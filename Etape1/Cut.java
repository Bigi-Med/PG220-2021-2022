import java.lang.annotation.Retention;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
public class Cut implements Validate
{
    int idClient;
    int  idSupplier;
    int idPlanche;
    int idPanel;
    double positionX;
    double positionY;
    Cut(int idClient,int  idSupplier,int idPlanche,int idPanel ,double positionX,double positionY)
    {
        this.idClient = idClient;
        this.idSupplier = idSupplier;
        this.idPanel = idPanel;
        this.idPlanche = idPlanche;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    @Override
    public boolean isId(int id)
    {
        if(id >=0)
        {
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public boolean isPos(double x,double y)
    {
        if(x >= 0 && y>= 0)
        {
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public   boolean isPrice(double price)
    {
        return true;
    }
    @Override
    public boolean isDate(String format, String value, Locale locale)
    {
        return true;
    }
    @Override
    public  boolean isDimension(Dimension dim)
    {
        return true;
    }
    @Override
    public boolean isNumber(int number)
    {
        return true;
    }
    @Override
    public String isCovering(Cut découpe1,Cut découpe2,List<Client> CLientList,List<Supplier> SupplierList)
    {
        if (découpe1.idPanel == découpe2.idPanel && découpe1.idSupplier == découpe2.idSupplier){
        
            List<List<Dimension>> listPlanks = new ArrayList<>();
            List<Cut> CutList = new ArrayList<>();
            CutList.add(découpe1);
            CutList.add(découpe2);
            double Longueur_pannel = 0;
            double Largeur_pannel = 0;
            if( (découpe1.positionX == découpe2.positionX) && (découpe1.positionY == découpe2.positionY)  )
            {
                return "Position cut convering Invalid ! Please change the cut position";
            }
            else 
            {
                // getting the inner rectangle parameteres, as in the Client Plank
                for (Client x : CLientList)
                {
                    User s = (Client)x;
                    for(Cut c : CutList)
                    {
                        if(s.id == c.idClient)
                        {
                            for(Wood p : s.listWood)
                            {
                                if(c.idPlanche == p.id)
                                {
                                    listPlanks.add(p.listDim);
                                }
                                if(c.idPanel == p.id)
                                {
                                    Longueur_pannel = p.listDim.get(0).L;
                                    Largeur_pannel = p.listDim.get(0).l;
                                }
                            }
                        }
                    }
                }
                for (List<Dimension> i : listPlanks)
                {
                    // check the width
                    if (découpe2.positionX < découpe1.positionX + i.get(0).l || découpe2.positionX  > Largeur_pannel ){ 
                        return "Convering rectangle invalid ! the X position second cut is on the surface of the previous cut ! Please adapt your position";
                    }
                    // check the length
                    else if (découpe2.positionY < découpe1.positionY + i.get(0).L || découpe2.positionY > Longueur_pannel){
                        return "Convering rectangle invalid ! the Y position second cut is on the surface of the previous cut ! Please adapt your position";
                    }
                    //check the first cut limit
                    
                    else if (découpe1.positionX + i.get(0).l > Largeur_pannel || découpe1.positionY + i.get(0).L > Longueur_pannel){
                        return "First cut depassing limits ! Please adapt the X postion";
                    }
                    //check the second cut limit
                    else if (découpe2.positionX + i.get(0).l > Largeur_pannel || découpe2.positionY + i.get(0).L > Longueur_pannel){
                        return "Second cut depassing limits ! Please adapt the Y position";
                    }
                }
                return ""; 
            }  
            

        }
        return "";
        
    }

    
    

    
}

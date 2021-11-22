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
    
    

    
}

package Algo;
import Readwrite.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

class GenerateCuts31
{
    List<String> Cutting = new ArrayList<>(); 
    
    void GeneratingCuts31(List<Client> Listc,List<Supplier> ListSupp)
    {
    List<String> Planks = new ArrayList<>(); 
   
        
        for(Client c : Listc)
        { 
            Planks.add("client");
            for(Wood w : c.listWood)
            {
                Planche p = (Planche)w;//downcasting
                Planks.add("m");
                for(int i = 0;i<p.nombre;i++)
                {   
                    Planks.add(Integer.toString(c.id));
                    Planks.add(Integer.toString(p.id));
                    Planks.add(Double.toString(p.listDim.get(0).L));
                    Planks.add(Double.toString(p.listDim.get(0).l));
                    if( i != p.nombre -1)
                        Planks.add("m");

                }
                Planks.add("n");
            }
        }
                 

        List<String> Panels = new ArrayList<>();
        for(Supplier s : ListSupp)
        {
            Panels.add("supplier");
            for(Wood w : s.listWood)
            {
                Panel p = (Panel)w;//downcasting
                Panels.add("m");
                for(int i = 0 ;i<p.nombre;i++)
                {
                    Panels.add(Integer.toString(s.id));
                    Panels.add(Integer.toString(p.id));
                    Panels.add(Double.toString(p.listDim.get(0).L));
                    Panels.add(Double.toString(p.listDim.get(0).l));
                    if(i != p.nombre -1)
                        Panels.add("m");
                }
                Panels.add("n");
                
            }
        }
        Panels.add("end");
        Planks.add("end");

        // organising planks accoridingly

        Sorting1 sort = new Sorting1();
        List<String> Listcorg = new ArrayList<>();
        Listcorg = sort.Sorting(Planks);
        System.out.println("finale is : "+Listcorg);
        System.out.println("Planks is : "+Planks);
        // System.out.println("planks 31 are : " + Listcorg);
        // System.out.println("size 31 is : " + Planks.size());
        // System.out.println("size 31 is : " + Listcorg.size());

        // creating cuts
        int indexc = 0;
        int indexf  = 0;
        boolean value = true;
        double posx = 0;
        double posy = 0;
        int sizec = Planks.size();
        int sizef = Panels.size();
        double current_l = 0;
        double current_L =0;
        int numberc = 1;
        int numbers = 1;
        boolean cond = true;

        while(value)
        {
            while(indexc<sizec)
            {
                indexc++;
                if(Listcorg.get(indexc) == "m")
                {
                    current_L = Double.parseDouble(Listcorg.get(indexc+3));
                    current_l = Double.parseDouble(Listcorg.get(indexc+4));
                    Cutting.add("client");
                    Cutting.add(Listcorg.get(indexc+1));//adding client id
                    Cutting.add(Listcorg.get(indexc+2) + "." + Integer.toString(numberc));
                    numberc++;
                }
                else if(Listcorg.get(indexc) == "client")
                {
                    numberc = 1;
                }
                else if(Listcorg.get(indexc) == "end")
                {
                    value = false;
                    break;
                }
                else{
                    continue;
                }
            }
            while(indexf<sizef)
            {
                // indexf++;
                if(value == false)
                    break;
                while(cond && indexf2<sizef)
                {
                indexf++;
                if(Panels.get(indexf) == "m") 
                {
                    if(Double.parseDouble(Panels.get(indexf+3)) >=  current_L && Double.parseDouble(Panels.get(indexf+4)) >=  current_l )
                    {
                        Cutting.add("Supplier");
                        Cutting.add(Panels.get(indexf +1));
                        Cutting.add(Panels.get(indexf + 2) + "." + Integer.toString(numbers));
                        numbers++;
                        Cutting.add("positionX");
                        Cutting.add(Double.toString(posx));
                        Cutting.add("positionY");
                        Cutting.add(Double.toString(posy));
                        posy = current_L;
                        cond = false;
                    }
                }
                else{
                    continue;
                }
                }
                }
                
            }
        }



        
        

    }
}
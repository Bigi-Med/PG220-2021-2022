package Algo;
import Readwrite.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;



import java.io.FileWriter;
import java.io.IOException;
// generating cuts randomly
class GenerateCuts{
    List<String> Cutting = new ArrayList<>(); 
    
    void GeneratingCuts(List<Client> Listc,List<Supplier> ListSupp)
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
                    if(i != p.nombre -1)
                        Panels.add("m");
                }
                Panels.add("n");
                
            }
        }
        Panels.add("end");
        Planks.add("end");

        // parametres for loop
        boolean value = true;
        int indexc = -1;
        int indexf = -1;
        int numberc = 1;
        int numberf = 1;
        int sizec = Planks.size();
        int sizef = Panels.size();



        while(value)
        {
            while(indexc<sizec)
            {   
                indexc++;
                
                if(Planks.get(indexc) == "m")
                {
                    Cutting.add("Client");
                    Cutting.add(Planks.get(indexc+1));
                    Cutting.add(Planks.get(indexc+2) + "." + Integer.toString(numberc));
                    numberc++;
                    break;
                }
                else if (Planks.get(indexc) == "n"){
                    numberc = 1;
                    if(Planks.get(indexc+1) == "end")
                    {
                        value = false;
                        break;
                    }
                }
                else if(Planks.get(indexc) == "end")
                {
                    value =false;
                    break;
                }
                else{
                    continue;
                }
            }
            while(indexf<sizef)
            {
                indexf++;
                if(value == false)
                    break;
                if(Panels.get(indexf) == "m") 
                {
                    Cutting.add("Supplier");
                    Cutting.add(Panels.get(indexf +1));
                    Cutting.add(Panels.get(indexf + 2) + "." + Integer.toString(numberf));
                    numberf++;
                    break;
                }
                else if(Panels.get(indexf) == "n"){
                    numberf = 1;
                    if(Panels.get(indexf+1) == "end")
                    {
                        value = false;
                        break;
                    }
                }
                else if(Panels.get(indexf) == "end")
                {
                    value = false;
                    break;
                }
                else{
                    continue;
                }

            }
        }
        
        System.out.println("planks are : "+Planks);
        System.out.println("Cuts are : " + Panels);
        System.out.println("Cuts are : " + Cutting);
    }
    
}
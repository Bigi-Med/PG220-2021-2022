package Algo;
import Readwrite.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

class Sorting1
{
    Compare cmp = new Compare();
    List<String> Sorting(List<String> PanlestoSort)
    {
        int add  = 0;
        boolean value = true;
        String max_L = "-1";
        String max_l = "-1";
        String old_L = "0";
        String old_l = "0";
        List<String> c1 = new ArrayList<>();
        List<String> c2 = new ArrayList<>();
        int max_index = 0;
        int is = 0;
        List<String> finale = new ArrayList<>();
        int index = 0 ;
        int index2 = 0;
        // finale.add("client");
        int first = 0;
       

        


        while(value)
        {
            for(int i = 0; i<PanlestoSort.size();i++)
            {
                if(i == PanlestoSort.size()-1)
                {
                    break;
                }
                if (PanlestoSort.get(i) == "n" && PanlestoSort.get(i+1) != "end" || (i == 0 && PanlestoSort.get(i) == "client"))
                {
                    if(PanlestoSort.get(i+1) == "client"){
                        add = 1;
                    }
                    else{
                        add = 0;
                        
                    }
                    c1.add(max_L);
                    c1.add(max_l);
                    c2.add(PanlestoSort.get(i+4+add));
                    c2.add(PanlestoSort.get(i+5+add));
                    if(cmp.Comparelexico(c1,c2) == 1)
                    {
                        max_L = c1.get(0);
                        max_l = c1.get(1);
                        
                        // System.out.println("new is 1"+ PanlestoSort);
                        c1.clear();
                        c2.clear();
                        if(old_l != max_l && old_L != max_L)
                        {
                            max_index = i+add;
                            old_l = max_l;
                            old_L = max_L;
                            // System.out.println("changed 1 ");
                        }
                        
                    }
                    else if (cmp.Comparelexico(c1,c2) == 2)
                    {
                        max_L = c2.get(0);
                        max_l = c2.get(1);
                        // PanlestoSort.set(i+add+4,"-1");
                        // PanlestoSort.set(i+add+5,"-1");
                        // System.out.println("new is 2"+ PanlestoSort);

                        c2.clear();
                        c1.clear();
                        if(old_l != max_l && old_L != max_L)
                        {
                            // System.out.println("changed 2 ");

                            max_index = i+add;
                            old_l = max_l;
                            old_L = max_L;
                        }
                        

                    }
                   

                }
                else{
                    continue;
                }
            }
            // adding elements to new list
            index = max_index;
            index2 = max_index;
            while(value)
            {
                if(PanlestoSort.get(index) == "client")
                {   
                    if(first != 0)
                    {
                        PanlestoSort.add("n");
                    }
                    while(PanlestoSort.get(index2) !="n")
                    {
                        finale.add(PanlestoSort.get(index2));
                        index2++;
                        if(PanlestoSort.get(index2) == "n")
                        {
                            finale.add("n");
                        }

                    }

                }
                else if(PanlestoSort.get(index) == "n")
                {
                    // System.out.println("in second");
                    finale.add("client"); 
                    
                    while(PanlestoSort.get(index2+1) != "n")
                    {
                        // System.out.println("infinite");
                        finale.add(PanlestoSort.get(index2+1));
                        index2++;
                        if(PanlestoSort.get(index2) == "n")
                        {
                            finale.add("n");
                        }
                        // index++;
                    }
                }
                // firtstest++;
                if(finale.size() == PanlestoSort.size()-1 )
                 {  
                    value = false;
                    finale.add("end");
                 }
                 break;


            }
            
           
          
            // System.out.println("max_l is :" + max_l);
            // System.out.println("max_L is :" + max_L);
            // System.out.println("max index is :" + max_index );

            PanlestoSort.set(max_index+4,"-1");
            PanlestoSort.set(max_index+5,"-1");
            // System.out.println("finale is :" +finale);
            
            max_l = "-1";
            max_L = "-1";
        is++;

        }
        return finale;
    }

    
}
package Algo;
import Readwrite.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.io.FileWriter;
import java.io.IOException;
public class generate
{
  // private Wood WoodById(List<? extends User> users, int uId, int wId)
  // {
  //   .

  // }
    // public static void generate_cut(List<Client> CLientList,List<Supplier> SupplierList,List<Cut> CutList)
    // {
    //     try {
    //       int cuts;
    //       cuts = CutList.size();
    //       System.out.println("Cut list is :" + CutList);
    //       // List<List<Dimension>> listPanels = new ArrayList<>();
    //       // List<List<Dimension>> listPlanks = new ArrayList<>();

    //       // System.out.println("size is " + cuts);
    //       String[] files = new String[cuts];
    //       // creating names for svg files
    //       for(int i = 0 ;i <cuts;i++)
    //       {
    //         files[i] = "decoupe_"+Integer.toString(i)+".svg";
    //       }
          
    //       // FileWriter myWriter = new FileWriter(files[1]);
    //       // getting the outer Rectangle parameteres, as in the Supplier panel
    //       // for (Supplier x : SupplierList)
    //       // {
    //       //   User s = (Supplier)x;
    //       //   for(Cut c : CutList)
    //       //   {
    //       //     if(s.id == c.idSupplier)
    //       //     {
    //       //       for(Wood p : s.listWood)
    //       //       {
    //       //         if((int)c.idPanel == p.id)
    //       //         {
    //       //           listPanels.add(p.listDim);
    //       //           // System.out.println("[PANELS] : L : "+ p.listDim.get(0).L + " l : " +p.listDim.get(0).l );
    //       //         }
    //       //       }
    //       //     }
    //       //   }
    //       // }
    //       // getting the inner rectangle parameteres, as in the Client Plank
    //       // for (Client x : CLientList)
    //       // {
    //       //   User s = (Client)x;
    //       //   for(Cut c : CutList)
    //       //   {
    //       //     if(s.id == c.idClient)
    //       //     {
    //       //       for(Wood p : s.listWood)
    //       //       {
    //       //         if((int)c.idPlanche == p.id)
    //       //         {
    //       //           listPlanks.add(p.listDim);
    //       //           // System.out.println("[PLANKS] : L : "+ p.listDim.get(0).L + " l : " +p.listDim.get(0).l );
                    

    //       //         }
    //       //       }
    //       //     }
    //       //   }
    //       // }

          
    //       // for(Cut ct : CutList)
    //       // {
    //       //   for(Client x : CLientList)
    //       //   {
    //       //     User c = (Client)x;
    //       //     if(c.id == ct.idClient)
    //       //     {
    //       //       for(Wood w : c.listWood)
    //       //       {
    //       //         if(w.id == (int)ct.idPlanche)
    //       //         {
    //       //           listPlanks.add(w.listDim);
    //       //         }
    //       //       }
    //       //     }
    //       //   }
    //       // }

             
    //       // for(Cut ct : CutList)
    //       // {
    //       //   for(Supplier x : SupplierList)
    //       //   {
    //       //     User c = (Supplier)x;
    //       //     if(c.id == ct.idSupplier)
    //       //     {
    //       //       for(Wood w : c.listWood)
    //       //       {
    //       //         if(w.id == (int)ct.idPanel)
    //       //         {
    //       //           listPanels.add(w.listDim);
    //       //         }
    //       //       }
    //       //     }
    //       //   }
    //       // }
          
    //         System.out.println("======================================================================== Creating svg files");
           
    //       //    for(int i = 0; i<listPlanks.size();i++)
    //       //    {
    //       //      FileWriter myWriter = new FileWriter(files[i]);
    //       //      String heightPanel = Double.toString(listPanels.get(i).get(0).L);
    //       //      String widthPanel = Double.toString(listPanels.get(i).get(0).l);
    //       //      String widthPlank = Double.toString(listPlanks.get(i).get(0).l);
    //       //      String heightPlank = Double.toString(listPlanks.get(i).get(0).L);
    //       //      String x = Double.toString(CutList.get(i).positionX);
    //       //      String y = Double.toString(CutList.get(i).positionY);
    //       //     //  System.out.println("[PANEL] : L : " + heightPanel + " l : " + widthPanel     );
    //       //     //  System.out.println("[PLANK] : L : " + heightPlank + " l : " + widthPlank     );
    //       //     //  System.out.println("[POS] : X : " + x + " Y : " + y);
               
    //       //      myWriter.write("    <svg width= " + "\"" + widthPanel + "\"" + " height=  " + "\"" + heightPanel +"\"" +"  >\n");
    //       //      myWriter.write("        <rect height= " + "\"" +heightPanel + "\"" + " width= " + "\"" +  widthPanel + "\"" + " style=\"fill:rgb(165,42,42);stroke-width:3;stroke:rgb(0,0,0)\"></rect>\n");//outer
    //       //      myWriter.write("        <rect   x= " + "\"" + x + "\"" + " y= " + "\"" + y + "\"" + " height= " + "\"" +heightPlank + "\"" + " width= " + "\"" +  widthPlank + "\"" + " style=\"fill:rgb(0,0,255);stroke-width:3;stroke:rgb(0,0,0)\"></rect>\n");//inner
    //       //      myWriter.write("    </svg>\n");
    //       //      myWriter.close();
    //       //      System.out.println("Successfully wrote to the file : " + files[i]);


            
    //       // }
    //       List<Dimension> listPanels = new ArrayList<>();
    //       List<Dimension> listPlanks = new ArrayList<>();

    //       for(int i = 0 ; i < CutList.size();i++)
    //       {
    //         FileWriter myWriter = new FileWriter(files[i]);
    //         listPanels = GetDimensionClient(CLientList,CutList.get(i).idClient,(int)CutList.get(i).idPlanche,CutList);
    //         listPlanks = GetDimensionSupp(SupplierList,CutList.get(i).idSupplier,(int)CutList.get(i).idSupplier,CutList);
    //         String heightPanel = Double.toString(listPanels.get(0).L);
    //         String widthPanel = Double.toString(listPanels.get(0).l);
    //         String widthPlank = Double.toString(listPlanks.get(0).l);
    //         String heightPlank = Double.toString(listPlanks.get(0).L);
    //         String x = Double.toString(CutList.get(i).positionX);
    //         String y = Double.toString(CutList.get(i).positionY);
    //                System.out.println("[PANEL] : L : " + heightPanel + " l : " + widthPanel     );
    //            System.out.println("[PLANK] : L : " + heightPlank + " l : " + widthPlank     );
    //            System.out.println("[POS] : X : " + x + " Y : " + y);

    //         myWriter.write("    <svg width= " + "\"" + widthPanel + "\"" + " height=  " + "\"" + heightPanel +"\"" +"  >\n");
    //         myWriter.write("        <rect height= " + "\"" +heightPanel + "\"" + " width= " + "\"" +  widthPanel + "\"" + " style=\"fill:rgb(165,42,42);stroke-width:3;stroke:rgb(0,0,0)\"></rect>\n");//outer
    // myWriter.write("        <rect   x= " + "\"" + x + "\"" + " y= " + "\"" + y + "\"" + " height= " + "\"" +heightPlank + "\"" + " width= " + "\"" +  widthPlank + "\"" + " style=\"fill:rgb(0,0,255);stroke-width:3;stroke:rgb(0,0,0)\"></rect>\n");//inner
    //         myWriter.write("    </svg>\n");
    //         myWriter.close();
    //         System.out.println("Successfully wrote to the file : " + files[i]);




    //       }
            
            
    //       } catch (IOException e) {
    //         System.out.println("An error occurred");
    //         e.printStackTrace();
    //       }

    // }
    // private static List<Dimension> GetDimensionClient(List<Client> ListC, int idClient , int idPlanche , List<Cut> CutList)
    // {
    //   List<Dimension> Dim = new ArrayList<>();
    //   boolean value = true;
    //   for(Cut ct : CutList)
    //   {
    //     for(Client x : ListC)
    //     {
    //       User c = (Client)x;
    //       if(c.id == ct.idClient)
    //       {
    //         for(Wood w : c.listWood)
    //         {
    //           if(w.id == (int)ct.idPlanche)
    //           {
    //             Dim =  w.listDim;
    //             value = false;
    //             break;
    //           }
    //         }
    //       }
    //       if(value == false)
    //       {
    //         break;
    //       }
    //     }
    //   if(value == false)
    //   {
    //     break;
    //   }
    //   }
    //   return Dim;
    // }

    // private static  List<Dimension> GetDimensionSupp(List<Supplier> ListS, int idSupplier , int idPanel , List<Cut> CutList)
    // {
    //   List<Dimension> Dim = new ArrayList<>();
    //   boolean value = true; 
    //   for(Cut ct : CutList)
    //       {
    //         for(Supplier x : ListS)
    //         {
    //           User c = (Supplier)x;
    //           if(c.id == ct.idSupplier)
    //           {
    //             for(Wood w : c.listWood)
    //             {
    //               if(w.id == (int)ct.idPanel)
    //               {
    //                 Dim = w.listDim;
    //                 value = false;
    //                 break;
    //               }
    //             }
    //           }
    //           if(value == false)
    //           {
    //             break;
    //           }
    //         }
    //         if(value == false)
    //         {
    //           break;
    //         }
    //       }
    //       return Dim;
    // }
    private static Wood getWood(List<? extends User> users,int userid,int woodid){
      Wood wood=null;
        for(User u : users){
            if(u.id==userid){
                for(Wood w : u.listWood){
                    if(w.id==woodid)
                      wood=w;
                }
            }
        }
      return wood;
    }

    static  void generate_cut(List<Client> clients, List<Supplier> suppliers, List<Cut> cuts){
      String filename;
      int file_index = 0;
      List<List<Cut>> panneauCuts = new ArrayList<List<Cut>>();
      int refsup = cuts.get(0).idSupplier;
      int refpan = (int)cuts.get(0).idPanel;
      int refnumpan = (int)((10*cuts.get(0).idPanel))%10;
  
      List<Cut> cutslist = new ArrayList<>();
      for (Cut cut : cuts){
        if(((int)((10*cut.idPanel))%10 == refnumpan) && ((int)cut.idPanel == refpan) && ((int)cut.idSupplier == refsup)){
          cutslist.add(cut);
        }
        else{
          refnumpan = (int)((10*cut.idPanel))%10;
          refpan = (int)cut.idPanel;
          refsup = (int)cut.idSupplier;
          panneauCuts.add(cutslist);
          cutslist = new ArrayList<>();
          cutslist.add(cut);
        }
      }
        for(List<Cut> cutPanneau : panneauCuts){
          file_index++;
          filename="decoupe_"+file_index+".svg";
          SVGWriter(clients, suppliers, cutPanneau, filename);
          
        }
      

    }

    static void SVGWriter(List<Client> Listc,List<Supplier> Lists,List<Cut> Cuts,String name)
    {
      try{
      FileWriter myWriter = new FileWriter(name);
      StringBuilder writeBuilder = new StringBuilder();

      // Panel Panles = (Panels)getWood(Lists, Cuts.get(0).idSupplier, (int)Cuts.get(0).idPanel);
      // listPanels = GetDimensionClient(CLientList,CutList.get(i).idClient,(int)CutList.get(i).idPlanche,CutList);
      // listPlanks = GetDimensionSupp(SupplierList,CutList.get(i).idSupplier,(int)CutList.get(i).idSupplier,CutList);
      Panel Panels = (Panel)getWood(Lists, Cuts.get(0).idSupplier, (int)Cuts.get(0).idPanel);
      String widthPanel = Double.toString(Panels.listDim.get(0).l) ;
      String heightPanel = Double.toString(Panels.listDim.get(0).L);
      // String heightPanel = Double.toString(listPanels.get(0).L);
      // String widthPanel = Double.toString(listPanels.get(0).l);
      // String widthPlank = Double.toString(listPlanks.get(0).l);
      // String heightPlank = Double.toString(listPlanks.get(0).L);
      // String x = Double.toString(CutList.get(i).positionX);
      // String y = Double.toString(CutList.get(i).positionY);
          //     System.out.println("[PANEL] : L : " + heightPanel + " l : " + widthPanel     );
          // System.out.println("[PLANK] : L : " + heightPlank + " l : " + widthPlank     );
          // System.out.println("[POS] : X : " + x + " Y : " + y);

      writeBuilder.append("    <svg width= " + "\"" + widthPanel + "\"" + " height=  " + "\"" + heightPanel +"\"" +"  >\n");
      writeBuilder.append("        <rect height= " + "\"" +heightPanel + "\"" + " width= " + "\"" +  widthPanel + "\"" + " style=\"fill:rgb(165,42,42);stroke-width:3;stroke:rgb(0,0,0)\"></rect>\n");//outer
      for(Cut cut : Cuts){
        Planche Plank = (Planche)getWood(Listc, cut.idClient, (int)cut.idPlanche);
        writeBuilder.append("<rect x=\""+cut.positionX+"\" y=\""+cut.positionY+"\" width=\""+Plank.listDim.get(0).l+"\" height=\""+Plank.listDim.get(0).L);
        writeBuilder.append("\" style=\"fill:rgb(0,0,255);stroke-width:3;stroke:rgb(0,0,0)\">\n</rect>\n");
      }
      // myWriter.write("        <rect   x= " + "\"" + x + "\"" + " y= " + "\"" + y + "\"" + " height= " + "\"" +heightPlank + "\"" + " width= " + "\"" +  widthPlank + "\"" + " style=\"fill:rgb(0,0,255);stroke-width:3;stroke:rgb(0,0,0)\"></rect>\n");//inner
      writeBuilder.append("    </svg>\n");
      String write = writeBuilder.toString();

         myWriter.write(write);
         myWriter.close();
    }catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
      // myWriter.close();
      // System.out.println("Successfully wrote to the file : " + files[i]);
    }
   






}

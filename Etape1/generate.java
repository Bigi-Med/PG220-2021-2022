import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.io.FileWriter;
import java.io.IOException;
public class generate
{
    public static void generate_cut(List<Client> CLientList,List<Supplier> SupplierList,List<Cut> CutList)
    {
        try {
          int cuts;
          cuts = CutList.size();
          List<List<Dimension>> listPanels = new ArrayList<>();
          List<List<Dimension>> listPlanks = new ArrayList<>();

          // System.out.println("size is " + cuts);
          String[] files = new String[cuts];
          files[0]="svg_1.svg";
          files[1]="svg_2.svg";
          FileWriter myWriter = new FileWriter(files[1]);
          // creating the outer Rectangle, as in the Supplier panel
          for (Supplier x : SupplierList)
          {
            User s = (Supplier)x;
            for(Cut c : CutList)
            {
              if(s.id == c.idSupplier)
              {
                for(Wood p : s.listWood)
                {
                  if(c.idPanel == p.id)
                  {
                    listPanels.add(p.listDim);
                  }
                }
              }
            }
          }
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
                }
              }
            }
          }
          // listPlanks.get(i).get(0).l;
          System.out.println("==========================================================================================================");

          for(int i=0 ; i <listPanels.size();i++)
          {
            System.out.println("l is :" + listPanels.get(i).get(0).l + " L is : " + listPanels.get(i).get(0).L);
          }
          System.out.println("==========================================================================================================");
          for(int i=0 ; i <listPlanks.size();i++)
          {
            System.out.println("l is :" + listPlanks.get(i).get(0).l + " L is : " + listPlanks.get(i).get(0).L);
          }



            myWriter.write("    <svg width=\"700\" height=\"200\">\n");
            myWriter.write("        <rect height=\"100\" width=\"600\" style=\"fill:rgb(255,255,255);stroke-width:3;stroke:rgb(0,0,0)\"></rect>\n");
            myWriter.write("        <rect height=\"60\" width=\"100\" style=\"fill:rgb(0,0,255);stroke-width:3;stroke:rgb(0,0,0)\"></rect>\n");
            myWriter.write("    </svg>\n");
            // myWriter.write("</body>\n");
            // myWriter.write("</html>\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }

    }

//     <html>
//     <body>
//         <h1>My first SVG</h1>
//         <svg width="700" height="200">
//             <rect height="100" width="600" style="fill:rgb(255,255,255);stroke-width:3;stroke:rgb(0,0,0)"></rect>
//             <rect height="50" width="100" style="fill:rgb(0,0,255);stroke-width:3;stroke:rgb(0,0,0)"></rect>
//         </svg>
//     </body>
// </html>


}

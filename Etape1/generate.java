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
            FileWriter myWriter = new FileWriter("ssvg.svg");
            myWriter.write("<html> \n");
            myWriter.write("<body>\n");
            myWriter.write("    <h1>My first SVG</h1>\n");
            myWriter.write("    <svg width=\"700\" height=\"200\">\n");
            myWriter.write("        <rect height=\"100\" width=\"600\" style=\"fill:rgb(255,255,255);stroke-width:3;stroke:rgb(0,0,0)\"></rect>\n");
            myWriter.write("        <rect height=\"60\" width=\"100\" style=\"fill:rgb(0,0,255);stroke-width:3;stroke:rgb(0,0,0)\"></rect>\n");
            myWriter.write("    </svg>\n");
            myWriter.write("</body>\n");
            myWriter.write("</html>\n");
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
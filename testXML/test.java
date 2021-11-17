import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
      List<Client> listCLient;
        listCLient = XMLReader.readXml("../clients.xml");
        for(Client c : listCLient)
        {
          System.out.println("Client with id  : " + c.id +" has : ");
          for(Planche p : c.listP )
          {
            System.out.println(" planche with id : " + p.id + " and number : "+p.nombre + " with price : " +p.price + " with date : " + p.date + " with dimensions : ");
            for(Dimension d : p.listDim)
            {
              System.out.println(" width of : " + d.l + " and length of : " + d.L);
              System.out.println("");
            }
          }
        }
        // Client[] listClient = {}
      }   
}

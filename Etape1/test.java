import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {// 0 : client / 1 : fournisseur
      int cf = 1;
      String[] xmlFile = new String[2];
      String[] users = new String[2];
      String[] woodTypes = new String[2];
      xmlFile[0] = "clients.xml";
      xmlFile[1] = "fournisseurs.xml";
      users[0] = "Clients";
      users[1] = "Supplier";
      woodTypes[0] = "planche";
      woodTypes[1] = "panel";
      List<User> listUser;
      listUser = XMLReader.readXml(xmlFile[cf]);
        for(User u : listUser)
        {
          System.out.println(users[cf] + " with id  : " + u.id +" has : ");
          
          for(Wood w : u.listWood )
          {
            System.out.println(woodTypes[cf] + " with id : " + w.id + " and number : "+w.nombre + " with price : " +w.price + " with date : " + w.date + " with dimensions : ");
            for(Dimension d : w.listDim)
            {
              System.out.println(" width of : " + d.l + " and length of : " + d.L);
              System.out.println("");
              if(w.isPrice(w.price))
              {
                System.out.println(" CHECK OK");
              }
              else{
                System.out.println("PRICE INVALID !");
              }
            }
          }
        }
      
        
      }   
}

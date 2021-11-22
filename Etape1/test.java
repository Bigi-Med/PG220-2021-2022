

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {// 0 : client / 1 : fournisseur
      int cf = 1;
      String fileCut = "decoupes.xml";
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
      List<Cut> listCut;
      listUser = XMLReader.readXml(xmlFile[cf]);
      System.out.println("");
      System.out.println("========================================================Reading user");
      System.out.println("");
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
              
              
              if((w.isPrice(w.price)) && (w.isDimension(d)) && (w.isId(w.id)) && (w.isNumber(w.nombre) && w.isDate(w.date)))
              {
                System.out.println(" CHECK OK");
                System.out.println("");
              }
               if (w.isPrice(w.price) == false){
                System.out.println("PRICE INVALID !");
                System.out.println("");
              }
               if(w.isDimension(d) == false){
                System.out.println("DIMENSION INVALID !");
                System.out.println("");
              }
               if(w.isId(w.id)== false)
              {
                System.out.println("ID INVALID !");
                System.out.println("");
              }
               if(w.isNumber(w.nombre)== false)
              {
                System.out.println("NOMBRE INVALID !");
                System.out.println("");
              }
              if(w.isDate(w.date) == false)
              {
                System.out.println("DATE INVALID !");
                System.out.println("");
              }
            }
          }
        }
      listCut = XMLReader.readXMLcut(fileCut);
      System.out.println("========================================================Reading decoupe");
      System.out.println("");

      for(Cut c : listCut)
       {
         System.out.println("Cut has client id " + c.idClient + " and planche id " + c.idPlanche + " fournisseurs id " + c.idSupplier + " panel id " + c.idPanel + " positions x " + c.positionX + " position y " + c.positionY);
         System.out.println("");
        }

      
        
      }   
}

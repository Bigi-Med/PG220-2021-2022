import javax.swing.ListCellRenderer;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.lang.Exception;


public class XMLReader
{
  static int check = 0; 
  static boolean value;
  
    static List<User> readXml(String filename )
    {
      
        List<User> listUser = new ArrayList<>();
      try
        {
            FileInputStream file = new FileInputStream(filename);
            XMLStreamReader reader = XMLInputFactory.newInstance().createXMLStreamReader(file);
           
            while(reader.hasNext())
            {
              if(check < 3)
              {  value =(reader.next() == XMLStreamConstants.START_ELEMENT);
                check++;
              }

                if(value)
                {
                  value = true;

                    if(reader.getName().toString() == "client" || reader.getName().toString() == "fournisseur" )
                    {
                       
                        User u = readUser(reader);
                        listUser.add(u);
                    }


                }
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (XMLStreamException e)
        {
            e.printStackTrace();
        }
       
        return listUser;
    }
    static List<Cut> readXMLcut(String filename)
    {
      int idClient = 0;
      int idSupplier = 0;
      int planche = 0;
      int panneau = 0;
      double x = 0;
      double y = 0;
      List<Cut> listCut = new ArrayList<>();
      try
      {
        FileInputStream file = new FileInputStream(filename);
        XMLStreamReader reader = XMLInputFactory.newInstance().createXMLStreamReader(file);
        while(reader.hasNext())
        {
          if(reader.next() == XMLStreamConstants.START_ELEMENT)
          {
            if(reader.getName().toString() == "client")
            {
              try{
              idClient = Integer.parseInt(reader.getAttributeValue(0));
              }
              catch(Exception e){
                idClient = -69;
              }
              try{
              planche = Integer.parseInt(reader.getAttributeValue(1));
              }
              catch(Exception e)
              {
                planche = -69;
              }
              continue;
            }
            
             if(reader.getName().toString() == "fournisseur")
            {
             try{
              idSupplier = Integer.parseInt(reader.getAttributeValue(0));
             }
             catch(Exception e)
             {
               idSupplier = -69;
             }
             try{
              panneau = Integer.parseInt(reader.getAttributeValue(1));
             }
             catch(Exception e)
             {
               panneau = -69;
             }
              continue;
            }
           if(reader.getName().toString() == "position")
            {
              try{
              x = Double.parseDouble(reader.getAttributeValue(0));
              }
              catch(Exception e)
              {
                x = -69;
              }
              try{
              y = Double.parseDouble(reader.getAttributeValue(1));
              }
              catch(Exception e)
              {
                y = -69;
              }
              Cut c = new Cut(idClient,idSupplier,planche,panneau,x,y);
              listCut.add(c);
            }
           
          }
          else{
            continue;
          }
        }
      }
      catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (XMLStreamException e)
        {
            e.printStackTrace();
        }
      
        return listCut;
    }
    static User readUser(XMLStreamReader reader) throws XMLStreamException
    {
        
        int id;
        try{
         id = Integer.parseInt(reader.getAttributeValue(0));
        }
        catch(Exception e){
           id  = -69;
        }
        
        
          List<Wood> listWood = new ArrayList<>();
        while(reader.hasNext())
        {
          if(reader.next() != XMLStreamConstants.START_ELEMENT )
            {
              continue;
            }
            if(reader.getName().toString()=="planche" || reader.getName().toString() == "panneau")
            {
              
              Wood w = readWoodType(reader);
              listWood.add(w);
              continue;

            }
            else if (reader.getName().toString() == "client"){

              break;

            }

        }

       
        return new User(id,listWood);
    }

    static Wood readWoodType(XMLStreamReader reader) throws XMLStreamException
    {
      int id;
      int nombre ;
      String date ;
      double price;
      try{
       id = Integer.parseInt(reader.getAttributeValue(0));
      }
      catch(Exception e){
         id = -69;
      }
      try{
       nombre = Integer.parseInt(reader.getAttributeValue(1));
      }
      catch(Exception e){
         nombre = -69;
      }
      try{
       date = reader.getAttributeValue(2);
      }
      catch(Exception e){
       date = "69";
      }
      try{
       price = Double.parseDouble(reader.getAttributeValue(3));
      }
      catch(Exception e){
         price = -69;
      }
      List<Dimension> listDimension = new ArrayList<>();
      while(reader.hasNext())
      {
        if(reader.next() == XMLStreamConstants.START_ELEMENT)
        {

            if(reader.getName().toString() == "dim")
            {
            Dimension d = readDimension(reader);
            listDimension.add(d);
            break;
          }


        }

      }


       
          return new Wood(id,nombre,date,price,listDimension);
      }
    static Dimension readDimension(XMLStreamReader reader) throws XMLStreamException
    {
      double L;
      double l;
      try{
       L = Double.parseDouble(reader.getAttributeValue(0));
      }
      catch(Exception e){
         L = -69;
      }
      try{
       l = Double.parseDouble(reader.getAttributeValue(1));
      }
      catch(Exception e){
         l = -69;
      }
      return new Dimension(L,l);
    }
}

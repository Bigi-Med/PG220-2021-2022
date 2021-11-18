import javax.swing.ListCellRenderer;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class XMLReader
{
  static int check = 0; 
  static boolean value;
  
    static List<User> readXml(String filename )
    {
      String[] user = new String[2];
      // user[0] = "client";
      // user[1] = "fournisseur";
      // List<Client> listClients = new ArrayList<>();
      // List<Supplier> listSupplier = new ArrayList<>();
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
                        // if(option == 0)
                        // {
                        // Client c = readUser(reader);
                        // listClients.add(c);
                        // }
                        // else if(option == 1)
                        // {
                        //   Supplier s = readUser(reader);
                        //   listSupplier.add(s);
                        // }
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
        // return listClients;
        return listUser;
    }
    static User readUser(XMLStreamReader reader) throws XMLStreamException
    {
        String[] woodType = new String[2];
        // woodType[0] = "planche";
        // woodType[1] = "panneau";
        int id = Integer.parseInt(reader.getAttributeValue(0));
        // List<Panel> listPanel = new ArrayList<>();
        // List<Planche> listPlanche = new ArrayList<>();
          List<Wood> listWood = new ArrayList<>();
        while(reader.hasNext())
        {
          if(reader.next() != XMLStreamConstants.START_ELEMENT )
            {
              continue;
            }
            if(reader.getName().toString()=="planche" || reader.getName().toString() == "panneau")
            {
              // if(option == 0)
              // {
              //   Planche p = readWoodType(reader);
              //   listPlanche.add(p);

              // }
              // else if (option == 1)
              // {
              //   Panel ps = readWoodType(reader);
              //   listPanel.add(ps);
              // }
              Wood w = readWoodType(reader);
              listWood.add(w);
              continue;

            }
            else if (reader.getName().toString() == "client"){

              break;

            }

        }

        // return new Client(id,listPlanche);
        return new User(id,listWood);
    }

    static Wood readWoodType(XMLStreamReader reader) throws XMLStreamException
    {

      int id = Integer.parseInt(reader.getAttributeValue(0));
      int nombre = Integer.parseInt(reader.getAttributeValue(1));
      String date = reader.getAttributeValue(2);
      double price = Double.parseDouble(reader.getAttributeValue(3));
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


        // return new Planche(id,nombre,date,price,listDimension);
          return new Wood(id,nombre,date,price,listDimension);
      }
    static Dimension readDimension(XMLStreamReader reader) throws XMLStreamException
    {
      String L = reader.getAttributeValue(0);
      String l = reader.getAttributeValue(1);
      return new Dimension(L,l);
    }
}

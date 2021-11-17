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
  
    static List<Client> readXml(String filename)
    {
      List<Client> listClients = new ArrayList<>();
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

                    if(reader.getName().toString() == "client")
                    {

                        Client c = readClient(reader);
                        listClients.add(c);
                        // System.out.println("CLient id : "+c.id);
                        // System.out.println("==============================================================================================");

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
        return listClients;
    }
    static Client readClient(XMLStreamReader reader) throws XMLStreamException
    {
        int id = Integer.parseInt(reader.getAttributeValue(0));

        List<Planche> listPlanche = new ArrayList<>();
        while(reader.hasNext())
        {
          if(reader.next() != XMLStreamConstants.START_ELEMENT )
            {
              continue;
            }
            if(reader.getName().toString()=="planche")
            {
              Planche p = readPlanche(reader);
              // System.out.println("planche id " + p.id);
              // System.out.println("planche nombre "+p.nombre);
              // System.out.println("planche date  "+ p.date);
              // System.out.println("planche price  "+p.price);
              // System.out.println("============================");
              listPlanche.add(p);
              continue;

            }
            else if (reader.getName().toString() == "client"){

              break;

            }

        }

        return new Client(id,listPlanche);
    }

    static Planche readPlanche(XMLStreamReader reader) throws XMLStreamException
    {

      int id = Integer.parseInt(reader.getAttributeValue(0));
      int nombre = Integer.parseInt(reader.getAttributeValue(1));
      String date = reader.getAttributeValue(2);
      String price = reader.getAttributeValue(3);
      List<Dimension> listDimension = new ArrayList<>();
      while(reader.hasNext())
      {
        if(reader.next() == XMLStreamConstants.START_ELEMENT)
        {

            if(reader.getName().toString() == "dim")
            {
            Dimension d = readDimension(reader);
            listDimension.add(d);
            // System.out.println("dimension l " +d.l);
            // System.out.println("dimension L "+d.L);
            // System.out.println("============================");
             break;
          }


        }

      }


        return new Planche(id,nombre,date,price,listDimension);
    }
    static Dimension readDimension(XMLStreamReader reader) throws XMLStreamException
    {
      String L = reader.getAttributeValue(0);
      String l = reader.getAttributeValue(1);
      return new Dimension(L,l);
    }
}

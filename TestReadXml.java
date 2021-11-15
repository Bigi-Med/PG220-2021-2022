import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamConstants;
import java.io.FileInputStream;
import java.io.IOException;


public class TestReadXml {

    public static void main(String[] argvs)
    {
        FileInputStream file = null;
        try {
            file = new FileInputStream("clients.xml");
            XMLInputFactory xmlInFact = XMLInputFactory.newInstance();
            XMLStreamReader reader = xmlInFact.createXMLStreamReader(file);
            int event = reader.getEventType();
            System.out.println(XMLStreamConstants.START_ELEMENT );
            while(reader.hasNext()) {
              reader.next(); // On regarde la liste des clients
              if(event == XMLStreamConstants.START_DOCUMENT || event == XMLStreamConstants.START_ELEMENT || event  == XMLStreamConstants.END_ELEMENT  )
              {

                

                //reader.nextTag(); //On regarde le premier client
                reader.nextTag(); //On regarde la première commande de planche demandée
                String commande = "Commande n°" + reader.getAttributeValue(0) + " de " + reader.getAttributeValue(1) + " planches à livrer pour le " + reader.getAttributeValue(2) + " au prix maximal de " +reader.getAttributeValue(3);
                reader.nextTag();//dimension
                reader.nextTag();//close dim
                reader.nextTag();//close planche
                reader.nextTag();//close  client
                System.out.println(commande);
                 event = reader.getEventType();
                 System.out.println(event);
               }
               else{
                 System.out.println("in break");
                 // reader.close();
                 // System.out.println(event);
                 break;

               }
               }
             }
        catch(IOException exc) {

            System.out.print("Erreur IO: " + exc.toString());
        }
        catch(XMLStreamException exc) {
            System.out.print("Erreur XML: " + exc.toString());

        }
      }
}

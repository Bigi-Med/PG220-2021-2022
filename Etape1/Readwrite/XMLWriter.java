package Readwrite;
import Algo.*;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
 
public class XMLWriter implements Iwrite {
 
    @Override
    public  void WriteFile() {
 
      try {
 
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();
 
        // élément de racine
        Document doc = docBuilder.newDocument();
        Element racine = doc.createElement("repertoire");
        doc.appendChild(racine);
 
        // l'élément contact
        Element contact = doc.createElement("contact");
        racine.appendChild(contact);
 
        // attributs de l'élément contact
        Attr attr = doc.createAttribute("id");
        attr.setValue("1");
        contact.setAttributeNode(attr);
 
        // le nom
        Element nom = doc.createElement("nom");
        nom.appendChild(doc.createTextNode("codeur"));
        contact.appendChild(nom);
 
        // le prénom
        Element prenom = doc.createElement("prenom");
        prenom.appendChild(doc.createTextNode("java"));
        contact.appendChild(prenom);
 
        // le mobile
        Element mobile = doc.createElement("mobile");
        mobile.appendChild(doc.createTextNode("098745126"));
        contact.appendChild(mobile);
  
        // l'email
        Element email = doc.createElement("email");
        email.appendChild(doc.createTextNode("codeurjava8@gmail.com"));
        contact.appendChild(email);
 
        // write the content into xml file
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult resultat = new StreamResult(new File("monFichier.xml"));
 
        transformer.transform(source, resultat);
 
        System.out.println("Fichier sauvegardé avec succès!");
 
     } catch (ParserConfigurationException pce) {
         pce.printStackTrace();
     } catch (TransformerException tfe) {
         tfe.printStackTrace();
     }
  }
}
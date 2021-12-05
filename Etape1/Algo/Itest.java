package Algo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ListCellRenderer;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import Algo.Dimension;
import Algo.Ifactory;
import Algo.Planche;
import Readwrite.Iread;
import Readwrite.XMLReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.lang.Exception;
import java.lang.SuppressWarnings;

 class Itest{

    public static void main(String[] args) {

      Iread xml = new XMLReader();
        String[] files = {"clients.xml","fournisseurs.xml"};
        // String[] users = {"Client","Supplier"};
        // List<Ifactory> fact = new ArrayList<>();

        Ifactory Supp = new SupplierFactory();
        Ifactory Client = new ClientFactory();

        // fact.add(Client);
        // fact.add(Supp);
        xml.ReadFile(files[1]);



        Supp.ConstructObj(Iread.infos);

         for(Supplier u : SupplierFactory.ListSupp)
         {


            System.out.println( "Supplier with id  : " + u.id +" has : ");
          for(Wood w : u.listWood )
          {
            System.out.println("Panel with id : " + w.id + " and number : "+w.nombre + " with price : " +w.price + " with date : " + w.date + " with dimensions : ");
            for(Dimension d : w.listDim)
            {
              System.out.println(" width of : " + d.l + " and length of : " + d.L);
              System.out.println("");



              }
            }
            System.out.println("=====================================================================================");
          }

          xml.ReadFile(files[0]);
          Client.ConstructObj(Iread.infos);
          

          for(Client u : ClientFactory.ListClient)
          {


             System.out.println( "Client with id  : " + u.id +" has : ");
           for(Wood w : u.listWood )
           {
             System.out.println("Plank with id : " + w.id + " and number : "+w.nombre + " with price : " +w.price + " with date : " + w.date + " with dimensions : ");
             for(Dimension d : w.listDim)
             {
               System.out.println(" width of : " + d.l + " and length of : " + d.L);
               System.out.println("");



               }
             }
             System.out.println("=====================================================================================");
           }

        }
        }

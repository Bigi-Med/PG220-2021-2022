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
import java.util.Locale;

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
            System.out.println("============PANEL===============");
            System.out.println("");
            System.out.println("Panel with id : " + w.id + " and number : "+w.nombre + " with price : " +w.price + " with date : " + w.date + " with dimensions : ");
            for(Dimension d : w.listDim)
            {
                System.out.println(" width of : " + d.l + " and length of : " + d.L);
                System.out.println("");
                System.out.println("==================CHEKING ATTRIBUTES====================");
                System.out.println("");


                if((w.isPrice(w.price)) && (w.isDimension(d)) && (w.isId((double)w.id)) && (w.isNumber(w.nombre) && w.isDate("dd.MM.yy",w.date,Locale.ENGLISH)))
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
                 if(w.isId((double)w.id)== false)
                {
                  System.out.println("ID INVALID !");
                  System.out.println("");
                }
                 if(w.isNumber(w.nombre)== false)
                {
                  System.out.println("NOMBRE INVALID !");
                  System.out.println("");
                }
                if(w.isDate("dd.MM.yy",w.date,Locale.ENGLISH) == false)
                {
                  System.out.println("DATE INVALID !");
                  System.out.println("");
                }



              }
            }
            System.out.println("=====================================================================================");
            System.out.println("");

          }

          xml.ReadFile(files[0]);
          Client.ConstructObj(Iread.infos);


          for(Client u : ClientFactory.ListClient)
          {


             System.out.println( "Client with id  : " + u.id +" has : ");
           for(Wood w : u.listWood )
           {
             System.out.println("============PLANK===========");
             System.out.println("");


             System.out.println("Plank with id : " + w.id + " and number : "+w.nombre + " with price : " +w.price + " with date : " + w.date + " with dimensions : ");
             for(Dimension d : w.listDim)
             {
               System.out.println(" width of : " + d.l + " and length of : " + d.L);
               System.out.println("");
               System.out.println("==================CHEKING ATTRIBUTES====================");
               System.out.println("");


               if((w.isPrice(w.price)) && (w.isDimension(d)) && (w.isId((double)w.id)) &&   (w.isNumber(w.nombre) && w.isDate("dd.MM.yy",w.date,Locale.ENGLISH)))
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
                if(w.isId((double)w.id)== false)
               {
                 System.out.println("ID INVALID !");
                 System.out.println("");
               }
                if(w.isNumber(w.nombre)== false)
               {
                 System.out.println("NOMBRE INVALID !");
                 System.out.println("");
               }
               if(w.isDate("dd.MM.yy",w.date,Locale.ENGLISH) == false)
               {
                 System.out.println("DATE INVALID !");
                 System.out.println("");
               }



               }
             }
             System.out.println("=====================================================================================");
             System.out.println("");

           }

        }
        }
        // if((w.isPrice(w.price)) && (w.isDimension(d)) && (w.isId((double)w.id)) && (w.isNumber(w.nombre) && w.isDate("dd.MM.yy",w.date,Locale.ENGLISH)))
        //       {
        //         System.out.println(" CHECK OK");
        //         System.out.println("");
        //       }
        //        if (w.isPrice(w.price) == false){
        //         System.out.println("PRICE INVALID !");
        //         System.out.println("");
        //       }
        //        if(w.isDimension(d) == false){
        //         System.out.println("DIMENSION INVALID !");
        //         System.out.println("");
        //       }
        //        if(w.isId((double)w.id)== false)
        //       {
        //         System.out.println("ID INVALID !");
        //         System.out.println("");
        //       }
        //        if(w.isNumber(w.nombre)== false)
        //       {
        //         System.out.println("NOMBRE INVALID !");
        //         System.out.println("");
        //       }
        //       if(w.isDate("dd.MM.yy",w.date,Locale.ENGLISH) == false)
        //       {
        //         System.out.println("DATE INVALID !");
        //         System.out.println("");
        //        //

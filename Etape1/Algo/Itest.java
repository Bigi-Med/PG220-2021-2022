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

public class Itest{
  
    public static void main(String[] args) {
    
      Iread xml = new XMLReader();
        String file = "fournisseurs.xml";
        xml.ReadFile(file);
        // System.out.println(Iread.infos);
        Ifactory cf = new SupplierFactory(); 
        
         cf.ConstructObj(Iread.infos);
        // System.out.println("list is " + Cl);
        // for(int i = 0;i<Cl.size();i++)
        // {
        //     System.out.println( "Client with id  : " + Cl.get(i).id +" has : ");
        //     for(int j = 0;j<Cl.get(j).)

        // }
         for(Supplier u : SupplierFactory.ListSupp)
         {   
           
         
            System.out.println( "Client with id  : " + u.id +" has : ");
          for(Wood w : u.listWood )
          {
            System.out.println("Planche with id : " + w.id + " and number : "+w.nombre + " with price : " +w.price + " with date : " + w.date + " with dimensions : ");
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
        
    


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.lang.String;
import java.text.Format;
public  class Wood  implements Validate
{
  int id;
  int nombre;
  String date;
  double price;
  List<Dimension> listDim;
  Wood(int id, int nombre,String date,Double price,List<Dimension>listDim)
  {
    this.id = id;
    this.nombre = nombre;
    this.date = date;
    this.price = price;
    this.listDim = listDim;
    
  }
   @Override
  public boolean isPrice(double price)
  {
      if(price >= 0)
      {
          return true;
      }
      else
      {
          return false;
      }
  }
   @Override
  public  boolean isDate(String date)
  {
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
      Date d = new Date();
      String t = sdf.format(d);
      if(t.compareTo(date) == 0)
      {
          return true;
      }
      else{
        return false;
      }
  }
  @Override
  public boolean isDimension(Dimension dim)
  {
    if(dim.l >= 0 && dim.L >= 0)
      {
          return true;
      }
      else
      {
          return false;
      }
  }
  @Override
  public boolean isId(int id)
  {
    if(id >= 0)
      {
          return true;
      }
      else
      {
          return false;
      }
  }
  @Override
 public boolean isNumber(int number)
 {
  if(number >= 0)
  {
      return true;
  }
  else
  {
      return false;
  }
 }

}

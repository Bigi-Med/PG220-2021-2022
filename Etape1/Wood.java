import java.util.List;
public  class Wood  
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
  // @Override
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
  // @Override
  public  boolean isDate(String date)
  {
      return true;
  }
}

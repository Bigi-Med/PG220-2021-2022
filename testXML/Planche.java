import java.util.List;

public class Planche
{
  int id;
  int nombre;
  String date;
  String price;
  List<Dimension> listDim;
  Planche(int id, int nombre,String date,String price,List<Dimension>listDim)
  {
    this.id = id;
    this.nombre = nombre;
    this.date = date;
    this.price = price;
    this.listDim = listDim;
    
  }
}

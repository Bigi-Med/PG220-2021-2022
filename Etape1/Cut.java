public class Cut{
    int idClient;
    int  idSupplier;
    int idPlanche;
    int idPanel;
    double positionX;
    double positionY;
    Cut(int idClient,int  idSupplier,int idPlanche,int idPanel ,double positionX,double positionY)
    {
        this.idClient = idClient;
        this.idSupplier = idSupplier;
        this.idPanel = idPanel;
        this.idPlanche = idPlanche;
        this.positionX = positionX;
        this.positionY = positionY;
    }
    // @Override
    // public boolean isId(int id)
    // {
    //     if(id >=0)
    //     {
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }
    // @Override
    // public boolean isPos(double x,double y)
    // {

    // }
    
}

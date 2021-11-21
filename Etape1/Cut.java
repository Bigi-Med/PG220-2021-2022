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
    
}

import java.util.List;
public class User 
{
    int id;
    List<? extends Wood> listWood;
    User(int id, List<? extends Wood> listWood)
    {
        this.id = id;
        this.listWood = listWood;
    }

}

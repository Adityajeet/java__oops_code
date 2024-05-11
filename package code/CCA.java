package P2;
interface CCA_Score
{
    float cca_credit=5;
    public void show();
}
public class CCA implements CCA_Score
{
    public void show()
    {
        System.out.println("CCA Credit: "+ cca_credit);
    }
}
package at.codersbay.main;

public class ShopItem {

    private String ItemName = "";
    private int Count = 0;
    private double Price = 0.0d;

    public ShopItem(String pName, int pCount, double pPrice)
    {
        ItemName = pName;
        Count = pCount;
        Price = pPrice;
    }

    public String getItemName()
    {
        return ItemName;
    }

    public int getCount() {
        return Count;
    }
    public double getPrice()
    {
        return Price;
    }

}

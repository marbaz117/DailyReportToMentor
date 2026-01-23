import java.util.*;

interface food{
    void price(int cost);
}
interface cloth{
    void price(int cost);
}

class electronic{
    public void price(int cost){
        System.out.println("Price of Gadget is : "+cost);
    }
}

class store extends electronic implements food,cloth{
    public void price(int cost){
        System.out.println("Product Price is : "+cost);
    }
}

public class code1{
    public static void main(String[] args){
        store s=new store();
        s.price(90);
    }
}
class Animal{
    String name;

    String getName(){
        return name;
    }

    void setName(String n){
        name = n;
    }
    public void show(){
        System.out.println("Srida Cat breed");
    }
}

public class Data {
    //private String name;
    public static void main(String[]args){
        Animal d1 = new Animal();
        d1.name = "Cat";
        d1.setName("Wilawan cat breed");
        System.out.println(d1.getName());

        d1.show();
        System.out.println(d1.name);
    }
}
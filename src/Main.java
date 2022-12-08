public class Main {
    public String name = "Mr.Mark Zuckerberg";
    public Number salary;
    public String ceo;
    Main(){
        name = "Lung Sri";
        System.out.println(name);
    }

    Main(String c){
        ceo = c;
    }
    Main(String n, Number s){
        name = n;
        salary = s;
        System.out.println("Constructor Called: " + n + "Salary:" + salary);
    }

    void getName(){
        System.out.println("Name of CEO: " + this.name);
    }

    public static void main(String[] args) {
        Main obj1 = new Main("Jeff Bezzo", 10000);
        Main obj2 = new Main();
        Main obj3 = new Main();
        obj2.getName();
        System.out.println("The name of ceo is " + obj3.ceo);
        System.out.println("The name is " + obj1.name + "\n" + " Salary: " + obj1.salary);
    }
}
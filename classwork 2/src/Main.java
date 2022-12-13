import  java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Animal dog = new Animal("Dog", 20);
        Animal cat = new Animal("Cat", 10);
        Animal test = new Animal();

        System.out.println(dog.getAge());
        System.out.println(cat.getAge());

        dog.setAge(21);
        cat.setAge(11);

        System.out.println(dog.getAge());
        System.out.println(cat.getAge());
        dog.testing();

        System.out.println(dog);
        System.out.println(cat);

        System.out.println(Animal.test);

        int n = Integer.parseInt("1");

        Scanner scanner = new Scanner(System.in);

        //test();

        Main main = new Main();
        main.test();
    }

    public static void test(){
        System.out.println("Testing...");
    }
}

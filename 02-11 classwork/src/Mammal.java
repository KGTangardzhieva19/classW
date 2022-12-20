public abstract class Mammal implements Animal {
    protected int age;
    protected double weight;

    public Mammal (int age, double weight)
    {
        this.age = age;
        this.weight = age;
    }
    public abstract void walk();

    public void testMammal() {
        System.out.println("testing in mammal class.");
    }
    @Override
    public void eat() {
        System.out.println("eating...");
    }
}
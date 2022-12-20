public class Dog extends Mammal {
    public String breed;

    public Dog(int age, double weight, String breed) {
        super(age, weight);
        this.breed = breed;
    }

    @Override
    public String toString()
    {
        return this.breed + " " + super.age + " " + super.weight;
    }

    @Override
    public void walk() {

    }

    @Override
    public void test() {

    }
}

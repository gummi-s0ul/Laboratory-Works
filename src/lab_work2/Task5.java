package lab_work2;

public class Task5 {
    public static void main(String[] args) {
        DogNursery dogNursery = new DogNursery(3);

        dogNursery.addDog("Шарик", 6);
        dogNursery.addDog("Бобик", 3);

        dogNursery.printDogNurseryInfo();

        dogNursery.getHumanAge(0);
    }

    static class Dog {
        private String name;
        private int age;

        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getHumanAge() {
            return age * 7;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    static class DogNursery {
        private Dog[] dogs;
        private int count;

        public DogNursery(int capacity) {
            dogs = new Dog[capacity];
            count = 0;
        }

        public void getHumanAge(int number){
            System.out.println(dogs[number].getHumanAge());
        }

        public void addDog(String name, int age) {
            if (count < dogs.length) {
                dogs[count] = new Dog(name, age);
                count++;
            } else {
                System.out.println("The nursery is full, no more dogs can be added");
            }
        }

        public void printDogNurseryInfo() {
            if (count == 0) {
                System.out.println("Nursery is empty");
            } else {
                System.out.println("List of dogs in nursery: ");
                for (int i = 0; i < count; i++) {
                    System.out.println(dogs[i].toString());
                }
            }
        }
    }
}

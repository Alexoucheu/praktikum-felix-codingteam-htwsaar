public class arrays {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 3, 2, 1};
        Dog[] dogs = new Dog[3]; // erzeugung von 3 Dog-Objekte und Array-Objekte | Die Werten erhalten null
        System.out.println("dogs[0] : " + dogs[0] + "\ndogs[1] : " + dogs[1] + "\ndogs[2] : " + dogs[2]);

        dogs[0] = new Dog();
        dogs[1] = new Dog();
        dogs[2] = new Dog();

        dogs[0].name = "Joe";
        dogs[1].name = "Rufus";
        dogs[2].name = "Trump";


        dogs[0].size = 54;
        dogs[1].size = 879;
        dogs[2].size = 25;


        dogs[0].breed = "german shepherd";
        dogs[1].breed = "golden retriver";
        dogs[2].breed = "labrador";

        int[] numbers2 = numbers;
        numbers2[1] = 60;
        System.out.println(numbers[1]);
        System.out.println(numbers2[1]);

        for(int i = 0; i < dogs.length; i++) {
            dogs[i].bark();
        }

    }
}

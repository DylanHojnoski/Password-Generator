package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Password google = new Password("google", 10);
        System.out.println(google.getName());
        System.out.println(google.getPassword());
    }
}
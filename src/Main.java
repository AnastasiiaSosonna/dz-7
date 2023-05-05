public class Main {
    public static void main(String[] args) {

        System.out.println("Planets List:");
        for (Planets p : Planets.values()) {
            System.out.println("The " + p + " is " + p.showDistanceFromTheSun() + " million kilometers from the Sun");
        }

    }

}
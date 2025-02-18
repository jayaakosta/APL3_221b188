public class Main {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Vikarn vikarn = new Vikarn();
        KauravNormal kaurav = new KauravNormal();

        System.out.println("Arjun's Actions:");
        arjun.fight();
        arjun.obey();
        arjun.kind();
        System.out.println("Arjun is a " + arjun.getType());

        System.out.println("\nBheem's Actions:");
        bheem.fight();
        bheem.obey();
        bheem.kind();
        System.out.println("Bheem is a " + bheem.getType());

        System.out.println("\nVikarn's Actions:");
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
        System.out.println("Vikarn is a " + vikarn.getType());

        System.out.println("\nKaurav's Actions:");
        kaurav.fight();
        kaurav.disobey();
        kaurav.cruel();
        System.out.println("Kaurav is a " + kaurav.getType());
    }
}

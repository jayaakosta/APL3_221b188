interface KindAndObedient {
    void obey();
    void kind();
}

class Vikarn extends Kaurav implements KindAndObedient {
    @Override
    public void fight() {
        System.out.println("Vikarn is fighting honorably.");
    }

    @Override
    public void obey() {
        System.out.println("Vikarn is obedient and listens to instructions.");
    }

    @Override
    public void kind() {
        System.out.println("Vikarn is kind and helps others.");
    }

    @Override
    public String getType() {
        return "Kaurav";
    }
}
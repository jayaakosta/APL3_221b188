abstract class Beverage{

    protected void pourBeverage(int qnt){
        System.out.println("Pour " + qnt + " of beverage into a glass.");
    }
    protected abstract void addCondiments();
    protected void stir(){}
    private void serve(){
        System.out.println("Serve through waiter.");
    }
    final public void templateMethod(int qnt){
        pourBeverage(qnt);
        addCondiments();
        stir();
        serve();
    }
}
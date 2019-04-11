public class Traveller {
    //Car c = new Car();

    private Vehicle v;

    public Traveller(Vehicle v) {
        this.v = v;
    }

    public void yolculugaBasla() {
        String yolculukAracı = v.aracVer("Honda");
        System.out.println("yolculugnuz başlamak üzere");
        System.out.println(yolculukAracı + "ile yolculugunuz baslamıstır.");
    }
}

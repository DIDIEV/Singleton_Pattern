import boilers.Boiler;
public class Main {
    public static void main(String[] args) {

        System.out.println("\n---Welcome to Wonka's Chocolate Factory---\n");
        Boiler wonkasBoiler = Boiler.getInstance();
        wonkasBoiler.fill();
        wonkasBoiler.mix();
        wonkasBoiler.unFill();
        System.out.println("\n---The Chocolate is ready to be served---\n");

        System.out.println("\n---Time to steal wonka's chocolate Boiler---\n");
        Boiler thiefBoiler = Boiler.getInstance();
        if(wonkasBoiler == thiefBoiler){
            System.out.println("\n---You have successfully stolen Wonka's Chocolate Boiler---\n");
        }

    }
}

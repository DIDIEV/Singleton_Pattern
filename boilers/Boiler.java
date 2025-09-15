package boilers;

public class Boiler {
    private static Boiler instance;
    private boolean empty;
    private boolean isResistanceOn;

    private Boiler() {
        empty = true;
        isResistanceOn = false;
    }

    public static Boiler getInstance() {
        if (instance == null) {
            instance = new Boiler();
        }
        return instance;
    }
    
    public void fill() {
        if (empty && !isResistanceOn) {
            empty = false;
            System.out.println("\n---Filled the boiler with Chocolate and Milk---\n");
        }
    }
    
    public void mix(){

        if(!empty && !isResistanceOn){
            System.out.println("\n---Turning on the resistance---\n");
            System.out.println("\n---Mixing the ingredients---\n");
            setResistance(true);
        }else if(empty){
            System.out.println("\n---The boiler is empty, please fill it with Chocolate and Milk first---\n");
        }else if(isResistanceOn){
            System.out.println("\n---Turn off the resistance to mix---\n");
        }

    }

    public void unFill(){
        if (!empty && isResistanceOn) {
            System.out.println("\n---Turning off the resistance---\n");
            setResistance(false);
            System.out.println("\n---Pouring the Chocolate---\n");
            setEmpty(true);
        }
    }

    public boolean getEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
    public void setResistance(boolean isResistanceOn) {
        this.isResistanceOn = isResistanceOn;
    }
    public boolean getResistance() {
        return isResistanceOn;
    }
}

public class DiscreteSignal implement Signal{
    public void processSignal{
        System.out.println("Processing continuous signal...");
    }
}
public class Main{
    public static void main(String[] args){
        Signal discrete = new DiscreteSignal();
            discrete.processSignal();
        Signal continuous.processSignal();
    }
}
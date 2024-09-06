public class Radar{
    public double X(int n){
        if(n >= 0 && n <= 15)
            return 1 - (n / 15);
        else
            return 0;
        public static void main(String[] args){
            Radar radar = new Radar();
            int n = 4;
            double result = Radar.X(n);
            System.out.println("Result:" + result);
        }
    }
}
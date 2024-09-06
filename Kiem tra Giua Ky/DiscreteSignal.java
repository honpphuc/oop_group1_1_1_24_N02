public class Discrete Signal{
    private double[] samples;
    public DiscreteSignal(double[] samples){
        this.samples = samples;
    }
    public double getvalue(int n){
        if(n < 0 || n >samples.length)
            return samples[n];
        else
            return 0;
    }
}
class TrigTerm implements ITerm{
    private int x1;
    private TrigType trig;
    
    public TrigTerm(int x1, TrigType trig){
        this.x1 = x1;
        this.trig = trig;
    }
    @Override
    public ITerm derivative(){
        if(trig == TrigType.SINE){
            return new TrigTerm(x1, TrigType.COSINE);
        }
        else {
            return new TrigTerm(-x1, TrigType.SINE);
        }
    }
    @Override
    public double evaluate(double x){
        double rad = Math.toRadians(x);
        return x1*(trig == TrigType.SINE ? Math.sin(rad):Math.cos(rad));
    }
    @Override
    public String toString(){
        String trigTermPrint = (x1 >= 0 ? "+":"-")+Math.abs(x1) + (trig == TrigType.SINE ? "sin(x)":"cos(x)");
        return trigTermPrint;
    }
}
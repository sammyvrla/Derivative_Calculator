class PolynomialTerm implements ITerm{
    private int x1;
    private int b;
    
    public PolynomialTerm(int x1, int b){
        this.x1 = x1;
        this.b = b;
    }
    @Override
    public ITerm derivative(){
        if(b > 2){
            return new PolynomialTerm(x1*b, b-1);
        }
        else if(b == 2){
            return new LinearTerm(x1*2);
        }
        else{
            return new ConstantTerm(0);
        }
    }
    @Override
    public double evaluate(double x){
        return x1*Math.pow(x, b);
    }
    @Override
    public String toString(){
        String polyTerm = (x1 >= 0 ? "+":"-")+Math.abs(x1) + "x^" + b;
        return polyTerm;
    }
}
class LinearTerm implements ITerm{
    private int x1;

    public LinearTerm(int x1){
        this.x1 = x1;
    }
    @Override
    public ITerm derivative(){
        return new ConstantTerm(x1);
    }
    @Override
    public double evaluate(double x){
        return x1 * x;
    }
    @Override
    public String toString(){
        String linTerm = (x1 >= 0 ? "+":"-")+Math.abs(x1) + "x";
        return linTerm;
    }
}
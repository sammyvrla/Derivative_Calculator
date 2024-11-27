class ConstantTerm implements ITerm {
    private int a;

    public ConstantTerm(int a) {
        this.a = a;
    }

    @Override
    public ITerm derivative() {
        return new ConstantTerm(0);

    }

    @Override
    public double evaluate(double x) {
        return a;
    }

    @Override
    public String toString() {
        String constTerm = (a >= 0 ? "+" : "-") + Math.abs(a);
        return constTerm;
    }
}
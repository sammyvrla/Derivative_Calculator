class Expression{
    private ProjLinkedList<ITerm> terms;
    public Expression(){
        this.terms = new ProjLinkedList<>();
    }
    public void add(ITerm term){
        terms.add(term);
    }
    public Expression getDerivative(){
        Expression derivative = new Expression();
        ProjNode<ITerm> current = terms.getHead();
        while(current != null){
            ITerm term = current.getData();
            ITerm termDerivative = term.derivative();
            if(!(termDerivative instanceof ConstantTerm)||termDerivative.evaluate(0) != 0){
                derivative.add(termDerivative);
            }
            current = current.getNext();
        }
        return derivative;
    }
    public double getEvaluation(double x){
        double answer = 0;
        ProjNode<ITerm> current = terms.getHead();
        while(current != null){
            ITerm term = current.getData();
            answer += term.evaluate(x);
            current = current.getNext();
        }
        return answer;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        ProjNode<ITerm> current = terms.getHead();
        while(current != null){
            sb.append(current.getData().toString());
            current = current.getNext();
        }
        return sb.toString();
    }
}
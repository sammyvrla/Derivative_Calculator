class ProjNode<T>{
    private T data;
    private ProjNode<T> next;
    
    public ProjNode(T data, ProjNode<T> next){
        this.data = data;
        this.next = next;
    }
    public T getData(){
        return data;
    }
    public ProjNode<T> getNext(){
        return next;
    }
    public void setNext(ProjNode<T> next){
        this.next = next;
    }
}
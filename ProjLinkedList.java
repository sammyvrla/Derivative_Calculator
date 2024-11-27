class ProjLinkedList<T>{
    private ProjNode<T> head;
    
    public ProjLinkedList(){
        head = null;
    }
    public ProjNode<T> getHead() {
        return head;
    }
    public void add(T data){
        ProjNode<T> nodeOne = new ProjNode<>(data, null);
        nodeOne.setNext(head);
        head = nodeOne;
    }
    public T getAt(int index){
        ProjNode<T> curNode = head;
        int i = 0;
        while(curNode != null){
            if(i == index){
                return curNode.getData();
            }
            curNode = curNode.getNext();
            i++;
        }
        return null;
    }
}
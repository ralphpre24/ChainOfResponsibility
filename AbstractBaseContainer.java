package src;

public abstract class  AbstractBaseContainer implements WasteContainer {
    private WasteContainer nextChain; 
    protected int capacity;

    public AbstractBaseContainer(int capacity){
        this.capacity = capacity;
    }

    @Override
    public void setNextChain(WasteContainer nextChain) {
        this.nextChain = nextChain;
    }

    protected void moveNextContainer(Waste waste) {
        if(nextChain != null){
            nextChain.collect(waste);
        } else {
            System.out.println("No suitable Container found");
        }
    }

}

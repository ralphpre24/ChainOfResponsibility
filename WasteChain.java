package src;


public class WasteChain {
    private WasteContainer chain;    

    public WasteChain(){
        chain = new RecyclableContainer(100);
        WasteContainer organic = new OrganicContainer(100);
        WasteContainer hazardous = new HazardousContainer(100);
        chain.setNextChain(organic);
        chain.setNextChain(hazardous);
    }

    public void processWaste(Waste waste){
        chain.collect(waste);
    }
}

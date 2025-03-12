package src;


public interface WasteContainer {
   void setNextChain(WasteContainer nextChain); 
   void collect(Waste waste);
}

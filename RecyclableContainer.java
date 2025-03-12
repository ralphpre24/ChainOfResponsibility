package src;

public class RecyclableContainer extends AbstractBaseContainer{
    public RecyclableContainer(int capacity){
        super(capacity);
    }

    @Override
    public void collect(Waste waste) {
        if(waste.getType().equals("Recyclable") && capacity > 0){
            int processed = Math.min(capacity, waste.getQuantity());
            capacity -= processed;
            waste.setQuantity(waste.getQuantity() - processed);
            if (capacity == 0) {
               System.out.println("Recyclable container if Full -- \"Emptying\" "); 
               capacity = 100;
            }else{
                moveNextContainer(waste);
            }

        }
    }
   
}

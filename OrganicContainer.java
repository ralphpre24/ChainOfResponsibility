package src;

public class OrganicContainer extends AbstractBaseContainer{
    public OrganicContainer(int capacity){
        super(capacity);
    }

    @Override
    public void collect(Waste waste) {
        if(waste.getType().equals("Organic") && capacity > 0){
            int processed = Math.min(capacity, waste.getQuantity());
            capacity -= processed;
            waste.setQuantity(waste.getQuantity() - processed);
            if (capacity == 0) {
               System.out.println("Organic container if Full -- \"Emptying\" "); 
               capacity = 100;
            }else{
                moveNextContainer(waste);
            }

        }
    }
   
}

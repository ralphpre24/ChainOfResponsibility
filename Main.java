package src;

public class Main {
   public static void main(String[] args) {
      WasteChain wasteChain = new WasteChain();

      Waste[] wastes = new Waste[]{
         new Waste("Organic", 70),
         new Waste("Recyclable", 30),
         new Waste("Recyclable", 40),
         new Waste("Hazardous", 60),
         new Waste("Recyclable", 90),
         new Waste("Hazardous", 50),
         new Waste("Organic", 27)
      };

      for (Waste waste: wastes){
         System.out.println("Waste processing " + waste.getType());
         wasteChain.processWaste(waste);
      }
   } 
}

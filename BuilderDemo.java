public class BuilderDemo{  
 public static void main(String args[]){  
  System.out.print("Welcome to IndoJaya Mobil!"); 
  System.out.print("\n");
  System.out.print("Berikut adalah list harga yang kami tawarkan"); 
  System.out.print("\n");
  System.out.print("============================================================"); 
  System.out.print("\n"); 
   CDBuilder cdBuilder=new CDBuilder();  
   CDType cdType1=cdBuilder.buildHondaCD();  
   cdType1.showItems();  
  
   CDType cdType2=cdBuilder.buildMitsubishiCD();  
   cdType2.showItems();  
   
   CDType cdType3=cdBuilder.buildHyundaiCD();  
   cdType3.showItems();  
 }  
}
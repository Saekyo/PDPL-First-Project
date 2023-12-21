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

   CDType cdType4=cdBuilder.buildToyotaCD();  
   cdType4.showItems(); 

   CDType cdType5=cdBuilder.buildDaihatsuCD();  
   cdType5.showItems();

   CDType cdType6=cdBuilder.buildWulingCD();  
   cdType6.showItems();

   CDType cdType7=cdBuilder.buildMercedesCD();  
   cdType7.showItems();

   CDType cdType8=cdBuilder.buildFerrariCD();  
   cdType8.showItems();

   CDType cdType9=cdBuilder.buildAudiCD();  
   cdType9.showItems();

   CDType cdType10=cdBuilder.buildMiniCooperCD();  
   cdType10.showItems();
 }  
}
import java.util.ArrayList;  
import java.util.List;  
public class CDType {  
             private List<Packing> items=new ArrayList<Packing>();  
             public void addItem(Packing packs) {    
                    items.add(packs);  
             }  
             public void getCost(){  
              for (Packing packs : items) {  
                        packs.price();  
              }   
             }             
             public void getYear(){  
              for (Packing packs : items) {  
                        packs.year();  
              }   
             }
             public void showItems(){   
              for (Packing packing : items){ 
             System.out.print(packing.pack());  
             System.out.print(", Tahun : "+packing.year());
             System.out.println(", Harga : "+packing.price()); 
          }       
            }     
}//End of the CDType class.
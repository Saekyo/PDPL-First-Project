import java.util.ArrayList;  
import java.util.List;  
public class CDType {  
             private List<Packing> items=new ArrayList<Packing>();  
             public void addItem(Packing packs) {    
                    items.add(packs);  
             }  
             //Memanggil method price() dari setiap objek Packing
             public void getCost(){  
              for (Packing packs : items) {  
                        packs.price();  
              }   
             }             
             //Memanggil method year() dari setiap objek Packing
             public void getYear(){  
              for (Packing packs : items) {  
                        packs.year();  
              }   
             }
             //Menampilkan informasi terkait setiap item ke layar 
             public void showItems(){   
              for (Packing packing : items){ 
             System.out.print(packing.pack());  
             System.out.print("| Tahun : "+packing.year());
             System.out.print("| Type : "+packing.transmisi());
             System.out.println("| Harga : "+packing.price()); 
          }       
            }     
}//End of the CDType class.
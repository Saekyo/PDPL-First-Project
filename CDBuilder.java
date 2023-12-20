public class CDBuilder {  
                  public CDType buildHondaCD(){   
                     CDType cds=new CDType();  
                     cds.addItem(new Honda());  
                     return cds;  
              }  
              public CDType buildMitsubishiCD(){  
             CDType cds=new CDType();  
             cds.addItem(new Mitsubishi());  
             return cds;  
              }
              public CDType buildHyundaiCD(){  
             CDType cds=new CDType();  
             cds.addItem(new Hyundai());  
             return cds;  
              }

}// End of the CDBuilder class.
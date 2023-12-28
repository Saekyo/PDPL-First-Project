public class CDBuilder {  
              //Menginisialisasi objec CDType 
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

              public CDType buildToyotaCD(){  
             CDType cds=new CDType();  
             cds.addItem(new Toyota());  
             return cds;  
              }

              public CDType buildDaihatsuCD(){  
             CDType cds=new CDType();  
             cds.addItem(new Daihatsu());  
             return cds;  
              }

               public CDType buildWulingCD(){  
             CDType cds=new CDType();  
             cds.addItem(new Wuling());  
             return cds;  
              }

              public CDType buildMercedesCD(){  
             CDType cds=new CDType();  
             cds.addItem(new Mercedes());  
             return cds;  
              }

              public CDType buildFerrariCD(){  
             CDType cds=new CDType();  
             cds.addItem(new Ferrari());  
             return cds;  
              }

              public CDType buildAudiCD(){  
             CDType cds=new CDType();  
             cds.addItem(new Audi());  
             return cds;  
              }

              public CDType buildMiniCooperCD(){  
             CDType cds=new CDType();  
             cds.addItem(new MiniCooper());  
             return cds;  
              }

}// End of the CDBuilder class.
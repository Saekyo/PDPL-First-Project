public class Honda extends Company{ 
    //Mengoveride dari class Company 
    @Override  
        public String price(){   
                        return "Rp. 265.000.000";  
      }  
      @Override  
      public int year()
      {
          return 2020;
      }
       @Override  
        public String transmisi(){   
                        return "Manual";  
      }
    @Override  
    public String pack(){  
             return "HONDA HR-V";  
        }         
}//End of the Honda class. 
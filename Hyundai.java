public class Hyundai extends Company{  
  //Mengoveride dari class Company
    @Override  
        public String price(){   
                        return "RP. 700.000.000";  
      }  
    @Override  
    public int year()
    {
        return 2023;
    }

    @Override  
    public String transmisi(){   
                    return "Manual";  
  }
    @Override  
    public String pack(){  
             return "HYUNDAI IONIQ 5";  
        }         
}//End of the Hyundai class. 
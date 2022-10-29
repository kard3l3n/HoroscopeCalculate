package horoscopecalc;
import java.util.Scanner;
import java.math.*;
public class HoroscopeCalc {
    public static void main(String[] args) {
        int day,month;
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Doğum günüzü giriniz");
        day=input.nextInt();
        
        System.out.println("Doğduğunuz Ayı giriniz:");
        month=input.nextInt();
        
        if(month==1){
            if(day>=22 && day<=31){
                System.out.println("Kova burcu");
            }
            else if(day<=21 && day>=1){
                System.out.println("Oğlak Burcu");
            }
        }
        else if(month==2){
            if(day<=19 && day>=1){
                System.out.println("Kova burcu"); 
            }
            else if(day>=20 && day<=31){
                System.out.println("Balık burcu");  
            }
            
        }
        else if(month==3){
            if(day>=21 && day<=31){
                System.out.println("Koç burcu");
            }
            else if(day<=22 && day>=1){
                System.out.println("Balık burcu");
            }
        }
        else if(month==4){
            if(day<=20 && day>=1){
                System.out.println("Koç burcu");
            }
            else if(day>20 && day<=31){
                System.out.println("Boğa burcu");
            }
            
        }
        else if(month==5){
            if(day>=22 && day<=31){
                System.out.println("İkizler burcu");
            }
            else if(day<22 && day>=1){
                System.out.println("Boğa burcu");  
            }
        }
        else if(month==6){
            if(day<=22 && day>=1){
                System.out.println("İkizler burcu");
            }
            else if(day>=23 && day<=31){
                System.out.println("Yengeç burcu");
            }
            
        }else if(month==7){
            if(day<=22 && day>=1){
                System.out.println("Yengeç burcu");
                
            }
            else if(day>=23 && day<=31){
                System.out.println("Aslan burcu");
                
            }
            
        }else if(month==8){
            if(day<=22 && day>=1){
                System.out.println("Aslan burcu");
                
            }
            else if(day>23 && day<=31){
                System.out.println("Başak burcu");
                
            }
            
        }else if(month==9){
            if(day<=22 && day>=1){
                 System.out.println("Başak burcu");
            }
            else if(day>=23 && day<=31){
                 System.out.println("Terazi burcu");
            }
            
        }else if(month==10){
            if(day<=22 && day>=1){
                 System.out.println("Terazi burcu");
            }
            else if(day>=23 && day<=31){
                 System.out.println("Akrep burcu");
            }
            
        }else if(month==11){
            if(day<=21 && day>=1){
                 System.out.println("Akrep burcu");
            }
            else if(day>=22 && day<=31){
                 System.out.println("Yay burcu");
            }
            
        }else if(month==12){
            if(day<=21 && day>=1){
                 System.out.println("Yay burcu");
            } 
            else if(day>=22 && day<=31){
                 System.out.println("Oğlak burcu");
            }
            
        }else{
            System.out.println("Girdiğiniz bilgiler hatalı");
        }
    }
    
}

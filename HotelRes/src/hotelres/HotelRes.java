package hotelres;
import java.util.*;
import java.text.*;
public class HotelRes {
public static void main(String[] args) {
  Scanner a=new Scanner(System.in);
           DateFormat date = new SimpleDateFormat("dd/MM/yyyy\t\t\t\t\t\t\tHH:mm:ss");
      Calendar cal = Calendar.getInstance();
      System.out.println(date.format(cal.getTime()));
      System.out.println("\t\tWelcome To Room Reservation in the Hotel..");
      System.out.println("\t\t\tWe are Happy to Help you..");
      System.out.println("Enter the Following Form Properly, Book your room and then Enjoy our Services.. ");
      
      System.out.println("\tTitle : ");
      System.out.println("-> Press 1 for : Mr.");
      System.out.println("-> Press 2 for : Ms.");
      System.out.print("Enter here : ");
      String[] mrs={"Mr.","Ms."};
      int[] m={1,2};
      int t=0;
      int ma= a.nextInt();
      for(int i=0; i<mrs.length; i++ ){
          if(ma==m[i])
              t=i;
      }
      System.out.print("-> Enter your First Name here : ");
              String fn=a.next();
      System.out.print("-> Enter you Last Name here : ");
              String ln=a.next();
      System.out.print("-> Enter your Age here : ");
              
              int x=1;
              do{ 
              int age=a.nextInt();            
              if(age<18)
                  System.out.print("You must be 18+ to fill this form... ReCheck and ReEnter..!\n-> Enter Again or Exit : ");
              
              else if(age>=100)
                  System.out.print("Haha.. You must be kidding me.. ReCheck and ReEnter..! \n-> Enter Again : ");
              else
                  x=2;
}while(x==1);
              
              System.out.print("-> How many people(Excluding Children i.e. 12+) are with you ? : ");
              int pa=a.nextInt();
      
          System.out.println("\tHere is the List of types of rooms :");
          
          int[] srno={1,2,3,4,5,6,7,8,9,10};
          String[] room={"Luxury(King size : Single)","Luxury(King size : Double)","Deluxe(quad)","Deluxe(Tripple)","Deluxe(Twin)","Deluxe(Single)","Semi Deluxe(Quad)","Semi Deluxe(Tripple)","Semi Deluxe(Twin)","Semi Deluxe(Single)"};
          double[] price={9000,7000,4500,3500,3000,2500,2000,1500,1000,700};
          System.out.println("|---------|---------------------------------|----------|");
          System.out.println("| Sr. no. | List of Rooms                   | Price    |");
          System.out.println("|---------|---------------------------------|----------|");
          System.out.println("| 1.      | Luxury Room(King size : Double) | 9000.00  |");
          System.out.println("| 2.      | Luxury Room(King size : Single) | 7000.00  |");
          System.out.println("| 3.      | Deluxe Room(quad)               | 4500.00  |");
          System.out.println("| 4.      | Deluxe Room(Tripple)            | 3500.00  |");
          System.out.println("| 5.      | Deluxe Room(Twin)               | 3000.00  |");
          System.out.println("| 6.      | Deluxe Room(Single)             | 2500.00  |");
          System.out.println("| 7.      | Semi Deluxe Room(quad)          | 2000.00  |");
          System.out.println("| 8.      | Deluxe Room(Tripple)            | 1500.00  |");
          System.out.println("| 9.      | Semi Deluxe Room(Twin)          | 1000.00  |");
          System.out.println("| 10.     | Semi Deluxe Room(Single)        | 700.00   |");
          System.out.println("|---------|---------------------------------|----------|");
      if(pa==0){
          System.out.println("Suggested Rooms : ");
          System.out.println("Luxury Room(King size : Single)\nDeluxe Room(Single)\nSemi Deluxe Room(Single) ");
      }
      else if(pa>0 && pa<100){
          System.out.println("Will Suggest you to go for twin, tripple or quad rooms that are available in \nDeluxe and Semi Deluxe Acoording to your requirement ");
      }
      else 
          System.out.println("Sorry we cant Arrange rooms for more than 100 people..!");
      System.out.print("Enter The Sr. no. of the required Room : ");
      int sr=a.nextInt();
      int w=0;
      for(int i=0; i<10; i++){
          if(sr==srno[i])
              w=i;
      }
        
       int book=1; 
        if(pa==0){
            System.out.println(mrs[t]+fn+" "+ln+", you are Booking "+room[w]+" room for you.");
        }
      else if(pa>0 && pa<100){
          System.out.print("-> How many "+room[w]+" you want to book ? : ");
         book=a.nextInt();
        System.out.println(mrs[t]+fn+" "+ln+", you are Booking "+book+" "+room[w]+" rooms for "+pa+" persons.");
      }
        
        System.out.println("-> Total cost = "+(price[w]*book));
        System.out.println("Thank You "+mrs[t]+fn+" "+ln);
        System.out.println("IN YOU SERVICE .. CALL ANYTIME WITHOUT ANY HESITATION..!");
        System.out.println("\t\tHOPE YOU ENJOY ..!");
        System.out.println("");
        
    }
    
}

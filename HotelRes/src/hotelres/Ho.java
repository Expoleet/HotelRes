package ho;
import java.util.*;
public class Ho {
public static void main(String[] args) {

    int sh=1;
    do{
    try{
        Scanner a=new Scanner(System.in);
        int p=1,q=1,e=1,r=1;
       int[]sn={0,1,2};
       int []n1={0,1,2,3,4};
        int[] rom={1,2,3};
       int ha=0;
        int[]f1={101,102,103,104,105};
        int[]f2={201,202,203,204,205};
        int[]f3={301,302,303,304,305};
       System.out.println("Select Floor");
        for (int i=0;i<rom.length;i++){
           System.out.println(sn[i]+"\t"+"Floor"+rom[i]);
       }
        System.out.println("Enter sr.no to choose floor: ");
        p=a.nextInt();
        for (int i=0;i<1;i++){
        if(p==sn[i])
            p=i;}
        
        System.out.println("Choose  the room :");
        for (int i=0;i<5;i++){
            if(sn[p]==0)
                System.out.println(n1[i]+"\t"+"Room No."+f1[i]);
            else if(sn[p]==1)
                System.out.println(n1[i]+"\t"+"Room No."+f2[i]);
            else if(sn[p]==2)
                System.out.println(n1[i]+"\t"+"Room No."+f3[i]);
        }
       int ds=1;
        do{
        for (int i=0;i<1;i++){
            q=a.nextInt();
            if(q==n1[i])
                q=i;
             if (q>=0&&q<=4)
                ds=2;
           else if(q>=5)
           System.out.println("Invadil Selection");
                
            }    
        }while(ds==1);
        System.out.println("Enter no. of member : ");
        
         int d;
         int x=1;
         do{  d=a.nextInt();
             if(d>0&&d<=5)
             x=2;
         if(d>6)
             System.out.println("no. of member Exceeded Minimum members in a room is 4");
         }while(x==1);
        
        for(int i=0;i<1;i++){
            if(sn[p]==0){
                System.out.println("Room on Floor "+rom[p]+" and room no. "+f1[q]+" with total no. of members "+d); 
                ha=f1[q];}
            if(sn[p]==1){
                System.out.println("Room on Floor "+rom[p]+" and room no. "+f2[q]+" with total no. of members "+d);
                ha=f2[q];}
            if(sn[p]==2){
                System.out.println("Room on Floor "+rom[p]+" and room no. "+f3[q]+" with total no. of members "+d);
                ha=f3[q];
            }
        }
                
                
        String [] me=new String[d];
        System.out.println("Enter name of Members");
        for(int i=0;i<me.length;i++){
            System.out.println("name of member:");
            me[i]=a.next();
        }
        int[] n2={0,1};
        int[] n4={0,1};
        int[] n5={0,1};
        int[] n6={0,1};
        int[] n3={0,1,2};
        int ui=1,oi=1,po=1;
        String []yep={"YES","NO"};
        String[] trom={"AC","NON-AC"};
        String[] exsr={"Laundary","Meal","Room Service"};
        int na=2000;
        int ac=3500;
        int lan=50;
        int ser=12;
        int meal=1500;
        int rose=200;
       System.out.println("Charges for AC Room : "+ac);
       System.out.println("Charges of Non-AC Room: "+na);
       System.out.println("Chargers Of Laundary Per Cloth : "+lan);
       System.out.println("Charges for meal per member for  a day :"+meal);
       System.out.println("Room Service Charges :"+rose);
        
       System.out.println("Choose the Room type:");
       for(int i=0;i<2;i++){
           System.out.println(n2[i]+"\t"+"Room Type "+trom[i]);
       }int ma=1;
       do{
        for (int i=0;i<1;i++){
            System.out.println("Enter Serial no to choose room type");
            e=a.nextInt();
            if(e==n2[i])
                e=i;
            if(e>=0&&e<=1)
                ma=2;
            else
                System.out.println("Invalid Seletion");
        }        
       }while(ma==1)  ;    
        
       System.out.println("Laundary Service");
       for(int i=0;i<2;i++){
           System.out.println(n4[i]+"\t"+yep[i]);
       }int yu=1;
       do{
       for (int i=0;i<1;i++){
            System.out.println("Enter Serial no to choose");
            ui=a.nextInt();
            if(ui==n4[i])
                ui=i;
            if(ui>=0&&ui<=1)
                yu=2;
            else
                System.out.println("Invalid Seletion");
            }
       }while(yu==1);
        
       System.out.println("Meal Service");
       for(int i=0;i<2;i++){
           System.out.println(n5[i]+"\t"+yep[i]);
       }int yk=1;
       do{
       for (int i=0;i<1;i++){
            System.out.println("Enter Serial no to choose");
            oi=a.nextInt();
            if(oi==n5[i])
                oi=i;
            if(oi>=0&&oi<=1)
                yk=2;
            else
                System.out.println("Invalid Seletion");
        }
       }while(yk==1);
       System.out.println("Room Service");
       for(int i=0;i<2;i++){
           System.out.println(n6[i]+"\t"+yep[i]);
       }int tik=1;
       do{
        for (int i=0;i<1;i++){
            System.out.println("Enter Serial no to choose");
            po=a.nextInt();
            if(po==n6[i])
                po=i;
            if(po>=0&&po<=1)
                tik=2;
            else
                System.out.println("Invalid Seletion");    
        }
       }while(tik==1);
        int lon = 0;
        int lo=0;
       if(n4[ui]==0) {
        System.out.println("number of laundary :");
        lon=a.nextInt();
        lo=lon*lan;}
       int kjk=0;
       int kj=0;
       if(n5[oi]==0){
        System.out.println("number of meals taken :");
        kjk=a.nextInt();
        kj=kjk*meal;}
       int ll=0;
        if(n6[po]==0){
           ll= rose;
        }
        System.out.println("Number of Days Stayed :");
        int dg=a.nextInt();
        System.out.println("Total Amount Before Tax");
        int gh = 0;
        for(int i=0;i<1;i++){
            if(n2[e]==0)
             gh=(lo+kj+ac+lo)*dg;
           else if(n2[e]==1)
             gh=(lo+kj+na+lo)*dg;
              System.out.println(gh);
        }
         System.out.println("Total Amount After Tax");
         int jk = 0;
         int mk=0;
         for(int i=0;i<1;i++){
            if(n2[e]==0)
           jk=  ((lo+kj+ac+ll)*dg*ser)/100;
           else if(n2[e]==1)
            jk= ((lo+kj+na+ll)*dg)/ser;
            mk=gh+jk;
             System.out.println(mk);
        }
        
     
     
        System.out.println("|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("Floor\t"+"Room no.\t"+"Room Type\t"+"Laundary\t"+"Landary Charges\t\t"+"Meals\t\t"+"Meals Charges\t"+"Room Srvice\t"+"Room Service Charges\t\t"+"No. of days Stayed\t"+"Payment without tax\t"+"Tax added\t"+"Payment After tax");
        System.out.println("|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        System.out.println("| "+rom[p]+"\t| "+ha+"\t\t| "+trom[e]+"\t\t| "+yep[ui]+"\t\t| "+lo+"\t\t\t| "+yep[oi]+"\t\t| "+kj+"\t\t| "+ll+"\t\t| "+yep[po]+"\t\t\t\t| "+dg+"\t\t\t| "+gh+"\t\t\t| "+jk+"\t\t\t| "+mk);
        System.out.println("|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|");
        sh=2;
    }catch(Exception him){
        System.out.println("Invalid Enrty");
    }
    }while(sh==1);
    }
    
}    
            
              
           
     
        
   

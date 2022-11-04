/* A program of a Mall Management system based in java and executed in Blue j compiler */
import java.util.*;
import java.io.*;
class Shopping_Mall //extends s
{

    static BufferedReader y=new BufferedReader(new InputStreamReader(System.in));//Creating Buffered Object for keyboard input
    static int ch,sr,qt,c1,bill=0,c=0;//Instance Variables Initialized
    static String items[]=new String[22];//Array Declared
    static int cost[]=new int[22];
    static String blank[]=new String[22];
    static int bq[]=new int[22];
    static int quan[]=new int[22];




    private void setdata()
    {

        items[1]=". T-SHIRT          ";
        items[2]=". BLUE JEANS       ";
        items[3]=". SNEAKERS         ";
        items[4]=". SHIRT            ";
        items[5]=". TROUSER          ";
        items[6]=". LIPSTICK         ";
        items[7]=". PERFUME          ";
        items[8]=". DEO-ODORANT      ";
        items[9]=". NAIL-POLISH      ";
        items[10]=". MAKE-UP KIT      ";
        items[11]=". TOUCH PHONE      ";
        items[12]=". A/C              ";
        items[13]=". GAMING CONSOLE   ";
        items[14]=". MUSIC SYSTEM     ";
        items[15]=". WASHING MACHINE  ";
        items[16]=". CHIPS            ";
        items[17]=". CHOCOLATES       ";
        items[18]=". NOODLES          ";
        items[19]=". COKE             ";
        items[20]=". FRITTERS         ";

        cost[1]=200;
        cost[2]=300;
        cost[3]=750;
        cost[4]=500;
        cost[5]=1000;
        cost[6]=400;
        cost[7]=150;
        cost[8]=275;
        cost[9]=840;
        cost[10]=1500;
        cost[11]=50000;
        cost[12]=80000;
        cost[13]=30000;
        cost[14]=60000;
        cost[15]=15000;
        cost[16]=20;
        cost[17]=35;
        cost[18]=90;
        cost[19]=100;
        cost[20]=50;
    }





    private void disp()throws IOException
    {
        System.out.println("\n\t\t\t\t\t\tPlease enter what you want to BUY \n\n\n\t 1. Clothes \t\t\t\t2. Cosmetic \t\t\t\t3. Electronics \t\t\t\t4.Consumer Goods "); 
    }





    private void buy()throws IOException
    {
        ch=Integer.parseInt(y.readLine());
        switch(ch)
        {

        case 1:
            System.out.println();
            for(int i=1;i<6;i++)
            {
                System.out.println(i+items[i]+"\t\t\t\t"+"Rs."+cost[i]);
                System.out.println();
            }
            System.out.println("Please enter the serial no of what you want to BUY"); 
            sr=Integer.parseInt(y.readLine());
            if(sr>=1 && sr<=5)
            {
                System.out.println("Please enter the quantity you want to BUY"); 
                qt=Integer.parseInt(y.readLine());
                bill=bill+cost[sr]*qt;
                blank[c]=items[sr];
                bq[c]=cost[sr];
                quan[c]=qt;
                c++;
                break;
            }
            else
            {
                System.out.println("Invalid choice");
                break;
            }   


        case 2:
            System.out.println();
            for(int i=6;i<11;i++)
            {
                System.out.println((i-5)+items[i]+"\t\t\t\t"+"Rs."+cost[i]);
                System.out.println();
            }
            System.out.println("Please enter the serial no of what you want to BUY"); 
            sr=Integer.parseInt(y.readLine());
            if(sr>=1&&sr<=5)
            {
                System.out.println("Please enter the quantity you want to BUY"); 
                qt=Integer.parseInt(y.readLine());
                bill=bill+cost[(sr+5)]*qt;
                blank[c]=items[(sr+5)];
                bq[c]=cost[(sr+5)];
                quan[c]=qt;
                c++;
                break;
            }
            else{
                System.out.println("Invalid choice");
                break;
            }


        case 3:
            System.out.println();
            for(int i=11;i<16;i++)
            {
                System.out.println((i-10)+items[i]+"\t\t\t\t"+"Rs."+cost[i]);
                System.out.println();
            }
            System.out.println("Please enter the serial no of what you want to BUY"); 
            sr=Integer.parseInt(y.readLine());
            if(sr>=1&&sr<=5)
            {
                System.out.println("Please enter the quantity you want to BUY"); 
                qt=Integer.parseInt(y.readLine());
                bill=bill+cost[(sr+10)]*qt;
                blank[c]=items[(sr+10)];
                bq[c]=cost[(sr+10)];
                quan[c]=qt;
                c++;
                break;
            }
            else{
                System.out.println("Invalid choice");
                break;
            }


        case 4:
            System.out.println();
            for(int i=16;i<21;i++)
            {
                System.out.println((i-15)+items[i]+"\t\t\t\t"+"Rs."+cost[i]);
                System.out.println();
            }
            System.out.println("Please enter the serial no of what you want to Buy");
            sr=Integer.parseInt(y.readLine());
            if(sr>=1&&sr<=5)
            {
                System.out.println("Please enter the quantity you want to BUY"); 
                qt=Integer.parseInt(y.readLine());
                bill=bill+cost[(sr+15)]*qt;
                blank[c]=items[(sr+15)];
                bq[c]=cost[(sr+15)];
                quan[c]=qt;
                c++;
                break;
            }
            else{
                System.out.println("Invalid choice");
                break;}

            default:
                System.out.println("Invalid Choice");
                System.out.println("");
        }
    }








    private void bill()throws IOException, InterruptedException
    {


        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        //System.out.print('\u000C');
        Calendar calendar=Calendar.getInstance();
        Date today=calendar.getTime();
        calendar.add(Calendar.DAY_OF_YEAR,10);

        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\tT H E   M B K   M A L L"); 
        System.out.println("\t\t\t\t\tAdd- c-29810,Rosario,Avenue of the Americas,New York City,New York,The USA");
        System.out.println(" \t\t\t\t\t\t\tBill issued :-"+"\t"+today);
        System.out.println(" Bill MEMO :");
        System.out.println("=======================================================================================================================================================================================================");
        System.out.println(" ARTICLE NAME\t\t\tRATE\t\t\tQUANTITY\t\t\tAMOUNT");
        System.out.println("=======================================================================================================================================================================================================");
        System.out.println();

        for(int f=0;f<c;f++)
        {
            System.out.println(" "+(f+1)+blank[f]+"\t\t"+bq[f]+"\t\t\t"+quan[f]+"\t\t\t\t"+"Rs."+(bq[f]*quan[f]));
        }

        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(" GRAND TOTAL\t\t\t\t\t\t\t\t\t\tRs."+bill);
        System.out.println("=======================================================================================================================================================================================================");
        System.out.println("\t\t\t\t\t\t\tTHANK YOU VISIT AGAIN!!!");
        System.out.println("=======================================================================================================================================================================================================");
    }









    public static void main(String args[])throws IOException, InterruptedException
    {
        int ann,css=1;
        while(css==1)
        {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            //System.out.println('\u000C');
            System.out.println("\t\t\t\t\t\t\t\t\tGreetings and good wishes");
            System.out.println("\n\t\t\t\t\t\t\t\tW E L C O M E   T O   T H E   M B K   M A L L");
            System.out.println("\n\t\t\t\t\t\t\t\t    Please enter what you want to BUY \n\n\n\t 1. Clothes \t\t\t\t2. Cosmetic \t\t\t\t3. Electronics \t\t\t\t4.Consumer Goods "); 

            Shopping_Mall obj=new Shopping_Mall();
            obj.setdata();
            obj.buy();

            System.out.println("Do want to buy anything else(1 for YES and 2 for NO)");
            c1=Integer.parseInt(y.readLine());
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();//System.out.print('\u000C');
            while(c1==1)
            {

                obj.disp();
                obj.buy();
                System.out.println("Do want to buy anything else(1 for YES and 2 for NO)");
                c1=Integer.parseInt(y.readLine());
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();//System.out.print('\u000C');

            }
            obj.bill();
            System.out.println("\n\n\n\nDo you wish to visit the mall again ?(1 for YES  2 for NO)");
            ann=Integer.parseInt(y.readLine());
            bq=new int[22];
            quan=new int[22];
            blank=new String[22];
            c=0;

            if(ann==1)
            css=1;
            else
            css=0;
        }
        System.out.println("THANK YOU . HAVE A NICE DAY !!!");
    }
}

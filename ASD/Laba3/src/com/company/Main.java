package com.company;
import java.util.Scanner;

class Aeroflot {
    public String city;
    public int num;
    public String type;
    // constructor
    public Aeroflot(String c, int n, String t) {
        this.city = c;
        this.num = n;
        this.type=t;
    }

    }
    public class Main {

        public static Aeroflot[] Input(Aeroflot[] air, int n){
            Scanner in = new Scanner(System.in);
            for(int i=0; i<n; i++)
            {
                String c1=in.next();
                int n1=in.nextInt();
                String t1=in.next();
                Aeroflot y=new Aeroflot(c1,n1,t1);
                air[i]=y;
            }
            return air;
        }

        public static void printOnDesktop(Aeroflot[] air, int n){
            for(int i=0; i<n; i++){
                System.out.println(air[i].city+" "+air[i].num+" "+air[i].type);
            }
        }

        public static Aeroflot[] Sort(Aeroflot[] air, int n){
            String tempS1="";
            String tempS2="";
            int tempI=0;
            for (int i = 0; i < n; i++){
                for (int j = i + 1; j < n; j++)
                {
                    if (air[i].num > air[j].num)
                    {
                        tempI = air[i].num;
                        air[i].num = air[j].num;
                        air[j].num = tempI;

                        tempS1 = air[i].city;
                        air[i].city = air[j].city;
                        air[j].city = tempS1;

                        tempS2 = air[i].type;
                        air[i].type = air[j].type;
                        air[j].type = tempS2;
                    }
                }
            }
            return air;
        }

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Aeroflot[] air;
            System.out.println("Enter n:");
            int n = in.nextInt();
            air=new Aeroflot[n];
            air=Input(air,n);

            while(true) {
                System.out.println("Enter x: ");
                int x = in.nextInt();
                switch (x) {
                    case 0:
                        System.out.println("Exit");
                        break;
                    case 1:
                        Sort(air,n);
                        printOnDesktop(air,n);
                        break;
                    case 2:
                        System.out.println("Enter string");
                        String s=in.next();
                        boolean b=false;
                        for(int i=0; i<n; i++)
                        {
                            if(s.equals(air[i].city)){
                                System.out.println(+air[i].num+" "+air[i].type);
                                b=true;
                            }
                        }
                        if(b==false)
                        {
                            System.out.println("No matches");
                        }
                        break;
                }
                if(x==0){break;}
            }



    }
}

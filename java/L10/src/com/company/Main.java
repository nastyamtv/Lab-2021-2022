package com.company;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        String s="";
        try(FileReader reader = new FileReader("INPUT.txt"))
        {
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
                if(((char)c=='e')||((char)c=='a')||((char)c=='i')||((char)c=='y')||((char)c=='o')){
                    s=s+'-';
                }
                else{
                    s=s+(char)c;
                }
            }

        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        try(FileWriter writer = new FileWriter("OUTPUT.txt", false)) {
            writer.write(s);
            //System.out.print(s);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}

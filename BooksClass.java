/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author user
 */
public class BooksClass {
    static String booknm1;
    static String booknm2;
    static String booknm3;
    static int nbrBook;
    public static void main(String[] args) {
        Scanner getUserInput=new Scanner(System.in);
        System.out.println("Enter the number of the books");
        nbrBook=getUserInput.nextInt();
        if(nbrBook<=3){
            for(int i=1;i<=nbrBook;i++){
                System.out.println("Enter"+" "+nbrBook+" "+"Books name");
                if(nbrBook==1){
                    booknm1=getUserInput.next();
                    System.out.println("you are allowed"+booknm1);
                    
                }
                              else if(nbrBook<=2){
                    booknm1=getUserInput.next();
                    booknm2=getUserInput.next();
                    System.out.println("you are  only allowed "+booknm1+" and "+booknm2);
                }
                else{
                    booknm1=getUserInput.next();
                    booknm2=getUserInput.next();
                    booknm3=getUserInput.next();
                     System.out.println("you are  only allowed these books "+booknm1+" and "+booknm2+" and "+booknm3);
                    
                }
            break;
            }}
        
        else{if(nbrBook>3)for(;;){
            System.out.println("the maximum number of books you are allowed must be 3");
            System.out.println("Please re-enter the number of books");
            nbrBook=getUserInput.nextInt();
            if(nbrBook<=3)
                break;
                 }
        for(int i=1;i<=nbrBook;i++)
        {
              System.out.println("Enter"+" "+nbrBook+""+"Books");
                if(nbrBook==1){
                    booknm1=getUserInput.next();
                    System.out.println("you are allowed"+booknm1);
                    
                }
                
     else if(nbrBook<=2){
                    booknm1=getUserInput.next();
                    booknm2=getUserInput.next();
                    System.out.println("you are  only allowed "+booknm1+" and "+booknm2);
                }
      else{
                    booknm1=getUserInput.next();
                    booknm2=getUserInput.next();
                    booknm3=getUserInput.next();
                     System.out.println("you are  only allowed these books "+booknm1+" and "+booknm2+" and "+booknm3);
                    
                }
            break;
            }}
            }
    }
              
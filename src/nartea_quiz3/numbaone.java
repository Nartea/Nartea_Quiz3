/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nartea_quiz3;


import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class numbaone {
     public static int PUNO = 9;
    private int [] data;
    private int head;
    private int tail;
    
    
    public numbaone(){
        data = new int[PUNO];
        head = 0;
        tail = 0;       
    }
     private void sulod(int index)throws Exception{
        if(head == PUNO - 1){
            throw new Exception("Queue is Full");
        }else{
            data[tail++] = index;
        }
    }private void pakita() throws Exception{
        if (head == tail){
            throw new Exception("Queue is Empty");
        }
        System.out.println(" ");
        System.out.println("\nara ouh");
        
        for (int i = 0; i < tail;i++){
            System.out.println(data[i]+ ", ");
        }
        System.out.println(" ");
    }
    
    public static void main(String[] args) throws Exception {
        numbaone one= new numbaone();
        Scanner s=new Scanner(System.in);
       
            one.sulod(1);
            one.sulod(22);
            one.sulod(333);
            one.sulod(444);
            one.sulod(55555);
            one.sulod(666666);
            one.sulod(7777777);
            one.sulod(88888888);
            one.sulod(999999999);
            one.pakita();
            
          
       

      
    }
   

    
}


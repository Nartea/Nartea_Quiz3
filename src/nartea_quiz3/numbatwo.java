/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nartea_quiz3;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class numbatwo {
     static int size= 5;
    private int[]data=new int[size];
    private int front;
    private int rear;
    
    
    private void insertion(int index)throws Exception{
    
        if ((front==0&&rear==size-1)|| (rear+1==front)) {
            
            throw new Exception("Queue is full");
            
        }
        if (rear==size-1) {
            
            rear=0;
        }else if(front==1){
            front=0;
        }else{
            data[rear++]=index;
        }
    }
    
    public void deletion()throws Exception{
        if (front== -1) {
            throw new Exception("Queue is empty");
        }
        Scanner q=new Scanner(System.in);
        System.out.println("where to delete");
        System.out.println("last");
        System.out.println("1st");
        String where=q.nextLine();
        if (where.equalsIgnoreCase("1st")) {
            delete1st();
        }else if(where.equalsIgnoreCase("last")){
            deletelast();
        }
    }
     
    public int delete1st()throws Exception{
        if (front== -1) {
            throw new Exception("Queue is empty");
        }
      int temporary=data[front];
        if (front==rear) {
            front=rear=-1;
            
        }else{
            front++;
        }
        return temporary;
    }
    public int deletelast()throws Exception{
        if (front== -1) {
            throw new Exception("Queue is empty");
        }
        int temporary=data[rear];
        if (front==rear) {
            front=rear=-1;
        }else{
            rear--;
        }
        return temporary;
    }
    private void display()throws Exception{
        
        if (front==-1) {
            throw new Exception("Queue is empty");
        }
        
        if (rear<front) {
            for (int i = front; i <= size-1; i++) {
                System.out.println(data[i]+" ");
            }
            for (int i = 0; i <= rear; i++) {
                System.out.println(data[i]+" ");
            }
            
        }else{
            for (int i = front; i < rear; i++) {
                System.out.println(data[i]+" ");
            }
        }
        System.out.println("Null");
    }
    public static void main(String[] args)throws Exception {
     Scanner s=new Scanner(System.in);
        numbatwo two= new numbatwo();
        boolean start=true;
        
        while (start) {
            System.out.println("**menu**");
            System.out.println("1. insert");
            System.out.println("2. delete");
            System.out.println("3. display");
            System.out.println("4. exit");
            int menu=s.nextInt();
            
            switch (menu) {
                case 1:
                    System.out.println("enter index: ");
                    int index=s.nextInt();
                    
                    two.insertion(index);       
                    break;
                    
                case 2:
                    two.deletion();;
                    break;
                    
                case 3:
                    two.display();
                    break;
                    
                case 4:
                    start=false;
                    break;
                    
                default:
                    throw new AssertionError();
            }
            
        }
    }
    }


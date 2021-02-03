package test;

@FunctionalInterface
interface Chargeable 
{ 
    int charge(int x); 
} 
  
public class Test 
{ 
    public static void main(String args[]) 
    { 
        int a = 6; 
  
        // lambda expression to define the calculate method 
        Chargeable s = (int x)->x*x; 
  
        // parameter passed and return type must be 
        // same as defined in the prototype 
        int ans = s.charge(a); 
        System.out.println(ans); 
    } 
} 
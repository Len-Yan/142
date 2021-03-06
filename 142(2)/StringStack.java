/* Project 2
 * Lengfan Yan
 * CSC 142
 * 5/21
 */

//StringStack that will implement a stack of strings
public class StringStack{
  private String[] cap;                 //ini
  int top = 0;
  
  public StringStack(){  // constructor that makes a StringStack with an initial capacity of 10
    cap = new String[10];
  }
  public StringStack(int n){  // constructor with an initial capacity of n
    cap = new String[n];
  }
  
  public void push(String s){  // stores the given value at the top of the stack - 
    //if this would exceed the current capacity of the stack, you will need to double its capacity
    //double capacity if overrange
    if(top == cap.length){
      String[] temp = cap; 
      cap = new String[(cap.length)*2];
      for(int i =0;i<temp.length; i++){
        cap[i] = temp[i];
      }
    }
    cap[top] = s;
    top++;
  }
  
  public String pop(){  // removes and returns the value at the top of the stack - 
    //if the stack is empty, this should throw an IllegalStateException
    if(cap[0] == null){
      throw new IllegalStateException();}
    
    String temp = cap[top-1];
    //set back to null after pop
    cap[top-1] = null;
    top--;
    return temp;
  }
  
  public boolean isEmpty(){  // returns true if the stack is empty
    if(cap[0] == null){return true;}
    return false;
  }
    
  public String peek(){  // returns the value at the top of the stack without removing it- 
    //if the stack is empty, this should throw an IllegalStateException
    
    if(cap[0] == null){
      throw new IllegalStateException();}
    return cap[top-1];
  }
  
  public int size(){  // returns the number of values stored in the stack
    return top;
  }
}
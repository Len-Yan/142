/* Project 3
 * Lengfan Yan
 * CSC 142
 * 6/11
 */

public class Book{
  
  private String title;
  private String genre;
  private String copyrightYear;
  private String author;
  private int numPages;
  public static final int checkOutLength = 21;
  private int location; // 0 = on shelf, 1 = on hold shelf, 2 = checked out
  private Patron checkedOutBy; // null if not checked out
  private Patron requestedBy; // null if not on request
  private int dateCheckedOut;
  
  public Book(String title, String genre, String copyrightDate, String author, int numPages){
// set other fields to appropriate values
    
  }
  public int getLocation(){
    
  }
  public void setLocation(int loc){
    
  }
  public Patron getCheckedOutBy(){
    
  }
  public void setCheckedOutBy(Patron p){
    
  }
  public Patron getRequestedBy(){
    
  }
  public void setRequestedBy(Patron p){
    
  }
  public int getDateCheckedOut(){
    
  }
  public void setDateCheckedOut(int d){
    
  }
  
  
}
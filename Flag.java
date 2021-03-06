//Lengfan Yan
//csc142
//assignment 2 ; flag
//Challenge
import java.awt.Color;

public class Flag {
  /**
   * draw flags
   * @author Lengfan Yan
   * @version assignment2 Flag   Challenge
   * 
   * vertical; 364/3=88 
   * position 0, 88, 176
   * circle = 308 * .75 = 73.5
   * 
   */
  public void drawNigerFlag() {
    //create window for niger flag
    NsccWindow win = new NsccWindow(10, 10, 400, 350);
    win.setTitle("Nigerflag");
    //create a rectangle background for nigerflag
    NsccRectangle re = new NsccRectangle(33, 22, 308, 264);
    win.add(re);
    re.setFilled(true);
    re.setBackground(java.awt.Color.white);
    //set new color
    Color norange = new Color(255, 127, 0);
     Color ngreen = new Color(0, 204, 0);
    
    
    // draw tob and bottom rectangle for flag
     NsccRectangle re1 = new NsccRectangle(0, 0, 308, 88);                                
     re.add(re1);
     re1.setFilled(true); 
     re1.setBackground(norange);                               
                                     
     NsccRectangle re3 = new NsccRectangle(0, 176, 308, 88);
     re.add(re3);   
     re3.setFilled(true);
     re3.setBackground(ngreen);     
    // draw circle in flag
     NsccEllipse circle = new NsccEllipse(117, 95, 73, 73);                                
     re.add(circle);
     circle.setFilled(true); 
     circle.setBackground(norange);    
     //repanit
    win.repaint();}
  
  
  
  /**
   * run  and  draw flags windows
   * @param ?
   * @return what shall i say?
   */
 public static void main(String[] args) {
     Flag niger;
     niger = new Flag();
     niger.drawNigerFlag();
     
     Flag sweden;
     sweden = new Flag();
     sweden.drawSwedenFlag();
     
     Flag norway;
     norway = new Flag();
     norway.drawNorwayFlag();
     
     Flag seychelles;
     seychelles = new Flag();
     seychelles.drawSeychellesFlag();
 
     Flag alabama;
     alabama = new Flag();
     alabama.drawAlabamaFlag();
 
 }
 
 
 
 //create swedenflag
 public void drawSwedenFlag() {
   /**
    * cal: X; 416/(5+2+9)= 26   y; 260/(4=2=4)=26 
    * position; x: 0, 104, 156, 416
    * y:0,104,156,260
    * 
    * size:blue(104+104),(104+234)
    * 
    */
// create window for Swedenflag
    NsccWindow wins = new NsccWindow(10, 10, 500, 350);
    wins.setTitle("Swedenflag");
    // background for flag
    NsccRectangle res = new NsccRectangle(40, 25, 416, 260);
    wins.add(res);
    res.setFilled(true);
    res.setBackground(java.awt.Color.yellow);
    // 4 rectangle in each corner of flag
    NsccRectangle res1 = new NsccRectangle(0, 0, 130, 104);
    res.add(res1);
    res1.setFilled(true);
    res1.setBackground(java.awt.Color.blue);
    
    NsccRectangle res2 = new NsccRectangle(182, 0, 234, 104);
    res.add(res2);
    res2.setFilled(true);
    res2.setBackground(java.awt.Color.blue);
    
    NsccRectangle res3 = new NsccRectangle(0, 156, 130, 104);
    res.add(res3);
    res3.setFilled(true);
    res3.setBackground(java.awt.Color.blue);
    
    NsccRectangle res4 = new NsccRectangle(182, 156, 234, 104);
    res.add(res4);
    res4.setFilled(true);
    res4.setBackground(java.awt.Color.blue);
    //repaint
    wins.repaint();
 }

 
public void drawNorwayFlag() {
  /**
   * cal:
   * 352/(6+1+2+1+12)=16
   * each horizontally position: 0,96(+96)(r),112(+16)(w),144(+32)(b),160(+16)(w),352(+192)(r)
   * 256/(6+1+2+1+6)=16
   * vertical:0, 96(+96)(r),112(+16)(w),144(+32)(b),160(+16)(w),256(+96)(r)
   * 
   * size: white (112*112)(112*208)
   * red:(96*96) (96*192)
   * 
   */
// create window for Norwayflag
    NsccWindow winn = new NsccWindow(30, 30, 440, 340);
    winn.setTitle("Norwayflag");
    // background for flag
    NsccRectangle ren = new NsccRectangle(30, 20, 352, 256);
    winn.add(ren);
    ren.setFilled(true);
    ren.setBackground(java.awt.Color.blue);
    // 4 white rectangle in each corner of flag
    NsccRectangle ren1 = new NsccRectangle(0, 0, 112, 112);
    ren.add(ren1);
    ren1.setFilled(true);
    ren1.setBackground(java.awt.Color.white);
    
    NsccRectangle ren2 = new NsccRectangle(144, 0, 208,112);
    ren.add(ren2);
    ren2.setFilled(true);
    ren2.setBackground(java.awt.Color.white);
    
    NsccRectangle ren3 = new NsccRectangle(0, 144, 112, 112);
    ren.add(ren3);
    ren3.setFilled(true);
    ren3.setBackground(java.awt.Color.white);
    
    NsccRectangle ren4 = new NsccRectangle(144, 144, 208, 112);
    ren.add(ren4);
    ren4.setFilled(true);
    ren4.setBackground(java.awt.Color.white);
    
    // 4 red rectangle
    NsccRectangle ren5 = new NsccRectangle(0, 0, 96, 96);
    ren.add(ren5);
    ren5.setFilled(true);
    ren5.setBackground(java.awt.Color.red);
    
    NsccRectangle ren6 = new NsccRectangle(160, 0, 192, 96);
    ren.add(ren6);
    ren6.setFilled(true);
    ren6.setBackground(java.awt.Color.red);
    
    NsccRectangle ren7 = new NsccRectangle(0, 160, 96, 96);
    ren.add(ren7);
    ren7.setFilled(true);
    ren7.setBackground(java.awt.Color.red);
    
    NsccRectangle ren8 = new NsccRectangle(160, 160, 192, 96);
    ren.add(ren8);
    ren8.setFilled(true);
    ren8.setBackground(java.awt.Color.red);
    
    //repaint
    winn.repaint();
}

//create Seychellesflag
public void drawSeychellesFlag(){
  
   NsccWindow sey = new NsccWindow(30, 30, 520,320);
   sey.setTitle("Seychelles");
   NsccRectangle recs = new NsccRectangle(30, 20, 444,222);
    sey.add(recs);
    recs.setFilled(true);
    recs.setBackground(java.awt.Color.blue);
    
    // creat big triangle fill into the seychellesflag
    NsccUpTriangle yellow = new NsccUpTriangle(0, -444, 888, 666); //222*3=666,(222-666=-444)
    recs.add(yellow);
    yellow.setFilled(true);
    yellow.setBackground(java.awt.Color.yellow);
    
    NsccUpTriangle red = new NsccUpTriangle(0, -74, 888, 296);
    recs.add(red);
    red.setFilled(true);
    red.setBackground(java.awt.Color.red);
    
    NsccUpTriangle white = new NsccUpTriangle(0,74, 888, 148);  //222/3*2 = 148 222-148=74
    recs.add(white);
    white.setFilled(true);
    white.setBackground(java.awt.Color.white);
   
    NsccUpTriangle green = new NsccUpTriangle(0, 148, 888, 74);   //222/3=74  222-74=148
    recs.add(green);
    green.setFilled(true);
    Color sgreen = new Color(0,128,0);
    green.setBackground(sgreen);

    sey.repaint();
}


public void drawAlabamaFlag(){
  
  // window and background for flag
   NsccWindow ab = new NsccWindow(30, 30, 520,340);
   ab.setTitle("Alabama");
   NsccRectangle rb = new NsccRectangle(30, 20, 444,264);
    ab.add(rb);
    rb.setFilled(true);
    rb.setBackground(java.awt.Color.red);
    /**
     * 444/11=40  40+9=360    440/2 -40 = 180
     * 264/11=24  24*9 216    264/2 -24 = 108
     */ 
    //create 4 triangle in the side
    NsccUpTriangle w1 = new NsccUpTriangle(40,156, 360, 108);  //264/2+24 =156
    rb.add(w1);
    w1.setFilled(true);
    w1.setBackground(java.awt.Color.white);
    
    NsccDownTriangle d1 = new NsccDownTriangle(40,0, 360, 108);  
    rb.add(d1);
    d1.setFilled(true);
    d1.setBackground(java.awt.Color.white);
    
    NsccLeftTriangle l1 = new NsccLeftTriangle(263,24, 180, 216);  //440/2+40 = 260 +3(extal)
    rb.add(l1);
    l1.setFilled(true);
    l1.setBackground(java.awt.Color.white);
    
    NsccRightTriangle r1 = new NsccRightTriangle(0,24, 180, 216);  
    rb.add(r1);
    r1.setFilled(true);
    r1.setBackground(java.awt.Color.white);
    

    ab.repaint();
}}
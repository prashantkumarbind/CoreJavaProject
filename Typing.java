

			import java.awt.*;
			import java.awt.event.*;
			import java.applet.*;
			import java.applet.*;
			import java.util.*;
			import java.io.*;
			
					public class Typing extends Applet
					{
						   Button b1,b2,b3,b4,b5,b6;
						   TextField write_word;
						   int x,y,r,c,count;
						   TextField t1,t2;
						   String meaning;
						   public void init()
						   {
							      setVisible(true);
								 setBackground(Color.green);
								 b2=new Button("Stop");
								 b2.setBounds(750,100,200,50);
								 b2.setFont(new Font("Serial",Font.BOLD,20));
								 b2.setForeground(Color.red);
								 b2.setBackground(Color.yellow);
								 add(b2);
								 b3=new Button("Cancle");
								 b3.setBounds(750,160,200,50);
								 b3.setFont(new Font("Serial",Font.BOLD,20));
								 b3.setForeground(Color.red);
								 b3.setBackground(Color.yellow);
								 add(b3);
								 Typing ref=new Typing();
								 MultiThreading ob1=new MultiThreading(ref);
														  ob1.start();
														  System.out.print("New Thread create ");
						   }
						   public void paint(Graphics g)
						   {
								  g.setColor(Color.black);
								  g.fillRect(300,400,400,50);
								  g.fillRect(300,200,50,200);
								  g.fillRect(650,200,50,200);
								  Random random=new Random();
								  t1=new TextField();
								  t1.setBackground(Color.blue);
								  t1.setForeground(Color.white);
								  t1.setFont(new Font("Serial",Font.BOLD,20));
								  add(t1);
								  String arr[]={
									"Please","Sir","Coaching","Start","Kariya","Please","sir","Off","Line"
									,"Class","Soon","Shiwangi","Vinod","Faiz","Rehana","Sanjoya"};
								  while(true)
								  {
									  try
									  {
									    for(String val:arr)
									    {   
											  t1.setText(val);
											  //t1.setEditable(false);
											  
												for(y=200;y<=370;y=y+2)
												{
													
													t1.setBounds(350,y,298,40);
													Thread.sleep(30);
													//t1.setEnabled(true);
												}
											//}
										}
									  }
									  catch(Exception e)
									  {
										    //br.close();
									System.out.println("\n:- Exception Occure in the program::-"+e);
									  }

								  }
						   }
						   /*
						   <applet code="Typing"width=950 height=600>
						   </applet>
						   */
						  
						    public void update(Graphics g){
									  
												paint(g);
												System.out.print("update method calling ***************************************");
								  }
					}

					class MultiThreading extends Thread{
								 Typing reference;
								 Graphics g=new Graphics();
								 public MultiThreading(Typing ref){
									 
									   reference=ref;
									   System.out.print("it is the multithreading  class call********************************************");
								 }
								 public void run(){
									    paint(g);
									    System.out.print("run method call****************");
								 }
					}




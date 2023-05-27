

		import java.awt.*;
		import java.awt.event.*;
		import javax.swing.*;
		import java.util.*;
		
		
					class TypingDemo extends JFrame 
					{
							JButton b1,b2,b3,b4,b5,b6,b7;
							JTextField t1,t2,t3,t4;
							JLabel l1,l2,l3;
							TextField ta;
							int x,y;
							TypingDemo()
							{
								     setVisible(true);
									setLocation(200,50);
									setResizable(true);
									setLayout(null);
									setSize(800,600);
									setBackground(Color.white);
									/*we are use the JButton class*/
									b1=new JButton("Next");
									b1.setBounds(600,450,200,40);
									b1.setFont(new Font("Serial",Font.BOLD,20));
									add(b1);
									b1.addActionListener(new ActionListener(){
										
										
													public void actionPerformed(ActionEvent ae){
														
															nextWordConcept();
															System.out.print("next button click");
													}
									});
									b2=new JButton("Cancel");
									b2.setBounds(600,500,200,40);
									b2.setFont(new Font("Serial",Font.BOLD,20));
									add(b2);
									
									
									b2.addActionListener(new ActionListener(){
										
											public void actionPerformed(ActionEvent ae){
												
													  Frame frame=new Frame();
															      frame.dispose();
											}
									});
									ta=new TextField("Hello");
									ta.setBounds(270,100,100,40);
									ta.setFont(new Font("Serial",Font.BOLD,20));
									add(ta);
									l1=new JLabel("Score");
									l1.setBounds(100,500,150,30);
									l1.setFont(new Font("Serial",Font.BOLD,20));
									add(l1);
									/*
										we are use the Pannel class
										JPanel panel=new JPanel();
										panel.setBounds(1,405,800,295);
										panel.setBackground(Color.red);
										add(panel);
										panel.add(b1);
										panel.add(b2);
							      */
								 
								 /* repaint() internaly call the update();*/
								 
									repaint();
							} 	
							public void update(Graphics g)
							{
								      paint(g);
							}
							public void paint(Graphics g)
							{
									//g.setColor(Color.blue);
								    g.fillRect(240,400,300,30);
								    g.fillRect(240,230,30,170);
								    g.fillRect(510,230,30,170);
							}
							public void execute()
							{
								String name[]={"Mira","Neema","Raju","Karan","Ashok","Karan",
														"Jay","Raju","santosh","Manoj","Balvant",
														"Manmohan","Karan","Spama","Sanju","Hanuman","Karan"};
														
								Random random=new Random();
								int r=0;
								while(true)
								{
									try{
											for(String value:name)
											{
													ta.setText(value);
													ta.setBackground(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));
												for(y=50;y<=320;y=y+2);
												{
														  Thread.sleep(2000);
														  /* ta.setBounds(x,y,width,height);*/
														  
														  ta.setBounds(265,y,232,40);
												}	
											}
										}
										catch(InterruptedException e){
											
											  System.out.print("\n::Exception Occure in the program::");
										}
										catch(Exception e){
											
											 System.out.print("\n::Exception Occure in the program::");
										}
								}
								
							}
							public void nextWordConcept(){
								
									System.out.println("Hi nextWordConcept method calling");
									execute();
							}
					}
					
					class ForMultithreading extends Thread
					{
							TypingDemo reference;
							ForMultithreading(TypingDemo ref)
							{
								     reference=ref;
							}
						     public void run()
							{
								reference.execute();
							}
					}
					
					class RunTypingDemo
					{
						    public static void main(String args[])
						    {
							         TypingDemo ob1=new TypingDemo();
								    ForMultithreading t=new ForMultithreading(ob1);
															   t.start();
						    }
					}
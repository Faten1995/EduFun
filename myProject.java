4//import statments

import javax.swing.JFrame;
//for the components
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
//for the background
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
//for the layout
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.Box;
//for the menu
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;


import java.awt.Color;

import javax.swing.SwingUtilities;
import java.awt.*;
import java.util.*;
import java.applet.Applet;	

import java.awt.event.*;

//music
import javax.sound.sampled.Clip;
import javax.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.LineUnavailableException;

public class myProject extends JFrame  {
	
	
	public static ImageIcon background =
	            new ImageIcon (myProject.class.getResource("background.jpg"));
	
	
	JPanel panelCont = new JPanel();
	CardLayout cl = new CardLayout();
	
	JButton next;
	JLabel hi;
	JLabel m;
	GridBagLayout gb = new GridBagLayout();
	GridBagConstraints c = new GridBagConstraints();
	JButton math;
	JButton english;
	
	JButton next2;
	JButton prev;
	JButton exit;
	

	JPanel firstPanel = new JPanel();
	JPanel secondPanel = new JPanel();
	JPanel englishPanel = new JPanel();
		
		
		public myProject() {
		
			//the frame settings
			super("EduFun");
			setSize(400, 400);
			setResizable(false);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			

			panelCont.setLayout(cl);
			panelCont = new BackgroundPanel (cl);	
			panelCont.setOpaque(true);
			panelCont.setBackground(Color.BLACK);
			
			// the first panel.
			firstPanel.setLayout(gb);		
			m = new JLabel("<html>Welcome <br><br>This is my first program using GUI<br>and this program is a simple game<br>the Goal of it is to get some learning<br>outcome, and it contains two parts<br>English and Mathematics<br><br>Enjoy playing with EduFun.<br>");
			c.ipady = 40;      //make this component tall
			c.weightx = 0.0;
			c.gridwidth = 3;
			c.gridx = 1;
			c.gridy = 1;
			firstPanel.add(m, c);
															
			next = new JButton();

			next.addActionListener(new panel2Listener());
			next.setIcon(new ImageIcon("next.jpg"));
		
			c.ipady = 0;       //reset to default
			c.weighty = 1.0;   //request any extra vertical space
			c.anchor = GridBagConstraints.PAGE_END; //bottom of space
			c.insets = new Insets(1,0,0,0);  //top padding
			c.gridx = 1;       //aligned with button 2
			c.gridwidth = 2;   //2 columns wide
			c.gridy = 2;       //third row
								
								
			firstPanel.add(next, c);
								
			//second Panel
			secondPanel.setLayout(gb);
						
			JPanel center = new JPanel();
			center.setLayout(new BoxLayout(center, BoxLayout.PAGE_AXIS));
			
			math = new JButton(new ImageIcon("mathButton.jpg"));
			math.addActionListener(new mathListener());
			english = new JButton(new ImageIcon("English.jpg"));
			english.addActionListener(new engListener());
			center.add(math);
			center.add(Box.createRigidArea(new Dimension(0,10)));
			center.add(english);
						
			c.gridx = 1;
			c.gridy = 0;
			c.insets = new Insets(5,5,5,5);
			secondPanel.add(center, c);

			JPanel buttons = new JPanel();
			prev = new JButton(new ImageIcon("previous.jpg"));
			prev.addActionListener(new prevListener());
			exit = new JButton(new ImageIcon("exit.jpg"));
			exit.addActionListener(new exitListener());
						
			buttons.setLayout(new BoxLayout(buttons, BoxLayout.LINE_AXIS));
			buttons.add(prev);
			buttons.add(Box.createRigidArea(new Dimension(5,0)));
			buttons.add(exit);
			buttons.add(Box.createRigidArea(new Dimension(5,0)));
						
			c.gridx = 0;
			c.gridy = 1;
			c.gridwidth = 3;
			secondPanel.add(buttons, c);
			
			//english Panel
			englishPanel.setLayout(new BorderLayout());
			JPanel p1= new JPanel();
			JPanel p2= new JPanel();
			p1.setLayout(new GridLayout(2,2));
			p2.setLayout(new GridLayout(2,1));
			JButton storyB = new JButton(new ImageIcon("storyButton.jpg"));
			storyB.addActionListener(new storyListener());
			p1.add(storyB);
			JButton animal = new JButton(new ImageIcon("animalsButton.jpg"));
			animal.addActionListener(new animalListener());
			p1.add(animal);
			JButton clownB = new JButton(new ImageIcon("clownButton.jpg"));
			clownB.addActionListener(new clownListener());
			p1.add(clownB);					
			JButton quizB = new JButton(new ImageIcon("quizButton.jpg"));
			quizB.addActionListener(new quizListener());
			p1.add(quizB);

			
			//the quiz Panel
			JPanel quiz	= new JPanel();
			quiz.setLayout(new BorderLayout());
			JPanel quiza	= new JPanel();
			quiza.setLayout(new GridLayout(3,1));			JButton quiz1 = new JButton(new ImageIcon("b1.jpg"));
			quiz1.addActionListener(new quiz1Listener());
			JButton quiz2 = new JButton(new ImageIcon("b2.jpg"));
			quiz2.addActionListener(new quiz2Listener());
			JButton quiz3 = new JButton(new ImageIcon("b3.jpg"));
			quiz3.addActionListener(new quiz3Listener());			quiza.add(quiz1);
			quiza.add(quiz2);
			quiza.add(quiz3);
			JPanel quizb = new JPanel();
			quizb.setLayout(new FlowLayout());
			JButton quizExit = new  JButton("Exit");
			quizExit.addActionListener(new exitListener());
			JButton quizPrev = new  JButton("Previous");
			quizPrev.addActionListener(new engListener());
			quizb.add(quizPrev);
			quizb.add(quizExit);
			quiz.add(quiza, BorderLayout.CENTER);
			quiz.add(quizb, BorderLayout.SOUTH);
			
			//quiz 1
			JPanel quiz1_panel = new JPanel();
			quiz1_panel.setLayout(new BorderLayout());
			quiz1_panel.add(new Quiz(), BorderLayout.CENTER);
			JPanel quiz1_options = new JPanel();
			JButton q1ex1 = new JButton("Exit the PROGRAM");
			q1ex1.addActionListener(new exitListener());
			JButton q1ex2 = new JButton("Exit the Quiz");
			q1ex2.addActionListener(new quizListener());
			quiz1_options.add(q1ex2);
			quiz1_options.add(q1ex1);
			quiz1_panel.add(quiz1_options,BorderLayout.SOUTH);

			//quiz 2
			JPanel quiz2_panel = new JPanel();
			quiz2_panel.setLayout(new BorderLayout());
			quiz2_panel.add(new Quiz2(), BorderLayout.CENTER);
			JPanel quiz2_options = new JPanel();
			JButton q2ex1 = new JButton("Exit the PROGRAM");
			q2ex1.addActionListener(new exitListener());
			JButton q2ex2 = new JButton("Exit the Quiz");
			q2ex2.addActionListener(new quizListener());
			quiz2_options.add(q2ex2);
			quiz2_options.add(q2ex1);
			quiz2_panel.add(quiz2_options,BorderLayout.SOUTH);
			
			//quiz 3
			JPanel quiz3_panel = new JPanel();
			quiz3_panel.setLayout(new BorderLayout());
			quiz3_panel.add(new Quiz3(), BorderLayout.CENTER);
			JPanel quiz3_options = new JPanel();
			JButton q3ex1 = new JButton("Exit the PROGRAM");
			q3ex1.addActionListener(new exitListener());
			JButton q3ex2 = new JButton("Exit the Quiz");
			q3ex2.addActionListener(new quizListener());
			quiz3_options.add(q3ex2);
			quiz3_options.add(q3ex1);
			quiz3_panel.add(quiz3_options,BorderLayout.SOUTH);

			
			//create prev and exit buttons.
			p2.setLayout(new FlowLayout());
			JButton previous = new JButton("Previous");
			previous.addActionListener(new panel2Listener());
			p2.add(previous);
			JButton exit2 = new JButton("Exit");
			exit2.addActionListener(new exitListener());
			p2.add(exit2);
			
			englishPanel.add(p1, BorderLayout.CENTER);
			englishPanel.add(p2, BorderLayout.SOUTH);
			
			//math
			JPanel math = new JPanel();
			math.setLayout(new BorderLayout());
			JPanel mathbuttons = new JPanel();
			mathbuttons.setLayout(new GridLayout(2, 2));
			JButton addButton = new JButton(new ImageIcon("addButton.jpg"));
			addButton.addActionListener(new addListener());
			mathbuttons.add(addButton);
			JButton subButton = new JButton(new ImageIcon("subButton.jpg"));
			subButton.addActionListener(new subListener());
			mathbuttons.add(subButton);
			JButton mulButton = new JButton(new ImageIcon("mulButton.jpg"));
			mulButton.addActionListener(new mulListener());
			mathbuttons.add(mulButton);	
			JButton qButton = new JButton(new ImageIcon("qButton.jpg"));
			qButton.addActionListener(new devListener());
			mathbuttons.add(qButton);			
			
					
			math.add(mathbuttons,BorderLayout.CENTER);
			
			JPanel butPanel =   new  JPanel();
			butPanel.setBackground(Color.PINK);
			JButton mathExit = new  JButton("Exit");
			JButton mathprevious = new  JButton("Previous");
			mathExit.addActionListener(new exitListener());
			mathprevious.addActionListener(new panel2Listener());
			butPanel.add(mathprevious);
			butPanel.add(mathExit);
			math.add(butPanel,BorderLayout.SOUTH);
			
			
			//the clown
			
			JPanel clown = new JPanel();
			clown.setLayout(new BorderLayout());
			clown.add(new paintit(), BorderLayout.CENTER);
			JPanel options = new JPanel();
			JButton ex1 = new JButton("Exit the PROGRAM");
			ex1.addActionListener(new exitListener());
			JButton ex2 = new JButton("Exit the GAME");
			ex2.addActionListener(new engListener());
			options.add(ex2);
			options.add(ex1);
			clown.add(options,BorderLayout.SOUTH);

			
			//the story
			
			JPanel story = new JPanel();
			story.setLayout(new BorderLayout());
			story.add(new story1(), BorderLayout.CENTER);
			JPanel options1 = new JPanel();
			JButton ex11 = new JButton("Exit the PROGRAM");
			ex11.addActionListener(new exitListener());
			JButton ex22 = new JButton("Exit the GAME");
			ex22.addActionListener(new engListener());
			options1.add(ex22);
			options1.add(ex11);
			story.add(options1,BorderLayout.SOUTH);

			//the animals
			JPanel animals = new JPanel();
			animals.setLayout(new BorderLayout());
			animals.add(new animals(), BorderLayout.CENTER);
			JPanel animals_options = new JPanel();
			JButton animalsex1 = new JButton("Exit the PROGRAM");
			animalsex1.addActionListener(new exitListener());
			JButton animalsex2 = new JButton("Exit the Game");
			animalsex2.addActionListener(new engListener());
			animals_options.add(animalsex2);
			animals_options.add(animalsex1);
			animals.add(animals_options,BorderLayout.SOUTH);
			
			firstPanel.setOpaque(false);
			secondPanel.setOpaque(false);
			englishPanel.setOpaque(false);
			math.setOpaque(false);
			
			//adding the cards
			panelCont.add(firstPanel, "1");	
			panelCont.add(secondPanel, "2");
			panelCont.add(englishPanel, "3");
			panelCont.add(math, "4");
			panelCont.add(new addPanels(), "5");
			panelCont.add(new subPanels(), "6");
			panelCont.add(new mulPanels(), "7");
			panelCont.add(new devPanels(), "8");
			panelCont.add(story,"9");
			panelCont.add(clown, "10");

			panelCont.add(quiz1_panel, "11");
			panelCont.add(quiz2_panel, "12");
			panelCont.add(quiz3_panel, "13");
			panelCont.add(animals, "14");
			panelCont.add(quiz, "15");
			cl.show(panelCont, "1");
			
			add(panelCont);
			
			validate();
			
			//the Menu
			
			JMenu firstmenu = new JMenu("Go to");
			
			JMenuItem English = new JMenuItem("English");
			English.addActionListener(new engListener());
			firstmenu.add(English);
			JMenuItem mathChoice = new JMenuItem("Math");
			mathChoice.addActionListener(new mathListener());
			firstmenu.add(mathChoice);
			JMenuItem mainmenu = new JMenuItem("Main menu");
			mainmenu.addActionListener(new panel2Listener());
			firstmenu.add(mainmenu);
			
			JMenuBar bar = new JMenuBar();
			bar.add(firstmenu);
			setJMenuBar(bar);
			bar.setVisible(true);
			setVisible(true);
		}
			
			private class panel2Listener implements ActionListener{
					
				public void actionPerformed(ActionEvent e)
							{
							
								cl.show(panelCont, "2");
								
							}
				}
			private class quizListener implements ActionListener{					public void actionPerformed(ActionEvent e)
					{
						cl.show(panelCont, "15");					}}
			
			private class quiz1Listener implements ActionListener{
						
					public void actionPerformed(ActionEvent e)
								{
								
									cl.show(panelCont, "11");
									
								}
					}
			private class quiz2Listener implements ActionListener{					public void actionPerformed(ActionEvent e)
				{
					cl.show(panelCont, "12");					}}
			private class quiz3Listener implements ActionListener{
					public void actionPerformed(ActionEvent e)
				{
					cl.show(panelCont, "13");					}}
			private class animalListener implements ActionListener{
					public void actionPerformed(ActionEvent e)				{													cl.show(panelCont, "14");
				}}
			private class prevListener implements ActionListener{
					public void actionPerformed(ActionEvent e)
				{
					cl.show(panelCont, "1");			
				}}
			private class exitListener implements ActionListener{
				public void actionPerformed(ActionEvent e)
				{
						System.exit(0);
				}}
			private class engListener implements ActionListener{
				public void actionPerformed(ActionEvent e)
				{
					cl.show(panelCont, "3");
				}}
			private class mathListener implements ActionListener{
					public void actionPerformed(ActionEvent e)
							{
								cl.show(panelCont, "4");
							}}		
			private class addListener implements ActionListener{
					public void actionPerformed(ActionEvent e)							{													cl.show(panelCont, "5");							}}	
			private class subListener implements ActionListener{
					public void actionPerformed(ActionEvent e)							{													cl.show(panelCont, "6");							}}
			private class mulListener implements ActionListener{
					public void actionPerformed(ActionEvent e)							{													cl.show(panelCont, "7");							}}
			private class devListener implements ActionListener{
					public void actionPerformed(ActionEvent e)							{													cl.show(panelCont, "8");							}}
		   private class storyListener implements ActionListener{
					public void actionPerformed(ActionEvent e)							{													cl.show(panelCont, "9");							}}
			private class clownListener implements ActionListener{
					public void actionPerformed(ActionEvent e)							{													cl.show(panelCont, "10");							}}
		
		
		//for the background
		 private class BackgroundPanel extends JPanel
		    {
		        public BackgroundPanel ( LayoutManager layout )
		        {
		            super ( layout );
		        }

		        protected void paintComponent ( Graphics g )
		        {
		            super.paintComponent ( g );
		            g.drawImage ( background.getImage (), 0, 0, BackgroundPanel.this );
		        }
		    }
	//the main method
			
		public static void main(String[] args) 
			{
				SwingUtilities.invokeLater(new Runnable(){
					public void run(){
						new myProject();
					}
				});
									
			}
}
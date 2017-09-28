import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.BoxLayout;
import javax.swing.Box;


import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class story1 extends JPanel{
	
	JPanel cards = new JPanel();
	CardLayout cl = new CardLayout();
	
	String s;
	JTextField a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11;
	public story1()
	{
		//Panel q1
		JPanel q1 = new JPanel();
		q1.setLayout(new GridLayout(9, 1));
		
		//q1.add(Box.createRigidArea(new Dimension(0,0)));
		q1.add(new JLabel("What's your favorite color?"));
		//q1.add(Box.createRigidArea(new Dimension(5,5)));
		a1 = new JTextField("(Color)",10);
		q1.add(a1);
		//q1.add(Box.createRigidArea(new Dimension(0,0)));
		
		q1.add(new JLabel("What is your favorite thing to drink?"));
		//q1.add(Box.createRigidArea(new Dimension(0,0)));
		
		a2 = new JTextField("(liquid)",10);
		q1.add(a2);
		//q1.add(Box.createRigidArea(new Dimension(0,0)));	
		q1.add(new JLabel("Name something people bring with them to school"));
		//q1.add(Box.createRigidArea(new Dimension(0,0)));
		
		a3 = new JTextField("(plural noun)",10);
		q1.add(a3);
		//q1.add(Box.createRigidArea(new Dimension(0,0)));
		
		q1.add(new JLabel("<html>What is one aspect you would want an<br>imaginary friend to have?"));
		//q1.add(Box.createRigidArea(new Dimension(0,0)));
		
		a4 = new JTextField("(adjective)",10);
		q1.add(a4);
		//q1.add(Box.createRigidArea(new Dimension(0,0)));		
		JButton next = new JButton("next");
		next.setAlignmentX(Component.CENTER_ALIGNMENT);
		next.addActionListener(new card2());
		q1.add(next);
		
		//Panel q2
		JPanel q2 = new JPanel();
		q2.setLayout(new GridLayout(9, 1));
		
		q2.add(new JLabel("What is something you do when you study?"));
		
		a5 = new JTextField("(present tense verb)",10);
		q2.add(a5);
		q2.add(new JLabel("Name something you own multiple of "));
				
		a6 = new JTextField("(plural noun)",10);
		q2.add(a6);
		
		q2.add(new JLabel("What is something you might find in Saudi"));
				
		a7 = new JTextField("(singular noun)",10);
		q2.add(a7);		
		
		q2.add(new JLabel("Describe your current leader in one word"));
				
		a8 = new JTextField("(adjective)",10);
		q2.add(a8);

		JButton next2 = new JButton("next");
		next2.setAlignmentX(Component.CENTER_ALIGNMENT);
		next2.addActionListener(new card3());
		q2.add(next2);	
		
		//Panel q3			
		JPanel q3 = new JPanel();
		q3.setLayout(new GridLayout(9, 1));
					
		q3.add(new JLabel("What is something you do while travelling"));
					
		a9 = new JTextField("(present tense verb)",10);
		q3.add(a9);
		q3.add(new JLabel("Name something you do when you go to the gym"));
							
		a10 = new JTextField("(present tense verb)",10);
		q3.add(a10);
					
		q3.add(new JLabel("<html>If you could have one thing in the world<br>what would it be?"));
							
		a11 = new JTextField("(singular noun)",10);
		q3.add(a11);		
					
		JButton next3 = new JButton("the Story");
		next3.setAlignmentX(Component.CENTER_ALIGNMENT);
		next3.addActionListener(new card4());
		q3.add(next3);			
		
		//the story
				//The cards
		cards.setLayout(cl);
		cards.add(q1, "1");
		cards.add(q2, "2");
		cards.add(q3, "3");
		cl.show(cards, "1");
		add(cards);
	}
	private class card2 implements ActionListener
		{
			@Override
				public void actionPerformed(ActionEvent e) {
				//CardLayout cl = (CardLayout)(cards.getLayout());
				cl.show(cards,"2");
		}}
	private class card3 implements ActionListener
		{
			@Override
				public void actionPerformed(ActionEvent e) {
				//CardLayout cl = (CardLayout)(cards.getLayout());
				cl.show(cards,"3");
		}}
	private class card4 implements ActionListener
		{
			@Override
				public void actionPerformed(ActionEvent e) {
				//CardLayout cl = (CardLayout)(cards.getLayout());
				s = "<html>Each spring, the sky turns "+a1.getText()+". Giant drops of<br>"+ a2.getText() +" fall from the sky."+ 
											"All this "+ a2.getText()+"<br> helps the grass and the "+a3.getText() +" to grow,<br> but it can make things"+
											"really "+a4.getText()+" too.<br>"+
											
											"Some places get so much "+a2.getText()+", that rivers <br>"+a5.getText()+" into the streets. <br>Driving can"+ 
											"be tricky when this happens,<br> so some people put special "+a6.getText()+" on their cars.<br>"+

											"And when the "+a2.getText()+" is falling,<br> don't forget your "+a7.getText()+". <br>Otherwise, your feet"+ 
											"might get "+a8.getText()+"<br> if you "+a9.getText()+" in puddles!<br>"+

											"After all the "+a2.getText()+" has fallen,<br> the skies begin to "+a10.getText()+".<br> If you are lucky, you"+ 
											"might see<br> a huge "+a11.getText()+" stretched across the sky.<br>";
	JPanel story = new JPanel();
	story.setLayout(new BoxLayout(story, BoxLayout.PAGE_AXIS));	JLabel hi = new JLabel(s);
	JButton reset = new JButton("start again");
	reset.addActionListener(new reset());
	story.add(hi);
	story.add(reset);
	cards.add(story, "4");
	cl.show(cards,"4");
		}}	
	private class reset implements ActionListener
			{
			@Override
				public void actionPerformed(ActionEvent e) {
				//CardLayout cl = (CardLayout)(cards.getLayout());
				cl.show(cards,"1");
			}}
	
}
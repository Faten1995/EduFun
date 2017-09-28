import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JPanel;
import java.awt.CardLayout;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.ImageIcon;
import java.io.IOException;
import java.awt.event.*;
import java.awt.Color;


public class devPanels extends JPanel {

		JPanel cards;

		JPanel firstQ = new JPanel();
		JPanel secondQ = new JPanel();
		JPanel thirdQ = new JPanel();
		JPanel fourthQ = new  JPanel();
		JPanel fifthQ = new  JPanel();

		//contructure
			
		devPanels()
		{
			//this.setLayout(new CardLayout());
			
			firstQ.setLayout(new BorderLayout());
			firstQ.add(new JLabel(new ImageIcon("q1.jpg")), BorderLayout.CENTER);
			
			JPanel q1 =   new  JPanel();
			JLabel answer =  new  JLabel("The answer is : ");
			JTextField t1 = new JTextField(2);
			JButton check1 = new JButton("check");
			check1.addActionListener(new ActionListener() {
			                @Override
			                public void actionPerformed(ActionEvent e) {
			                    try {
				int i =  Integer.parseInt(t1.getText());
				if(i==40)
				{
					JOptionPane.showMessageDialog(null," 40 is correct\nWell Done :)");
				}
				else {
					
					JOptionPane.showMessageDialog(null," \ntry again ");
				}
			} catch (Exception e2) {
				
				JOptionPane.showMessageDialog(null," \nError: Reenter integer Number. ");
			}
			                }
			            }
			
			);
			JButton next1 = new JButton("next");
			next1.addActionListener(new next1());
			
			q1.add(answer);
			q1.add(t1);
			q1.add(check1);
			q1.add(next1);
			firstQ.add(q1, BorderLayout.SOUTH);
			
			
			secondQ.setLayout(new BorderLayout());
			secondQ.add(new JLabel(new ImageIcon("q2.jpg")), BorderLayout.CENTER);
						
			JPanel q2 =   new  JPanel();
			JLabel answer2 =  new  JLabel("The answer is : ");
			JTextField t2 = new JTextField(2);
			JButton check2 = new JButton("check");
			check2.addActionListener(new ActionListener() {
						         @Override
					public void actionPerformed(ActionEvent e) {
						try {
					int i =  Integer.parseInt(t2.getText());
					if(i==45)
							{
					JOptionPane.showMessageDialog(null," 45 is correct\nWell Done :)");
						//cl.show(panelCont, "3");
							}
					else {
						JOptionPane.showMessageDialog(null," \ntry again ");
							}
						} catch (Exception e2) {
							
							JOptionPane.showMessageDialog(null," \nError: Reenter integer Number. ");
						}
						      }
						 }
						
						);
			JButton next2 = new JButton("next");
			next2.addActionListener(new next2());
			q2.add(answer2);
			q2.add(t2);
			q2.add(check2);
			q2.add(next2);
			secondQ.add(q2, BorderLayout.SOUTH);
			
			
			thirdQ.setLayout(new BorderLayout());
			thirdQ.add(new JLabel(new ImageIcon("q3.jpg")), BorderLayout.CENTER);
									
			JPanel q3 =   new  JPanel();
			JLabel answer3 =  new  JLabel("The answer is : ");
			JTextField t3 = new JTextField(3);
			JButton check3 = new JButton("check");
			check3.addActionListener(new ActionListener() {
							@Override
			public void actionPerformed(ActionEvent e) {
						try {
			int i =  Integer.parseInt(t3.getText());
				if(i==5)
					{
				JOptionPane.showMessageDialog(null," 5 is correct\nWell Done :)");
					}
				else {
				JOptionPane.showMessageDialog(null," \ntry again ");
					}
				} catch (Exception e2) {
										
				JOptionPane.showMessageDialog(null," \nError: Reenter integer Number. ");
					}
				}
			}
									
			);
			JButton next3 = new JButton("next");
			next3.addActionListener(new next3());
			q3.add(answer3);
			q3.add(t3);
			q3.add(check3);
			q3.add(next3);
			thirdQ.add(q3, BorderLayout.SOUTH);
						
			fourthQ.setLayout(new BorderLayout());
			fourthQ.add(new JLabel(new ImageIcon("q4.jpg")), BorderLayout.CENTER);
			JPanel q4 =   new  JPanel();
			JLabel answer4 =  new  JLabel("The answer is : ");
			JTextField t4 = new JTextField(3);
			JButton check4 = new JButton("check");
			check4.addActionListener(new ActionListener() {
															@Override
			public void actionPerformed(ActionEvent e) {
				try {
			int i =  Integer.parseInt(t4.getText());
			if(i==7){
			JOptionPane.showMessageDialog(null," 7 is correct\nWell Done :)");
			}else {
			JOptionPane.showMessageDialog(null," \ntry again ");}
				} catch (Exception e2) {
			JOptionPane.showMessageDialog(null," \nError: Reenter integer Number. ");
			}}}
			);
			JButton next4 = new JButton("next");
			next4.addActionListener(new next4());
			q4.add(answer4);
			q4.add(t4);
			q4.add(check4);
			q4.add(next4);
			fourthQ.add(q4, BorderLayout.SOUTH);
			
			fifthQ.setLayout(new BorderLayout());
			fifthQ.add(new JLabel(new ImageIcon("q5.jpg")), BorderLayout.CENTER);
			JPanel q5 =   new  JPanel();
			JLabel answer5 =  new  JLabel("The answer is : ");
			JTextField t5 = new JTextField(3);
			JButton check5 = new JButton("check");
			check5.addActionListener(new ActionListener() {
															@Override
			public void actionPerformed(ActionEvent e) {
				try {
			int i =  Integer.parseInt(t5.getText());
			if(i==9){
			JOptionPane.showMessageDialog(null," 9 is correct\nWell Done :)");
			}else {
			JOptionPane.showMessageDialog(null," \ntry again ");}
				} catch (Exception e2) {
			JOptionPane.showMessageDialog(null," \nError: Reenter integer Number. ");
			}}}
			);
			JButton next5 = new JButton("next");
			next5.addActionListener(new next5());
			q5.add(answer5);
			q5.add(t5);
			q5.add(check5);
			q5.add(next5);
			fifthQ.add(q5, BorderLayout.SOUTH);						
			cards = new JPanel(new CardLayout());
			cards.add(firstQ, "1");
			cards.add(secondQ, "2");
			cards.add(thirdQ, "3");
			cards.add(fourthQ, "4");
			cards.add(fifthQ, "5");
			add(cards);
			
		
		}
		
		private class next1 implements ActionListener
		{
		@Override
			public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout)(cards.getLayout());
			cl.show(cards,"2");
		}}
		
		private class next2 implements ActionListener
		{
		@Override
			public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout)(cards.getLayout());
			cl.show(cards,"3");
		}}		
		private class next3 implements ActionListener
		{
		@Override
			public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout)(cards.getLayout());
			cl.show(cards,"4");
		}}
		private class next4 implements ActionListener
		{
		@Override
			public void actionPerformed(ActionEvent e) {
			CardLayout cl = (CardLayout)(cards.getLayout());
			cl.show(cards,"5");
		}}		
		private class next5 implements ActionListener
		{
		@Override
			public void actionPerformed(ActionEvent e) {			JOptionPane.showMessageDialog(null," \nwill Done =)\nthis is the last question\nuse the Go menu to go back. ");
		}}
		
		
}
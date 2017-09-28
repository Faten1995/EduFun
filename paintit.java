import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import java.awt.Dimension;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.Box;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.*;
import javax.swing.*;

public class paintit extends JPanel
{
	
	JPanel cards;
	
	public paintit(){
	
	//for coloring the nose RED.	
	JPanel first = new JPanel();
	first.setLayout(new BoxLayout(first,BoxLayout.PAGE_AXIS));
	
	JLabel clown1 = new JLabel(new ImageIcon("clown1.jpg"));
	clown1.setAlignmentX(Component.CENTER_ALIGNMENT);
	first.add(clown1);
	first.add(Box.createRigidArea(new Dimension(0,5)));
	JLabel command1 = new JLabel("choose the color RED for the nose");
	command1.setAlignmentX(Component.CENTER_ALIGNMENT);
	first.add(command1);
	first.add(Box.createRigidArea(new Dimension(0,5)));
	
	//the buttons panel
	JPanel colors1 = new JPanel();
	colors1.setLayout(new BoxLayout(colors1,BoxLayout.LINE_AXIS));
	colors1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JButton yellow1 = new JButton(new ImageIcon("yellow.jpg"));
	yellow1.addActionListener(new wrongColor());
	colors1.add(yellow1);
	colors1.add(Box.createRigidArea(new Dimension(5,0)));
	JButton green1 = new JButton(new ImageIcon("green.jpg"));
	green1.addActionListener(new wrongColor());
	colors1.add(green1);
	colors1.add(Box.createRigidArea(new Dimension(5,0)));
	JButton red1 = new JButton(new ImageIcon("red.jpg"));
	red1.addActionListener(new red());
	colors1.add(red1);
	colors1.add(Box.createRigidArea(new Dimension(5,0)));
	JButton blue1 = new JButton(new ImageIcon("blue.jpg"));
	blue1.addActionListener(new wrongColor());
	colors1.add(blue1);
	colors1.add(Box.createRigidArea(new Dimension(5,0)));
	JButton purple1 = new JButton(new ImageIcon("purple.jpg"));
	purple1.addActionListener(new wrongColor());
	colors1.add(purple1);
	colors1.add(Box.createRigidArea(new Dimension(5,0)));
	
	first.add(colors1);
	
	//for coloring the eyes BLUE 
	JPanel second = new JPanel();
	second.setLayout(new BoxLayout(second,BoxLayout.PAGE_AXIS));
		
	JLabel clown2 = new JLabel(new ImageIcon("clown2.jpg"));
	clown2.setAlignmentX(Component.CENTER_ALIGNMENT);
	second.add(clown2);
	second.add(Box.createRigidArea(new Dimension(0,5)));
	JLabel command2 = new JLabel("choose the color BLUE for the eyes");
	command2.setAlignmentX(Component.CENTER_ALIGNMENT);
	second.add(command2);
	second.add(Box.createRigidArea(new Dimension(0,5)));
		
	//the buttons panel
	JPanel colors2 = new JPanel();
	colors2.setLayout(new BoxLayout(colors2,BoxLayout.LINE_AXIS));
	colors2.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JButton yellow2 = new JButton(new ImageIcon("yellow.jpg"));
	yellow2.addActionListener(new wrongColor());
	colors2.add(yellow2);
	colors2.add(Box.createRigidArea(new Dimension(5,0)));
	JButton green2 = new JButton(new ImageIcon("green.jpg"));
	green2.addActionListener(new wrongColor());
	colors2.add(green2);
	colors2.add(Box.createRigidArea(new Dimension(5,0)));
	JButton red2 = new JButton(new ImageIcon("red.jpg"));
	red2.addActionListener(new wrongColor());
	colors2.add(red2);
	colors2.add(Box.createRigidArea(new Dimension(5,0)));
	JButton blue2 = new JButton(new ImageIcon("blue.jpg"));
	blue2.addActionListener(new blue());
	colors2.add(blue2);
	colors2.add(Box.createRigidArea(new Dimension(5,0)));
	JButton purple2 = new JButton(new ImageIcon("purple.jpg"));
	purple2.addActionListener(new wrongColor());
	colors2.add(purple2);
	colors2.add(Box.createRigidArea(new Dimension(5,0)));
		
	second.add(colors2);
	
	//for coloring the mouth PURPLE 
	JPanel third = new JPanel();
	third.setLayout(new BoxLayout(third,BoxLayout.PAGE_AXIS));
		
	JLabel clown3 = new JLabel(new ImageIcon("clown3.jpg"));
	clown3.setAlignmentX(Component.CENTER_ALIGNMENT);
	third.add(clown3);
	third.add(Box.createRigidArea(new Dimension(0,5)));
	JLabel command3 = new JLabel("choose the color PURPLE for the mouth");
	command3.setAlignmentX(Component.CENTER_ALIGNMENT);
	third.add(command3);
	third.add(Box.createRigidArea(new Dimension(0,5)));
		
	//the buttons panel
	JPanel colors3 = new JPanel();
	colors3.setLayout(new BoxLayout(colors3,BoxLayout.LINE_AXIS));
	colors3.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JButton yellow3 = new JButton(new ImageIcon("yellow.jpg"));
	yellow3.addActionListener(new wrongColor());
	colors3.add(yellow3);
	colors3.add(Box.createRigidArea(new Dimension(5,0)));
	JButton green3 = new JButton(new ImageIcon("green.jpg"));
	green3.addActionListener(new wrongColor());
	colors3.add(green3);
	colors3.add(Box.createRigidArea(new Dimension(5,0)));
	JButton red3 = new JButton(new ImageIcon("red.jpg"));
	red3.addActionListener(new wrongColor());
	colors3.add(red3);
	colors3.add(Box.createRigidArea(new Dimension(5,0)));
	JButton blue3 = new JButton(new ImageIcon("blue.jpg"));
	blue3.addActionListener(new wrongColor());
	colors3.add(blue3);
	colors3.add(Box.createRigidArea(new Dimension(5,0)));
	JButton purple3 = new JButton(new ImageIcon("purple.jpg"));
	purple3.addActionListener(new purple());
	colors3.add(purple3);
	colors3.add(Box.createRigidArea(new Dimension(5,0)));
	
	third.add(colors3);	

	//for coloring the hair Yellow 
	JPanel fourth = new JPanel();
	fourth.setLayout(new BoxLayout(fourth,BoxLayout.PAGE_AXIS));
		
	JLabel clown4 = new JLabel(new ImageIcon("clown4.jpg"));
	clown4.setAlignmentX(Component.CENTER_ALIGNMENT);
	fourth.add(clown4);
	fourth.add(Box.createRigidArea(new Dimension(0,5)));
	JLabel command4 = new JLabel("choose the color YELLOW for the hair");
	command4.setAlignmentX(Component.CENTER_ALIGNMENT);
	fourth.add(command4);
	fourth.add(Box.createRigidArea(new Dimension(0,5)));
		
	//the buttons panel
	JPanel colors4 = new JPanel();
	colors4.setLayout(new BoxLayout(colors4,BoxLayout.LINE_AXIS));
	colors4.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JButton yellow4 = new JButton(new ImageIcon("yellow.jpg"));
	yellow4.addActionListener(new yellow());
	colors4.add(yellow4);
	colors4.add(Box.createRigidArea(new Dimension(5,0)));
	JButton green4 = new JButton(new ImageIcon("green.jpg"));
	green4.addActionListener(new wrongColor());
	colors4.add(green4);
	colors4.add(Box.createRigidArea(new Dimension(5,0)));
	JButton red4 = new JButton(new ImageIcon("red.jpg"));
	red4.addActionListener(new wrongColor());
	colors4.add(red4);
	colors4.add(Box.createRigidArea(new Dimension(5,0)));
	JButton blue4 = new JButton(new ImageIcon("blue.jpg"));
	blue4.addActionListener(new wrongColor());
	colors4.add(blue4);
	colors4.add(Box.createRigidArea(new Dimension(5,0)));
	JButton purple4 = new JButton(new ImageIcon("purple.jpg"));
	purple4.addActionListener(new wrongColor());
	colors4.add(purple4);
	colors4.add(Box.createRigidArea(new Dimension(5,0)));
	
	fourth.add(colors4);
	
	//for coloring the ears Green 
	JPanel fifth = new JPanel();
	fifth.setLayout(new BoxLayout(fifth,BoxLayout.PAGE_AXIS));
		
	JLabel clown5 = new JLabel(new ImageIcon("clown5.jpg"));
	clown5.setAlignmentX(Component.CENTER_ALIGNMENT);
	fifth.add(clown5);
	fifth.add(Box.createRigidArea(new Dimension(0,5)));
	JLabel command5 = new JLabel("choose the color GREEN for the ears");
	command5.setAlignmentX(Component.CENTER_ALIGNMENT);
	fifth.add(command5);
	fifth.add(Box.createRigidArea(new Dimension(0,5)));
		
	//the buttons panel
	JPanel colors5 = new JPanel();
	colors5.setLayout(new BoxLayout(colors5,BoxLayout.LINE_AXIS));
	colors5.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JButton yellow5 = new JButton(new ImageIcon("yellow.jpg"));
	yellow5.addActionListener(new wrongColor());
	colors5.add(yellow5);
	colors5.add(Box.createRigidArea(new Dimension(5,0)));
	JButton green5 = new JButton(new ImageIcon("green.jpg"));
	green5.addActionListener(new green());
	colors5.add(green5);
	colors5.add(Box.createRigidArea(new Dimension(5,0)));
	JButton red5 = new JButton(new ImageIcon("red.jpg"));
	red5.addActionListener(new wrongColor());
	colors5.add(red5);
	colors5.add(Box.createRigidArea(new Dimension(5,0)));
	JButton blue5 = new JButton(new ImageIcon("blue.jpg"));
	blue5.addActionListener(new wrongColor());
	colors5.add(blue5);
	colors5.add(Box.createRigidArea(new Dimension(5,0)));
	JButton purple5 = new JButton(new ImageIcon("purple.jpg"));
	purple5.addActionListener(new wrongColor());
	colors5.add(purple5);
	colors5.add(Box.createRigidArea(new Dimension(5,0)));
	
	fifth.add(colors5);
	
	//the last card 
	JPanel last = new JPanel();
	last.setLayout(new BoxLayout(last,BoxLayout.PAGE_AXIS));
		
	JLabel clown6 = new JLabel(new ImageIcon("clown6.jpg"));
	clown6.setAlignmentX(Component.CENTER_ALIGNMENT);
	last.add(clown6);
	last.add(Box.createRigidArea(new Dimension(0,25)));
	JLabel command6 = new JLabel("and this is your COLORFUL clown =)");
	command6.setAlignmentX(Component.CENTER_ALIGNMENT);
	last.add(command6);
	last.add(Box.createRigidArea(new Dimension(0,5)));

	
	//adding the cards
	cards = new JPanel(new CardLayout());
	cards.add(first, "1");
	cards.add(second, "2");
	cards.add(third, "3");
	cards.add(fourth, "4");
	cards.add(fifth, "5");
	cards.add(last, "6");
	add(cards);
	}
	
	
	private class red implements ActionListener
		{
			@Override
				public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout)(cards.getLayout());
				cl.show(cards,"2");
		}}
	private class blue implements ActionListener
		{
			@Override
				public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout)(cards.getLayout());
				cl.show(cards,"3");
		}}
		private class purple implements ActionListener
		{
			@Override
				public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout)(cards.getLayout());
				cl.show(cards,"4");
		}}	
		private class yellow implements ActionListener
		{
			@Override
				public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout)(cards.getLayout());
				cl.show(cards,"5");
		}}
		private class green implements ActionListener
		{
			@Override
				public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout)(cards.getLayout());
				cl.show(cards,"6");
		}}
	private class wrongColor implements ActionListener
	{
		@Override
			public void actionPerformed(ActionEvent e) {
			new AePlayWave("obnowhs.wav").start(); 
			JOptionPane.showMessageDialog(null,"error\nchoose another color.");
	}}
}
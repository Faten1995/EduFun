import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.io.IOException;
//for the layout
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.Box;

import java.awt.Color;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class animals extends JPanel{
	
	int numCs;
	int clicked=0;
	CardLayout cards=new CardLayout();
	JPanel panelCont = new JPanel();
	
	CardLayout cl = new CardLayout();
	
	String[] animals = {"Sheep","Cow","Horse","Dog","Cat","Bird"};
	String[] voice =  {"sheep.wav","cow.wav","horse.wav","dog.wav","cat.wav","bird.wav"};
	String[] img =  {"sheep.png","cow.png","horse.png","dog.gif","cat.png","bird.png"};
	slide slides[] ={
		
		new slide(animals[0],
		img[0],
		voice[0],this
		),
		new slide(animals[1],
		img[1],
		voice[1],this
		),
		new slide(animals[2],
		img[2],
		voice[2],this
		),
		new slide(animals[3],
		img[3],
		voice[3],this
		),
		new slide(animals[3],
		img[3],
		voice[3],this
		),
		new slide(animals[4],
		img[4],
		voice[4],this
		),
		new slide(animals[5],
		img[5],
		voice[5],this
		),
		
	};
	
	public animals(){
		setLayout(cards);
		numCs=slides.length;
		for(int i=0;i<numCs;i++){
		add(slides[i],"q"+i);
				}
		Random r=new Random();
		int i=r.nextInt(numCs);
		cards.show(this,"q"+i);
		setVisible(true);
		
	}
	
	public void next(){
			try{
			if(clicked==numCs){
					JOptionPane.showMessageDialog(null,"this is the last animal :)\n ");	
			} 
			else if(clicked > numCs){
				throw new Exception();
			}
			else {
			Random r=new Random();
			boolean found=false;
			int i=0;
			while(!found){
			i=r.nextInt(numCs);
			if(!slides[i].used){
				found=true;
					}
			}
			cards.show(this,"q"+i);
		}
		
	}
	catch (Exception e) {
		JOptionPane.showMessageDialog(null, "ERROR \n no animals left =) \n ");
	}	}
}
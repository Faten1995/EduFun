import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import javax.swing.ImageIcon;


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
import java.awt.Font;

public class slide extends JPanel implements ActionListener{
	

		animals animal;	
		int selected;
		boolean used;
		//picutre
		JPanel pPanel=new JPanel();
		//voices
		JPanel vPanel=new JPanel();
		//names
		JPanel nPanel=new JPanel();
		//bottom
		JPanel botPanel=new JPanel();
		JButton next=new JButton("Next");
		JButton finish=new JButton("Finish");
	
	public slide(String name,String img,String voice,animals animal){
		
	this.animal=animal;	
	setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
	
	pPanel.add(new JLabel(new ImageIcon(img)));
	JButton but=new JButton("Listen");
	but.addActionListener(new ActionListener() {
	                @Override
	                public void actionPerformed(ActionEvent e) {
	                 new AePlayWave(voice).start();   
	                }
	            });
	
	vPanel.add(but);
	Font fo = new Font("Algerian",Font.BOLD,25);
	JLabel l = new JLabel(name);
	l.setFont(fo);
	nPanel.add(l);
	add(pPanel);
	add(vPanel);
	add(nPanel);
	//bottom
	next.addActionListener(this); 
	finish.addActionListener(this);
	botPanel.add(next);
	add(botPanel);
	
	}

	public void actionPerformed(ActionEvent e){
			Object src=e.getSource();
			//next button
			if(src.equals(next)){
					animal.clicked++;
					used=true;
					animal.next();
				}
			
						
		}
		
}
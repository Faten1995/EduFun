import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class Quiz2 extends JPanel{
	CardLayout cards=new CardLayout();
	int numQs;
	int wrongs=0;
	int total=0;
	
	
	JPanel panelCont = new JPanel();
	CardLayout cl = new CardLayout();
	
	String[][] answers={
		{"childs","children","child","child's"},
		{"childs","children","children's","childrens'"},
		{"leaves","leaf","leafs"},
		{"cat","cats"},
		{"countries","country","countrys","country's"},
		{"mouse","mouse's","mouses","mice"},
		{"men","man","men's","man's"},
		{"feet","foots"},
		{"fathers","father's","father","fathers'"},

	};
	
	RadioQuestion2 questions[]={
		
		new RadioQuestion2(
			"There are some ___ playing in the park.",
			answers[0],
			1,this
		),
		new RadioQuestion2(
			"The ___ rooms are upstairs.",
			answers[1],
			2,this
		),
		new RadioQuestion2(
			"Most of the ___ have already changed colors.",
			answers[2],
			0,this
		),
		new RadioQuestion2(
			"I don't like ___.",
			answers[3],
			1,this
		),
		new RadioQuestion2(
			"How many ___ have you visited?",
			answers[4],
			0,this
		),
		new RadioQuestion2(
			"There are many ___ in our house.",
			answers[5],
			3,this
		),
		new RadioQuestion2(
			"One of the ___ broke his glasses.",
			answers[6],
			0,this
		),
		new RadioQuestion2(
			"Please put the shoes on the baby's ___.",
			answers[7],
			0,this
		),
		new RadioQuestion2(
			"That is my ___ umbrella.",
			answers[8],
			1,this
		)
	};

	
	public Quiz2(){
	
		
		setLayout(cards);
		numQs=questions.length;
		for(int i=0;i<numQs;i++){
			add(questions[i],"q"+i);
		}
		Random r=new Random();
		int i=r.nextInt(numQs);
		cards.show(this,"q"+i);
		setVisible(true);
	}
	
	public void next(){
		if((total-wrongs)==numQs){
			showSummary();
		}else{
			Random r=new Random();
			boolean found=false;
			int i=0;
			while(!found){
				i=r.nextInt(numQs);
				if(!questions[i].used){
					found=true;
				}
			}
			cards.show(this,"q"+i);
		}
	}
	
	public void showSummary(){
		JOptionPane.showMessageDialog(null,"All Done :), here are your results"+
			"\nNumber of incorrect Answers: \t"+wrongs+
			"\nNumber of Correct Answers: \t"+(total-wrongs)+
			"\nAverage Incorrect Answers per Quesiotn: \t"+((float)wrongs/numQs)+
			"\nPercent Correct: \t\t"+(int)(((float)(total-wrongs)/total)*100)+"%"
		);
		
		

	}
}
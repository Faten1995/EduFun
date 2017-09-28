import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class Quiz3 extends JPanel{
	CardLayout cards=new CardLayout();
	int numQs;
	int wrongs=0;
	int total=0;
	
	
	JPanel panelCont = new JPanel();
	CardLayout cl = new CardLayout();
	
	String[][] answers={
		{"at","in","on"},
		{"at","in","on"},
		{"at","in","on"},
		{"at","in","on"},
		{"at","in","on"},
		{"at","in","on"},
		{"at","in","on"},
		{"at","in","on"},
		{"at","in","on"},

	};
	
	RadioQuestion3 questions[]={
		
		new RadioQuestion3(
			"Your father is arriving in Texas ___ five o'clock in the evening.",
			answers[0],
			0,this
		),
		new RadioQuestion3(
			"I swim ___ the school pool.",
			answers[1],
			1,this
		),
		new RadioQuestion3(
			"What day were you born ___?",
			answers[2],
			2,this
		),
		new RadioQuestion3(
			"We will stop ___ the mall on the way to my house.",
			answers[3],
			0,this
		),
		new RadioQuestion3(
			"Diamond was born ___ the 30th of July.",
			answers[4],
			2,this
		),
		new RadioQuestion3(
			"Do you like to shop ___ Lucky's Supermarket?",
			answers[5],
			0,this
		),
		new RadioQuestion3(
			"___ what day were you born?",
			answers[6],
			2,this
		),
		new RadioQuestion3(
			"Lina was born ___ 1954.",
			answers[7],
			1,this
		),
		new RadioQuestion3(
			"Do your parents live ___ Mexico?",
			answers[8],
			1,this
		)
	};

	
	public Quiz3(){
	
		
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
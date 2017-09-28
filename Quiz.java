import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class Quiz extends JPanel{
	CardLayout cards=new CardLayout();
	int numQs;
	int wrongs=0;
	int total=0;
	
	//JButton back;
	
	JPanel panelCont = new JPanel();
	CardLayout cl = new CardLayout();
	
	String[][] answers={
		{"ordering","ordered","orders"},
		{"acting","acts","act"},
		{"borrow","borrowed","borowing"},
		{"asked","asking","ask"},
		{"cooking","cooked","cook","cooks"},
		{"wakes","wakeing","woke"},
		{"packing","packed","packs"},
		{"signing","signed","sign"},
		{"watered","waters","watering"},

	};
	
	RadioQuestion questions[]={
		
		new RadioQuestion(
			"She has ____ a hamburger for dinner.",
			answers[0],
			1,this
		),
		new RadioQuestion(
			"They ___ in a play every year.",
			answers[1],
			2,this
		),
		new RadioQuestion(
			"My brother will ___ money from me.",
			answers[2],
			0,this
		),
		new RadioQuestion(
			"Can you ___ the teacher the question?",
			answers[3],
			2,this
		),
		new RadioQuestion(
			"She will ___ my breakfast in the morning.",
			answers[4],
			2,this
		),
		new RadioQuestion(
			"She ___ up early on her trip last week.",
			answers[5],
			2,this
		),
		new RadioQuestion(
			"We ___ for our trip to Europe.",
			answers[6],
			1,this
		),
		new RadioQuestion(
			"He ___ his name on the paper.",
			answers[7],
			1,this
		),
		new RadioQuestion(
			"I'm ___ my garden.",
			answers[8],
			2,this
		)
	};

	
	public Quiz(){
		
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
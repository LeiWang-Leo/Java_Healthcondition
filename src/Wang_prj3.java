//import swing and awt;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Wang_prj3 extends JFrame implements ActionListener
{
	//initialize width and height of the window;
	//initialize the number of character;
	//initialize the number of digits;
	//initialize the textfield and textarea as null.
   public static final int WIDTH=400;
   public static final int HEIGHT=300;
   public static final int NUMBER_OF_CHAR=30;
   public static final int NUMBER_OF_DIGITS=3;
   public String result=null;
   public String result1=null;
   
   //define different objects of textfield and textarea;
   private JTextField name;
   private JTextField age;
   private JTextField height;
   private JTextField weight;
   private JTextField value;
   private JTextArea theText;
   
   public static void main(String[] args)
   {
	   //defince a object of class Wang_prj3;
	   //set JFram visible;
	   Wang_prj3 a = new Wang_prj3();
	   a.setVisible(true);
   }
   
   public Wang_prj3()
   {
	   //assign title to the superclass;
	   super("health condition");
	   //set size of the window;
	   setSize(WIDTH,HEIGHT);
	   //set close operation;
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   //set layout of window;
	   setLayout(new BorderLayout());
	   
	   //define object of Jpanel called bigPanel and set it as gridlayout and set the backgroud white;
	   JPanel bigPanel=new JPanel();
	   bigPanel.setLayout(new GridLayout(4,2));
	   bigPanel.setBackground(Color.white);
	   
	   //define object of JLabel called nameLabel and name label as "Name" and add it to bigPanel; 
	   JLabel nameLabel=new JLabel("Name");
	   bigPanel.add(nameLabel);
	   //assign a new memory to JTextField name, and set its number of character;
	   //add this JTextField to the next space of gridlayout;
	   name=new JTextField(NUMBER_OF_CHAR);
	   bigPanel.add(name);
	   
	   //define object of JLabel called ageLabel and name label as "Age" and add it next space of gridlayout;
	   JLabel ageLabel=new JLabel("Age");
	   bigPanel.add(ageLabel);
	   //assign a new memory to JTextField age, and set its number of digits;
	   //add it to next space of bigPanel;
	   age=new JTextField(NUMBER_OF_DIGITS);
	   bigPanel.add(age);
	   
	 //define object of JLabel called heightLabel and name label as "Height(inches)" and add it next space of gridlayout;
	   JLabel heightLabel=new JLabel("Height(inches)");
	   bigPanel.add(heightLabel);
	   //assign a new memory to JTextField height, and set its number of digits;
	   //add it to next space of bigPanel;
	   height=new JTextField(NUMBER_OF_DIGITS);
	   bigPanel.add(height);
	   
	 //define object of JLabel called weightLabel and name label as "Weight(pound)" and add it next space of gridlayout;
	   JLabel weightLabel=new JLabel("Weight(pound)");
	   bigPanel.add(weightLabel);
	   //assign a new memory to JTextField weight, and set its number of digits;
	   //add it to next space of bigPanel;
	   weight=new JTextField(NUMBER_OF_DIGITS);
	   bigPanel.add(weight);
	   
	   //add the bigPanel to the north of borderlayout, which is layout of JFrame;
	   add(bigPanel, BorderLayout.NORTH);
	   
	   //define a JPanel object called buttonPanel and set its layout as flowlayout;
	   //set its background as white;
	   JPanel buttonPanel=new JPanel();
	   buttonPanel.setLayout(new FlowLayout());
	   buttonPanel.setBackground(Color.WHITE);
	   
	   //define a JButton object called buttonContinue and name it as "Continue";
	   JButton buttonContinue=new JButton("Continue");
	   
	   //using this object to call addActionListener function, pass current object to it.
	   buttonContinue.addActionListener(this);
	   //add this button to the buttonPanel;
	   buttonPanel.add(buttonContinue);
	   
	 //using this object to call addActionListener function, pass current object to it.
	   JButton finishContinue=new JButton("Finish");
	   finishContinue.addActionListener(this);
	 //add this button to the buttonPanel;
	   buttonPanel.add(finishContinue);
	   
	   //add the buttonPanel to the Center of borderlayout;
	   add(buttonPanel, BorderLayout.CENTER);
	   
	   //define an JPanel object named descriptionPanel;
	   //set its layout as borderlayout;
	   //set its background as gray;
	   //add the descriptionPanel to the south of borderlayout;
	   JPanel descriptionPanel=new JPanel();
	   descriptionPanel.setLayout(new BorderLayout());
	   descriptionPanel.setBackground(Color.LIGHT_GRAY);
	   add(descriptionPanel, BorderLayout.SOUTH);
	   
	   
	   //define a JLabel object named descriptionLabel and name it as "Description";
	   //add it to center of borderlayout;
	   JLabel descriptionLabel= new JLabel("Description");
	   descriptionPanel.add(descriptionLabel, BorderLayout.CENTER);
	   
	   //assign a new memory ot the JTextField value and name it "displaying the entered value";
	   //make it not be able to be edited by users;
	   //add it to the north of the borderlayout;
	   value=new JTextField("Displaying the entered value");
	   value.setEditable(false);
	   descriptionPanel.add(value, BorderLayout.NORTH);
	   
	   //assign a new momery to JTextArea and name it as "Describing your body condition",
	   //and set number of rows as 4 and number of colomns as 15;
	   //set it uneditable;
	   //add it to the south of borderlayout;
	   theText=new JTextArea("Describing your body condition", 4,15);
	   theText.setEditable(false);
	   descriptionPanel.add(theText, BorderLayout.SOUTH);
	   
	   
	   //define a object of JMenu;
	   JMenu instructionMenu=new JMenu("INTRODUCTION");
	   
	   //define an object of JMenuItem;
	   JMenuItem nameItem=new JMenuItem("Name");
	   //use this object to call addActionListener function;
	   nameItem.addActionListener(new menuListener());
	   //add this menuitem object to menu object named instructionMenu; 
	   instructionMenu.add(nameItem);
	   
	   JMenuItem ageItem=new JMenuItem("Age");
	   ageItem.addActionListener(new menuListener());
	   instructionMenu.add(ageItem);
	   
	   JMenuItem heightItem=new JMenuItem("Height");
	   heightItem.addActionListener(new menuListener());
	   instructionMenu.add(heightItem);
	   
	   JMenuItem weightItem=new JMenuItem("Weight");
	   weightItem.addActionListener(new menuListener());
	   instructionMenu.add(weightItem);
	  
	   //define a menubar object named bar;
	   //add menu to this bar;
	   //set the color of the bar as gray;
	   JMenuBar bar= new JMenuBar();
	   bar.add(instructionMenu);
	   bar.setBackground(Color.LIGHT_GRAY);
	   //set the menubar;
	   setJMenuBar(bar);
	  
   }
   
 //overide this function, which within the actionlistener function;
   public void actionPerformed(ActionEvent e)
   {
	  //initialize string actionCommand to store return value of getActionCommand function called by object e;
		   String actionCommand=e.getActionCommand();
		   //if actionCommand equals "continue", execute the following statement;
		   if(actionCommand.equals("Continue"))
			   {
			   //make sure the input value within the right range;
			   if(stingToDouble(age.getText())<200&&stingToDouble(height.getText())<120&&stingToDouble(weight.getText())<550
				 &&stingToDouble(age.getText())>0&&stingToDouble(height.getText())>0&&stingToDouble(weight.getText())>0)
			   {
				   //display the input value from an user in result1;
				   result1="name: "+name.getText()+";\t"+"age: "+age.getText()+";\t"+"height: "+height.getText()+";\t"+ "weight: "+weight.getText();
			   //set result1 to TextField value;
				   value.setText(result1);
				   
				   //judge the health condition based on relevant value, including age, weight and height;
				   //and use result to store the result;
		       if(stingToDouble(age.getText())<30)
		          {
		    	  result=name.getText()+" is young";
		          }
		       else if(stingToDouble(age.getText())>65)
		    	   {
		    	   result=name.getText()+" is old";
		    	   }
		       else  result=name.getText()+" is middle-age";
		       
		       if(stingToDouble(height.getText())<63)
		    	   result=result+", short";
			       else if(stingToDouble(height.getText())>69)
			    	   result=result+", tall";
			       else  result=result+", medium";   
		       
		       if(stingToDouble(weight.getText())<132)
		    	   result=result+", slim";
		       else if(stingToDouble(weight.getText())>187)
		    	   result=result+" , heavy";
		       else  result=result+", normal";   
		    	   //pass the result to theText;
		       theText.setText(result);
			   }
			   else value.setText("Something wrong, please read the introduction");
			   }
		   //if action Command equals "Finish", then execute the following statement;
		   else if(actionCommand.equals("Finish"))
		   {
			   //set all relevant object as null;
			   result1=null;
			   value.setText(result1);
			   result=null;
			   theText.setText(result);
			   name.setText(null);
			   age.setText(null);
			   height.setText(null);
			   weight.setText(null);
		   }
		  
   }
   //use this function to convert value whose type is string to double type;
   private static double stingToDouble(String stringObject)
   {
	   return Double.parseDouble(stringObject.trim());
   }
   
   
  //define class menuListener implements actionlistener;
public  class menuListener implements ActionListener
   {
	
   public void actionPerformed(ActionEvent e) 
   {
	   String actionCommand=e.getActionCommand();
	   //display the instruction in the theText, which is TextArea, based on which button is pressd;
	   if(actionCommand.equals("Name"))
	   {
		   theText.setText("Enter your name within 30 characters");
	   }
	   else if(actionCommand.equals("Age"))
	   {
		   theText.setText("Enter your age within 3 digits, ranging from 0 to 200");
	   }
	   else if(actionCommand.equals("Height"))
	   {
		   theText.setText("Enter your Height within 3 digits, ranging from 0 to 120(inches)");
	   }
	   else if(actionCommand.equals("Weight"))
	   {
		   theText.setText("Enter your Weight within 3 digits, ranging from 0 to 550(pound)");
	   }
	   else 
		   theText.setText("Unexpected error.");
   }
   }
}
    	   
       
	   
   

   
   
   
   


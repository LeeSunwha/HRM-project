package panel;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;


/**
 * @brief 인사평가 등록
 * @author 유지광
 * @version v1.00 2020.02.11 
 * @see 
 */
public class EvaluationManagePanel extends JPanel{

	
	private Frame frame;
	private Button button1, button2, button3;
	
	
	public EvaluationManagePanel() {
		// TODO Auto-generated constructor stub
		
		
		frame = new Frame();
		button1 = new Button ("버튼1");
		button2 = new Button ("열기");
		button3 = new Button ("닫기");
		
		
	}
	
	public void startFrame() {
		
		frame.setLayout( new FlowLayout());
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		
		
		frame.setSize (300, 300);
		frame.setVisible(true);
		
	}
		
}		
		
	
		

package dialog;

import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * @brief ��� ��� ���̾�α�
 * @author �ڿ���
 * @version v1.00 2020.02.11
 * @see none
 */
public class EmpAddDialog extends JDialog{
	
	public EmpAddDialog(JFrame f, String msg, boolean modal) {
		// TODO Auto-generated constructor stub
		super(f,msg,modal);
		
		setSize(new Dimension(660,880)); //���̾�α� ũ��
		setLocationRelativeTo(null); //��� ��ġ
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); //�ݱ�

	}
}

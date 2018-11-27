import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyCounter extends JFrame implements ActionListener{
	private JLabel[] labels;
	private JButton button;
	private int[] numbers;
	
	public MyCounter() {
		this.setSize(500, 300);
		JPanel panel=new JPanel();
		panel.setLayout(null);
		
		labels=new JLabel[3];
		numbers=new int[3];
		
		for(int i=0;i<3;i++) {//3���� ���̺��� �����Ѵ�. ���� ��ġ�� ǥ���Ѵ�.
			labels[i]=new JLabel(" "+numbers[i]);
			labels[i].setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 100));
			labels[i].setSize(100, 100);
			labels[i].setLocation(100+100*i, 20);
			panel.add(labels[i]);
		}
		
		button=new JButton("����");
		button.setSize(250, 50);
		button.setLocation(100, 150);
		panel.add(button);
		button.addActionListener(this);
		
		this.add(panel);
		this.setTitle("My Game");
		
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0;i<3;i++) {
			numbers[i]=(int)(Math.random()*10);
			labels[i].setText(" "+numbers[i]);
		}
		
	}
	
}
public class SlotMachine {

	public static void main(String[] args) {
		new MyCounter();

	}

}

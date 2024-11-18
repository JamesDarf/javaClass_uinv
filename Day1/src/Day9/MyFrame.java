package Day9;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("300 x 300 스윙 프레임 만들기");

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.orange);
		contentPane.setLayout(null);
//		contentPane.setLayout(new GridLayout(4,2));

//		GridLayout grid = new GridLayout(4,2);
//		contentPane.setLayout(grid);
//		grid.setVgap(5);
//
//
//		contentPane.add(new JLabel("이름"));
//		contentPane.add(new JTextField(""));
//		contentPane.add(new JLabel("학번"));
//		grid.setVgap(5);
//		contentPane.add(new JLabel("학과"));
//		contentPane.add(new JTextField(""));
//		contentPane.add(new JLabel("과목"));
//		contentPane.add(new JTextField(""));

		for(int i = 1; i < 10; i++) {
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i*20, i*20);
			b.setSize(50,20);
			contentPane.add(b);
		}


		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}

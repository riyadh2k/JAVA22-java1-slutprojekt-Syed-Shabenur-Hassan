

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI {

	public static void addGroupOfComponents(String text, JPanel panel, String day, String date) {
		// TODO Auto-generated method stub
		JPanel panelChild = new JPanel();
		panelChild.setLayout(new BoxLayout(panelChild, BoxLayout.Y_AXIS));

		JLabel labelday = new JLabel(day);
		labelday.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		JLabel labeldate = new JLabel(date);
		labeldate.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		JTextArea eventTextarea = new JTextArea();
		eventTextarea.setEditable(false);
		eventTextarea.setLineWrap(true);
//		eventTextarea.setBackground(Color.lightGray);


		JButton button = new JButton(text + "");
		button.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		JTextField tf = new JTextField(text + "Text Field", 20);
		tf.setMaximumSize(new Dimension(Short.MAX_VALUE, 500));
		addButtonListener(button, eventTextarea, tf);
		panelChild.setBorder((BorderFactory.createLineBorder(Color.black)));


		panelChild.add(labelday);
		panelChild.add(labeldate);
		panelChild.add(eventTextarea);
		panelChild.add(tf);
		panelChild.add(button);
//		System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")));
		setDayColor(labelday, date);

		panel.add(panelChild);

	}

	private static void addButtonListener(JButton button, JTextArea label, JTextField tf) {
		ActionListener buttonListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				System.out.println(button.getText());
//				System.out.println(tf.getText());
				label.setText(label.getText() + "\n" + tf.getText());
				tf.setText(" ");
			}
		};
		button.addActionListener(buttonListener);
	}

	private static void setDayColor(JLabel labelday, String date) {
		if (LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")).equals(date)) {
			labelday.setOpaque(true);
			labelday.setBackground(Color.GREEN);
		}

	}

}
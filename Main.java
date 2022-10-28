

import java.awt.GridLayout;
import java.time.DayOfWeek;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Calender");
		frame.setSize(1000, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 7, 5, 5));

		DayDate dayDate = new DayDate();


		GUI.addGroupOfComponents("Add", panel, "MONDAY", dayDate.getWeekDate(DayOfWeek.MONDAY));
		GUI.addGroupOfComponents("Add", panel, "TUESDAY", dayDate.getWeekDate(DayOfWeek.TUESDAY));
		GUI.addGroupOfComponents("Add", panel, "WEDNESDAY", dayDate.getWeekDate(DayOfWeek.WEDNESDAY));
		GUI.addGroupOfComponents("Add", panel, "THURSDAY", dayDate.getWeekDate(DayOfWeek.THURSDAY));
		GUI.addGroupOfComponents("Add", panel, "FRIDAY", dayDate.getWeekDate(DayOfWeek.FRIDAY));
		GUI.addGroupOfComponents("Add", panel, "SATURDAY", dayDate.getWeekDate(DayOfWeek.SATURDAY));
		GUI.addGroupOfComponents("Add", panel, "SUNDAY", dayDate.getWeekDate(DayOfWeek.SUNDAY));

		frame.add(panel);
		frame.setVisible(true);

	}

}
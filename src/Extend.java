import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Extend extends JFrame {
	
	//Calendar calendar;  This instance is not needed!
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	String time;
	String day;
	String date;
	
	
	Extend (){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Digital Clock");
		this.setLayout(new FlowLayout());
		this.setSize(350, 200);
		this.setResizable(false);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		timeFormat = new SimpleDateFormat ("hh:mm:ss a");
		dayFormat = new SimpleDateFormat ("EEEE");
		dateFormat = new SimpleDateFormat ("MMMMM dd, yyyy");
		
		timeLabel = new JLabel();
		timeLabel.setFont(new Font("verdana", Font.PLAIN,50));
		timeLabel.setForeground(new Color(0x00FF00));
		timeLabel.setBackground(Color.BLACK);
		timeLabel.setOpaque(true);
		
		dayLabel = new JLabel();
		dayLabel.setFont(new Font("Arial",Font.PLAIN,30));
		
		dateLabel = new JLabel ();
		dateLabel.setFont(new Font ("Arial Narrow", Font.PLAIN,35));
		
		this.add(timeLabel);
		this.add(dayLabel);
		this.add(dateLabel);
		
		
		
		setTime();
		
	}
	
	public void setTime() {
		while(true) {
			
		
		
		time = timeFormat.format(Calendar.getInstance().getTime());
		timeLabel.setText(time);
		
		day = dayFormat.format(Calendar.getInstance().getTime());
		dayLabel.setText(day);
		
		date = dateFormat.format(Calendar.getInstance().getTime());
		dateLabel.setText(date);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}

}

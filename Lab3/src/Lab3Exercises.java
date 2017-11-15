import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("John Hernandez");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(1920/2 - 500/2, 1080/2 - 300/2);
		myFrame.setSize(500, 300);
        MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
	}
}
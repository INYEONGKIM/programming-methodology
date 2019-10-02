// View (input view)

package myBank;

import javax.swing.JOptionPane;

public class BankReader {
	
	private String input_line;
	
	// 무조건 첫 번째 글자만 반환하는 역할 
	public char readCommand(String message) {
		// input dialog를 이용한 input, message = input info message
		this.input_line = JOptionPane.showInputDialog(message);
		
		if (this.input_line == null) { // inputDialog의 cancel btn return type
			return 'Q';
		}
		else {
			this.input_line = this.input_line.trim().toUpperCase();
			return this.input_line.charAt(0); 
		}		
	}
	
	public int readAmount() {
		String[] s = this.input_line.split(" ");
		if (s.length < 2) {
			JOptionPane.showMessageDialog(null, "Wrong input! Put additional number");
			return 0;
		}
		else {
			String t = s[1];
			for(int i=0; i<t.length(); i++) {
				if ( (int)t.charAt(i) < (int)'0' || ((int)t.charAt(i) > (int)'9')) {
					JOptionPane.showMessageDialog(null, "Wrong input! Put number");
					return 0;
				}
			}
			
			return (int)(Double.parseDouble(s[1])*100);
		}
	}
	
}

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class JurosGUI {

	public static void main(String[] args) {
		
		try {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		
		window.setBounds(100, 100, 200, 200);
		
		window.setResizable(false);
		
		JLabel mon = new JLabel("Capital");
		
		window.add(mon);
		
		JTextArea moneyW = new JTextArea(1,10);
		
		window.add(moneyW);
		
		
		JLabel ta = new JLabel("Taxa");
		
		window.add(ta);
		
		JTextArea taxW = new JTextArea(1,10);
		
		window.add(taxW);
		
		
		JLabel tim = new JLabel("Tempo em anos");
		
		window.add(tim);
		
		JTextArea timeW = new JTextArea(1,10);
		
		
		window.add(timeW);
				
		JButton calc = new JButton("Calcular");
		
		
		
		calc.addActionListener((n)-> {
			
			try {
			
			String tax = taxW.getText().toString();
			
			String money = moneyW.getText().toString();
			
			String time = timeW.getText().toString();
			
			String finalMoney = Double.parseDouble(money.replace(',', '.'))*
					(Math.pow(   (   1 + (Double.parseDouble(tax.replace(',', '.'))/100)  ),
					Double.parseDouble(time.replace(',', '.'))))+"";
			
			JOptionPane.showMessageDialog(null, finalMoney);
			
			}catch(Exception ex) {
				
				JOptionPane.showMessageDialog(null, "Algo deu errado\n\n"+ex);
				
			}
			
			});
		
				
		window.add(calc);
		
		window.setVisible(true);
		
		}catch(Exception e) {
			
			JOptionPane.showMessageDialog(null, "Algo deu errado\n\n"+e);
			
		}
		

	}

}

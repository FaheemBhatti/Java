import java.awt.BorderLayout;
import java.awt.Color;
public class menu 
{
		public void showGame()
		{ 	
			TicTacToe t=new TicTacToe();
			t.clearPanelSouth();
			TicTacToe.inGame = true;
			TicTacToe.pnlSouth.setLayout(new BorderLayout());
			TicTacToe.pnlSouth.setBackground(Color.RED);
			TicTacToe.pnlSouth.add(t.pnlPlayingField, BorderLayout.CENTER);
			t.pnlPlayingField.requestFocus();
			t
			.pnlPlayingField.setBackground(Color.GREEN);
		}
	}


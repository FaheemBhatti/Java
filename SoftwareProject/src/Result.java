	import java.awt.Color;
	import javax.swing.JOptionPane;
	class result 
	{
		TicTacToe q=new TicTacToe();
		public static void checkWin() 
		{ 
			for(int i=0; i<7; i++) {
			if(
			!q.btnEmpty[q.winCombo[i][0]].getText().equals("") &&
			TicTacTo.btnEmpty[TicTacTo.winCombo[i][0]].getText().equals(TicTacTo.btnEmpty[TicTacTo.winCombo[i][1]].getText()) &&
			TicTacTo.btnEmpty[TicTacTo.winCombo[i][1]].getText().equals(TicTacTo.btnEmpty[TicTacTo.winCombo[i][2]].getText())
			) 
			{
				TicTacTo.win = true;
				TicTacTo.wonNumber1 = TicTacTo.winCombo[i][0];
				TicTacTo.wonNumber2 = TicTacTo.winCombo[i][1];
				TicTacTo.wonNumber3 = TicTacTo.winCombo[i][2];
				TicTacTo.btnEmpty[TicTacTo.wonNumber1].setBackground(Color.red);
				TicTacTo.btnEmpty[TicTacTo.wonNumber2].setBackground(Color.red);
				TicTacTo.btnEmpty[TicTacTo.wonNumber3].setBackground(Color.red);
				break;
			}
			}
				if(TicTacTo.win || (!TicTacTo.win && TicTacTo.turn>9))
				{
					if(TicTacTo.win) 
					{
						if(TicTacTo.turn % 2 == 0)
							TicTacTo.message = "Player1 has won!";
						else
							TicTacTo.message = "Player2 has won!";
						TicTacTo.win = false;
			} 
					else if(!TicTacTo.win && TicTacTo.turn>9) {
						TicTacTo.message = "Both players have tied!\nBetter luck next time.";
			}
			JOptionPane.showMessageDialog(null, TicTacTo.message);
			for(int i=1; i<=9; i++) {
				TicTacTo.btnEmpty[i].setEnabled(false);
			}
				}
		}
	}



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
public class TicTacToe implements ActionListener 
{
	String p1=JOptionPane.showInputDialog(null, "Enter 1st Player name");
	String p2=JOptionPane.showInputDialog(null, "Enter 2nd Player name");
	final String VERSION = "1.0";
	JFrame window = new JFrame("Tic-Tac-Toe " + VERSION);
	JMenuBar mnuMain = new JMenuBar();
	JMenuItem mnuNewGame = new JMenuItem("New Game"),
			mnuInstruction = new JMenuItem("Instructions"),
			mnuExit = new JMenuItem("Exit"),
			mnuAbout = new JMenuItem("About");
	JButton btn1v1 = new JButton(p1+" vs "+p2),
			btnBack = new JButton("back");
	JButton btnEmpty[] = new JButton[10];
	JPanel pnlNewGame = new JPanel(),pnlNorth = new JPanel();
	static JPanel pnlSouth = new JPanel();
	JPanel pnlTop = new JPanel();
	JPanel pnlBottom = new JPanel();
	//final string arr{}
	JPanel pnlPlayingField = new JPanel();

	JLabel lblTitle = new JLabel("Tic-Tac-Toe");
	JTextArea txtMessage = new JTextArea();
	

	final static int winCombo[][] = new int[][] 
			{
			{1, 2, 3}, {1, 4, 7}, {1, 5, 9},
			{4, 5, 6}, {2, 5, 8}, {3, 5, 7},
			{7, 8, 9}, {3, 6, 9}

			};
	final int X = 550, Y = 408, color = 190;
	static boolean inGame = false;
	static boolean win = false;
	boolean btnEmptyClicked = false;
	String message;
	int turn = 1;
	static int wonNumber1 = 1;
	int wonNumber2 = 1;
	int wonNumber3 = 1;

	public TicTacToe() 
	{ 
		
		window.setSize(X, Y);
		window.setLocation(20, 20);
		window.setResizable(false);
		window.setLayout(new BorderLayout());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pnlNewGame.setLayout(new GridLayout(2, 1, 2, 10));
		pnlNorth.setLayout(new FlowLayout(FlowLayout.CENTER));
		pnlSouth.setLayout(new FlowLayout(FlowLayout.CENTER));

		pnlNorth.setBackground(new Color(color-40, color-60, color-100));
		pnlSouth.setBackground(new Color(color-40, color-20, color-40));

		pnlTop.setBackground(new Color(color-40, color-20, color-40));
		pnlBottom.setBackground(new Color(color-40, color-20, color-40));

		pnlTop.setLayout(new FlowLayout(FlowLayout.CENTER));
		pnlBottom.setLayout(new FlowLayout(FlowLayout.CENTER));
		pnlNewGame.setBackground(new Color(color-40, color-20, color-40));


		mnuMain.add(mnuNewGame);
		mnuMain.add(mnuInstruction);
		mnuMain.add(mnuAbout);
		mnuMain.add(mnuExit);//---->Menu Bar Complete

		pnlNewGame.add(btn1v1);


		mnuNewGame.addActionListener(this);
		mnuExit.addActionListener(this);
		mnuInstruction.addActionListener(this);
		mnuAbout.addActionListener(this);
		btn1v1.addActionListener(this);
		btnBack.addActionListener(this);


		pnlPlayingField.setLayout(new GridLayout(3, 3, 2, 2));
		pnlPlayingField.setBackground(Color.green);
		for(int i=1; i<=9; i++) 
		{
			btnEmpty[i] = new JButton();
			btnEmpty[i].setBackground(new Color(220, 220, 220));
			btnEmpty[i].addActionListener(this);
			pnlPlayingField.add(btnEmpty[i]);
		}

		pnlNorth.add(mnuMain);
		pnlSouth.add(lblTitle);


		window.add(pnlNorth, BorderLayout.NORTH);
		window.add(pnlSouth, BorderLayout.CENTER);
		window.setVisible(true);
		
	}

	public void actionPerformed(ActionEvent click)
	{
		Object source = click.getSource();
		for(int i=1; i<=9; i++) 
		{
			if(source == btnEmpty[i] && turn < 10)
			{
				btnEmptyClicked = true;
				if(!(turn % 2 == 0))
					btnEmpty[i].setText("X");
				else
					btnEmpty[i].setText("O");
					btnEmpty[i].setEnabled(false);
					pnlPlayingField.requestFocus();
					turn++;
			}
		}
		if(btnEmptyClicked) 
		{
			checkWin();
			btnEmptyClicked = false;
		}
		if(source == mnuNewGame)
		{
			clearPanelSouth();
			pnlSouth.setLayout(new GridLayout(2, 1, 2, 5));
			pnlTop.add(pnlNewGame);
			pnlBottom.add(btnBack);
			pnlSouth.add(pnlTop);
			pnlSouth.add(pnlBottom);

		}
		else if(source == btn1v1)
		{
			if(inGame) 
			{
				int option = JOptionPane.showConfirmDialog(null, "If you start a new game," +
						"your current game will be lost..." + "\n" +
						"Are you sure you want to continue?",
						"Quit Game?" ,JOptionPane.YES_NO_OPTION);
				if(option == JOptionPane.YES_OPTION)
				{
					inGame = false;
				}
			}
			if(!inGame)
			{
				btnEmpty[wonNumber1].setBackground(new Color(220, 220, 220));
				btnEmpty[wonNumber2].setBackground(new Color(220, 220, 220));
				btnEmpty[wonNumber3].setBackground(new Color(220, 220, 220));
				turn = 1;
				for(int i=1; i<10; i++)
				{
					btnEmpty[i].setText("");
					btnEmpty[i].setEnabled(true);
				}
				win = false;
				showGame();

			}
		}
		else if(source == mnuExit) 
		{
			int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?",
					"Exit Game" ,JOptionPane.YES_NO_OPTION);
			if(option == JOptionPane.YES_OPTION)
				System.exit(0);
		}
		else if(source == mnuInstruction || source == mnuAbout)
		{
			clearPanelSouth();
			String message = "";
			txtMessage.setBackground(new Color(color, color, color));
			if(source == mnuInstruction)
			{
				message = "Instructions:\n\n" +
						"Your goal is to be the first player to get 3 X's or O's in a\n" +
						"row. (horizontally, diagonally, or vertically)";
			}
			else
			{
				message = "About:\n\n" +
							"Title: Tic-Tac-Toe\n" +
							"Author: MUJADDAD SHERAZ AHMAD\n"
							+ "FAHEEM AZFAR\nJAWAD RAFIQ" +
							"Version: " + VERSION + "\n";
			}
			txtMessage.setEditable(false);

			txtMessage.setText(message);
			pnlSouth.setLayout(new GridLayout(2, 1, 2, 5));
			pnlTop.add(txtMessage);
			pnlBottom.add(btnBack);
			pnlSouth.add(pnlTop);
			pnlSouth.add(pnlBottom);
		}
		else if(source == btnBack) 
		{
			if(inGame)
				showGame();
			else
			{
				clearPanelSouth();
				pnlSouth.setLayout(new FlowLayout(FlowLayout.CENTER));
				pnlNorth.setVisible(true);
				pnlSouth.add(lblTitle);
			}
		}
		pnlSouth.setVisible(false);
		pnlSouth.setVisible(true);
}


public void showGame()
{ 
	clearPanelSouth();
	inGame = true;
	pnlSouth.setLayout(new BorderLayout());
	pnlSouth.setBackground(Color.RED);
	pnlSouth.add(pnlPlayingField, BorderLayout.CENTER);
	pnlPlayingField.requestFocus();
	pnlPlayingField.setBackground(Color.GREEN);
}

public void checkWin() 
{ 
	for(int i=0; i<7; i++) 
	{
		if(!btnEmpty[winCombo[i][0]].getText().equals("") &&
btnEmpty[winCombo[i][0]].getText().equals(btnEmpty[winCombo[i][1]].getText()) &&
btnEmpty[winCombo[i][1]].getText().equals(btnEmpty[winCombo[i][2]].getText()))
		{
			win = true;
			wonNumber1 = winCombo[i][0];
			wonNumber2 = winCombo[i][1];
			wonNumber3 = winCombo[i][2];
			btnEmpty[wonNumber1].setBackground(Color.red);
			btnEmpty[wonNumber2].setBackground(Color.red);
			btnEmpty[wonNumber3].setBackground(Color.red);
			break;
		}
	}
	if(win || (!win && turn>9))
	{
		if(win)
		{
			if(turn % 2 == 0)
				message = p1+" has won!";
			else
				message = p2+" has won!";
			win = false;
		}
		else if(!win && turn>9) 
		{
			message = "Both players have tied!\nBetter luck next time.";
		}
		JOptionPane.showMessageDialog(null, message);
		for(int i=1; i<=9; i++)
		{
			btnEmpty[i].setEnabled(false);
		}
	}
}

public  void clearPanelSouth() 
{
	pnlSouth.remove(lblTitle);
	pnlSouth.remove(pnlTop);
	pnlSouth.remove(pnlBottom);
	pnlSouth.remove(pnlPlayingField);
	pnlTop.remove(pnlNewGame);
	pnlTop.remove(txtMessage);
	pnlBottom.remove(btnBack);
}

public static void main(String[] args) 
{
	new TicTacToe();
}
}

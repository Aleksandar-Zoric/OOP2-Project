import javax.swing.*;
import java.awt.event.*;

public class MyMenu1 extends JFrame{
		JMenuBar menuBar = new JMenuBar();
	
	public MyMenu1()
	{
		setTitle("MyGui");
		setSize(300,300);
		setLocation(800,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setJMenuBar(menuBar);
		createFileMenu();
		createCharacter();
		
	}
	
	public static void main(String args[])
	{
		MyMenu1 menu = new MyMenu1();
		menu.setVisible(true);
	}
	
	public void createFileMenu()
	{
		JMenu fileMenu = new JMenu("File");
		menuBar.add(fileMenu);
		MyHandler handler = new MyHandler();
		JMenuItem open = new JMenuItem("Open");
		open.addActionListener(handler);
		JMenuItem close = new JMenuItem("Close");
		close.addActionListener(handler);
		JMenuItem save = new JMenuItem("Save As");
		save.addActionListener(handler);
		JMenuItem exit = new JMenuItem("Exit");
		exit.addActionListener(handler);
		fileMenu.add(open);
		fileMenu.add(close);
		fileMenu.add(save);
		fileMenu.addSeparator();
		fileMenu.add(exit);
		
		
	}
	
	public void createCharacter()
	{
		JMenu character = new JMenu("Character");
		menuBar.add(character);
		MyHandler2 handler = new MyHandler2();
		JMenuItem add = new JMenuItem("Add Character");
		add.addActionListener(handler);
		JMenuItem display = new JMenuItem("Display Character");
		display.addActionListener(handler);
		JMenuItem delete = new JMenuItem("Delete Character");
		delete.addActionListener(handler);
		character.add(add);
		character.add(display);
		character.addSeparator();
		character.add(delete);	
	}
	
	/*
	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Open")){
			JOptionPane.showMessageDialog(null,"You clicked Open");
		}
		
		else if(e.getActionCommand().equals("Close")){
			JOptionPane.showMessageDialog(null,"You clicked Close");
		}
		
			else if(e.getActionCommand().equals("Save As")){
			JOptionPane.showMessageDialog(null,"You clicked Save As");
		}
		
		else if(e.getActionCommand().equals("Exit")){
			JOptionPane.showMessageDialog(null,"You clicked Exit");
			System.exit(0);
		}
		
		else if(e.getActionCommand().equals("Add Character")){
			JOptionPane.showMessageDialog(null,"You clicked Add Character");
		}
		
		else if(e.getActionCommand().equals("Display Character")){
			JOptionPane.showMessageDialog(null,"You clicked Display Character");
		}
		
		else if(e.getActionCommand().equals("Delete Character")){
			JOptionPane.showMessageDialog(null,"You clicked Delete Character");
		}
			
	}*/
	//End of actionPerformed
	
	public class MyHandler implements ActionListener{
			public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("Open")){
			JOptionPane.showMessageDialog(null,"You clicked Open");
		}
		
		else if(e.getActionCommand().equals("Close")){
			JOptionPane.showMessageDialog(null,"You clicked Close");
		}
		
		else if(e.getActionCommand().equals("Save As")){
			JOptionPane.showMessageDialog(null,"You clicked Save As");
		}
		
		else if(e.getActionCommand().equals("Exit")){
			JOptionPane.showMessageDialog(null,"You clicked Exit");
			System.exit(0);
		}
			
	}
		
}

	public class MyHandler2 implements ActionListener{
		public void actionPerformed(ActionEvent e)
		{
				 if(e.getActionCommand().equals("Add Character")){
			JOptionPane.showMessageDialog(null,"You clicked Add Character");
		}
		
		else if(e.getActionCommand().equals("Display Character")){
			JOptionPane.showMessageDialog(null,"You clicked Display Character");
		}
		
		else if(e.getActionCommand().equals("Delete Character")){
			JOptionPane.showMessageDialog(null,"You clicked Delete Character");
		}
			
		}
	}
}// End of Class


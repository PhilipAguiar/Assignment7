
/* 
 * File: FacePamphlet.java
 * -----------------------
 * When it is finished, this program will implement a basic social network
 * management system.
 */

import acm.program.*;
import acm.graphics.*;
import acm.util.*;
import java.awt.event.*;
import javax.swing.*;

public class FacePamphlet extends ConsoleProgram implements FacePamphletConstants {

	private JLabel name = new JLabel("");
	private JTextField nameField;
	private JButton add;
	private JButton delete;
	private JButton lookUp;
	private JTextField statusTextField;
	private JButton statusButton;
	private JTextField pictureTextField;
	private JButton pictureButton;
	private JTextField addFriendTextField;
	private JButton addFriendButton;

	/**
	 * This method has the responsibility for initializing the interactors in
	 * the application, and taking care of any other initialization that needs
	 * to be performed.
	 */
	public void init() {

		JLabel name = new JLabel("Name:");
		add(name, NORTH);

		nameField = new JTextField(TEXT_FIELD_SIZE);
		add(nameField, NORTH);

		add = new JButton("Add");
		add(add, NORTH);

		delete = new JButton("Delete");
		add(delete, NORTH);

		lookUp = new JButton("Lookup");
		add(lookUp, NORTH);

		statusTextField = new JTextField(TEXT_FIELD_SIZE);
		add(statusTextField, WEST);
		statusTextField.addActionListener(this);

		statusButton = new JButton("Change Status");
		add(statusButton, WEST);

		JLabel blank1 = new JLabel(EMPTY_LABEL_TEXT);
		add(blank1, WEST);

		pictureTextField = new JTextField(TEXT_FIELD_SIZE);
		add(pictureTextField, WEST);
		pictureTextField.addActionListener(this);

		pictureButton = new JButton("Change Picture");
		add(pictureButton, WEST);

		JLabel blank2 = new JLabel(EMPTY_LABEL_TEXT);
		add(blank2, WEST);

		addFriendTextField = new JTextField(TEXT_FIELD_SIZE);
		add(addFriendTextField, WEST);
		addFriendTextField.addActionListener(this);

		addFriendButton = new JButton("Add Friend");
		add(addFriendButton, WEST);

		addActionListeners();

	}

	/**
	 * This class is responsible for detecting when the buttons are clicked or
	 * interactors are used, so you will have to add code to respond to these
	 * actions.
	 */
	public void actionPerformed(ActionEvent e) {

		
		
		if (e.getSource() == add) {
			println(nameField.getText());
		}
		if (e.getSource() == delete) {
			println(nameField.getText()+" was deleted.");
		}
		if (e.getSource() == lookUp) {
			println("Looking up: "+nameField.getText());
		}
		
		
		if (e.getSource() == statusTextField) {
			println(nameField.getText() + " is currently " + statusTextField.getText());
		}
		if (e.getSource() == statusButton) {
			println(nameField.getText() + " is currently " + statusTextField.getText());
		}
		if (e.getSource() == pictureTextField) {
			println(pictureTextField.getText() + " Picture added.");
		}
		if (e.getSource() == pictureButton) {
			println(pictureTextField.getText() + " Picture added.");
		}
		if (e.getSource() == addFriendTextField) {
			println(addFriendTextField+ "was added as a friend!");
		}
		if (e.getSource() == addFriendButton) {
			println(addFriendTextField.getText()+ " was added as a friend!");
		}
	}

	private boolean checkIfBlank(String text){
		
		if(text == ""){
			return true;
			
		}else return false;
		
		
		
		
	}
}

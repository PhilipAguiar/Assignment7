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

public class FacePamphlet extends Program 
					implements FacePamphletConstants {

	/**
	 * This method has the responsibility for initializing the 
	 * interactors in the application, and taking care of any other 
	 * initialization that needs to be performed.
	 */
	public void init() {
		
		JLabel name = new JLabel("Name:");
		add(name,NORTH);
		
		JTextField nameField = new JTextField(TEXT_FIELD_SIZE);
		add(nameField,NORTH);
		
		JButton add = new JButton("Add");
		add(add,NORTH);
		
		JButton delete = new JButton("Delete");
		add(delete,NORTH);
		
		JButton lookUp = new JButton("Lookup");
		add(lookUp,NORTH);
		
		JTextField statusTextField = new JTextField(TEXT_FIELD_SIZE);
		add(statusTextField,WEST);
		
		JButton statusButton = new JButton("Change Status");
		add(statusButton,WEST);
		
		JLabel blank1 = new JLabel(EMPTY_LABEL_TEXT);
		add(blank1,WEST);
		
		JTextField pictureTextField = new JTextField(TEXT_FIELD_SIZE);
		add(pictureTextField,WEST);
		
		JButton pictureButton = new JButton("Change Picture");
		add(pictureButton,WEST);
		
		JLabel blank2 = new JLabel(EMPTY_LABEL_TEXT);
		add(blank2,WEST);
		
		JTextField addFriendTextField = new JTextField(TEXT_FIELD_SIZE);
		add(pictureTextField,WEST);
		
		JButton addFriendButton = new JButton("Add Friend");
		add(pictureButton,WEST);
		
		
    }
    
  
    /**
     * This class is responsible for detecting when the buttons are
     * clicked or interactors are used, so you will have to add code
     * to respond to these actions.
     */
    public void actionPerformed(ActionEvent e) {
		// You fill this in as well as add any additional methods
	}

}


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
	private FacePamphletDatabase db = new FacePamphletDatabase();
	private FacePamphletProfile profile;
	private FacePamphletProfile currentProfile;
	private String currentName = "";

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

		String name = nameField.getText();
	
		String status = statusTextField.getText();
		String pictureText = pictureTextField.getText();
		String friendName = addFriendTextField.getText();
		
		if (e.getSource() == add) {
			if(!name.isEmpty()){
			if(!db.containsProfile(name)){
				profile= new FacePamphletProfile(name);
				db.addProfile(profile);
				currentProfile= profile;
				currentName= currentProfile.getName();
				println("Add new profile: "+ profile.toString());
			}else println("This name is already in the database!");
			
		}}
		
		if (e.getSource() == delete) {
			if(!name.isEmpty()){
				if(db.containsProfile(name)){
					println(name+ " was removed from the database!");
					db.deleteProfile(name);
				}else println("This name is not in the database!");}
		}
		
		if (e.getSource() == lookUp) {
			if(!name.isEmpty()){
				if(db.containsProfile(name)){
				println("Looking up "+name+"'s profile");
				}else println("This name is not in the database!");}
		}
		
		if (e.getSource() == statusTextField) {
			if(!status.isEmpty()){		
				if(db.containsProfile(name)){
				currentProfile.setStatus(status);
				db.addProfile(currentProfile);
			println(currentName + " is currently " + status);}
				else {println("There's no profile to add this status too");}
		}
			}
		
		if (e.getSource() == statusButton) {
			if(!status.isEmpty()){
				if(db.containsProfile(name)){
				currentProfile.setStatus(status);
				db.addProfile(currentProfile);
			println(currentName + " is currently " + status);}
				else {println("There's no profile to add this status too");}
		}
			}
		
		if (e.getSource() == pictureTextField) {
			if(!pictureText.isEmpty()){
				if(db.containsProfile(currentName)){
					GImage image = null;
					 try {
					 image = new GImage(pictureText);
					 if (image!=null){
						 currentProfile.setImage(image);
						 db.addProfile(currentProfile);
					 println("Uploading: "+pictureText);}
					 } catch (ErrorException ex) {
					 println("That image cannot be uploaded");
					 }

				}
				else {println("There's no profile to upload this picture too");}
			}
			
		}
		
		if (e.getSource() == pictureButton) {
			if(!pictureText.isEmpty()){
				if(db.containsProfile(currentName)){
					GImage image = null;
					 try {
					 image = new GImage(pictureText);
					 if (image!=null){
						 currentProfile.setImage(image);
						 db.addProfile(currentProfile);
					 println("Uploading: "+pictureText);}
					 } catch (ErrorException ex) {
					 println("That image cannot be uploaded");
					 }

				}
				else {println("There's no profile to upload this picture too");}
			}
			}
		
		if (e.getSource() == addFriendTextField) {
			if(!addFriendTextField.getText().isEmpty()){
				if(db.containsProfile(friendName)){
					
					
					println(friendName+ " is now your friend!");
				}else println("You're already friends with this person!");}
		}
		
		if (e.getSource() == addFriendButton) {
			if(db.containsProfile(friendName)){
				println(friendName+ " is now your friend!");
			}else {println("You're already friends with this person!");}
		}
	}

	
		
		
		
		
	
}

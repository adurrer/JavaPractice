import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;


public class Playback extends JFrame {
	public Playback() {
		super("Playback");
		setLookAndFeel();
		setSize(500,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		
		//Creating labels to describe text and comboboxes
		JLabel searchSong = new JLabel("Search for song: ", JLabel.RIGHT);
		JLabel genreLabel = new JLabel("Genre: ", JLabel.RIGHT);
		JLabel notesLabel = new JLabel("Notes:", JLabel.RIGHT);
		
		//Creating a text field to search for songs
		JTextField song = new JTextField(20);
		
		//Creating a checkbox to add it to your playlist
		JCheckBox playlistCheckbox = new JCheckBox("Add to Playlist");
		
		//Creating a combo box with genres
		JComboBox genre = new JComboBox();
		genre.addItem("Genre");
		genre.addItem("Rock");
		genre.addItem("Disco");
		genre.addItem("Funk");
		genre.addItem("Indie");
		genre.addItem("Pop");
		genre.addItem("Old school rap");
		genre.addItem("Rap");
		genre.addItem("R & B");
		genre.addItem("Dubstep");
		genre.addItem("Trance");
		genre.addItem("Electronic");
		genre.addItem("House");
		
		//Creating buttons to play, stop, and pause the song
		JButton play = new JButton("Play");
		JButton stop = new JButton("Stop");
		JButton pause = new JButton("Pause");
		
		//Creating a Text Area for a user to take notes about a song
		JTextArea notes = new JTextArea(8,40);
		//Adding all containers to frame to create components
		add(genreLabel);
		add(genre);
		add(searchSong);
		add(song);
		add(playlistCheckbox);
		add(play);
		add(stop);
		add(pause);
		add(notesLabel);
		add(notes);
		
		//Making the frame visiable
		setVisible(true);
	}
	
	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel(
					"com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception exc) {
			// ignore error
		}
	}
	
	public static void main(String[] args) {
		Playback playback = new Playback();
	}
}

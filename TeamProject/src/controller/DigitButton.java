package controller;

import java.io.IOException;

import javafx.beans.NamedArg;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;

public class DigitButton extends Button {
	
	//This is an FXML property
	//public IntegerProperty digit = new SimpleIntegerProperty();
	
	private final int digit;
	
	public DigitButton(@NamedArg("digit") int digit) {
		this.digit = digit;
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../fxml/calcbutton.fxml"));
		fxmlLoader.setRoot(this);	
		fxmlLoader.setClassLoader(getClass().getClassLoader());
		try {
			fxmlLoader.load();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}		
		this.setText(Integer.toString(digit));
	}
	
	public int getDigit() {
		return digit;
	}
	
//	public IntegerProperty digitProperty() {
//		return digit;
//	}
//	
//	public int getDigit() {
//		return digitProperty().get();
//	}
//	
//	public void setDigit(int digit) {
//		digitProperty().set(digit);
//	}
//	

}
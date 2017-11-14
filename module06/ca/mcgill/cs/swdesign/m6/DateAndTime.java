package ca.mcgill.cs.swdesign.m6;

import java.time.LocalDateTime;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * mod06, ex5
 * A JavaFX application with a button and a label, which writes the current date and time
 * in the label every time the button is pressed.
 * @author Halil Murat
 *
 */
public class DateAndTime extends Application
{
	/**
	 *.
	 * @param pArgs array of arguments
	 */
	public static void main(String[] pArgs) 
	{
        launch(pArgs);
    }
    
	@Override
    public void start(Stage pPrimaryStage) 
    {
        pPrimaryStage.setTitle("Hello World!");
        Button btn = new Button();						// new button object
        btn.setText("Write date and time");				// text on the button
        btn.setOnAction(new EventHandler<ActionEvent>() 
        {
            @Override
            public void handle(ActionEvent pEvent)
            {
                System.out.println(LocalDateTime.now().toString());	// the event that happens when the button is clicked
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);						// add button to children of root
        pPrimaryStage.setScene(new Scene(root, 300, 250));
        pPrimaryStage.show();
    }
}

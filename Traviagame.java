package com.example.demo;
import javafx.application.Application;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.Optional;

/**
 *
 * TriviaGame class
 */
public class Traviagame extends Application {
    private String playerName; //name of player
    private Label objectLabel1; //label for object 1
    private Label objectLabel2; //label for object 2
    private final SimpleObjectProperty<Button> answerButton1 = new SimpleObjectProperty<>(this, "answerButton1"); //button for answer 1
    private final SimpleObjectProperty<Button> answerButton2 = new SimpleObjectProperty<>(this, "answerButton2"); //button for answer 2
    private final SimpleObjectProperty<Button> answerButton3 = new SimpleObjectProperty<>(this, "answerButton3"); //button for answer 3
    private final SimpleObjectProperty<Button> answerButton4 = new SimpleObjectProperty<>(this, "answerButton4"); //button for answer 4
    @Override
    public void start(Stage primaryStage) {
        TextInputDialog inputDialog = new TextInputDialog();
        inputDialog.setHeaderText("");
        inputDialog.setContentText("Please enter player's name:");
//ask player's name
        Optional<String> response = inputDialog.showAndWait();
        response.ifPresent(s -> playerName = s);

//Label for player name
        //label for player
        Label playerLabel = new Label("Player's name: " + playerName);
        objectLabel1 = new Label("3");
        objectLabel2 = new Label("4");
        //label for operation
        Label opLabel = new Label("+");
        Button answerButton1 = new Button();
        Button answerButton2 = new Button();
        Button answerButton3 = new Button();
        Button answerButton4 = new Button();
        answerButton1.setText("5");
        answerButton2.setText("7");
        answerButton3.setText("3");
        answerButton4.setText("8");
        answerButton1.setOnAction(event -> {
            String op1 = objectLabel1.getText();
            String op2 = objectLabel2.getText();
            try{
                int num1 = Integer.parseInt(op1);
                int num2 = Integer.parseInt(op2);
                int result = num1 + num2;
                int answer = Integer.parseInt(answerButton1.getText());
                if(result == answer)
                    System.out.println("Right answer");
                else
                    System.out.println("Wrong answer");
            }
            catch(NumberFormatException e)
            {
                System.out.println("Invalid input");
            }
        });

        answerButton2.setOnAction(event -> {
            String op1 = objectLabel1.getText();
            String op2 = objectLabel2.getText();
            try{
                int num1 = Integer.parseInt(op1);
                int num2 = Integer.parseInt(op2);
                int result = num1 + num2;
                int answer = Integer.parseInt(answerButton2.getText());
                if(result == answer)
                    System.out.println("Right answer");
                else
                    System.out.println("Wrong answer");
            }
            catch(NumberFormatException e)
            {
                System.out.println("Invalid input");
            }
        });

        answerButton3.setOnAction(event -> {
            String op1 = objectLabel1.getText();
            String op2 = objectLabel2.getText();
            try{
                int num1 = Integer.parseInt(op1);
                int num2 = Integer.parseInt(op2);
                int result = num1 + num2;
                int answer = Integer.parseInt(answerButton3.getText());
                if(result == answer)
                    System.out.println("Right answer");
                else
                    System.out.println("Wrong answer");
            }
            catch(NumberFormatException e)
            {
                System.out.println("Invalid input");
            }
        });

        answerButton4.setOnAction(event -> {
            String op1 = objectLabel1.getText();
            String op2 = objectLabel2.getText();
            try{
                int num1 = Integer.parseInt(op1);
                int num2 = Integer.parseInt(op2);
                int result = num1 + num2;
                int answer = Integer.parseInt(answerButton4.getText());
                if(result == answer)
                    System.out.println("Right answer");
                else
                    System.out.println("Wrong answer");
            }
            catch(NumberFormatException e)
            {
                System.out.println("Invalid input");
            }
        });

        GridPane root = new GridPane();
//root.setPadding(new Insets(10,10,10,10));
        root.setVgap(5);
        root.setHgap(5);
        root.add(playerLabel,0,0);
        root.add(objectLabel1,0,1);
        root.add(opLabel,1,1);
        root.add(objectLabel2,2,1);
        root.add(answerButton1,0,2);
        root.add(answerButton2,1,2);
        root.add(answerButton3,2,2);
        root.add(answerButton4,3,2);
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Trivia Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public SimpleObjectProperty<Button> answerButton1Property() {
        return answerButton1;
    }

    public SimpleObjectProperty<Button> answerButton2Property() {
        return answerButton2;
    }

    public SimpleObjectProperty<Button> answerButton3Property() {
        return answerButton3;
    }

    public SimpleObjectProperty<Button> answerButton4Property() {
        return answerButton4;
    }
}
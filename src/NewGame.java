import javax.swing.*;
import java.awt.*;

/**
 * Created by Bartłomiej on 2016-03-26.
        */


public class NewGame extends Frame {

    Font janusz = new Font("Serif", Font.BOLD, 20);

    public NewGame() {
        this.width=width/2;
        this.height=height*3/4;
    }

    public void createNewGameFrame(JFrame frame){

        int buttonHeight = height/8;
        int buttonWidth = width/4;
        JButton startGameButton = createAButton(width, height, 5, "START GAME");
        JButton pauseButton = createAButton(width, height, 5, "EXIT");

        frame.setResizable(false);
        JTextField p1 = new JTextField("Podaj prosze imie gracza 1");
        JTextField p2 = new JTextField("Podaj prosze imie gracza 2");
        p1.setEditable(false);
        p2.setEditable(false);
        p1.setBounds(width/10, height / 10 +(0*buttonHeight+0*20),2*buttonWidth,buttonHeight/2);
        p2.setBounds(width /10, height / 10 +(1*buttonHeight+1*20),2*buttonWidth,buttonHeight/2);
        p1.setVisible(true);
        p2.setVisible(true);
        p1.setFont(janusz);
        p2.setFont(janusz);
        p1.setBorder(BorderFactory.createEmptyBorder());
        p2.setBorder(BorderFactory.createEmptyBorder());
        frame.add(p2);
        frame.add(p1);

        JTextField player1 = new JTextField("     player 1");
        JTextField player2 = new JTextField("     player 2");
        player1.setBounds(width / 10 +buttonWidth*4/2, height / 10 +(0*buttonHeight+0*20),buttonWidth,buttonHeight/2);
        player2.setBounds(width / 10 +buttonWidth*4/2, height / 10 +(1*buttonHeight+1*20),buttonWidth,buttonHeight/2);
        player1.setVisible(true);
        player2.setVisible(true);
        player1.setFont(ft2);
        player2.setFont(ft2);
        frame.add(player1);
        frame.add(player2);

        JTextField tankColor1 = new JTextField("Wybierz kolor czolgu 1");
        JTextField tankColor2 = new JTextField("Wybierz kolor czolgu 2");
        tankColor1.setEditable(false);
        tankColor2.setEditable(false);
        tankColor1.setBounds(width/10, height / 10 +(2*buttonHeight+2*20),2*buttonWidth,buttonHeight/2);
        tankColor2.setBounds(width /10 + buttonWidth*4/2, height / 10 +(2*buttonHeight+2*20),2*buttonWidth,buttonHeight/2);
        tankColor1.setVisible(true);
        tankColor2.setVisible(true);
        tankColor1.setFont(janusz);
        tankColor2.setFont(janusz);
        tankColor1.setBorder(BorderFactory.createEmptyBorder());
        tankColor2.setBorder(BorderFactory.createEmptyBorder());
        frame.add(tankColor2);
        frame.add(tankColor1);

        Choice jaco = new Choice();
        jaco.add("Czerwony");
        jaco.add("Niebieski");
        jaco.add("Zielony");
        jaco.setBounds(width / 6 , height / 9 +(3*buttonHeight+3*2),buttonWidth/2,buttonHeight/2);
        jaco.setVisible(true);
        frame.add(jaco);
        Choice jaco2 = new Choice();
        jaco2.add("Czerwony");
        jaco2.add("Niebieski");
        jaco2.add("Zielony");
        jaco2.setBounds(width / 6 +buttonWidth*2, height / 9 +(3*buttonHeight+3*2),buttonWidth/2,buttonHeight/2);
        jaco2.setVisible(true);
        frame.add(jaco2);

        JTextField tanksNumber= new JTextField("Wybierz liczbe czolgow");
        tanksNumber.setEditable(false);
        tanksNumber.setBounds(width / 2 - (buttonWidth*3/5), height / 10 +(4*buttonHeight+4*2),2*buttonWidth,buttonHeight/2);
        tanksNumber.setVisible(true);
        tanksNumber.setFont(janusz);
        tanksNumber.setBorder(BorderFactory.createEmptyBorder());
        frame.add(tanksNumber);

        Choice tanksNum = new Choice();
        tanksNum.add("1");
        tanksNum.add("2");
        tanksNum.add("3");
        tanksNum.setBounds(width / 2 - (buttonWidth / 3) , height / 9 +(buttonHeight*9/2)+4*2,buttonWidth/2,buttonHeight/2);
        tanksNum.setVisible(true);
        frame.add(tanksNum);

        startGameButton.setBounds(width / 6 +buttonWidth*2, height / 8 +(5*buttonHeight), buttonWidth, buttonHeight/2);
        startGameButton.setVisible(true);
        startGameButton.setBorder(BorderFactory.createRaisedBevelBorder());
        frame.add(startGameButton);

        pauseButton.setBounds(width / 6-buttonWidth/4, height / 8 +(5*buttonHeight), buttonWidth, buttonHeight/2);
        pauseButton.setBorder(BorderFactory.createRaisedBevelBorder());
        pauseButton.setVisible(true);
        frame.add(pauseButton);

    }
}

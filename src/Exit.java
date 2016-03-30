import javax.swing.*;
import java.awt.*;

/**
 * Created by Bartłomiej on 2016-03-26.
 */
public class Exit extends Frame {
    public Exit()
    {
        this.width=width/2;
        this.height=height*3/4;
    }
    public void createAnExitFrame (JFrame exitFrame)
    {
        JButton exitProgramButton = createAButton(width, height, 1, "YES");
        JButton dontExitButton = createAButton(width, height, 1, "NOOOOO");
        JTextField exitQuestion = new JTextField("Do you want to quit the game, bitch?");

        exitProgramButton.setBounds(buttonWidth/8, height - 2*buttonHeight+30, buttonWidth/2, buttonHeight/2);
        exitProgramButton.setVisible(true);
        exitFrame.add(exitProgramButton);

        dontExitButton.setBounds(width-buttonWidth/2-buttonWidth/8, height - 2*buttonHeight+30, buttonWidth/2, buttonHeight/2);
        dontExitButton.setVisible(true);
        exitFrame.add(dontExitButton);

        exitQuestion.setBounds(width / 2 - buttonWidth/2 , height / 2+30 ,buttonWidth,buttonHeight);
        exitQuestion.setVisible(true);
        exitQuestion.setEditable(false);
        exitQuestion.setBorder(null);
        exitQuestion.setFont(new Font("Serif", Font.ITALIC, 22));
        exitFrame.add(exitQuestion);
        exitQuestion.setVisible(true);
        ImageIcon image = new ImageIcon("C:/Users/Bartłomiej/IdeaProjects/MicroTanks/closeButton.jpg");
        JLabel imageLable = new JLabel(image);
        imageLable.setVisible(true);
        imageLable.setBounds(width/2-150,10,300,310);
        exitFrame.add(imageLable);




    }


}

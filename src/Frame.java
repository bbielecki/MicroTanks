import javax.swing.*;
import java.awt.*;

/**
 * Created by Bartłomiej on 2016-03-26.
 */
public abstract class Frame {

    protected JFrame createAFrame(int width, int height, String name){

        JFrame frame = new JFrame(name);

        frame.setSize(width, height);
        frame.setResizable(true);
        frame.setLocation(150, 150);
        frame.setLayout(null);

        return frame;
    }

    protected JButton createAButton(int width, int height, int buttonWidth, int buttonHeight){

        Font ft2 = new Font("Comic", Font.BOLD, 10);
        JButton button = new JButton("Start Game");

        button.setFont(ft2);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBounds(width/2-(buttonWidth/2),height/8,buttonWidth,buttonHeight);
        button.setBorder(null);

        return button;
    }

}

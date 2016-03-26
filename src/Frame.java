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

}

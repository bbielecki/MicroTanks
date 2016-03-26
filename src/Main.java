import javax.swing.*;

/**
 * Created by Bartłomiej on 2016-03-26.
 */
public class Main {
    public static void main(String[] args) {
        int width = 700, buttonWidth = width/4;
        int height = 600, buttonHeight = height/8;
        MainMenu mainMenu = new MainMenu();
        mainMenu.createAFrame(width,height,"Main Menu").setVisible(true);
    }
}

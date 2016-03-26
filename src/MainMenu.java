import javax.swing.*;
import java.awt.*;

/**
 * Created by Bartłomiej on 2016-03-26.
 */
public class MainMenu extends Frame {
    private int buttonWidth=0, buttonHeight=0;

    private Rules rules = new Rules();
    private Authors authors = new Authors();
    private BestScores bestScores = new BestScores();
    private Exit exit = new Exit();
    private NewGame newGame = new NewGame();
    private JFrame newGameFrame = newGame.createAFrame(newGame.getWidth(), newGame.getHeight(), "New Game");
    private JFrame rulesFrame = rules.createAFrame(rules.getWidth(), rules.getHeight(), "Rules");
    private JFrame authorsFrame = authors.createAFrame(authors.getWidth(), authors.getHeight(), "Authors");
    private JFrame bestScoresFrame = bestScores.createAFrame(bestScores.getWidth(), bestScores.getHeight(), "Best Scores");
    private JFrame exiteFrame = exit.createAFrame(exit.getWidth(), exit.getHeight(), "Exit");

    public void createFrameButtons(JFrame frame) {

        JButton newGameButton = createAButton(newGame.getWidth(), newGame.getHeight());
        JButton rulesButton = createAButton(rules.getWidth(), rules.getHeight());
        JButton authorButton = createAButton(authors.getWidth(), authors.getHeight());
        JButton bestScoresButton = createAButton(bestScores.getWidth(),bestScores.getHeight());
        JButton exitButton = createAButton(exit.getWidth(),exit.getHeight());


    }

    private JButton createAButton(int width, int height) {
        int buttonHeight=60;
        int buttonWidth=150;
        Font ft2 = new Font("Comic", Font.BOLD, 10);
        JButton button = new JButton("Start Game");

        button.setFont(ft2);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBounds(width / 2 - (buttonWidth / 2), height / 8, buttonWidth, buttonHeight);
        button.setBorder(null);

        return button;

    }
}

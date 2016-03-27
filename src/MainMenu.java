import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Bartłomiej on 2016-03-26.
 */
public class MainMenu extends Frame {

    public MainMenu(){
        width = 700;
        height = 600;
    }

    private int buttonWidth=0, buttonHeight=0;
    private Rules rules = new Rules();
    private Authors authors = new Authors();
    private BestScores bestScores = new BestScores();
    private Exit exit = new Exit();
    private NewGame newGame = new NewGame();

    public void createFrameButtons(JFrame frame) {

        JFrame newGameFrame;
        JFrame rulesFrame;
        JFrame authorsFrame;
        JFrame bestScoresFrame;
        JFrame exiteFrame;

        JButton newGameButton = createAButton(width, height, 0, "New Game");
        JButton rulesButton = createAButton(width, height, 1, "Rules");
        JButton authorButton = createAButton(width, height, 2, "Author");
        JButton bestScoresButton = createAButton(width,height, 3, "Best Scores");
        JButton exitButton = createAButton(width,height, 4, "EXIT");

        newGameFrame = newGame.createAFrame(newGame.getWidth(), newGame.getHeight(), "New Game");
        rulesFrame = rules.createAFrame(rules.getWidth(), rules.getHeight(), "Rules");
        authorsFrame = authors.createAFrame(authors.getWidth(), authors.getHeight(), "Authors");
        bestScoresFrame = bestScores.createAFrame(bestScores.getWidth(), bestScores.getHeight(), "Best Scores");
        exiteFrame = exit.createAFrame(exit.getWidth(), exit.getHeight(), "Exit");

        frame.add(newGameButton);
        frame.add(rulesButton);
        frame.add(authorButton);
        frame.add(bestScoresButton);
        frame.add(exitButton);

        newGameButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                newGameFrame.setVisible(true);
            }
        });
        rulesButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                rulesFrame.setVisible(true);
            }
        });
        authorButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                authorsFrame.setVisible(true);
            }
        });
        bestScoresButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                bestScoresFrame.setVisible(true);
            }
        });
        exitButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                exiteFrame.setVisible(true);
            }
        });
    }

    private JButton createAButton(int width, int height, int numberOfButton, String name) {
        int buttonHeight = height/8;
        int buttonWidth = width/4;
        Font ft2 = new Font("Comic", Font.BOLD, 25);
        JButton button = new JButton(name);

        button.setFont(ft2);
        button.setBackground(Color.LIGHT_GRAY);
        button.setBounds(width / 2 - (buttonWidth / 2), height / 8 +(numberOfButton*buttonHeight+numberOfButton*20), buttonWidth, buttonHeight);
        button.setBorder(null);

        return button;

    }
}

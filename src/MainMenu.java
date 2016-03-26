import javax.swing.*;
import java.awt.*;

/**
 * Created by Bartłomiej on 2016-03-26.
 */
public class MainMenu extends Frame{

    private Rules rules=new Rules();
    private Authors authors=new Authors();
    private BestScores bestScores=new BestScores();
    private Exit exit=new Exit();
    private NewGame newGame = new NewGame();
    private JFrame newGameFrame = newGame.createAFrame(600,500, "New Game");
    private JFrame rulesFrame = rules.createAFrame(500,700,"Rules");
    private JFrame authorsFrame = authors.createAFrame(400,400,"Authors");
    private JFrame bestScoresFrame = bestScores.createAFrame(900,600,"Best Scores");
    private JFrame exiteFrame = exit.createAFrame(400,500,"Exit");

    public void createFrameButtons(JFrame frame){
        JButton

    }

}

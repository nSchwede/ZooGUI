import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class GUI {
    public final int LOCX = 800;
    public final int LOCY = 400;
    public final int HEIGHT = 300;
    public final int WIDTH = 300;

    private JFrame ZGFrame;
    private JPanel currPanel = null;
    private JPanel prevPanel = null;

    // constructor for the GUI
    public void ConstructGUI() {
        createFrame();
        menuInit();
        ZGFrame.setVisible(true);
    }

    // creates athe window
    private void createFrame() {
        ZGFrame = new JFrame();
        ZGFrame.setLocation(LOCX, LOCY);
        ZGFrame.setSize(HEIGHT, WIDTH);
        ZGFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ZGFrame.setTitle("Zoo");

        // ZGFrame.setVisible(true);
    }

    // sets up the main menu where all the main species select is
    private void menuInit() {

        // structurtal panels
        JPanel centerPanel = new JPanel();
        JPanel mainButtonsPanel = new JPanel();

        currPanel = mainButtonsPanel;

        // tertiary panels
        JPanel brownBearPanel = new JPanel();
        JPanel blackBearPanel = new JPanel();
        JPanel lionPanel = new JPanel();
        JPanel ocelotPanel = new JPanel();
        JPanel orangPanel = new JPanel();
        JPanel baboonPanel = new JPanel();
        JPanel wolfPanel = new JPanel();
        JPanel hyenaPanel = new JPanel();
        JPanel widowPanel = new JPanel();
        JPanel scorpionPanel = new JPanel();
        JPanel mantisPanel = new JPanel();
        JPanel dungPanel = new JPanel();
        JPanel robinPanel = new JPanel();
        JPanel parrotPanel = new JPanel();
        JPanel empPanel = new JPanel();
        JPanel kingPanel = new JPanel();
        JPanel snakePanel = new JPanel();
        JPanel dragonPanel = new JPanel();
        JPanel salmonPanel = new JPanel();
        JPanel sharkPanel = new JPanel();

        // secondary menu panels
        JPanel bearPanel = make2ButtonPanel("Brown Bear", "Black Bear", brownBearPanel, blackBearPanel);
        JPanel felinePanel = make2ButtonPanel("Lion", "Ocelot", lionPanel, ocelotPanel);
        JPanel monkeyPanel = make2ButtonPanel("Oragutang", "Baboon", orangPanel, baboonPanel);
        JPanel caninePanel = make2ButtonPanel("Wolf", "Hyena", wolfPanel, hyenaPanel);
        JPanel arachPanel = make2ButtonPanel("Black Widow", "Scorpion", widowPanel, scorpionPanel);
        JPanel insectPanel = make2ButtonPanel("Praying Mantis", "Dung Beetle", mantisPanel, dungPanel);
        JPanel birdPanel = make2ButtonPanel("Robin", "Parrot", robinPanel, parrotPanel);
        JPanel penguinPanel = make2ButtonPanel("Emperor", "King", empPanel, kingPanel);
        JPanel reptilePanel = make2ButtonPanel("Snake", "Komodo Dragon", snakePanel, dragonPanel);
        JPanel fishPanel = make2ButtonPanel("Salmon", "Shark", salmonPanel, sharkPanel);

        JPanel[] speciesArray = { bearPanel, felinePanel, monkeyPanel, caninePanel, arachPanel, insectPanel, birdPanel,
                penguinPanel, reptilePanel, fishPanel };

        JButton bearButton = new JButton("Bears");
        JButton felineButton = new JButton("Felines");
        JButton monkeyButton = new JButton("Monkeys");
        JButton canineButton = new JButton("Canines");
        JButton arachnidButton = new JButton("Arachnids");
        JButton insectsButton = new JButton("Insects");
        JButton birdsButton = new JButton("Birds");
        JButton penguinsButton = new JButton("Penguins");
        JButton reptilesButton = new JButton("Reptiles");
        JButton fishButton = new JButton("Fish");

        JButton backButton = new JButton("Back");

        JButton[] buttonArray = { bearButton,
                felineButton,
                monkeyButton,
                canineButton,
                arachnidButton,
                insectsButton,
                birdsButton,
                penguinsButton,
                reptilesButton,
                fishButton
        };

        for (int i = 0; i < buttonArray.length; i++) {
            JPanel panel = speciesArray[i];
            buttonArray[i].addActionListener(
                    new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            currPanel = panel;
                            prevPanel = mainButtonsPanel;
                            mainButtonsPanel.setVisible(false);
                            currPanel.setVisible(true);
                        }
                    });

        }

        backButton.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (prevPanel != null) {
                            currPanel.setVisible(false);
                            currPanel = prevPanel;
                            if (prevPanel != mainButtonsPanel) {
                                prevPanel = mainButtonsPanel;
                                prevPanel.setVisible(true);
                            }
                            prevPanel.setVisible(true);
                            prevPanel = null;
                        }
                    }
                });

        mainButtonsPanel.setLayout(new GridLayout(5, 2, 10, 10));

        for (int i = 0; i < buttonArray.length; i++) {
            mainButtonsPanel.add(buttonArray[i]);
        }

        for (int i = 0; i < speciesArray.length; i++) {
            centerPanel.add(speciesArray[i]);
            speciesArray[i].setVisible(false);
        }

        centerPanel.add(mainButtonsPanel, BorderLayout.CENTER);
        ZGFrame.add(backButton, BorderLayout.WEST);
        ZGFrame.add(centerPanel, BorderLayout.CENTER);
    }

    private JPanel make2ButtonPanel(String firstButton, String secondButton, JPanel p1, JPanel p2) {
        JPanel panel = new JPanel();

        JButton b1 = new JButton(firstButton);
        JButton b2 = new JButton(secondButton);

        b1.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        p1.setVisible(true);
                    }
                });

        b2.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        p2.setVisible(true);
                    }
                });

        panel.setLayout(new GridLayout(5, 2, 10, 10));

        panel.add(b1);
        panel.add(b2);

        return panel;
    }

}

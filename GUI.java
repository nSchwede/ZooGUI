
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.awt.event.ActionEvent;
import animal.*;
import behavior.*;

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
    public void menuInit() {

        // structurtal panels
        JPanel centerPanel = new JPanel();
        JPanel mainButtonsPanel = new JPanel();

        currPanel = mainButtonsPanel;

        // tertiary panels
        Map<String, Animal> animalMap = new HashMap<>();

        animalMap.put("Brown Bear", );
        animalMap.put("Black Bear", blackBear);
        animalMap.put("Lion", lion);
        animalMap.put("Ocelot", ocelot);
        animalMap.put("Orangutang", orangutang);
        animalMap.put("Baboon", baboon);
        animalMap.put("Wolf", wolf);
        animalMap.put("Hyena", hyena);
        animalMap.put("Black Widow", blackWidow);
        animalMap.put("Scorpion", scorpion);
        animalMap.put("Praying Mantis", mantis);
        animalMap.put("Dung Beetle", dungBeetle);
        animalMap.put("Robin", robin);
        animalMap.put("Parrot", parrot);
        animalMap.put("Emperor", emperor);
        animalMap.put("King", king);
        animalMap.put("Snake", snake);
        animalMap.put("Komodo Dragon", komodo);
        animalMap.put("Salmon", salmon);
        animalMap.put("Shark", shark);

        // secondary menu panels
        JPanel bearPanel = make2ButtonPanel("Brown Bear", "Black Bear");
        JPanel felinePanel = make2ButtonPanel("Lion", "Ocelot");
        JPanel monkeyPanel = make2ButtonPanel("Oragutang", "Baboon");
        JPanel caninePanel = make2ButtonPanel("Wolf", "Hyena");
        JPanel arachPanel = make2ButtonPanel("Black Widow", "Scorpion");
        JPanel insectPanel = make2ButtonPanel("Praying Mantis", "Dung Beetle");
        JPanel birdPanel = make2ButtonPanel("Robin", "Parrot");
        JPanel penguinPanel = make2ButtonPanel("Emperor", "King");
        JPanel reptilePanel = make2ButtonPanel("Snake", "Komodo Dragon");
        JPanel fishPanel = make2ButtonPanel("Salmon", "Shark");

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

        for (JButton x : buttonArray) {
            JPanel panel = speciesArray[java.util.Arrays.asList(buttonArray).indexOf(x)];
            buttonArray[java.util.Arrays.asList(buttonArray).indexOf(x)].addActionListener(
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

    private JPanel make2ButtonPanel(String firstButton, String secondButton) {
        JPanel panel = new JPanel();

        JButton b1 = new JButton(firstButton);
        JButton b2 = new JButton(secondButton);

        b1.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    }
                });

        b2.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                    }
                });

        panel.setLayout(new GridLayout(5, 2, 10, 10));

        panel.add(b1);
        panel.add(b2);

        return panel;
    }

    public JPanel getCurrPanel() {
        return currPanel;
    }

    public JPanel getPrevPanel() {
        return prevPanel;
    }

    // Create per animal pannels
    private JPanel makeAnimalPanel(Animal animal) {
        JPanel animalPanel = getCurrPanel();

        JButton dietButton = new JButton("Diet");
        dietButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("This animal is a " + animal.getDiet());
            }
        });

        JButton movementButton = new JButton("Movement");
        movementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("This animal moves by " + animal.getMove());
            }
        });

        JButton soundButton = new JButton("Sound");
        soundButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("This animal says: " + animal.getSound());
            }
        });

        animalPanel.add(dietButton);
        animalPanel.add(movementButton);
        animalPanel.add(soundButton);

        return animalPanel;
    }

}

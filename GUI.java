import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import animal.*; // Assuming you have Animal, AnimalContainer, etc.

public class GUI {

    public final int LOCX = 800;
    public final int LOCY = 400;
    public final int HEIGHT = 300;
    public final int WIDTH = 300;

    private JFrame ZGFrame;
    private JPanel centerPanel;
    private CardLayout cardLayout;

    private Map<String, JPanel> panelMap = new HashMap<>();

    public void ConstructGUI() {
        createFrame();
        menuInit();
        ZGFrame.setVisible(true);
    }

    private void createFrame() {
        ZGFrame = new JFrame();
        ZGFrame.setLocation(LOCX, LOCY);
        ZGFrame.setSize(HEIGHT, WIDTH);
        ZGFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ZGFrame.setTitle("Zoo");
        cardLayout = new CardLayout();
        centerPanel = new JPanel(cardLayout);
        ZGFrame.add(centerPanel, BorderLayout.CENTER);
    }

    public void menuInit() {
        JPanel mainButtonsPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        panelMap.put("MainMenu", mainButtonsPanel);

        String[][] categories = {
                { "Brown Bear", "Black Bear" },
                { "Lion", "Ocelot" },
                { "Orangutang", "Baboon" },
                { "Wolf", "Hyena" },
                { "Black Widow", "Scorpion" },
                { "Praying Mantis", "Dung Beetle" },
                { "Robin", "Parrot" },
                { "Emperor Penguin", "King Penguin" },
                { "Snake", "Komodo Dragon" },
                { "Salmon", "Shark" }
        };

        String[] categoryNames = {
                "Bears", "Felines", "Monkeys", "Canines", "Arachnids",
                "Insects", "Birds", "Penguins", "Reptiles", "Fish"
        };

        for (int i = 0; i < categoryNames.length; i++) {
            String panelName = categoryNames[i];
            JPanel animalPanel = make2ButtonPanel(categories[i][0], categories[i][1]);
            panelMap.put(panelName, animalPanel);
            centerPanel.add(animalPanel, panelName);

            JButton button = new JButton(panelName);
            button.addActionListener(e -> switchPanel(panelName));
            mainButtonsPanel.add(button);
        }

        centerPanel.add(mainButtonsPanel, "MainMenu");

        JButton backButton = new JButton("Back");
        backButton.addActionListener(e -> {
            switchPanel("MainMenu");
        });

        ZGFrame.add(backButton, BorderLayout.SOUTH);
        cardLayout.show(centerPanel, "MainMenu");
    }

    private JPanel make2ButtonPanel(String firstAnimal, String secondAnimal) {
        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));

        JButton b1 = new JButton(firstAnimal);
        JButton b2 = new JButton(secondAnimal);

        b1.addActionListener(e -> {
            Animal animal = new AnimalContainer().getAnimal(firstAnimal);
            JPanel animalPanel = makeAnimalPanel(animal);
            String name = "Animal_" + firstAnimal;
            panelMap.put(name, animalPanel);
            centerPanel.add(animalPanel, name);
            switchPanel(name);
        });

        b2.addActionListener(e -> {
            Animal animal = new AnimalContainer().getAnimal(secondAnimal);
            JPanel animalPanel = makeAnimalPanel(animal);
            String name = "Animal_" + secondAnimal;
            panelMap.put(name, animalPanel);
            centerPanel.add(animalPanel, name);
            switchPanel(name);
        });

        panel.add(b1);
        panel.add(b2);
        return panel;
    }

    private JPanel makeAnimalPanel(Animal animal) {
        JPanel animalPanel = new JPanel(new GridLayout(3, 1, 10, 10));

        JButton dietButton = new JButton("Diet");
        dietButton.addActionListener(e -> JOptionPane.showMessageDialog(
                ZGFrame,
                "This animal is a " + animal.getDietBehavior(),
                "Diet Information",
                JOptionPane.INFORMATION_MESSAGE));

        JButton movementButton = new JButton("Movement");
        movementButton.addActionListener(e -> JOptionPane.showMessageDialog(
                ZGFrame,
                "This animal moves by " + animal.getMoveBehavior(),
                "Movement Information",
                JOptionPane.INFORMATION_MESSAGE));

        JButton soundButton = new JButton("Sound");
        soundButton.addActionListener(e -> JOptionPane.showMessageDialog(
                ZGFrame,
                "This animal says: " + animal.getSoundBehavior(),
                "Sound Information",
                JOptionPane.INFORMATION_MESSAGE));

        animalPanel.add(dietButton);
        animalPanel.add(movementButton);
        animalPanel.add(soundButton);

        return animalPanel;
    }

    private void switchPanel(String panelName) {
        if (!panelMap.containsKey(panelName))
            return;
        cardLayout.show(centerPanel, panelName);
    }
}

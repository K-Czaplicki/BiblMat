package BiblMat;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

public class Painter extends JFrame {
    private final ArrayList<String> data = new ArrayList<>();
    private final String[] temp = new String[4];

    public Painter() {
        super("Painter");
        setSize(28 * 15 * 4, 28 * 15 + 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        GridCanvas canvas = new GridCanvas();
        add(canvas, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        JButton Btn1 = new JButton("1");
        JButton Btn2 = new JButton("2");
        JButton Btn3 = new JButton("3");
        JButton Btn4 = new JButton("4");
        JButton newBtn = new JButton("New set");
        JTextField ans = new JTextField("                      ");
        ans.setFont(ans.getFont().deriveFont(Font.BOLD, 36f));
        buttonPanel.add(Btn1);
        buttonPanel.add(Btn2);
        buttonPanel.add(Btn3);
        buttonPanel.add(Btn4);
        buttonPanel.add(newBtn);
        buttonPanel.add(ans);
        add(buttonPanel, BorderLayout.SOUTH);

        try {
            File myObj = new File("./src/BiblMat/MNIST_test.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data.add(myReader.nextLine());
            }

            Random rnd = new Random();
            temp[0] = data.get(rnd.nextInt(0, 10000));
            temp[1] = data.get(rnd.nextInt(0, 10000));
            temp[2] = data.get(rnd.nextInt(0, 10000));
            temp[3] = data.get(rnd.nextInt(0, 10000));
            for (int k = 0; k < 4; k++) {
                String[] splitted = temp[k].split(",");
                for (int i = 0; i < 28; i++) {
                    for (int j = 0; j < 28; j++) {
                        if (Integer.valueOf(splitted[(i * 28) + j + 1]).compareTo(70) > 0)
                            canvas.grid[j + k * 28][i] = Color.BLACK;
                        else
                            canvas.grid[j + k * 28][i] = Color.WHITE;
                    }
                }
            }
            setVisible(true);
        } catch (FileNotFoundException e) {
            System.out.println("File not found :(");
        }

        Btn1.addActionListener(e -> {
            Neural.dealWithData(temp[0]);
            Neural.go();
            ans.setText("Predicted: " + Neural.getNumber(Neural.output));
        });

        Btn2.addActionListener(e -> {
            Neural.dealWithData(temp[1]);
            Neural.go();
            ans.setText("Predicted: " + Neural.getNumber(Neural.output));
        });

        Btn3.addActionListener(e -> {
            Neural.dealWithData(temp[2]);
            Neural.go();
            ans.setText("Predicted: " + Neural.getNumber(Neural.output));
        });

        Btn4.addActionListener(e -> {
            Neural.dealWithData(temp[3]);
            Neural.go();
            ans.setText("Predicted: " + Neural.getNumber(Neural.output));
        });

        newBtn.addActionListener(e -> {
            Random rnd = new Random();
            temp[0] = data.get(rnd.nextInt(0, 9999));
            temp[1] = data.get(rnd.nextInt(0, 9999));
            temp[2] = data.get(rnd.nextInt(0, 9999));
            temp[3] = data.get(rnd.nextInt(0, 9999));
            for (int k = 0; k < 4; k++) {
                String[] splitted = temp[k].split(",");
                for (int i = 0; i < 28; i++) {
                    for (int j = 0; j < 28; j++) {
                        if (Integer.valueOf(splitted[(i * 28) + j + 1]).compareTo(100) > 0)
                            canvas.grid[j + k * 28][i] = Color.BLACK;
                        else
                            canvas.grid[j + k * 28][i] = Color.WHITE;
                    }
                }
            }
            canvas.repaint();
        });
    }

    public static void main(String[] args) {
        Neural.initW();
        Neural.start();
        new Painter();
    }

    static class GridCanvas extends JPanel {
        private final int gridSize = 28;
        private final Color[][] grid;

        public GridCanvas() {
            setPreferredSize(new Dimension(gridSize * 15 * 4, gridSize * 15));
            setBackground(Color.WHITE);
            grid = new Color[gridSize * 4][gridSize];
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (int i = 0; i < gridSize * 4; i++) {
                for (int j = 0; j < gridSize; j++) {
                    if (grid[i][j] != null) {
                        g.setColor(grid[i][j]);
                        g.fillRect(i * 15, j * 15, 15, 15);
                    }
                }
            }
        }
    }
}

package BiblMat;

import MathLibrary.Matrix;
import MathLibrary.Vector;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Neural {
    public static Vector input;
    private static final Matrix[] weights = new Matrix[10];
    public static final Vector output = new Vector(new Integer[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static Vector answer = new Vector(new Integer[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
    private static final double LEARNING_RATE = 0.1;
    private static int correct=0;
    private static int counter=0;

    public static void go() {
        for (int n = 0; n < 10; n++) {
            Double[][] temp = new Double[28][28];
            for (int i = 0; i < 784; i++) {
                temp[i / 28][i % 28] = input.get(i) * weights[n].get(i / 28, i % 28);
            }
            Matrix tp = new Matrix(temp);
            output.set(n, tp.sumOfElements()/784);
        }
    }

    private static void learn() {
        output.subtract(answer);
        output.multiplyByScalar(-LEARNING_RATE);
        for (int n = 0; n < 10; n++) {
            for (int i = 0; i < 784; i++) {
                weights[n].set(i / 28, i % 28, weights[n].get(i / 28, i % 28) + (input.get(i)*output.get(n)));
            }
        }
    }

    public static void printImg(Vector img) {
        for(int i=0; i<784; i++) {
            System.out.print((img.get(i)==1)?"#":"-");
            if(i%28==27)
                System.out.println();
        }
    }

    public static int getNumber(Vector arr) {
        double maxOut = 0;
        int maxInd = 0;
        for (int i=0; i<10; i++) {
            if (maxOut < arr.get(i)) {
                maxInd = i;
                maxOut = arr.get(i);
            }
        }
        return maxInd;
    }

    public static void dealWithData(String data) {
        int number = Character.getNumericValue(data.toCharArray()[0]);
        answer = new Vector(new Integer[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        answer.set(number, 1.0);
        ArrayList<Integer> tmp = new ArrayList<>();
        String[] splitted = data.split(",");
        for(int i=1; i<785; i++){
            tmp.add((Integer.valueOf(splitted[i]).compareTo(70)>0)?1:0);
        }
        Integer[] a = new Integer[784];
        a = tmp.toArray(a);
        input = new Vector(a);
    }

    public static void initW() {
        for (int i = 0; i < 10; i++) {
            weights[i] = Matrix.getRandomMatrix(28, 28);
        }
    }
    public static void start() {
        File myObj = new File("./src/BiblMat/MNIST_train.txt");
        try {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                dealWithData(data);
                go();
                if(getNumber(output)==getNumber(answer))
                    correct++;
                learn();
                counter++;
                if(counter%5000==0) {
                    printImg(input);
                    System.out.println("Trained: " + counter + "/60000");
                    System.out.println("Accuracy: " + (double)correct/(double)counter);
                    System.out.println("----------------------------");
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}

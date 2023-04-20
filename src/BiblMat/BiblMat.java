package BiblMat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import MathLibrary.*;

public class BiblMat {

    private static final ArrayList<String> vectorNames = new ArrayList<>();
    private static final ArrayList<String> matrixNames = new ArrayList<>();

    private static final HashMap<String, Vector> variable_vector = new HashMap<>();
    private static final HashMap<String, Matrix> variable_matrix = new HashMap<>();

    private static Vector prevVector;
    private static Matrix prevMatrix;

    private static boolean hasDigit(String text) {
        for (Character letter : text.toCharArray()) {
            if (Character.isDigit(letter))
                return true;
        }
        return false;
    }

    private static boolean hasnoLetter(String text) {
        for (Character letter : text.toCharArray()) {
            if (Character.isLetter(letter))
                return false;
        }
        return true;
    }

    private static void printLogo() {
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println(" /$$$$$$$  /$$ /$$       /$$ /$$      /$$             /$$");
        System.out.println("| $$__  $$|__/| $$      | $$| $$$    /$$$            | $$");
        System.out.println("| $$  \\ $$ /$$| $$$$$$$ | $$| $$$$  /$$$$  /$$$$$$  /$$$$$$");
        System.out.println("| $$$$$$$ | $$| $$__  $$| $$| $$ $$/$$ $$ |____  $$|_  $$_/ ");
        System.out.println("| $$__  $$| $$| $$  \\ $$| $$| $$  $$$| $$  /$$$$$$$  | $$");
        System.out.println("| $$  \\ $$| $$| $$  | $$| $$| $$\\  $ | $$ /$$__  $$  | $$ /$$");
        System.out.println("| $$$$$$$/| $$| $$$$$$$/| $$| $$ \\/  | $$|  $$$$$$$  |  $$$$/");
        System.out.println("|_______/ |__/|_______/ |__/|__/     |__/ \\_______/   \\___/");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println();
    }

    public static void main(String[] args) {
        printLogo();

        while (true) {
            System.out.println("--------- COMMAND ---------");
            Scanner scanner = new Scanner(System.in);
            String code = scanner.nextLine();

            if (code.toLowerCase().replace(" ", "").equals("exit"))
                break;

            String[] commands = code.split(" ");
            System.out.println("--------- OUT ---------");
            try {
                if (commands[0].equals("Matrix")) {
                    if (commands.length == 2) {
                        if (!matrixNames.contains(commands[1].toLowerCase()) && !vectorNames.contains(commands[1].toLowerCase())) {
                            if (hasDigit(commands[1]))
                                System.out.println("Variable name cannot use digits");
                            else {
                                matrixNames.add(commands[1].toLowerCase());
                                variable_matrix.put(commands[1].toLowerCase(), null);
                                System.out.println("Created matrix named: " + commands[1].toLowerCase());
                            }
                        } else
                            System.out.println("This name is already used");
                    } else {
                        System.out.println("You must declare a variable with a name");
                    }
                } else if (vectorNames.contains(commands[0]) && commands.length == 3 && commands[1].equals("=") && commands[2].equals("%")) {
                    variable_vector.replace(commands[0], prevVector);
                    System.out.println("Changed vector variable");
                } else if (matrixNames.contains(commands[0]) && commands.length == 3 && commands[1].equals("=") && commands[2].equals("%")) {
                    variable_matrix.replace(commands[0], prevMatrix);
                    System.out.println("Changed matrix variable");
                } else if (commands[0].equals("Vector")) {
                    if (commands.length == 2) {
                        if (!matrixNames.contains(commands[1].toLowerCase()) && !vectorNames.contains(commands[1].toLowerCase())) {
                            if (hasDigit(commands[1]))
                                System.out.println("Variable name cannot use digits");
                            else {
                                vectorNames.add(commands[1].toLowerCase());
                                variable_vector.put(commands[1].toLowerCase(), null);
                                System.out.println("Created vector named: " + commands[1].toLowerCase());
                            }
                        } else
                            System.out.println("This name is already used");
                    } else {
                        System.out.println("You must declare a variable with a name");
                    }
                } else if (matrixNames.contains(commands[0]) && commands.length == 3 && commands[1].equals("=")) {
                    String[] rows = commands[2].split(":");
                    Double[][] tp = new Double[rows.length][rows[0].split(",").length];
                    for (int i = 0; i < rows.length; i++) {
                        String[] val = rows[i].split(",");
                        for (int j = 0; j < val.length; j++) {
                            tp[i][j] = Double.valueOf(val[j]);
                        }
                    }
                    Matrix temp = new Matrix(tp);
                    variable_matrix.put(commands[0], temp);
                    System.out.println("Changed matrix variable");
                } else if (vectorNames.contains(commands[0]) && commands.length == 3 && commands[1].equals("=")) {
                    String[] values = commands[2].split(",");
                    Double[] tp = new Double[values.length];
                    for (int i = 0; i < values.length; i++) {
                        tp[i] = Double.valueOf(values[i]);
                    }
                    Vector temp = new Vector(tp);
                    variable_vector.put(commands[0], temp);
                    System.out.println("Changed vector variable");
                } else if (vectorNames.contains(commands[0]) && commands.length == 1) {
                    prevVector = variable_vector.get(commands[0]);
                    System.out.println(prevVector);
                } else if (matrixNames.contains(commands[0]) && commands.length == 1) {
                    prevMatrix = variable_matrix.get(commands[0]);
                    System.out.println(prevMatrix);
                } else if (vectorNames.contains(commands[0]) && commands.length == 3 && commands[1].equals("+")  && vectorNames.contains(commands[2])) {
                    prevVector = Vector.add(variable_vector.get(commands[0]), variable_vector.get(commands[2]));
                    System.out.println(prevVector);
                } else if (matrixNames.contains(commands[0]) && commands.length == 3 && commands[1].equals("+") && matrixNames.contains(commands[2])) {
                    prevMatrix = Matrix.add(variable_matrix.get(commands[0]), variable_matrix.get(commands[2]));
                    System.out.println(prevMatrix);
                } else if (vectorNames.contains(commands[0]) && commands.length == 3 && commands[1].equals("-") && vectorNames.contains(commands[2])) {
                    prevVector = Vector.subtract(variable_vector.get(commands[0]), variable_vector.get(commands[2]));
                    System.out.println(prevVector);
                } else if (matrixNames.contains(commands[0]) && commands.length == 3 && commands[1].equals("-") && matrixNames.contains(commands[2])) {
                    prevMatrix = Matrix.subtract(variable_matrix.get(commands[0]), variable_matrix.get(commands[2]));
                    System.out.println(prevMatrix);
                } else if (vectorNames.contains(commands[0]) && commands.length == 3 && commands[1].equals("*") && hasnoLetter(commands[2])) {
                    prevVector = Vector.multiplyByScalar(variable_vector.get(commands[0]), Double.parseDouble(commands[2]));
                    System.out.println(prevVector);
                } else if (commands.length == 3 && matrixNames.contains(commands[0]) && commands[1].equals("*") && hasnoLetter(commands[2])) {
                    prevMatrix = Matrix.multiplyByScalar(variable_matrix.get(commands[0]), Double.parseDouble(commands[2]));
                    System.out.println(prevMatrix);
                } else if (commands.length == 3 && matrixNames.contains(commands[0]) && commands[1].equals("*") && matrixNames.contains(commands[2])) {
                    prevMatrix = Matrix.multiply(variable_matrix.get(commands[0]), variable_matrix.get(commands[2]));
                    System.out.println(prevMatrix);
                } else if (commands[0].equalsIgnoreCase("determinant") && commands.length == 2 && matrixNames.contains(commands[1])) {
                    System.out.println(Matrix.determinant(variable_matrix.get(commands[1])));
                } else if (commands[0].equalsIgnoreCase("trace") && commands.length == 2 && matrixNames.contains(commands[1])) {
                    System.out.println(Matrix.trace(variable_matrix.get(commands[1])));
                } else if (commands[0].equalsIgnoreCase("sumofelements") && commands.length == 2 && matrixNames.contains(commands[1])) {
                    System.out.println(Matrix.sumOfElements(variable_matrix.get(commands[1])));
                } else if (commands[0].equalsIgnoreCase("transpose") && commands.length == 2 && matrixNames.contains(commands[1])) {
                    prevMatrix = Matrix.transpose(variable_matrix.get(commands[1]));
                    System.out.println(prevMatrix);
                } else if (commands[0].equalsIgnoreCase("inverse") && commands.length == 2 && matrixNames.contains(commands[1])) {
                    prevMatrix = Matrix.inverse(variable_matrix.get(commands[1]));
                    System.out.println(prevMatrix);
                } else if (commands[0].equalsIgnoreCase("setrandom") && commands.length == 4 && matrixNames.contains(commands[1])) {
                    variable_matrix.replace(commands[1], Matrix.getRandomMatrix(Integer.parseInt(commands[2]),Integer.parseInt(commands[3])));
                    System.out.println(variable_matrix.get(commands[1]));
                } else if (commands[0].equalsIgnoreCase("setrandom") && commands.length == 3 && vectorNames.contains(commands[1])) {
                    variable_vector.replace(commands[1], Vector.getRandomVector(Integer.parseInt(commands[2])));
                    System.out.println(variable_vector.get(commands[1]));
                } else if (commands[0].equalsIgnoreCase("getrandommatrix") && commands.length == 3) {
                    prevMatrix = Matrix.getRandomMatrix(Integer.parseInt(commands[1]),Integer.parseInt(commands[2]));
                    System.out.println(prevMatrix);
                } else if (commands[0].equalsIgnoreCase("getrandomvector") && commands.length == 2) {
                    prevVector = Vector.getRandomVector(Integer.parseInt(commands[1]));
                    System.out.println(prevVector);
                } else if (commands[0].equalsIgnoreCase("opposite") && commands.length == 2 && vectorNames.contains(commands[1])) {
                    prevVector = Vector.opposite(variable_vector.get(commands[1]));
                    System.out.println(prevVector);
                } else if (commands[0].equalsIgnoreCase("crossproduct") && commands.length == 3 && vectorNames.contains(commands[1]) && vectorNames.contains(commands[2])) {
                    prevVector = Vector.crossProduct(variable_vector.get(commands[1]), variable_vector.get(commands[2]));
                    System.out.println(prevVector);
                } else if (commands[0].equalsIgnoreCase("isperpendicular") && commands.length == 3 && vectorNames.contains(commands[1]) && vectorNames.contains(commands[2])) {
                    System.out.println(Vector.isPerpendicular(variable_vector.get(commands[1]), variable_vector.get(commands[2])));
                } else if (commands[0].equalsIgnoreCase("isparallel") && commands.length == 3 && vectorNames.contains(commands[1]) && vectorNames.contains(commands[2])) {
                    System.out.println(Vector.isParallel(variable_vector.get(commands[1]), variable_vector.get(commands[2])));
                } else if (commands[0].equalsIgnoreCase("dotproduct") && commands.length == 3 && vectorNames.contains(commands[1]) && vectorNames.contains(commands[2])) {
                    System.out.println(Vector.dotProduct(variable_vector.get(commands[1]), variable_vector.get(commands[2])));
                } else if (commands[0].equalsIgnoreCase("length") && commands.length == 2 && vectorNames.contains(commands[1])) {
                    System.out.println(Vector.length(variable_vector.get(commands[1])));
                } else {
                    System.out.println("Wrong command");
                }
                System.out.println();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
}

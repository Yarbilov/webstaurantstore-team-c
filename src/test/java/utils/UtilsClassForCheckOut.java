package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UtilsClassForCheckOut {




    public static Object[][] readFromCSV(String path) throws IOException {

        List<List<String>> converted= new ArrayList<>();


        List<String>rows= Files.readAllLines(Path.of(path));

        for (int i = 0; i < rows.size(); i++) {

            List<String>each= Arrays.asList(rows.get(i).split(","));
            converted.add(each);

        }

        Object[][] arr= new Object[converted.size()][converted.get(0).size()];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j]=converted.get(i).get(j);

            }

        }

        return arr;

    }

//    public static void main(String[] args) throws IOException {
//
//        Object[][] objects = readFromCSV("data.csv");
//
//        System.out.println(Arrays.deepToString(objects));
//    }
}

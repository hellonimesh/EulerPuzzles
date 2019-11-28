package EulerMainClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class CalculatingNameScore {

    public static void calcultingTotalOfNameScore() throws IOException {
        // TODO Auto-generated method stub

        ArrayList<String> givenNames = new ArrayList<String>();

//       Make sure to change the location of the file according to your local machine drive path
        BufferedReader nameList = new BufferedReader(new FileReader("/Users/nsoni/iCloud Drive/Desktop/EulerPuzzles/src/names.txt"));
        String readTheNames = "";

        while ((readTheNames = nameList.readLine()) != null) {
                 // reading the names and separating by comma in pickNames
            String[] pickNames = readTheNames.split( "," );

            for (String item : pickNames) {
                // moving to the next name
                String nextName = item.substring( 1, item.length() - 1 );
                givenNames.add( nextName );
            }
        }
        nameList.close();

        // sorting names in order
        Collections.sort(givenNames);

        long finalScore = 0;
        int alfabeticalValue = 1;

        for(int i = 0; i < givenNames.size(); i++){


            int valueAllocation = valueOfName(givenNames.get(i));
            alfabeticalValue = valueAllocation * (i + 1);

            finalScore += alfabeticalValue;

        }
        System.out.println("Sum: " + finalScore);
    }

    private static int valueOfName(String readTheLetter) {
        char[] letterOfAlfabet = {'1', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        char[] initialNameHolder = readTheLetter.toCharArray();

        int scoreValue = 0;
        for (char c : initialNameHolder) {
            for (int j = 0; j < letterOfAlfabet.length; j++) {
                if (c == letterOfAlfabet[j])
                    scoreValue += j;
            }
        }
        return scoreValue;

    }
}

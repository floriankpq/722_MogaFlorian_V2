package Aufgabe1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Repository {

    public List<Offerten> readFromFile(String fileName, String character) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line = bufferedReader.readLine();
        String[] attributes;

        Offerten offerten;
        List<Offerten> listeOfferten = new ArrayList<>();

        while (line != null) {
            attributes = line.split(character);
            offerten = new Offerten(Integer.parseInt(attributes[0]), attributes[1], Integer.parseInt(attributes[2]),  Double.parseDouble(attributes[3]), attributes[4], Ort.valueOf(attributes[5]));
            listeOfferten.add(offerten);

            line = bufferedReader.readLine();
        }

        return listeOfferten;
    }


    public void writeToFile(String fileName, List<Offerten> offerten) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

        for(Offerten of : offerten){
            String line = of.getId()+"&"+of.getUnternehmensname()+"&"+of.getPreis()+"&"+of.getMehrwertsteuer()+"&"+of.getAdresse()+"&"+of.getOrt();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}

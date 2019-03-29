import com.opencsv.CSVReader;
import java.io.FileReader;
import java.io.IOException;

public class average {

    public static void main(String[] args) {

        String results = "C:\\g\\average\\exercise\\src\\main\\resources\\data.csv";

        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader(results));
            String[] line;
            while ((line = reader.readNext()) != null) {

                float average, sum=0;
                int i;
                int n = line.length;

                for(i=1; i<n; i++)
                {
                    float result = Float.parseFloat(line[i]);
                    sum = sum + result;
                }
                average = sum/(n-1);

                float sentiment = Float.parseFloat(line[0]);

                if (sentiment == average) {
                    System.out.println("Gratuluję AI!!! Rozpoznałeś sentyment: " + sentiment);
                }

                //System.out.println("Sentiment value is: " + line[0] + ", and AI says it is " + average + ".");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
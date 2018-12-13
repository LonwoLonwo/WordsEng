import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader {

    public static void main(String[] args) {
        String text = "Christmas was coming. One Morning in mid-December, Hogwarts woke to find itself covered in several feet of snow. The lake froze solid and the Weasley twins were punished for bewitching several snowballs so that they followed Quirrell around, bouncing off the back of his turban. The few owls that managed to battle their way through the stormy sky to deliver mail had to be nursed back to health by Hagrid before they could fly off again.";
        String text2 = "No one could wait for the holidays to start. While the Gryffinor common room and the Great Hall had roaring fires, the drafty corridors had become icy and a bitter wind rattled the windows in the classrooms. Worst of all were Professor Snape's classes down in the dungeons, where their hot cauldrons.";

        Pattern p = Pattern.compile("\\w+\\w+");
        Matcher m = p.matcher(text);

        while(m.find()) {
            System.out.println(m.group());
        }

        Matcher m1 = p.matcher(text2);

        while(m1.find()) {
            System.out.println(m1.group());
        }


    }

}

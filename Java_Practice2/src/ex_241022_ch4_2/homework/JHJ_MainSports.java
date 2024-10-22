package ex_241022_ch4_2.homework;

import java.util.Random;

public class JHJ_MainSports {
    public static void main(String[] args) {
        JHJ_Sports[] sports = new JHJ_Sports[3];

        sports[0] = new JHJ_Swimming();
        sports[1] = new JHJ_Badminton();
        sports[2] = new JHJ_Running();

        Random rd = new Random();
        int randomIndex = rd.nextInt(sports.length);

        sports[randomIndex].introduce();
        sports[randomIndex].place();
        sports[randomIndex].needs();
        sports[randomIndex].price();
        
    }
}

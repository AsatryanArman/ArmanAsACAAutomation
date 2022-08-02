package Utils;

import java.util.Random;

public class LoginRandom {

        public static String generateRandomPassword(int len) {
            String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk";
            Random rnd = new Random();
            StringBuilder sb = new StringBuilder(len);
            for (int i = 0; i < len; i++)
                sb.append(chars.charAt(rnd.nextInt(chars.length())));
            String l;
            return l = sb.toString();

    }
}


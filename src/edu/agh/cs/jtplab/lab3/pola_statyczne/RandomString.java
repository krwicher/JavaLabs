package edu.agh.cs.jtplab.lab3.pola_statyczne;

import java.util.Random;

public class RandomString {
    private String randomString;
    public static int instance = 0;

    public RandomString()
    {
        instance++;
        randomString = GetRandomString(4,12);
    }

    private String GetRandomString(int minLength, int maxLength)
    {
        Random rand = new Random();
        int length = rand.nextInt(maxLength - minLength) + minLength;
        StringBuilder sb = new StringBuilder(maxLength);
        for (int i = 0; i < length; i++) {
            int temp = rand.nextInt('z' - 'a') + 'a';
            sb.append((char) temp);
        }
        return sb.toString();
    }

}

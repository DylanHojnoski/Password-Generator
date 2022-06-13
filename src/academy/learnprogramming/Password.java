package academy.learnprogramming;

import java.util.Random;

public class Password {
    private String name;
    private int length;
    private String password = "";
    private String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
                        "w", "x", "y", "z" };
    private String[] specialCharacters = {"!", "@", "`", "~", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "+", "=", "{", "[", "]", "]",
                                            "\\", "|", ":", ";", "\"", "'", "<", ",", ">", ".", "?", "/"};
    private String[] numbers = {"1", "2", "3" , "4", "5", "6", "7", "8", "9", "0"};

    public Password(String name, int length)
    {
        this.name = name;
        this.length = length;
        generatePassword();
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void generatePassword()
    {
        Random rand = new Random();
        while (password.length() < length)
        {
            int num = rand.nextInt(3);
            switch (num)
            {
                case 0:
                    int letterNum = rand.nextInt(letters.length);
                    double upperOrLower = rand.nextInt(2);
                    if (upperOrLower != 1)
                    {
                        password = password.concat(letters[letterNum]);
                    }
                    else
                    {
                        password =  password.concat(letters[letterNum].toUpperCase());
                    }
                    break;
                case 1:
                    int specialCharacterNum = rand.nextInt(specialCharacters.length);
                    password =  password.concat(specialCharacters[specialCharacterNum]);
                    break;
                case 2:
                    int numPicker = rand.nextInt(numbers.length);
                    password =  password.concat(numbers[numPicker]);
                    break;
            }
        }
    }
}

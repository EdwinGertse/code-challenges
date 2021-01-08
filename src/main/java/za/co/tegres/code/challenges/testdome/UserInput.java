package za.co.tegres.code.challenges.testdome;

/**
 * User interface contains two types of user input controls: TextInput, which accepts all characters and NumericInput, which accepts only digits.
 *<br/>
 * Implement the class TextInput that contains:
 *<br/>
 * <p>
 * Public method void add(char c) - adds the given character to the current value<br/>
 * Public method String getValue() - returns the current value<br/>
 * Implement the class NumericInput that:
 * </p>
 *<br/>
 * Inherits from TextInput<br/>
 * Overrides the add method so that each non-numeric character is ignored<br/>
 * For example, the following code should output "10":
 */
public class UserInput {

    public static class TextInput {
        StringBuilder value = new StringBuilder();
        void add(char c) {
            value.append(c);
        }

        String getValue() {
            return value.toString();
        }
    }

    public static class NumericInput extends TextInput {
        @Override
        void add(char c) {
            if(Character.isDigit(c)){
                value.append(c);
            }
        }
    }
}

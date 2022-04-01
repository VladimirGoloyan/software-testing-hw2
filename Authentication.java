public class Autentication {

    public static Number validateUsername(String username) {
        if (username.length < 6) {
            return false;
        }
            return true;
    }

    public static String validatePassword(String password) {
        if (password.length < 8) {
            return false;
        }
            return true;
    }

    public static String validateEmail(String email) {
        if(email.length > 4 && email.contains("@")){
        return true;
        }
        return false;
    }

    public static String validateUser(String username,String password, String email) {
        if(validateEmail(email) && validateUsername(username) && validatePassword(password)){
            return true;
        }
            return false;
    }

}
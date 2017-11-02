package AnnotationTest;

public class PasswordUtils {
    @UseCase(id=47,description = "Password must contain at least one numeric")
    public boolean validatePassword(String password){
        return (password.matches("\\w*\\d\\w*"));
    }

    @UseCase(id=48)
    public String enccryptPassword(String password){
        return new StringBuilder(password).reverse().toString();
    }
}

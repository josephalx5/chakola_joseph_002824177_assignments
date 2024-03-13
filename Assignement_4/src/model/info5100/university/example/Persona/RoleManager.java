package info5100.university.example.Persona;

public enum RoleManager {
    ADMIN("admin"),
    FACULTY("faculty"),
    STUDENT("student");
    public final String password;
    RoleManager(String password){
        this.password = password;
    }
}

package starter.Utils;

import starter.models.Users;

import java.util.List;

public class MethodFind {
    public static Users userApp(String actor) {
        List<Users> users = UsersLogin.USERS_LIST;
        for (Users user : users) {
            if (user.getUsername().equals(actor)) {
                // Retorna el usuario si lo encuentra
                return user;
            }
        }
        // Retorna null si no se encuentra el usuario
        return null;
    }
}

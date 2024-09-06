package starter.Utils;

import starter.models.Users;

import java.util.Arrays;
import java.util.List;

public class UsersLogin {
    private static final Users STANDARD = new Users("standard_user", "secret_sauce");
    private static final Users STANDARD_2 = new Users("locked_out_user", "secret_sauce");
    private static final Users STANDARD_3 = new Users("problem_user", "secret_sauce");
    private static final Users STANDARD_4 = new Users("performance_glitch_user", "secret_sauce");
    private static final Users STANDARD_5 = new Users("error_user", "secret_sauce");
    private static final Users STANDARD_6 = new Users("visual_user", "secret_sauce");
    public static List<Users> USERS_LIST = Arrays.asList(STANDARD, STANDARD_2, STANDARD_3, STANDARD_4, STANDARD_5, STANDARD_6);
}

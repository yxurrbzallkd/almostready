package permissions;

public class Action {
    public void perform(User user, String data) {
        if (!PermissionType.checkPermission(user, this)) {
            throw new RuntimeException("Wrong Permission!");
        }
        System.out.println("Right Permission! Performing: "+data);
    }
}

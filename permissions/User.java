package permissions;

public class User {
    private PermissionType permissionType;

    public User() {}

    public PermissionType getPermissionType() {
        System.out.println("user has "+permissionType+" permission");
        return this.permissionType;
    }

    public void setPermissionType(PermissionType permissionType) {
        System.out.println("giving "+permissionType+" rights to the user");
        this.permissionType = permissionType;
    }
}

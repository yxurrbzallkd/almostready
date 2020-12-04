package permissions;

public enum PermissionType {
    ADMIN, MANAGER;

    public static boolean checkPermission(User user, Action action) {
        Class<?> cls = action.getClass();
        System.out.println(user+" whants to perform Action["+action+"] that requires "+
        cls.getAnnotation(Permission.class).type()+" permission");
        System.out.println("checking permission...");
        return user.getPermissionType() == cls.getAnnotation(Permission.class).type();
    }
}

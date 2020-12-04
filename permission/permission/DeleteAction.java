package permission;

@Permission(level = PermissionType.ADMIN)
public class DeleteAction extends Action {
    @Override
    public void perform(User user, String data) {
        // If user and permission have same level access, then perform action
        // 1. Extract metadata from class
        // 2. Check metadata
        // 3. Perform action if possible
    }
}

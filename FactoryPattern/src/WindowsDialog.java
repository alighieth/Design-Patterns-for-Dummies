public class WindowsDialog extends Dialog {
    public WindowsDialog(int width, int height) {
        super(width, height);
    }
    
    public Button createButton() {
        return new WindowsButton();
    }

    public static void main(String[] args) {
        WindowsDialog windowsDialog = new WindowsDialog(0, 0);
        Button newButton = windowsDialog.createButton();
        newButton.onClick();
    }
}

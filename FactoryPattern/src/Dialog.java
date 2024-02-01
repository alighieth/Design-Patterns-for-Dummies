public class Dialog {
    // This is a superclass that will include the base methods and attr of the dialogs
    public int width;
    public int height;

    public Dialog(int width,int height) {
        this.width = width;
        this.height = height;
    }

    public Button createButton() {
         return null;
    }
}

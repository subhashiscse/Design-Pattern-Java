public class WinFactory implements IFactory {
    @Override
    public IButton createButton() {
        return new WinButton();
    }

    @Override
    public ITextbox createTextbox() {
        return new WinTextBox();
    }
}

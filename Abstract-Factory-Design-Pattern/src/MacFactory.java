public class MacFactory implements IFactory {
    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ITextbox createTextbox() {
        return new MacTextBox();
    }
}

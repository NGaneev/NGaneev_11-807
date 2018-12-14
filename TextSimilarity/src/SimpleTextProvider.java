public class SimpleTextProvider implements TextProvider {
    private String text;

    public SimpleTextProvider(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}
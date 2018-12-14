import FileTextProvider;

import java.io.File;

public class FileTextProviderWithName extends FileTextProvider {
    private String fileName;

    public FileTextProviderWithName(File input, String fileName) {
        super(input);
        this.fileName = fileName;
    }
    public String getTextWithName () {
        return super.getText() + fileName;
    }

}
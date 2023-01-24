package lection2save_file.Format;


import lection2save_file.Document.TextDocument;
import lection2save_file.Interface.Saveable;

public abstract class TextFormat implements Saveable {
    public abstract void SaveAs(TextDocument document, String path);
}

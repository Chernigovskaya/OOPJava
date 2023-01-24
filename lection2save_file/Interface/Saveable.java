package lection2save_file.Interface;


import lection2save_file.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}

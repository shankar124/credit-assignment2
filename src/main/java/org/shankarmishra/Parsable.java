package org.shankarmishra;
import java.util.List;

public interface Parsable <File> {
    List<ServerLog> parseFile(File f);
}

package bos.consoar.objc2lua;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class DescriptiveErrorListener extends BaseErrorListener {
    public static DescriptiveErrorListener INSTANCE = new DescriptiveErrorListener();
    private static final boolean REPORT_SYNTAX_ERRORS = true;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg, RecognitionException e) {
        if (!REPORT_SYNTAX_ERRORS) {
            return;
        }

        String sourceName = recognizer.getInputStream().getSourceName();
        if (!sourceName.isEmpty()) {
            sourceName = String.format("%s:%d:%d: ", sourceName, line, charPositionInLine);
        }

        System.err.println(sourceName + "line " + line + ":" + charPositionInLine + " " + msg);
    }
}

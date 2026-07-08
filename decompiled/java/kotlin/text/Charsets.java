package kotlin.text;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes14.dex */
public final class Charsets {
    public static final Charset LIZIZ;
    public static final Charset LIZJ;
    public static final Charsets LIZ = new Charsets();
    public static final Charset UTF_8 = Charset.forName("UTF-8");

    static {
        Charset.forName("UTF-16");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        LIZIZ = Charset.forName("US-ASCII");
        LIZJ = Charset.forName("ISO-8859-1");
    }
}

package org.apache.commons.io;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import org.apache.commons.io.output.StringBuilderWriter;

/* JADX INFO: loaded from: classes4.dex */
public class IOUtils {
    public static final char DIR_SEPARATOR = File.separatorChar;
    public static final String LINE_SEPARATOR;

    static {
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter(4);
        try {
            PrintWriter printWriter = new PrintWriter(stringBuilderWriter);
            try {
                printWriter.println();
                LINE_SEPARATOR = stringBuilderWriter.toString();
                printWriter.close();
                stringBuilderWriter.close();
            } catch (Throwable th) {
                th = th;
                try {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        th = null;
                        TryCatchGuardChecker.doCheck(th);
                        if (th != null) {
                            try {
                                printWriter.close();
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                                th.addSuppressed(th3);
                            }
                        } else {
                            printWriter.close();
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            try {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                } catch (Throwable th6) {
                    th = th6;
                    th = null;
                    TryCatchGuardChecker.doCheck(th);
                    if (th == null) {
                        stringBuilderWriter.close();
                        throw th;
                    }
                    try {
                        stringBuilderWriter.close();
                        throw th;
                    } catch (Throwable th7) {
                        TryCatchGuardChecker.doCheck(th7);
                        th.addSuppressed(th7);
                        throw th;
                    }
                }
            } catch (Throwable th8) {
                th = th8;
            }
        }
    }

    public static int copy(Reader reader, Writer writer) {
        long jCopyLarge = copyLarge(reader, writer);
        if (jCopyLarge > 2147483647L) {
            return -1;
        }
        return (int) jCopyLarge;
    }

    public static long copyLarge(Reader reader, Writer writer) {
        return copyLarge(reader, writer, new char[SpeechEngineDefines.TTS_WORK_MODE_BOTH]);
    }

    public static String toString(InputStream inputStream, Charset charset) throws Throwable {
        StringBuilderWriter stringBuilderWriter = new StringBuilderWriter();
        try {
            copy(inputStream, stringBuilderWriter, charset);
            String string = stringBuilderWriter.toString();
            stringBuilderWriter.close();
            return string;
        } catch (Throwable th) {
            th = th;
            try {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                } catch (Throwable th2) {
                    th = th2;
                    th = null;
                    TryCatchGuardChecker.doCheck(th);
                    if (th != null) {
                        try {
                            stringBuilderWriter.close();
                            throw th;
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            th.addSuppressed(th3);
                            throw th;
                        }
                    }
                    stringBuilderWriter.close();
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public static void copy(InputStream inputStream, Writer writer, Charset charset) {
        copy(new InputStreamReader(inputStream, Charsets.toCharset(charset)), writer);
    }

    public static long copyLarge(Reader reader, Writer writer, char[] cArr) throws IOException {
        long j = 0;
        while (true) {
            int i = reader.read(cArr);
            if (-1 != i) {
                writer.write(cArr, 0, i);
                j += (long) i;
            } else {
                return j;
            }
        }
    }

    public static void write(String str, OutputStream outputStream, Charset charset) throws IOException {
        if (str != null) {
            outputStream.write(str.getBytes(Charsets.toCharset(charset)));
        }
    }
}

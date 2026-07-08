package com.ss.android.ugc.effectmanager.disklrucache;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class Util {
    public static final Charset US_ASCII = Charset.forName("US-ASCII");
    public static final Charset UTF_8 = Charset.forName("UTF-8");

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static void deleteContents(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    deleteContents(file2);
                }
                if (!file2.delete()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("failed to delete file: ");
                    sbLIZ.append(file2);
                    throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("not a readable directory: ");
        sbLIZ2.append(file);
        throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static String readFully(Reader reader) throws IOException {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int i = reader.read(cArr);
                if (i != -1) {
                    stringWriter.write(cArr, 0, i);
                } else {
                    String string = stringWriter.toString();
                    reader.close();
                    return string;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reader.close();
            throw th;
        }
    }
}

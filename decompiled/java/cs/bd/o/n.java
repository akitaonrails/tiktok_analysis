package cs.bd.o;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class n {
    public static String LIZ(String str) {
        return (str == null || str.length() <= 0) ? "" : str.trim().replace('\'', ' ').replace('\"', ' ').replace('\r', ' ').replace('\n', ' ');
    }

    public static byte[] LIZJ(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public static void LIZIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}

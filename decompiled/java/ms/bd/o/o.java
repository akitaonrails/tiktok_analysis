package ms.bd.o;

import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o extends b.a {
    public static void LIZJ(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                k.a(16777217, 0, 0L, "950515", new byte[]{37, 52, 124, 66, 7});
            }
        }
    }

    public static void LIZLLL(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                k.a(16777217, 0, 0L, "f39336", new byte[]{122, 50, 117, 68, 3});
            }
        }
    }

    public abstract Object[] LJ(String str, String str2);

    public abstract Object[] LJFF(String str, String str2, String str3);

    public abstract Object[] LJI(String str, String str2, byte[] bArr);

    @Override // ms.bd.o.b.a
    public final Object LIZ(int i, int i2, long j, String str, Object obj) {
        boolean z;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (a.LIZIZ.LIZ.checkPermission((String) k.a(16777217, 0, 0L, "9d96a9", new byte[]{41, 104, 78, 80, 81, 39, 62, 11, 120, 99, 58, 107, 67, 81, 77, 39, 53, 75, 38, 79, 6, 82, 111, 112, 112, 11, 14}), Process.myPid(), Process.myUid()) != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return null;
        }
        switch (i) {
            case 196609:
                Object[] objArr = (Object[]) obj;
                return LJI(str, (String) objArr[1], (byte[]) objArr[0]);
            case 196610:
                return LJ(str, (String) ((Object[]) obj)[0]);
            case 196611:
                Object[] objArr2 = (Object[]) obj;
                return LJFF(str, (String) objArr2[0], (String) objArr2[1]);
            default:
                return super.LIZ(i, i2, j, str, obj);
        }
    }
}

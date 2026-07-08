package cs.bd.o;

import X.C08PQ;
import X.C2110608Oq;
import android.os.Process;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d extends C08PQ {
    public abstract Object[] LIZJ(String str, String str2, String str3);

    public abstract Object[] LIZLLL(String str, String str2, String str3, byte[] bArr);

    public abstract Object[] LJ(String str, String str2, String str3);

    @Override // X.C08PQ
    public final Object LIZIZ(int i, int i2, long j, String str, Object obj) {
        boolean z;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (C2110608Oq.LIZIZ.LIZ.checkPermission(new String[]{"android.permission.INTERNET"}[0], Process.myPid(), Process.myUid()) != 0) {
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
                return LIZLLL(str, (String) objArr[1], (String) objArr[2], (byte[]) objArr[0]);
            case 196610:
                Object[] objArr2 = (Object[]) obj;
                return LJ(str, (String) objArr2[0], (String) objArr2[1]);
            case 196611:
                Object[] objArr3 = (Object[]) obj;
                return LIZJ(str, (String) objArr3[0], (String) objArr3[1]);
            default:
                return super.LIZIZ(i, i2, j, str, obj);
        }
    }
}

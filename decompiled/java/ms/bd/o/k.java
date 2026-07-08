package ms.bd.o;

import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public class k {
    public static native Object a(int i, int i2, long j, String str, Object obj);

    public static Object b(int i, int i2, long j, String str, Object obj) {
        b.a aVar = b.LIZ.get(i);
        if (aVar != null) {
            try {
                return aVar.LIZ(i, i2, j, str, obj);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw new RuntimeException(th);
            }
        }
        throw new RuntimeException(C786410Ut5.j4((String) a(16777217, 0, 0L, "25aa29", new byte[]{44, 39, 82, 22, 2, 42, 52, 84, 117, 53, 99, 62, 1, 85, 4, 32, 39, 21, 60, 56, 39}), new Object[]{Integer.valueOf(i)}));
    }
}

package ms.bd.o;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class b2 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        int i2;
        try {
            i2 = a.LIZIZ.LIZ.getResources().getConfiguration().orientation;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            i2 = -1;
        }
        return Integer.valueOf(i2);
    }
}

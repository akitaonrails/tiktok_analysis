package ms.bd.o;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        boolean zLIZIZ;
        try {
            zLIZIZ = j.LIZIZ(a.LIZIZ.LIZ, str, obj.toString());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            k.a(16777217, 0, 0L, "9cfc88", new byte[]{47, 96, 19});
            zLIZIZ = false;
        }
        if (zLIZIZ) {
            return k.a(16777217, 0, 0L, "353f63", new byte[]{13, 28});
        }
        return null;
    }
}

package ms.bd.o;

import android.provider.Settings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        int i2;
        try {
            boolean z = false;
            i2 = 1;
            if (Settings.Global.getInt(a.LIZIZ.LIZ.getContentResolver(), (String) k.a(16777217, 0, 0L, "f9a745", new byte[]{118, 50, 0, 83, 7, 35, 107, 29, 15, 106, 120, 63, 23, 124, 4, 44}), 0) != 0) {
                z = true;
            }
            if (z) {
                i2 = 2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            i2 = -1;
        }
        return Integer.valueOf(i2);
    }
}

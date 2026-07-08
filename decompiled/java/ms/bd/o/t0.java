package ms.bd.o;

import X.C786410Ut5;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class t0 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        Context context = a.LIZIZ.LIZ;
        if (s2.LIZ <= 0) {
            try {
                s2.LIZ = C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 0).versionCode;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return Integer.toString(s2.LIZ);
    }
}

package ms.bd.o;

import X.C2188811AlT;
import android.content.Context;
import android.util.DisplayMetrics;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class u1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        Context context = a.LIZIZ.LIZ;
        if (context != null) {
            try {
                new DisplayMetrics();
                x2.LIZ = context.getResources().getDisplayMetrics().densityDpi;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(x2.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

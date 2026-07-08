package cs.bd.o;

import X.C08PQ;
import X.C08XK;
import X.C2110608Oq;
import X.C2188811AlT;
import android.content.Context;
import android.util.DisplayMetrics;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public final class y0 extends C08PQ {
    @Override // X.C08PQ
    public final Object LIZ(long j, String str, Object obj) {
        Context context = C2110608Oq.LIZIZ.LIZ;
        if (context != null) {
            try {
                new DisplayMetrics();
                C08XK.LIZ = context.getResources().getDisplayMetrics().densityDpi;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(C08XK.LIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

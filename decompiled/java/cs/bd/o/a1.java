package cs.bd.o;

import X.C08PQ;
import X.C2110608Oq;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public final class a1 extends C08PQ {
    @Override // X.C08PQ
    public final Object LIZ(long j, String str, Object obj) {
        int i;
        try {
            i = C2110608Oq.LIZIZ.LIZ.getResources().getConfiguration().orientation;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            i = -1;
        }
        return Integer.valueOf(i);
    }
}

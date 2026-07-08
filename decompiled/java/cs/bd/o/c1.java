package cs.bd.o;

import X.C08PQ;
import X.C2110608Oq;
import X.C838410Wul;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public final class c1 extends C08PQ {
    @Override // X.C08PQ
    public final Object LIZ(long j, String str, Object obj) {
        int i;
        try {
            if (C838410Wul.LIZ(C2110608Oq.LIZIZ.LIZ, "android.permission.CAMERA") != 0) {
                i = 3;
            } else {
                i = 2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            i = -1;
        }
        return Integer.valueOf(i);
    }
}

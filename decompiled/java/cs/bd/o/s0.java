package cs.bd.o;

import X.C08PQ;
import X.C08XN;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 extends C08PQ {
    @Override // X.C08PQ
    public final Object LIZ(long j, String str, Object obj) {
        Throwable th;
        C08XN c08xnLIZ = C08XN.LIZ();
        synchronized (c08xnLIZ) {
            th = c08xnLIZ.LIZIZ;
        }
        if (th != null) {
            return Arrays.toString(th.getStackTrace());
        }
        return "";
    }
}

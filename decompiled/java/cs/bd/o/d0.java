package cs.bd.o;

import X.C08PQ;
import X.C08XO;
import X.C2110608Oq;
import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends C08PQ {
    @Override // X.C08PQ
    public final Object LIZ(long j, String str, Object obj) {
        int iLIZIZ;
        C08XO c08xoLIZ = C08XO.LIZ(C2110608Oq.LIZIZ.LIZ);
        c08xoLIZ.getClass();
        try {
            synchronized (c08xoLIZ) {
                try {
                    iLIZIZ = c08xoLIZ.LIZIZ();
                } finally {
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            iLIZIZ = -1;
        } catch (Throwable th) {
            throw th;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(iLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

package ms.bd.o;

import X.C2188811AlT;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class x0 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        int iLIZIZ;
        z2 z2VarLIZ = z2.LIZ(a.LIZIZ.LIZ);
        z2VarLIZ.getClass();
        try {
            synchronized (z2VarLIZ) {
                try {
                    iLIZIZ = z2VarLIZ.LIZIZ();
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

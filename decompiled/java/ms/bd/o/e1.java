package ms.bd.o;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class e1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        int i2;
        int iLIZJ;
        int iLIZIZ;
        z2 z2VarLIZ = z2.LIZ(a.LIZIZ.LIZ);
        z2VarLIZ.getClass();
        try {
            synchronized (z2VarLIZ) {
                try {
                    iLIZJ = z2VarLIZ.LIZJ();
                    iLIZIZ = z2VarLIZ.LIZIZ();
                } catch (Throwable th) {
                    throw th;
                }
            }
            i2 = (iLIZJ * 10000) + iLIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            i2 = -10001;
        } finally {
            TryCatchGuardChecker.doCheck(th);
        }
        Integer numValueOf = Integer.valueOf(i2);
        if (numValueOf != null) {
            ((ArrayList) z2VarLIZ.LIZIZ).add(numValueOf);
            try {
                int size = ((ArrayList) z2VarLIZ.LIZIZ).size();
                if (size > 20) {
                    ArrayList arrayList = new ArrayList(((ArrayList) z2VarLIZ.LIZIZ).subList(size - 10, size));
                    ((ArrayList) z2VarLIZ.LIZIZ).clear();
                    z2VarLIZ.LIZIZ = arrayList;
                    return null;
                }
                return null;
            } catch (Throwable th2) {
                return null;
            }
        }
        return null;
    }
}

package ms.bd.o;

import X.C08XC;
import X.C1494230ozF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public final class n2 extends m2 {
    public long LIZ;

    public final void finalize() throws Throwable {
        k.a(50331650, 0, this.LIZ, null, null);
        k.a(100663298, 0, this.LIZ, null, null);
        this.LIZ = -1L;
        super.finalize();
    }

    @Override // ms.bd.o.m2
    public final Object LIZJ(long j) {
        this.LIZ = j;
        a aVar = new a();
        synchronized (this) {
            try {
                C1494230ozF.LJIILJJIL = aVar;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return Boolean.TRUE;
    }

    public class a implements C08XC {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x015f A[RETURN] */
        @Override // X.C08XC
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.Map<java.lang.String, java.lang.String> onCallToAddSecurityFactor(java.lang.String r19, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r20) {
            /*
                Method dump skipped, instruction units count: 412
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.n2.a.onCallToAddSecurityFactor(java.lang.String, java.util.Map):java.util.Map");
        }
    }
}

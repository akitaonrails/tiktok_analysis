package cs.bd.o;

import X.C08XQ;
import X.C1494230ozF;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tts.mobsec.matrix.CSProxy;

/* JADX INFO: loaded from: classes4.dex */
public final class j1 extends h1 {
    public long LIZ;

    public class a implements C08XQ {
        public a() {
        }
    }

    public final void finalize() throws Throwable {
        CSProxy.a(50331650, 0, this.LIZ, null, null);
        CSProxy.a(100663298, 0, this.LIZ, null, null);
        this.LIZ = -1L;
        super.finalize();
    }

    @Override // cs.bd.o.h1
    public final Object LIZJ(long j) {
        this.LIZ = j;
        a aVar = new a();
        synchronized (this) {
            try {
                C1494230ozF.LJIILL = aVar;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return Boolean.TRUE;
    }
}

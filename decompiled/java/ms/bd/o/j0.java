package ms.bd.o;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        int size;
        boolean z;
        i2 i2VarLIZIZ = i2.LIZIZ(a.LIZIZ.LIZ);
        synchronized (i2VarLIZIZ) {
            if (!i2VarLIZIZ.LLILZ && i2VarLIZIZ.LLILLJJLI.isAlive()) {
                i2VarLIZIZ.LJ();
            }
            synchronized (i2VarLIZIZ.LLILZLL) {
                try {
                    size = i2VarLIZIZ.LLILZLL.size();
                    i2VarLIZIZ.LLJJI.LIZJ(i2VarLIZIZ.LLILZLL);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (size >= i2VarLIZIZ.LLJ && !i2VarLIZIZ.LLIZ) {
                z = true;
                i2VarLIZIZ.LLIZ = true;
            } else {
                z = i2VarLIZIZ.LLIZ;
            }
        }
        return Boolean.valueOf(z);
    }
}

package ms.bd.o;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class c3 {
    public static volatile c3 LIZJ;
    public int LIZ = 0;
    public Throwable LIZIZ = null;

    public static c3 LIZ() {
        if (LIZJ == null) {
            synchronized (c3.class) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new c3();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }
}

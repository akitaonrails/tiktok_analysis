package ms.bd.o;

import java.util.Arrays;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class o1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        Throwable th;
        c3 c3VarLIZ = c3.LIZ();
        synchronized (c3VarLIZ) {
            th = c3VarLIZ.LIZIZ;
        }
        if (th != null) {
            return Arrays.toString(th.getStackTrace());
        }
        return "";
    }
}

package ms.bd.o;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class v1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        try {
            return s2.LIZJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new ArrayList();
        }
    }
}

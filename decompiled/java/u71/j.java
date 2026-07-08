package u71;

import X.C0T9M;
import X.C0TLE;
import X.C1294250jmh;
import X.C785540Urg;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes13.dex */
public class j extends C0TLE {
    @Override // X.C0TLE
    public final C0T9M LIZ(String str, C785540Urg c785540Urg) {
        try {
            C0T9M c0t9m = new C0T9M(c785540Urg);
            C1294250jmh.LJII(str, null).LIZIZ(c0t9m);
            return c0t9m;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}

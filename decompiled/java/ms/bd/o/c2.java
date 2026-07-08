package ms.bd.o;

import X.C838410Wul;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class c2 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        int i2;
        Context context = a.LIZIZ.LIZ;
        String[] strArr = q2.LIZ;
        try {
            i2 = 2;
            if (C838410Wul.LIZ(context, (String) k.a(16777217, 0, 0L, "b7cdb7", new byte[]{114, 59, 20, 2, 82, 41, 101, 88, 34, 49, 97, 56, 25, 3, 78, 41, 110, 24, 124, 6, 86, 22, 63, 34, 121, 31, 64, 35, 22, 29, 92})) != 0) {
                i2 = 3;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            i2 = -1;
        }
        return Integer.valueOf(i2);
    }
}

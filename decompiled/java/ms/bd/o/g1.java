package ms.bd.o;

import X.C786410Ut5;
import android.content.Intent;
import android.content.IntentFilter;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class g1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) throws Exception {
        Intent intentLJIJJ = C786410Ut5.LJIJJ(z2.LIZ(a.LIZIZ.LIZ).LIZ, null, new IntentFilter((String) k.a(16777217, 0, 0L, "f51b54", new byte[]{118, 57, 70, 4, 5, 42, 97, 90, 105, 60, 99, 50, 76, 2, 68, 34, 102, 0, 105, 61, 121, 121, 96, 55, 62, 23, 64, 38, 89, 13, 84, 31, 99, 56, 45, 6, 65})));
        int i2 = -1;
        if (intentLJIJJ != null) {
            int intExtra = intentLJIJJ.getIntExtra((String) k.a(16777217, 0, 0L, "f045c7", new byte[]{100, 38, 70, 85, 73, 51}), -1);
            if (intExtra != 2 && intExtra != 5) {
                i2 = 0;
            } else {
                i2 = 1;
            }
        }
        return Integer.valueOf(i2);
    }
}

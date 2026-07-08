package ms.bd.o;

import X.C786410Ut5;
import android.telephony.TelephonyManager;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class d1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        Boolean bool = Boolean.FALSE;
        TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(a.LIZIZ.LIZ, (String) k.a(16777217, 0, 0L, "41c7e1", new byte[]{53, 59, 31, 77, 95}));
        if (telephonyManager != null && telephonyManager.getSimState() == 5) {
            return Boolean.TRUE;
        }
        return bool;
    }
}

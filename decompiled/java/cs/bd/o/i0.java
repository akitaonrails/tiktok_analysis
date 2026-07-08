package cs.bd.o;

import X.C08PQ;
import X.C2110608Oq;
import X.C786410Ut5;
import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 extends C08PQ {
    @Override // X.C08PQ
    public final Object LIZ(long j, String str, Object obj) {
        Boolean bool = Boolean.FALSE;
        TelephonyManager telephonyManager = (TelephonyManager) C786410Ut5.H2(C786410Ut5.N3(C2110608Oq.LIZIZ.LIZ), "phone");
        return (telephonyManager == null || telephonyManager.getSimState() != 5) ? bool : Boolean.TRUE;
    }
}

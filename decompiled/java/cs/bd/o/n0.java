package cs.bd.o;

import X.C08PQ;
import X.C08XO;
import X.C2110608Oq;
import X.C786410Ut5;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends C08PQ {
    @Override // X.C08PQ
    public final Object LIZ(long j, String str, Object obj) throws Exception {
        Intent intentLJIJJ = C786410Ut5.LJIJJ(C08XO.LIZ(C2110608Oq.LIZIZ.LIZ).LIZ, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int intExtra = -1;
        if (intentLJIJJ != null) {
            intExtra = intentLJIJJ.getIntExtra("plugged", -1);
        }
        return Integer.valueOf(intExtra);
    }
}

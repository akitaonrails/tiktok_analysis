package cs.bd.o;

import X.C08PQ;
import X.C08XO;
import X.C2110608Oq;
import X.C786410Ut5;
import android.content.Intent;
import android.content.IntentFilter;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends C08PQ {
    @Override // X.C08PQ
    public final Object LIZ(long j, String str, Object obj) throws Exception {
        Intent intentLJIJJ = C786410Ut5.LJIJJ(C08XO.LIZ(C2110608Oq.LIZIZ.LIZ).LIZ, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        int i = -1;
        if (intentLJIJJ != null) {
            int intExtra = intentLJIJJ.getIntExtra(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, -1);
            if (intExtra != 2 && intExtra != 5) {
                i = 0;
            } else {
                i = 1;
            }
        }
        return Integer.valueOf(i);
    }
}

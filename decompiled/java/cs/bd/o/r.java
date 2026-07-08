package cs.bd.o;

import X.C08PQ;
import X.C2110608Oq;
import android.provider.Settings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends C08PQ {
    @Override // X.C08PQ
    public final Object LIZ(long j, String str, Object obj) {
        int i;
        try {
            boolean z = false;
            i = 1;
            if (Settings.Global.getInt(C2110608Oq.LIZIZ.LIZ.getContentResolver(), "airplane_mode_on", 0) != 0) {
                z = true;
            }
            if (z) {
                i = 2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            i = -1;
        }
        return Integer.valueOf(i);
    }
}

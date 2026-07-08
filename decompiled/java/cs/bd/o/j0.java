package cs.bd.o;

import X.C08PQ;
import X.C08XO;
import X.C2110608Oq;
import X.C786410Ut5;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 extends C08PQ {
    @Override // X.C08PQ
    public final Object LIZ(long j, String str, Object obj) {
        int i;
        int intExtra;
        int iLIZIZ;
        C08XO c08xoLIZ = C08XO.LIZ(C2110608Oq.LIZIZ.LIZ);
        c08xoLIZ.getClass();
        try {
            synchronized (c08xoLIZ) {
                try {
                    Intent intentLJIJJ = C786410Ut5.LJIJJ(c08xoLIZ.LIZ, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    intExtra = -1;
                    if (intentLJIJJ != null) {
                        intExtra = intentLJIJJ.getIntExtra("plugged", -1);
                    }
                    iLIZIZ = c08xoLIZ.LIZIZ();
                } finally {
                }
            }
            i = (intExtra * 10000) + iLIZIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            i = -10001;
        } catch (Throwable th) {
            throw th;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf != null) {
            ((ArrayList) c08xoLIZ.LIZIZ).add(numValueOf);
            try {
                int size = ((ArrayList) c08xoLIZ.LIZIZ).size();
                if (size > 20) {
                    ArrayList arrayList = new ArrayList(((ArrayList) c08xoLIZ.LIZIZ).subList(size - 10, size));
                    ((ArrayList) c08xoLIZ.LIZIZ).clear();
                    c08xoLIZ.LIZIZ = arrayList;
                    return null;
                }
            } catch (Throwable th2) {
            }
        }
        return null;
    }
}

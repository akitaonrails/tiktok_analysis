package cs.bd.o;

import X.C08P2;
import X.C08PQ;
import X.C2110608Oq;
import X.C786410Ut5;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends C08PQ {
    @Override // X.C08PQ
    public final Object LIZ(long j, String str, Object obj) {
        Context context = C2110608Oq.LIZIZ.LIZ;
        if (C08P2.LIZ <= 0) {
            try {
                C08P2.LIZ = C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 0).versionCode;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return Integer.toString(C08P2.LIZ);
    }
}

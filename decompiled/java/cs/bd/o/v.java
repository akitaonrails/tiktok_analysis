package cs.bd.o;

import X.C08PQ;
import X.C0WZX;
import X.C2110608Oq;
import X.C2204961BRm;
import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends C08PQ {
    @Override // X.C08PQ
    public final Object LIZ(long j, String str, Object obj) {
        String str2 = null;
        try {
            Locale locale = C2110608Oq.LIZIZ.LIZ.getResources().getConfiguration().locale;
            str2 = C786410Ut5.t2(locale) + "_" + C2204961BRm.g0(locale, new C0WZX("dywwXgZ0UITK", null));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return n.LIZ(str2);
    }
}

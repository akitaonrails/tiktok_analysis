package ms.bd.o;

import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        String string = null;
        try {
            Locale locale = a.LIZIZ.LIZ.getResources().getConfiguration().locale;
            String strT2 = C786410Ut5.t2(locale);
            String strG0 = C2204961BRm.g0(locale, new C0WZX("eSwwXgZ0UITdBA==", null));
            StringBuilder sb = new StringBuilder();
            sb.append(strT2);
            sb.append((String) k.a(16777217, 0, 0L, "a294b8", new byte[]{79}));
            sb.append(strG0);
            string = sb.toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return d3.LIZ(string);
    }
}

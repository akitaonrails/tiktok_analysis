package cs.bd.o;

import X.C08PQ;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class v0 extends C08PQ {
    @Override // X.C08PQ
    public final Object LIZ(long j, String str, Object obj) {
        try {
            Method method = Class.forName("com.tts.mobsec.sensor.ml.CSB").getMethod("a", new Class[0]);
            if (method != null) {
                return (Long) method.invoke(null, new Object[0]);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return null;
    }
}

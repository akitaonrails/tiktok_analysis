package cs.bd.o;

import X.C08PQ;
import X.C0WZX;
import X.C2110608Oq;
import X.C2204961BRm;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class z0 extends C08PQ {
    @Override // X.C08PQ
    public final Object LIZ(long j, String str, Object obj) {
        double dDoubleValue;
        Context context = C2110608Oq.LIZIZ.LIZ;
        try {
            Class<?> cls = Class.forName(new String(n.LIZJ("636f6d2e616e64726f69642e696e7465726e616c2e6f732e506f77657250726f66696c65")));
            Object objNewInstance = cls.getConstructor(Context.class).newInstance(context);
            Method declaredMethod = cls.getDeclaredMethod(new String(n.LIZJ("67657441766572616765506f776572")), String.class);
            declaredMethod.setAccessible(true);
            dDoubleValue = ((Double) C2204961BRm.a0(declaredMethod, objNewInstance, new Object[]{new String(n.LIZJ("626174746572792e6361706163697479"))}, new C0WZX("dywwXgZ0UITGBQ==", null))).doubleValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            dDoubleValue = 0.0d;
        }
        return Integer.toString((int) dDoubleValue);
    }
}

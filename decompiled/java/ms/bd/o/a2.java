package ms.bd.o;

import X.C0WZX;
import X.C2204961BRm;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class a2 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        double dDoubleValue;
        Context context = a.LIZIZ.LIZ;
        try {
            Class<?> cls = Class.forName(new String(z.LIZIZ((String) k.a(16777217, 0, 0L, "4067c8", new byte[]{115, 97, 19, 69, 10, 43, 101, 20, 49, 54, 115, 55, 19, 23, 11, 125, 97, 23, 49, 62, 115, 102, 23, 70, 10, 118, 97, 20, 48, 51, 115, 103, 18, 17, 10, 42, 97, 64, 49, 100, 119, 55, 19, 69, 11, 124, 101, 20, 50, 55, 115, 52, 18, 20, 10, 122, 96, 67, 50, 55, 114, 96, 19, 69, 10, 121, 97, 72, 49, 100, 115, 103}))));
            Object objNewInstance = cls.getConstructor(Context.class).newInstance(context);
            Method declaredMethod = cls.getDeclaredMethod(new String(z.LIZIZ((String) k.a(16777217, 0, 0L, "e6805e", new byte[]{34, 99, 29, 17, 93, 38, 50, 70, 62, 54, 34, 97, 28, 22, 92, 35, 48, 64, 63, 53, 33, 100, 29, 66, 93, 37, 48, 66, 62, 50}))), String.class);
            declaredMethod.setAccessible(true);
            Object[] objArr = new Object[1];
            objArr[0] = new String(z.LIZIZ((String) k.a(16777217, 0, 0L, "12e6e6", new byte[]{118, 98, 64, 19, 13, 117, 101, 71, 98, 51, 119, 98, 65, 27, 8, 36, 100, 64, 98, 55, 119, 96, 64, 19, 12, 114, 100, 74, 99, 50, 119, 105})));
            dDoubleValue = ((Double) C2204961BRm.a0(declaredMethod, objNewInstance, objArr, new C0WZX("eSwwXgZ0UITdBw==", null))).doubleValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            dDoubleValue = 0.0d;
        }
        return Integer.toString((int) dDoubleValue);
    }
}

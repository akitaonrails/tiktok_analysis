package ms.bd.o;

import X.C0WZX;
import X.C2204961BRm;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        try {
            Class<?> cls = Class.forName((String) k.a(16777217, 0, 0L, "478085", new byte[]{38, 58, 70, 10, 20, 49, 121, 23, 103, 100, 55, 58, 66, 64, 73, 55, 48, 21, 39, 113, 48, 58, 95, 69, 73, 0, 19, 56, 108, 116, 50, 58, 89, 79, 51, 35, 48, 53, 102, 110, 49, 48, 83, 80, 55, 48, 56, 0, 96, 100, 32, 39, 106, 64, 6, 50, 35, 19, 123}));
            Method declaredMethod = cls.getDeclaredMethod((String) k.a(16777217, 0, 0L, "10e50a", new byte[]{45, 51, 4, 74, 46, 101, 28, 20, 35, 80, 51, 55, 4}), new Class[0]);
            declaredMethod.setAccessible(true);
            Object objNewInstance = cls.newInstance();
            if (objNewInstance != null ? ((Boolean) C2204961BRm.a0(declaredMethod, objNewInstance, new Object[0], new C0WZX("eSwwXgZ0UITV", null))).booleanValue() : false) {
                return (String) k.a(16777217, 0, 0L, "77defc", new byte[]{40, 48, 0, 36, 74, 113, 38});
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            k.a(16777217, 0, 0L, "44d0a7", new byte[]{34, 55, 17});
            return null;
        }
    }
}

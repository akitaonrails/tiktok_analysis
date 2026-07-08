package ms.bd.o;

import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import ms.bd.o.b;

/* JADX INFO: loaded from: classes4.dex */
public final class p1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) throws ClassNotFoundException {
        Throwable th;
        c3 c3VarLIZ = c3.LIZ();
        synchronized (c3VarLIZ) {
            th = c3VarLIZ.LIZIZ;
        }
        if (th == null) {
            return null;
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace.length < 4) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 1; i2 < 4; i2++) {
            StackTraceElement stackTraceElement = stackTrace[i2];
            if (stackTraceElement != null && !TextUtils.isEmpty(stackTraceElement.getClassName())) {
                Class<?> cls = Class.forName(stackTrace[i2].getClassName());
                c3 c3VarLIZ2 = c3.LIZ();
                String methodName = stackTrace[i2].getMethodName();
                c3VarLIZ2.getClass();
                ArrayList arrayList2 = new ArrayList();
                if (!TextUtils.isEmpty(methodName)) {
                    Method[] declaredMethods = cls.getDeclaredMethods();
                    for (Method method : declaredMethods) {
                        if (method != null && method.getName().equals(methodName)) {
                            arrayList2.add(method);
                        }
                    }
                }
                arrayList.addAll(arrayList2);
            }
        }
        return arrayList;
    }
}

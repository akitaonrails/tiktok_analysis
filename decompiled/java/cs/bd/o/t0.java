package cs.bd.o;

import X.C08PQ;
import X.C08XN;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class t0 extends C08PQ {
    @Override // X.C08PQ
    public final Object LIZ(long j, String str, Object obj) throws ClassNotFoundException {
        Throwable th;
        C08XN c08xnLIZ = C08XN.LIZ();
        synchronized (c08xnLIZ) {
            th = c08xnLIZ.LIZIZ;
        }
        if (th == null) {
            return null;
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace.length < 4) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i < 4; i++) {
            StackTraceElement stackTraceElement = stackTrace[i];
            if (stackTraceElement != null && !TextUtils.isEmpty(stackTraceElement.getClassName())) {
                Class<?> cls = Class.forName(stackTrace[i].getClassName());
                C08XN c08xnLIZ2 = C08XN.LIZ();
                String methodName = stackTrace[i].getMethodName();
                c08xnLIZ2.getClass();
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

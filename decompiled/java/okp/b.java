package okp;

import X.AbstractC23273099z;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends AbstractC23273099z implements CoroutineExceptionHandler {
    public volatile Object _preHandler;

    public b() {
        super(CoroutineExceptionHandler.LJJLIL);
        this._preHandler = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJJ(kotlin.coroutines.CoroutineContext r6, java.lang.Throwable r7) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            r5 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            r4 = 0
            if (r0 > r1) goto L29
            r0 = 28
            if (r1 >= r0) goto L29
            java.lang.Object r1 = r5._preHandler
            r3 = 0
            if (r1 == r5) goto L2a
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
        L12:
            if (r1 == 0) goto L1a
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.Object r3 = r1.invoke(r3, r0)
        L1a:
            boolean r0 = r3 instanceof java.lang.Thread.UncaughtExceptionHandler
            if (r0 == 0) goto L29
            java.lang.Thread$UncaughtExceptionHandler r3 = (java.lang.Thread.UncaughtExceptionHandler) r3
            if (r3 == 0) goto L29
            java.lang.Thread r0 = X.C786410Ut5.u3()
            r3.uncaughtException(r0, r7)
        L29:
            return
        L2a:
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r1 = "getUncaughtExceptionPreHandler"
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L49
            java.lang.reflect.Method r1 = r2.getDeclaredMethod(r1, r0)     // Catch: java.lang.Throwable -> L49
            int r0 = r1.getModifiers()     // Catch: java.lang.Throwable -> L49
            boolean r0 = java.lang.reflect.Modifier.isPublic(r0)     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L49
            int r0 = r1.getModifiers()     // Catch: java.lang.Throwable -> L49
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L49
            goto L4a
        L49:
            r1 = r3
        L4a:
            r5._preHandler = r1
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: okp.b.LJJ(kotlin.coroutines.CoroutineContext, java.lang.Throwable):void");
    }
}

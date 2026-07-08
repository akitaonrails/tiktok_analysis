package okhttp3.internal.connection;

import X.C1495520p1K;
import X.InterfaceC836900WsK;

/* JADX INFO: loaded from: classes24.dex */
public final class ConnectInterceptor implements InterfaceC836900WsK {
    public final C1495520p1K LIZ;

    public ConnectInterceptor(C1495520p1K c1495520p1K) {
        this.LIZ = c1495520p1K;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    @Override // X.InterfaceC836900WsK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0XLY intercept(X.C0X0W r15) {
        /*
            r14 = this;
            r4 = r15
            X.0p18 r4 = (X.C1495400p18) r4
            okhttp3.Request r3 = r4.LJFF
            X.0p1B r7 = r4.LIZIZ
            java.lang.String r1 = r3.method()
            java.lang.String r0 = "GET"
            boolean r0 = r1.equals(r0)
            r13 = r0 ^ 1
            X.0p1K r1 = r14.LIZ
            r7.getClass()
            r0 = r15
            X.0p18 r0 = (X.C1495400p18) r0
            int r8 = r0.LJIIIIZZ
            int r9 = r0.LJIIIZ
            int r10 = r0.LJIIJ
            int r11 = r1.LLJJL
            X.0p1Q r0 = r7.LJ
            if (r0 == 0) goto L8f
            okhttp3.Request r0 = r0.request()
            if (r0 == 0) goto L8f
            X.0p1Q r0 = r7.LJ
            okhttp3.Request r0 = r0.request()
            X.0XLQ r0 = r0.url()
            if (r0 == 0) goto L8f
            X.0p1Q r0 = r7.LJ
            okhttp3.Request r0 = r0.request()
            X.0XLQ r0 = r0.url()
            java.lang.String r0 = r0.LIZLLL
            if (r0 == 0) goto L8f
            X.0p1Q r0 = r7.LJ
            okhttp3.Request r0 = r0.request()
            X.0XLQ r0 = r0.url()
            java.lang.String r6 = r0.LIZLLL
            X.0p1Q r0 = r7.LJ
            okhttp3.Request r0 = r0.request()
            X.0XLQ r0 = r0.url()
            int r2 = r0.LJ
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L92
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            java.lang.String r0 = ":"
            r5.append(r0)
            r5.append(r2)
            X.0osn r0 = X.C1490230osn.LIZIZ()
            java.util.concurrent.CopyOnWriteArrayList<java.lang.String> r2 = r0.LIZIZ
            java.lang.String r0 = r5.toString()
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L92
            X.0osn r0 = X.C1490230osn.LIZIZ()
            java.util.concurrent.atomic.AtomicInteger r0 = r0.LIZ
            int r11 = r0.get()
        L8f:
            boolean r12 = r1.LLJJJ
            goto L95
        L92:
            int r11 = r1.LLJJL
            goto L8f
        L95:
            X.0p1X r0 = r7.LJ(r8, r9, r10, r11, r12, r13)     // Catch: java.io.IOException -> Lb4
            X.0p18 r15 = (X.C1495400p18) r15     // Catch: java.io.IOException -> Lb4
            X.0p19 r2 = r0.LJIIIIZZ(r1, r15, r7)     // Catch: java.io.IOException -> Lb4
            X.0p1C r1 = r7.LIZLLL     // Catch: java.io.IOException -> Lb4
            monitor-enter(r1)     // Catch: java.io.IOException -> Lb4
            r7.LJIILJJIL = r2     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lae
            X.0p1X r0 = r7.LIZIZ()
            X.0XLY r0 = r4.LJ(r3, r7, r2, r0)
            return r0
        Lae:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lae
            throw r0     // Catch: java.io.IOException -> Lb4
        Lb4:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.0XLZ r0 = new X.0XLZ
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.ConnectInterceptor.intercept(X.0X0W):X.0XLY");
    }
}

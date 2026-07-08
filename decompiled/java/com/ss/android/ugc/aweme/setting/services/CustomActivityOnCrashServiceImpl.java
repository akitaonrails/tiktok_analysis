package com.ss.android.ugc.aweme.setting.services;

import com.ss.android.ugc.customactivityoncrash_base.ICustomActivityOnCrashService;

/* JADX INFO: loaded from: classes4.dex */
public class CustomActivityOnCrashServiceImpl implements ICustomActivityOnCrashService {
    public final ICustomActivityOnCrashService LIZ;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r0 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        throw new java.lang.RuntimeException("cannot find service in com.ss.android.ugc.customactivityoncrash_implement.CustomActivityOnCrashService  or cannot create service through ".concat(X.C2039507yr.class.getSimpleName()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CustomActivityOnCrashServiceImpl() {
        /*
            r7 = this;
            r7.<init>()
            java.lang.String r0 = "com.ss.android.ugc.customactivityoncrash_implement.CustomActivityOnCrashService"
            java.lang.Class<X.07yr> r6 = X.C2039507yr.class
            com.bytedance.common.utility.reflect.Reflect r0 = com.bytedance.common.utility.reflect.Reflect.on(r0)     // Catch: java.lang.Throwable -> L16
            com.bytedance.common.utility.reflect.Reflect r0 = r0.create()     // Catch: java.lang.Throwable -> L16
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L16
            if (r0 != 0) goto L39
            goto L1a
        L16:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L1a:
            java.lang.reflect.Constructor[] r5 = r6.getDeclaredConstructors()
            int r4 = r5.length
            r3 = 0
            r2 = 0
        L21:
            if (r2 >= r4) goto L3e
            r1 = r5[r2]
            r0 = 1
            r1.setAccessible(r0)     // Catch: java.lang.Throwable -> L30
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L30
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.Throwable -> L30
            goto L37
        L30:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            int r2 = r2 + 1
            goto L21
        L37:
            if (r0 == 0) goto L3e
        L39:
            com.ss.android.ugc.customactivityoncrash_base.ICustomActivityOnCrashService r0 = (com.ss.android.ugc.customactivityoncrash_base.ICustomActivityOnCrashService) r0
            r7.LIZ = r0
            return
        L3e:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r1 = r6.getSimpleName()
            java.lang.String r0 = "cannot find service in com.ss.android.ugc.customactivityoncrash_implement.CustomActivityOnCrashService  or cannot create service through "
            java.lang.String r0 = r0.concat(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.setting.services.CustomActivityOnCrashServiceImpl.<init>():void");
    }
}

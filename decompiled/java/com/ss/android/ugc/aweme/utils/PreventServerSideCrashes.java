package com.ss.android.ugc.aweme.utils;

import X.C085N;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC20234614Fk;
import X.InterfaceC799590VYf;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
@InterfaceC20234614Fk
public class PreventServerSideCrashes implements C0CCZ, InterfaceC799590VYf {
    public static Activity LL;
    public static boolean LLILLJJLI;
    public static final CopyOnWriteArrayList<C085N> LLILLL = new CopyOnWriteArrayList<>();
    public static Field LLILZ;
    public static Object LLILZIL;
    public static Object LLILZLL;

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "PreventServerSideCrashes";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0038 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized void LIZ() {
        /*
            java.lang.Class<com.ss.android.ugc.aweme.utils.PreventServerSideCrashes> r6 = com.ss.android.ugc.aweme.utils.PreventServerSideCrashes.class
            monitor-enter(r6)
            boolean r0 = com.ss.android.ugc.aweme.utils.PreventServerSideCrashes.LLILLJJLI     // Catch: java.lang.Throwable -> Lac
            if (r0 == 0) goto L9
            monitor-exit(r6)
            return
        L9:
            r5 = 1
            com.ss.android.ugc.aweme.utils.PreventServerSideCrashes.LLILLJJLI = r5     // Catch: java.lang.Throwable -> Lac
            boolean r0 = X.C1954407l8.LIZIZ     // Catch: java.lang.Throwable -> Lac
            r2 = 0
            if (r0 != 0) goto L32
            java.lang.Class<X.085P> r3 = X.C085P.class
            java.lang.String r1 = "classLoader"
            java.lang.Class r0 = r3.getClass()     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> Lac
            java.lang.reflect.Field r1 = X.C1954407l8.LIZ(r0, r1)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> Lac
            if (r1 == 0) goto L30
            boolean r0 = r1.isAccessible()     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> Lac
            if (r0 != 0) goto L28
            r1.setAccessible(r5)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> Lac
        L28:
            r1.set(r3, r2)     // Catch: java.lang.Exception -> L2c java.lang.Throwable -> Lac
            goto L30
        L2c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lac
        L30:
            X.C1954407l8.LIZIZ = r5     // Catch: java.lang.Throwable -> Lac
        L32:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lac
            r0 = 28
            if (r1 <= r0) goto L3a
            monitor-exit(r6)
            return
        L3a:
            r0 = 26
            if (r1 >= r0) goto L4b
            java.lang.String r0 = "android.app.ActivityManagerNative"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.IllegalAccessException -> L9c java.lang.NoSuchFieldException -> La1 java.lang.ClassNotFoundException -> La6 java.lang.Throwable -> Lac
            java.lang.String r0 = "gDefault"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.IllegalAccessException -> L9c java.lang.NoSuchFieldException -> La1 java.lang.ClassNotFoundException -> La6 java.lang.Throwable -> Lac
            goto L57
        L4b:
            java.lang.String r0 = "android.app.ActivityManager"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.IllegalAccessException -> L9c java.lang.NoSuchFieldException -> La1 java.lang.ClassNotFoundException -> La6 java.lang.Throwable -> Lac
            java.lang.String r0 = "IActivityManagerSingleton"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.IllegalAccessException -> L9c java.lang.NoSuchFieldException -> La1 java.lang.ClassNotFoundException -> La6 java.lang.Throwable -> Lac
        L57:
            r0.setAccessible(r5)     // Catch: java.lang.IllegalAccessException -> L9c java.lang.NoSuchFieldException -> La1 java.lang.ClassNotFoundException -> La6 java.lang.Throwable -> Lac
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.IllegalAccessException -> L9c java.lang.NoSuchFieldException -> La1 java.lang.ClassNotFoundException -> La6 java.lang.Throwable -> Lac
            com.ss.android.ugc.aweme.utils.PreventServerSideCrashes.LLILZIL = r0     // Catch: java.lang.IllegalAccessException -> L9c java.lang.NoSuchFieldException -> La1 java.lang.ClassNotFoundException -> La6 java.lang.Throwable -> Lac
            java.lang.String r0 = "android.util.Singleton"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.IllegalAccessException -> L9c java.lang.NoSuchFieldException -> La1 java.lang.ClassNotFoundException -> La6 java.lang.Throwable -> Lac
            java.lang.String r0 = "mInstance"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.IllegalAccessException -> L9c java.lang.NoSuchFieldException -> La1 java.lang.ClassNotFoundException -> La6 java.lang.Throwable -> Lac
            com.ss.android.ugc.aweme.utils.PreventServerSideCrashes.LLILZ = r0     // Catch: java.lang.IllegalAccessException -> L9c java.lang.NoSuchFieldException -> La1 java.lang.ClassNotFoundException -> La6 java.lang.Throwable -> Lac
            r0.setAccessible(r5)     // Catch: java.lang.IllegalAccessException -> L9c java.lang.NoSuchFieldException -> La1 java.lang.ClassNotFoundException -> La6 java.lang.Throwable -> Lac
            java.lang.reflect.Field r1 = com.ss.android.ugc.aweme.utils.PreventServerSideCrashes.LLILZ     // Catch: java.lang.IllegalAccessException -> L9c java.lang.NoSuchFieldException -> La1 java.lang.ClassNotFoundException -> La6 java.lang.Throwable -> Lac
            java.lang.Object r0 = com.ss.android.ugc.aweme.utils.PreventServerSideCrashes.LLILZIL     // Catch: java.lang.IllegalAccessException -> L9c java.lang.NoSuchFieldException -> La1 java.lang.ClassNotFoundException -> La6 java.lang.Throwable -> Lac
            java.lang.Object r4 = r1.get(r0)     // Catch: java.lang.IllegalAccessException -> L9c java.lang.NoSuchFieldException -> La1 java.lang.ClassNotFoundException -> La6 java.lang.Throwable -> Lac
            if (r4 != 0) goto L7d
            monitor-exit(r6)
            return
        L7d:
            java.lang.String r0 = "android.app.IActivityManager"
            java.lang.Class r3 = java.lang.Class.forName(r0)     // Catch: java.lang.IllegalAccessException -> L9c java.lang.NoSuchFieldException -> La1 java.lang.ClassNotFoundException -> La6 java.lang.Throwable -> Lac
            java.lang.Thread r0 = X.C786410Ut5.u3()     // Catch: java.lang.IllegalAccessException -> L9c java.lang.NoSuchFieldException -> La1 java.lang.ClassNotFoundException -> La6 java.lang.Throwable -> Lac
            java.lang.ClassLoader r2 = r0.getContextClassLoader()     // Catch: java.lang.IllegalAccessException -> L9c java.lang.NoSuchFieldException -> La1 java.lang.ClassNotFoundException -> La6 java.lang.Throwable -> Lac
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch: java.lang.IllegalAccessException -> L9c java.lang.NoSuchFieldException -> La1 java.lang.ClassNotFoundException -> La6 java.lang.Throwable -> Lac
            r0 = 0
            r1[r0] = r3     // Catch: java.lang.IllegalAccessException -> L9c java.lang.NoSuchFieldException -> La1 java.lang.ClassNotFoundException -> La6 java.lang.Throwable -> Lac
            X.085M r0 = new X.085M     // Catch: java.lang.IllegalAccessException -> L9c java.lang.NoSuchFieldException -> La1 java.lang.ClassNotFoundException -> La6 java.lang.Throwable -> Lac
            r0.<init>()     // Catch: java.lang.IllegalAccessException -> L9c java.lang.NoSuchFieldException -> La1 java.lang.ClassNotFoundException -> La6 java.lang.Throwable -> Lac
            java.lang.Object r0 = java.lang.reflect.Proxy.newProxyInstance(r2, r1, r0)     // Catch: java.lang.IllegalAccessException -> L9c java.lang.NoSuchFieldException -> La1 java.lang.ClassNotFoundException -> La6 java.lang.Throwable -> Lac
            com.ss.android.ugc.aweme.utils.PreventServerSideCrashes.LLILZLL = r0     // Catch: java.lang.IllegalAccessException -> L9c java.lang.NoSuchFieldException -> La1 java.lang.ClassNotFoundException -> La6 java.lang.Throwable -> Lac
            goto Laa
        L9c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lac
            goto Laa
        La1:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lac
            goto Laa
        La6:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lac
        Laa:
            monitor-exit(r6)
            return
        Lac:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.PreventServerSideCrashes.LIZ():void");
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        LIZ();
    }
}

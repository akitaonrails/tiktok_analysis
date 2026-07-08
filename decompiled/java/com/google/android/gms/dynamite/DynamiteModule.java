package com.google.android.gms.dynamite;

import X.C0W0T;
import X.C0W3J;
import X.C0WH8;
import X.C786410Ut5;
import X.C828640Wf0;
import X.C828650Wf1;
import X.C828680Wf4;
import X.C828690Wf5;
import X.C829100Wfk;
import X.C829340Wg8;
import X.C829350Wg9;
import X.C829360WgA;
import X.InterfaceC828670Wf3;
import X.InterfaceC829420WgG;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes14.dex */
public final class DynamiteModule {
    public static Boolean LJ = null;
    public static String LJFF = null;
    public static boolean LJI = false;
    public static int LJII = -1;
    public static Boolean LJIIIIZZ;
    public static C828640Wf0 LJIIL;
    public static C828650Wf1 LJIILIIL;
    public final Context LIZ;
    public static final ThreadLocal LJIIIZ = new ThreadLocal();
    public static final C828690Wf5 LJIIJ = new ThreadLocal() { // from class: X.0Wf5
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ Object initialValue() {
            return 0L;
        }
    };
    public static final C828680Wf4 LJIIJJI = new InterfaceC829420WgG() { // from class: X.0Wf4
        @Override // X.InterfaceC829420WgG
        public final int LIZIZ(Context context, String str) {
            return DynamiteModule.LIZ(context, str);
        }

        @Override // X.InterfaceC829420WgG
        public final int LIZ(Context context, String str, boolean z) {
            return DynamiteModule.LIZLLL(context, str, z);
        }
    };
    public static final C829340Wg8 LIZIZ = new InterfaceC828670Wf3() { // from class: X.0Wg8
        @Override // X.InterfaceC828670Wf3
        public final C829410WgF LIZ(Context context, String str, InterfaceC829420WgG interfaceC829420WgG) {
            C829410WgF c829410WgF = new C829410WgF();
            int iLIZ = interfaceC829420WgG.LIZ(context, str, true);
            c829410WgF.LIZIZ = iLIZ;
            if (iLIZ != 0) {
                c829410WgF.LIZJ = 1;
            } else {
                int iLIZIZ = interfaceC829420WgG.LIZIZ(context, str);
                c829410WgF.LIZ = iLIZIZ;
                if (iLIZIZ != 0) {
                    c829410WgF.LIZJ = -1;
                    return c829410WgF;
                }
            }
            return c829410WgF;
        }
    };
    public static final C829350Wg9 LIZJ = new InterfaceC828670Wf3() { // from class: X.0Wg9
        @Override // X.InterfaceC828670Wf3
        public final C829410WgF LIZ(Context context, String str, InterfaceC829420WgG interfaceC829420WgG) {
            C829410WgF c829410WgF = new C829410WgF();
            c829410WgF.LIZ = interfaceC829420WgG.LIZIZ(context, str);
            int iLIZ = interfaceC829420WgG.LIZ(context, str, true);
            c829410WgF.LIZIZ = iLIZ;
            int i = c829410WgF.LIZ;
            if (i == 0) {
                i = 0;
                if (iLIZ == 0) {
                    c829410WgF.LIZJ = 0;
                    return c829410WgF;
                }
            }
            if (i >= iLIZ) {
                c829410WgF.LIZJ = -1;
                return c829410WgF;
            }
            c829410WgF.LIZJ = 1;
            return c829410WgF;
        }
    };
    public static final C829360WgA LIZLLL = new InterfaceC828670Wf3() { // from class: X.0WgA
        @Override // X.InterfaceC828670Wf3
        public final C829410WgF LIZ(Context context, String str, InterfaceC829420WgG interfaceC829420WgG) {
            int iLIZ;
            C829410WgF c829410WgF = new C829410WgF();
            int iLIZIZ = interfaceC829420WgG.LIZIZ(context, str);
            c829410WgF.LIZ = iLIZIZ;
            int i = 0;
            if (iLIZIZ != 0) {
                iLIZ = interfaceC829420WgG.LIZ(context, str, false);
                c829410WgF.LIZIZ = iLIZ;
            } else {
                iLIZ = interfaceC829420WgG.LIZ(context, str, true);
                c829410WgF.LIZIZ = iLIZ;
            }
            int i2 = c829410WgF.LIZ;
            if (i2 == 0) {
                if (iLIZ == 0) {
                    c829410WgF.LIZJ = 0;
                    return c829410WgF;
                }
            } else {
                i = i2;
            }
            if (i >= iLIZ) {
                c829410WgF.LIZJ = -1;
                return c829410WgF;
            }
            c829410WgF.LIZJ = 1;
            return c829410WgF;
        }
    };

    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public DynamiteModule(Context context) {
        C0W3J.LJIIIIZZ(context);
        this.LIZ = context;
    }

    public static void LJFF(ClassLoader classLoader) throws C0WH8 {
        C828650Wf1 c828650Wf1;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                c828650Wf1 = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (iInterfaceQueryLocalInterface instanceof C828650Wf1) {
                    c828650Wf1 = (C828650Wf1) iInterfaceQueryLocalInterface;
                } else {
                    c828650Wf1 = new C828650Wf1(iBinder);
                }
            }
            LJIILIIL = c828650Wf1;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C0WH8("Failed to instantiate dynamite loader", e);
        }
    }

    public static boolean LJI(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(LJIIIIZZ)) {
            return true;
        }
        boolean zBooleanValue = false;
        if (LJIIIIZZ == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (C829100Wfk.getInstance().isGooglePlayServicesAvailable(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                zBooleanValue = true;
            }
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            LJIIIIZZ = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
            if (zBooleanValue && providerInfoResolveContentProvider != null && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                LJI = true;
            }
        }
        return zBooleanValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r1 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C828640Wf0 LJII(android.content.Context r5) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r4 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r4)
            X.0Wf0 r0 = com.google.android.gms.dynamite.DynamiteModule.LJIIL     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L9
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L45
            return r0
        L9:
            r3 = 0
            java.lang.String r1 = "com.google.android.gms"
            r0 = 3
            android.content.Context r0 = X.C786410Ut5.m4(r5, r0, r1)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L45
            java.lang.ClassLoader r1 = r0.getClassLoader()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L45
            java.lang.String r0 = "com.google.android.gms.chimera.container.DynamiteLoaderImpl"
            java.lang.Class r0 = r1.loadClass(r0)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L45
            java.lang.Object r2 = r0.newInstance()     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L45
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L45
            if (r2 == 0) goto L43
            java.lang.String r0 = "com.google.android.gms.dynamite.IDynamiteLoader"
            android.os.IInterface r1 = r2.queryLocalInterface(r0)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L45
            boolean r0 = r1 instanceof X.C828640Wf0     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L45
            if (r0 == 0) goto L34
            X.0Wf0 r1 = (X.C828640Wf0) r1     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L45
            if (r1 == 0) goto L43
        L31:
            com.google.android.gms.dynamite.DynamiteModule.LJIIL = r1     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L45
            goto L3a
        L34:
            X.0Wf0 r1 = new X.0Wf0     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L45
            r1.<init>(r2)     // Catch: java.lang.Exception -> L3c java.lang.Throwable -> L45
            goto L31
        L3a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L45
            return r1
        L3c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r0.getMessage()     // Catch: java.lang.Throwable -> L45
        L43:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L45
            return r3
        L45:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L45
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.LJII(android.content.Context):X.0Wf0");
    }

    public final IBinder LIZIZ(String str) throws C0WH8 {
        try {
            return (IBinder) this.LIZ.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C0WH8("Failed to instantiate module class: ".concat(str), e);
        }
    }

    public static int LIZ(Context context, String str) {
        try {
            Class<?> clsLoadClass = C786410Ut5.N3(context).getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (!C0W0T.LIZIZ(declaredField.get(null), str)) {
                String.valueOf(declaredField.get(null));
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.dynamite.DynamiteModule LIZJ(android.content.Context r15, X.InterfaceC828670Wf3 r16, java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.LIZJ(android.content.Context, X.0Wf3, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa A[Catch: all -> 0x00bc, TRY_LEAVE, TryCatch #12 {all -> 0x00bc, blocks: (B:8:0x002a, B:10:0x0036, B:11:0x0038, B:14:0x003d, B:17:0x0045, B:18:0x0048, B:20:0x004e, B:22:0x0050, B:24:0x0054, B:26:0x005c, B:28:0x0064, B:30:0x006a, B:32:0x0070, B:34:0x0076, B:36:0x008d, B:35:0x0084, B:43:0x00b6, B:46:0x00b9, B:39:0x00a0, B:40:0x00aa), top: B:143:0x002a, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZLLL(android.content.Context r14, java.lang.String r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.LIZLLL(android.content.Context, java.lang.String, boolean):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00e3 A[Catch: all -> 0x00ec, TryCatch #7 {all -> 0x00ec, blocks: (B:58:0x00df, B:60:0x00e3, B:61:0x00e4, B:62:0x00eb), top: B:72:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e4 A[Catch: all -> 0x00ec, TryCatch #7 {all -> 0x00ec, blocks: (B:58:0x00df, B:60:0x00e3, B:61:0x00e4, B:62:0x00eb), top: B:72:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJ(android.content.Context r9, boolean r10, java.lang.String r11, boolean r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.LJ(android.content.Context, boolean, java.lang.String, boolean):int");
    }
}

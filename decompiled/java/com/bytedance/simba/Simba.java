package com.bytedance.simba;

import X.C08PL;
import X.C08RN;
import X.C2112108Pf;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C786450Ut9;
import X.C826590Wbh;
import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.shadowhook.ShadowHook;
import com.bytedance.simba.utils.ReflectHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes4.dex */
public class Simba {
    public static CatchCallback catchCallback;
    public static Context context;

    public static native void nDynamicTryCatch(Class cls, String str, String str2, boolean z, String str3, String str4, long j);

    public static native boolean nEnableDebuggable(boolean z);

    public static native void nEnableLog(boolean z);

    public static native void nInit();

    static {
        INVOKESTATIC_com_bytedance_simba_Simba_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("simba");
    }

    public static void INVOKESTATIC_com_bytedance_simba_Simba_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        LoadSoLancet.LIZJ(str);
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF(str);
        LoadSoLancet.LJ(jUptimeMillis, str);
        LoadSoLancet.LIZLLL(jUptimeMillis, str);
        LoadSoLancet.LIZIZ(str);
    }

    public static File INVOKEVIRTUAL_com_bytedance_simba_Simba_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context2) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context2.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc A[EXC_TOP_SPLITTER, PHI: r7
      0x00cc: PHI (r7v5 X.09NU) = (r7v3 X.09NU), (r7v7 X.09NU) binds: [B:31:0x00ca, B:20:0x009b] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:48:0x00fa
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean attachAgent(android.content.Context r9) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.simba.Simba.attachAgent(android.content.Context):boolean");
    }

    public static void callCatchFailedCallback(String str) {
        CatchCallback catchCallback2 = catchCallback;
        if (catchCallback2 != null) {
            catchCallback2.onCatchFailed(str);
        }
    }

    public static void callCatchSuccessCallback(String str) {
        CatchCallback catchCallback2 = catchCallback;
        if (catchCallback2 != null) {
            catchCallback2.onCatchSuccess(str);
        }
    }

    public static boolean checkMethod(Member member) {
        if (member == null) {
            if (!ReflectHelper.isDebugApk(context)) {
                return false;
            }
            throw new IllegalArgumentException("Member is empty, Please check if the method name and signature are correct!!!");
        }
        if ((member.getModifiers() & 256) == 0) {
            return true;
        }
        if (!ReflectHelper.isDebugApk(context)) {
            return false;
        }
        throw new IllegalArgumentException("The method is a native method and does not support hooks");
    }

    public static boolean enableDebuggableOnReleasePackage(boolean z) {
        if (!ReflectHelper.isDebugApk(context)) {
            return nEnableDebuggable(z);
        }
        return true;
    }

    public static void enableLog(boolean z) {
        nEnableLog(z);
    }

    public static boolean init(Context context2) {
        try {
            context = C786410Ut5.N3(context2);
            C2112108Pf c2112108Pf = new C2112108Pf();
            c2112108Pf.LIZ = C08PL.SHARED.value;
            c2112108Pf.LIZIZ = true;
            ShadowHook.init(c2112108Pf.LIZ());
            enableDebuggableOnReleasePackage(true);
            attachAgent(C786410Ut5.N3(context2));
            enableDebuggableOnReleasePackage(false);
            nInit();
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static void setCatchCallback(CatchCallback catchCallback2) {
        catchCallback = catchCallback2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void dynamicTryCatch(Method method, String str, String str2, String str3, long j) {
        String strLIZIZ;
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("L");
        sbLIZ.append(str.replace(e3.d, "/"));
        sbLIZ.append(";");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("L");
        sbLIZ2.append(str3.replace(e3.d, "/"));
        sbLIZ2.append(";");
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ2);
        Class<?> declaringClass = method.getDeclaringClass();
        if (method instanceof Constructor) {
            strLIZIZ = C826590Wbh.LIZIZ(Void.TYPE, ((Constructor) method).getParameterTypes());
        } else {
            strLIZIZ = C826590Wbh.LIZIZ(method.getReturnType(), method.getParameterTypes());
        }
        if ((method.getModifiers() & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        nDynamicTryCatch(declaringClass, str2, strLIZIZ, z, strLIZIZ2, strLIZIZ3, j);
    }
}

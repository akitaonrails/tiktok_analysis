package com.ss.ttm.player;

import X.C08RN;
import X.C1286630jaP;
import X.C1286640jaQ;
import X.C1286650jaR;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C786450Ut9;
import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes21.dex */
public final class x {
    public static String LIZ = null;
    public static String LIZIZ = "libttmplayer.so";
    public static final ConcurrentHashMap<Integer, C1286650jaR> LIZJ = new ConcurrentHashMap<>();

    public static final boolean LJFF() {
        if (LIZJ(6, 0) == 1) {
            return true;
        }
        if (LIZJ(1, 0) == 0) {
            return false;
        }
        if (LIZJ(11, 0) == 1) {
            return true;
        }
        return (LIZJ(7, 0) == 1 || LIZJ(8, 0) == 1 || LIZJ(10, 0) >= 3) ? false : true;
    }

    static {
        LJI(13, 1);
        LJII(14, "999.999.999.9");
        LJII(15, "version code:1,name:999.999.999.9default sdk info 2016-12-05");
        LJI(0, 0);
        LJI(1, 1);
        LJI(2, 1);
        LJI(3, 0);
        LJI(4, 0);
        LJI(5, 0);
        LJI(6, 0);
        LJI(7, 0);
        LJI(8, 0);
        LJI(10, 0);
        LJI(11, 0);
        LJI(18, 2);
        LJI(25, 32);
        LJI(34, 0);
        LJI(35, 5242880);
        LJI(36, 0);
        LJI(39, 0);
        LJI(40, 131072);
        LJI(41, 0);
        LJI(42, 2);
        LJI(58, 0);
        LJI(59, 2);
        LJI(60, 0);
        LJI(61, 0);
        LJI(63, 0);
        LJI(64, 2);
        LJI(65, 0);
        LJI(66, 0);
        LJI(67, 0);
        LJI(70, 0);
    }

    public static File LIZ(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
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

    public static final String LIZIZ(Context context) {
        String str = LIZ;
        if (str != null) {
            return str;
        }
        if (context == null) {
            return null;
        }
        try {
            String absolutePath = LIZ(C786410Ut5.N3(context)).getAbsolutePath();
            LIZ = absolutePath;
            return absolutePath;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final boolean LJ(int i) {
        C1286650jaR c1286650jaR = LIZJ.get(Integer.valueOf(i));
        if (c1286650jaR == null || !(c1286650jaR instanceof C1286630jaP) || ((C1286630jaP) c1286650jaR).LIZ != 1) {
            return false;
        }
        return true;
    }

    public static final int LIZJ(int i, int i2) {
        C1286650jaR c1286650jaR = LIZJ.get(Integer.valueOf(i));
        if (c1286650jaR != null && (c1286650jaR instanceof C1286630jaP)) {
            return ((C1286630jaP) c1286650jaR).LIZ;
        }
        return i2;
    }

    public static final String LIZLLL(int i, String str) {
        if (i == 17) {
            return "ttplayer_crash.log";
        }
        C1286650jaR c1286650jaR = LIZJ.get(Integer.valueOf(i));
        if (c1286650jaR != null && (c1286650jaR instanceof C1286640jaQ)) {
            return ((C1286640jaQ) c1286650jaR).LIZ;
        }
        return str;
    }

    public static final void LJI(int i, int i2) {
        ConcurrentHashMap<Integer, C1286650jaR> concurrentHashMap = LIZJ;
        C1286650jaR c1286650jaR = concurrentHashMap.get(Integer.valueOf(i));
        if (c1286650jaR != null) {
            if (c1286650jaR instanceof C1286630jaP) {
                if (i == 2 && LJ(6)) {
                    return;
                }
                ((C1286630jaP) c1286650jaR).LIZ = i2;
                return;
            }
            concurrentHashMap.remove(Integer.valueOf(i));
        }
        concurrentHashMap.put(Integer.valueOf(i), new C1286630jaP(i, i2));
    }

    public static final void LJII(int i, String str) {
        ConcurrentHashMap<Integer, C1286650jaR> concurrentHashMap = LIZJ;
        C1286650jaR c1286650jaR = concurrentHashMap.get(Integer.valueOf(i));
        if (c1286650jaR != null) {
            if (c1286650jaR instanceof C1286640jaQ) {
                ((C1286640jaQ) c1286650jaR).LIZ = str;
                return;
            }
            concurrentHashMap.remove(Integer.valueOf(i));
        }
        concurrentHashMap.put(Integer.valueOf(i), new C1286640jaQ(i, str));
    }
}

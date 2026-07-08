package com.ss.android.storage.cleaner;

import X.C08RN;
import X.C0A22;
import X.C0A28;
import X.C0C4C;
import X.C0VSJ;
import X.C13VI;
import X.C1551330qTL;
import X.C1957007lY;
import X.C2188811AlT;
import X.C2250131D5f;
import X.C2250201D5m;
import X.C2510209sa;
import X.C786450Ut9;
import X.C844470XAv;
import X.EnumC1335420kr6;
import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class GeckoStorage extends C13VI {
    public static final /* synthetic */ int LIZIZ = 0;

    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() throws Throwable {
        Object obj;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        File file = C786450Ut9.LIZJ;
        if (file == null || !C786450Ut9.LJ) {
            try {
                C786450Ut9.LIZJ = contextLIZ.getFilesDir();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Context applicationContext = null;
                try {
                    Class<?> cls = Class.forName("android.app.ActivityThread");
                    Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                    Field declaredField = cls.getDeclaredField("mInitialApplication");
                    declaredField.setAccessible(true);
                    obj = declaredField.get(objInvoke);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Error: ");
                    sbLIZ.append(e.getMessage());
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (!(obj instanceof Application)) {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(th.getMessage());
                    sbLIZ2.append(":");
                    sbLIZ2.append(C08RN.LIZJ());
                    sbLIZ2.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ2));
                }
                applicationContext = ((Application) obj).getApplicationContext();
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Application context obtained through ActivityThread: ");
                sbLIZ3.append(applicationContext);
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ3));
                if (applicationContext != null) {
                    C786450Ut9.LIZJ = applicationContext.getFilesDir();
                    C08RN.LIZ(applicationContext);
                }
                StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                sbLIZ22.append(th.getMessage());
                sbLIZ22.append(":");
                sbLIZ22.append(C08RN.LIZJ());
                sbLIZ22.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ22));
            }
            file = C786450Ut9.LIZJ;
        }
        return new C0VSJ(file, "offlineX");
    }

    @Override // X.C13VI
    public final long LJIILIIL() {
        C1957007lY.LIZ.LJ = (Map) C2250131D5f.LJII.getValue();
        try {
            return C1551330qTL.LIZ(C1551330qTL.LIZ, true, System.currentTimeMillis() - (((long) ((Number) C2250131D5f.LJ.getValue()).intValue()) * 86400000), 0, 6);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        }
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.CACHE;
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        try {
            return C1551330qTL.LIZ(C1551330qTL.LIZ, z, System.currentTimeMillis() - (((long) ((Number) C0A28.LIZ.getValue()).intValue()) * 86400000), C0C4C.LIZ(), 4);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        }
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) {
        try {
            return C1551330qTL.LIZ(C1551330qTL.LIZ, z, System.currentTimeMillis() - (((long) C2510209sa.LIZ) * 86400000), C0C4C.LIZ(), 5);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        }
    }

    @Override // X.C13VI
    public final long LJIIJJI(boolean z) {
        try {
            return C1551330qTL.LIZ(C1551330qTL.LIZ, z, System.currentTimeMillis() - (((long) ((Number) C2250201D5m.LJIIIIZZ.getValue()).intValue()) * 86400000), 0, 6);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        }
    }

    @Override // X.C13VI
    public final long LJIIL(boolean z) {
        try {
            return C1551330qTL.LIZ(C1551330qTL.LIZ, z, System.currentTimeMillis() - (((long) ((Number) C0A22.LIZ.getValue()).intValue()) * 86400000), 0, 6);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        }
    }
}

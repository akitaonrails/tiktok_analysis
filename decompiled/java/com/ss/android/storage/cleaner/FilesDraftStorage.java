package com.ss.android.storage.cleaner;

import X.C08RN;
import X.C13VI;
import X.C2188811AlT;
import X.C2427709fH;
import X.C786410Ut5;
import X.C786450Ut9;
import X.C844470XAv;
import X.EnumC1335420kr6;
import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class FilesDraftStorage extends C13VI {
    @Override // X.C13VI, X.InterfaceC345370DgN
    public final File LJIIIIZZ() {
        return null;
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        return 0L;
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.CACHE;
    }

    @Override // X.C13VI
    public final long LJIIJ(boolean z) throws Throwable {
        Object obj;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        List listLJIIIZ = C2427709fH.LJIIIZ(0, contextLIZ);
        Context applicationContext = null;
        List listLJIIJ = C2427709fH.LJIIJ(0, C786410Ut5.y2(contextLIZ, null));
        File file = C786450Ut9.LIZJ;
        if (file == null || !C786450Ut9.LJ) {
            try {
                C786450Ut9.LIZJ = contextLIZ.getFilesDir();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
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
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream2 = System.out;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Application context obtained through ActivityThread: ");
                    sbLIZ2.append(applicationContext);
                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
                    if (applicationContext != null) {
                        C786450Ut9.LIZJ = applicationContext.getFilesDir();
                        C08RN.LIZ(applicationContext);
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(th.getMessage());
                    sbLIZ3.append(":");
                    sbLIZ3.append(C08RN.LIZJ());
                    sbLIZ3.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
                }
                System.out.println("Error: mInitialApplication is not an instance of Application");
                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                sbLIZ32.append(th.getMessage());
                sbLIZ32.append(":");
                sbLIZ32.append(C08RN.LIZJ());
                sbLIZ32.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ32));
            }
            file = C786450Ut9.LIZJ;
        }
        long jLJIIIIZZ = C2427709fH.LJIIIIZZ(listLJIIIZ) + C2427709fH.LJIIIIZZ(listLJIIJ) + C2427709fH.LJIIIIZZ(C2427709fH.LJIIJ(0, file));
        if (z) {
            try {
                C844470XAv.LIZ.getClass();
                Context contextLIZ2 = C844470XAv.LIZ();
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("clearDrafts ");
                sbLIZ4.append(0);
                C2188811AlT.LIZIZ(sbLIZ4);
                C2427709fH.LJFF(C2427709fH.LJIIIZ(0, contextLIZ2));
                C2427709fH.LIZIZ(0, C844470XAv.LIZ());
                return jLJIIIIZZ;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return jLJIIIIZZ;
    }
}

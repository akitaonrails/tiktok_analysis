package com.ss.android.storage.cleaner;

import X.AbstractC2454309jZ;
import X.C08RN;
import X.C0VSJ;
import X.C13BV;
import X.C1697810uHb;
import X.C2188811AlT;
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
public final class VideoShareCacheStorageCleanerV2 extends AbstractC2454309jZ {
    @Override // X.AbstractC2454309jZ
    public final List<File> LJIIL() throws Throwable {
        C844470XAv.LIZ.getClass();
        File fileY2 = C786410Ut5.y2(C844470XAv.LIZ(), "");
        Context applicationContext = null;
        String path = fileY2 != null ? fileY2.getPath() : null;
        File[] fileArr = new File[2];
        Context contextLIZ = C844470XAv.LIZ();
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
                if (applicationContext == null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(th.getMessage());
                    sbLIZ3.append(":");
                    sbLIZ3.append(C08RN.LIZJ());
                    sbLIZ3.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
                }
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            }
            file = C786450Ut9.LIZJ;
        }
        fileArr[0] = new C0VSJ(file.getPath(), "share");
        C844470XAv.LIZ.getClass();
        fileArr[1] = C844470XAv.LIZ().getDir("share", 0);
        List<File> listLJIILJJIL = C1697810uHb.LJIILJJIL(fileArr);
        if (path != null) {
            listLJIILJJIL.add(new C0VSJ(path, "share"));
        }
        return listLJIILJJIL;
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.CACHE;
    }

    @Override // X.AbstractC2454309jZ
    public final List<File> LJIILJJIL() {
        return C13BV.INSTANCE;
    }
}

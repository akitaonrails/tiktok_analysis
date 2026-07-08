package com.ss.android.storage.cleaner;

import X.AbstractC2454309jZ;
import X.C08RN;
import X.C0VSJ;
import X.C13BV;
import X.C2188811AlT;
import X.C786450Ut9;
import X.C844470XAv;
import X.EnumC1335420kr6;
import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ByteBenchStorageCleaner extends AbstractC2454309jZ {
    @Override // X.AbstractC2454309jZ, X.InterfaceC345370DgN
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
        return new C0VSJ(file.getPath(), "bytebench");
    }

    @Override // X.AbstractC2454309jZ
    public final List<File> LJIIL() {
        return Collections.singletonList(LJIIIIZZ());
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

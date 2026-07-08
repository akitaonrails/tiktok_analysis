package com.ss.android.storage.cleaner;

import X.C08RN;
import X.C0VSJ;
import X.C13VI;
import X.C2188811AlT;
import X.C786450Ut9;
import X.C844470XAv;
import X.EnumC1335420kr6;
import android.app.Application;
import android.content.Context;
import com.bytedance.pitaya.api.IPitayaCore;
import com.bytedance.pitaya.api.PTYNormalCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYCleanStrategy;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes31.dex */
public final class PitayaStorageCleaner extends C13VI {
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
        return new C0VSJ(file.getPath(), "Pitaya");
    }

    @Override // X.InterfaceC345370DgN
    public final EnumC1335420kr6 LIZLLL() {
        return EnumC1335420kr6.CACHE;
    }

    @Override // X.C13VI
    public final long LJIIIZ(boolean z) {
        if (z) {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            IPitayaCore core = PitayaCoreFactory.getCore(String.valueOf(C844470XAv.LJIIJ));
            PTYCleanStrategy pTYCleanStrategy = PTYCleanStrategy.Normal;
            core.cleanStorage(contextLIZ, pTYCleanStrategy, new PTYNormalCallback() { // from class: com.ss.android.storage.cleaner.PitayaStorageCleaner$onClean$1
                @Override // com.bytedance.pitaya.api.PTYNormalCallback
                public void onResult(boolean z2, PTYError pTYError) {
                }
            });
            PitayaCoreFactory.getCore("1728").cleanStorage(contextLIZ, pTYCleanStrategy, new PTYNormalCallback() { // from class: com.ss.android.storage.cleaner.PitayaStorageCleaner$onClean$2
                @Override // com.bytedance.pitaya.api.PTYNormalCallback
                public void onResult(boolean z2, PTYError pTYError) {
                }
            });
            return 0L;
        }
        return 0L;
    }

    @Override // X.C13VI
    public final long LJIIJJI(boolean z) {
        if (z) {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            IPitayaCore core = PitayaCoreFactory.getCore(String.valueOf(C844470XAv.LJIIJ));
            PTYCleanStrategy pTYCleanStrategy = PTYCleanStrategy.Critical;
            core.cleanStorage(contextLIZ, pTYCleanStrategy, new PTYNormalCallback() { // from class: com.ss.android.storage.cleaner.PitayaStorageCleaner$onCleanForExtremeLowStorage$1
                @Override // com.bytedance.pitaya.api.PTYNormalCallback
                public void onResult(boolean z2, PTYError pTYError) {
                }
            });
            PitayaCoreFactory.getCore("1728").cleanStorage(contextLIZ, pTYCleanStrategy, new PTYNormalCallback() { // from class: com.ss.android.storage.cleaner.PitayaStorageCleaner$onCleanForExtremeLowStorage$2
                @Override // com.bytedance.pitaya.api.PTYNormalCallback
                public void onResult(boolean z2, PTYError pTYError) {
                }
            });
            return 0L;
        }
        return 0L;
    }
}

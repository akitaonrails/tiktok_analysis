package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C054G;
import X.C08RN;
import X.C095G;
import X.C0LC1;
import X.C0PEM;
import X.C0VSJ;
import X.C1227904rF;
import X.C13LQ;
import X.C2188811AlT;
import X.C2191201ApK;
import X.C2296808zG;
import X.C2296908zH;
import X.C23250099c;
import X.C360401ac;
import X.C541850LMx;
import X.C563650M8t;
import X.C786410Ut5;
import X.C786450Ut9;
import X.C844470XAv;
import X.InterfaceC2189808i0;
import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.asynctask.utils.IAIGCDebugToolLogger;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public final class AIGCDebugToolLogger implements IAIGCDebugToolLogger, InterfaceC2189808i0 {
    public final Set<String> LIZ;
    public final C054G LIZIZ;

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.utils.IAIGCDebugToolLogger
    public final void LIZ() {
    }

    @Override // X.InterfaceC2189808i0
    public final void LIZJ(int i, String str, String str2) {
    }

    public static File LJ() {
        try {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            File fileY2 = C786410Ut5.y2(contextLIZ, "aigc_logs");
            return fileY2 == null ? new C0VSJ(LIZLLL(contextLIZ), "aigc_logs") : fileY2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public AIGCDebugToolLogger() {
        C1227904rF.LIZ.getClass();
        C1227904rF.LIZLLL();
        this.LIZ = C13LQ.LJLIIL(new String[]{C0LC1.LIZIZ.LIZ, C563650M8t.LIZIZ.LIZ, C541850LMx.LIZIZ.LIZ});
        this.LIZIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
        C095G.LIZ(10000, null, 6);
        C095G.LIZ(Integer.MAX_VALUE, null, 6);
        new AtomicInteger(0);
        C2191201ApK.LIZ();
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        C2191201ApK.LIZ();
    }

    public static File LIZLLL(Context context) throws Throwable {
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

    public static C0VSJ LJFF(String str) {
        C0VSJ c0vsj;
        File fileLJ;
        try {
            fileLJ = LJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            c0vsj = null;
        }
        if (fileLJ != null) {
            c0vsj = new C0VSJ(fileLJ, "task_logs");
            if (c0vsj.exists() && c0vsj.isFile()) {
                try {
                    c0vsj.delete();
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            c0vsj.mkdirs();
        } else {
            c0vsj = null;
        }
        if (c0vsj != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(".log");
            return new C0VSJ(c0vsj, C2188811AlT.LIZIZ(sbLIZ));
        }
        C0VSJ c0vsj2 = new C0VSJ(LJ(), "temp_task_logs");
        c0vsj2.mkdirs();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append(".log");
        return new C0VSJ(c0vsj2, C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.ss.android.ugc.aweme.aigc.asynctask.utils.IAIGCDebugToolLogger
    public final void LIZIZ(String str) {
        C23250099c.LIZLLL(this.LIZIZ, null, null, new C360401ac(this, str, null), 3);
    }
}

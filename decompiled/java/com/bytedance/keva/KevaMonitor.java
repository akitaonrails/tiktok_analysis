package com.bytedance.keva;

import X.C2188811AlT;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintStream;

/* JADX INFO: loaded from: classes24.dex */
public class KevaMonitor {
    public void logDebug(String str) {
    }

    public void onLoadRepo(String str, int i) {
    }

    public void reportThrowable(int i, String str, String str2, Object obj, Throwable th) {
    }

    public void reportWarning(int i, String str, String str2, Object obj, String str3) {
    }

    public void loadLibrary(String str) {
        System.loadLibrary(str);
        try {
            PrintStream printStream = System.err;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("init keva: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable()));
            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}

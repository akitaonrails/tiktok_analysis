package com.lynx.tasm.utils;

import X.C2188811AlT;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public class CallStackUtil {
    public static String LIZ(Throwable th) {
        String stackTraceString = Log.getStackTraceString(th);
        if (stackTraceString.length() > 900) {
            return stackTraceString.substring(0, 900);
        }
        return stackTraceString;
    }

    public static String getMessageOfCauseChain(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(th);
            int i = 5;
            for (Throwable cause = th.getCause(); cause != null && i > 0; cause = cause.getCause()) {
                i--;
                sb.append(": ");
                sb.append(cause);
            }
            return sb.toString();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return th.toString();
        }
    }

    public static String getStackTraceStringWithLineTrimmed(Throwable th) {
        if (th == null) {
            return "";
        }
        try {
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            LIZIZ(th, Collections.newSetFromMap(new IdentityHashMap()), printWriter);
            printWriter.flush();
            return stringWriter.toString();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return LIZ(th);
        }
    }

    public static void LIZIZ(Throwable th, Set<Throwable> set, PrintWriter printWriter) {
        if (th != null && set != null && !set.contains(th)) {
            if (!set.isEmpty()) {
                printWriter.print("Caused by: ");
            }
            printWriter.println(th);
            set.add(th);
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = 9;
            if (stackTrace.length < 9) {
                length = stackTrace.length;
            }
            for (int i = 0; i < length; i++) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("\tat ");
                sbLIZ.append(stackTrace[i]);
                printWriter.println(C2188811AlT.LIZIZ(sbLIZ));
            }
            LIZIZ(th.getCause(), set, printWriter);
        }
    }
}

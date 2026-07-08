package com.bytedance.watson.assist.utils;

import X.C0VAN;
import X.C0VSF;
import X.C0VSJ;
import X.C2040807z4;
import X.C2188811AlT;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes14.dex */
public class FileUtils {
    public static native void alog(int i, String str, String str2);

    public static native String parseFile(String str);

    public static native String[] parsePidFile(String str);

    public static native String[] parsePidFileWithExtra(String str);

    public static native long parseSystemPolicyTimeInSate(String str, int i);

    public static native String[] parseTidFile(String str);

    public static native String[] parseTidFileWithExtra(String str);

    static {
        LoadSoLancet.LIZJ("watson");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("watson");
        LoadSoLancet.LJ(jUptimeMillis, "watson");
        LoadSoLancet.LIZLLL(jUptimeMillis, "watson");
        LoadSoLancet.LIZIZ("watson");
    }

    public static void LIZ(BufferedReader bufferedReader) {
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                Log.getStackTraceString(e);
                boolean z = C2040807z4.LIZ;
            }
        }
    }

    public static BufferedReader LIZIZ(File file) {
        if (file == null) {
            return null;
        }
        if (!file.exists()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("file:");
            sbLIZ.append(file.getName());
            sbLIZ.append(" not exist");
            C2188811AlT.LIZIZ(sbLIZ);
            boolean z = C2040807z4.LIZ;
            return null;
        }
        if (!file.canRead()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("file:");
            sbLIZ2.append(file.getName());
            sbLIZ2.append(" can not read");
            C2188811AlT.LIZIZ(sbLIZ2);
            boolean z2 = C2040807z4.LIZ;
            return null;
        }
        try {
            return new BufferedReader(new C0VSF(file), 10000);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Log.getStackTraceString(e);
            boolean z3 = C2040807z4.LIZ;
            return null;
        }
    }

    public static void LIZJ(String str, C0VAN c0van) {
        BufferedReader bufferedReaderLIZIZ;
        if (str == null || (bufferedReaderLIZIZ = LIZIZ(new C0VSJ(str))) == null) {
            return;
        }
        while (true) {
            try {
                String line = bufferedReaderLIZIZ.readLine();
                if (line == null) {
                    break;
                } else {
                    c0van.LIZ(line);
                }
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                Log.getStackTraceString(e);
                boolean z = C2040807z4.LIZ;
            }
        }
        LIZ(bufferedReaderLIZIZ);
    }
}

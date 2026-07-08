package com.tencent.wcdb.database;

import X.C0WZX;
import X.C2204961BRm;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;

/* JADX INFO: loaded from: classes4.dex */
public final class SQLiteGlobal {
    public static final int LIZ;

    public static void loadLib() {
    }

    public static native int nativeReleaseMemory();

    public static native void nativeSetDefaultPageSize(int i);

    static {
        int iLLI;
        if (!WCDBInitializationProbe.libLoaded) {
            LoadSoLancet.LIZJ("wcdb");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF("wcdb");
            LoadSoLancet.LJ(jUptimeMillis, "wcdb");
            LoadSoLancet.LIZLLL(jUptimeMillis, "wcdb");
            LoadSoLancet.LIZIZ("wcdb");
        }
        try {
            iLLI = C2204961BRm.LLI(new StatFs(Environment.getDataDirectory().getAbsolutePath()), new C0WZX("dzBzEhY/UcnZW0NvUhGAZE2P3v8J9entOoQtz4bcyYSE89euews=", null));
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            iLLI = SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        }
        LIZ = iLLI;
        nativeSetDefaultPageSize(iLLI);
    }
}

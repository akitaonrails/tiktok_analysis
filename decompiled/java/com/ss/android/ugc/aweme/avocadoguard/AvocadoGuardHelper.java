package com.ss.android.ugc.aweme.avocadoguard;

import X.C0C64;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.crash.Npth;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import com.tiktok.avocadoguard.AvocadoGuard;
import com.tiktok.avocadoguard.TraceListener;
import java.io.PrintStream;

/* JADX INFO: loaded from: classes4.dex */
public class AvocadoGuardHelper {
    public static String LOG_TYPE_PUBLISH_FUSED_TEST = "LOG_TYPE_PUBLISH_FUSED_TEST";
    public static AvocadoGuard avocadoGuard;

    public static void startTrace() {
        final n nVar = (n) SettingsManager.LIZLLL().LJIIIIZZ("cpp_trace_config", n.class, null);
        if (nVar == null) {
            return;
        }
        avocadoGuard.StartTrace(nVar.toString(), new TraceListener() { // from class: X.08DC
            @Override // com.tiktok.avocadoguard.TraceListener
            public final void onTraceFinish() {
                System.err.println("onTraceFinish");
                C805380Via.LJFF("LaunchProtectException", "AvocadoGuard", new RuntimeException(nVar.toString()));
            }

            @Override // com.tiktok.avocadoguard.TraceListener
            public final void onLoadLibrary(String str) {
                try {
                    PrintStream printStream = System.err;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("begin onLoadLibrary, lib: ");
                    sbLIZ.append(str);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                    LoadSoLancet.LIZJ(str);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    Librarian.LJFF(str);
                    LoadSoLancet.LJ(jUptimeMillis, str);
                    LoadSoLancet.LIZLLL(jUptimeMillis, str);
                    LoadSoLancet.LIZIZ(str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    PrintStream printStream2 = System.err;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onLoadLibrary, e: ");
                    sbLIZ2.append(th.getLocalizedMessage());
                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }

            @Override // com.tiktok.avocadoguard.TraceListener
            public final void onLog(String str) {
                C805380Via.LJFF("LaunchProtectException", "AvocadoGuard", new RuntimeException(str));
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE("AvocadoGuard", str);
            }
        });
    }

    public static void doTrace(Context context) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_avocadoguard", true, false) && SettingsManager.LIZLLL().LJIIIIZZ("cpp_trace_config", n.class, null) != null) {
            avocadoGuard = new AvocadoGuard();
            Npth.addTag("avocadoguard_enable", "true");
            try {
                startTrace();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}

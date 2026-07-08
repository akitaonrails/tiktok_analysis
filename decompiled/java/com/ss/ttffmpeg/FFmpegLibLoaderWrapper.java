package com.ss.ttffmpeg;

import X.C08TO;
import X.C0NET;
import X.C0X35;
import X.C1150504el;
import X.C1472750oQb;
import X.C202099145x;
import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class FFmpegLibLoaderWrapper {
    public static boolean LIZ;

    public static boolean LIZ() {
        boolean z;
        if (C1472750oQb.LIZJ && C1150504el.LIZ().LJII) {
            C0X35.LJIIJJI("player_precreate_ttvideoengine_lock_duration", true);
            C0X35.LIZ("player_precreate_load_vcnlib_duration", true);
        }
        C202099145x c202099145xLIZ = C1150504el.LIZ();
        C0NET.LIZ.getClass();
        c202099145xLIZ.LJ(C0NET.LJI() ? 1L : 2L, "feed_get_cache_type");
        if (((Number) C08TO.LIZ.getValue()).intValue() > 0) {
            C0NET.LJIIJ = false;
            z = true;
        } else {
            synchronized (FFmpegLibLoaderWrapper.class) {
                if (LIZ) {
                    z = true;
                } else {
                    try {
                        LoadSoLancet.LIZJ("ttmverify");
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        Librarian.LJFF("ttmverify");
                        LoadSoLancet.LJ(jUptimeMillis, "ttmverify");
                        LoadSoLancet.LIZLLL(jUptimeMillis, "ttmverify");
                        LoadSoLancet.LIZIZ("ttmverify");
                    } catch (UnsatisfiedLinkError e) {
                        TryCatchGuardChecker.doCheck(e);
                        try {
                            LoadSoLancet.LIZJ("ttmverifylite");
                            long jUptimeMillis2 = SystemClock.uptimeMillis();
                            Librarian.LJFF("ttmverifylite");
                            LoadSoLancet.LJ(jUptimeMillis2, "ttmverifylite");
                            LoadSoLancet.LIZLLL(jUptimeMillis2, "ttmverifylite");
                            LoadSoLancet.LIZIZ("ttmverifylite");
                            CustomVerify._init();
                        } catch (UnsatisfiedLinkError e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            z = false;
                        }
                    }
                    z = true;
                    LIZ = z;
                }
            }
            C0NET.LIZ.getClass();
            C0NET.LJIIJ = true;
        }
        if (C1472750oQb.LIZJ && C1150504el.LIZ().LJII) {
            C0X35.LJIIJJI("player_precreate_load_vcnlib_duration", true);
            C0X35.LIZ("player_precreate_ttvideoengine_create_duration", true);
            C1472750oQb.LIZJ = false;
        }
        return z;
    }

    public static List<String> LIZIZ() {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add("ttcrypto");
            arrayList.add("ttboringssl");
            arrayList.add("ttffmpeg");
            return arrayList;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return arrayList;
        }
    }

    public static synchronized String getFFmpegVersion() {
        return "3.1.281.10-mt";
    }
}

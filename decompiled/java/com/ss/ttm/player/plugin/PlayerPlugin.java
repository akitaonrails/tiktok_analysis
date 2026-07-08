package com.ss.ttm.player.plugin;

import android.os.SystemClock;
import com.bytedance.librarian.Librarian;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class PlayerPlugin {
    public static final Object LIZ = new Object();
    public static boolean LIZIZ = false;
    public static final LinkedHashSet<String> LIZJ = new LinkedHashSet<>();

    public static native int nativeRegister(String str);

    public static int LIZ(String str) {
        int iNativeRegister = 5;
        try {
            LoadSoLancet.LIZJ(str);
            long jUptimeMillis = SystemClock.uptimeMillis();
            Librarian.LJFF(str);
            LoadSoLancet.LJ(jUptimeMillis, str);
            LoadSoLancet.LIZLLL(jUptimeMillis, str);
            LoadSoLancet.LIZIZ(str);
            if ("ttmplayer-plugin".equals(str) && !LIZIZ) {
                LIZIZ = true;
                LinkedHashSet<String> linkedHashSet = LIZJ;
                if (!linkedHashSet.isEmpty()) {
                    ArrayList<String> arrayList = new ArrayList(linkedHashSet);
                    linkedHashSet.clear();
                    for (String str2 : arrayList) {
                        if (!"ttmplayer-plugin".equals(str2)) {
                            LIZ(str2);
                        }
                    }
                }
            }
            try {
                iNativeRegister = nativeRegister(str);
                return iNativeRegister;
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                return 1;
            } catch (UnsatisfiedLinkError e2) {
                TryCatchGuardChecker.doCheck(e2);
                return iNativeRegister;
            }
        } catch (SecurityException e3) {
            TryCatchGuardChecker.doCheck(e3);
            return 5;
        } catch (UnsatisfiedLinkError e4) {
            TryCatchGuardChecker.doCheck(e4);
            return 5;
        }
    }
}

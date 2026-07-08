package com.ss.android.ugc.aweme.utils;

import X.C1C7U;
import X.C786410Ut5;
import X.C823050WQl;
import Y.ARunnableS83S0000000_3;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes4.dex */
public class LancetPreload {
    public static /* synthetic */ void lambda$preloadThread$0() {
        C1C7U.LIZ("LancetPreload@5f9e.preloadThread$1L");
        C1C7U.LIZIZ("LancetPreload@5f9e.preloadThread$1L");
    }

    public static void preloadThread() {
        ARunnableS83S0000000_3 aRunnableS83S0000000_3 = new ARunnableS83S0000000_3(26);
        C823050WQl.LIZLLL().execute(aRunnableS83S0000000_3);
        C823050WQl.LIZIZ().execute(aRunnableS83S0000000_3);
    }

    public static void preloadPackageManager(Context context) {
        try {
            C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 0);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}

package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C0C64;
import X.C0CEB;
import X.C0X35;
import X.C1150504el;
import X.C1620790sHN;
import X.C202094145s;
import X.C786410Ut5;
import X.C823050WQl;
import Y.ARunnableS124S0100000_24;
import Y.ARunnableS5S0600000_24;
import Y.ARunnableS72S0200000_3;
import Y.ARunnableS93S0200000_24;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.experiment.ColdBootStartJankOptimize;
import java.lang.reflect.Field;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes25.dex */
public final class ColdBootStartJankOptimize {
    public static Config LIZ;
    public static Field LIZJ;
    public static final Handler LIZIZ = new MainHandler(Looper.getMainLooper());
    public static boolean LIZLLL = false;

    public static class Config {

        @C09CT("delay_preload_second_item")
        public boolean delayPreloadSecondItem;

        @C09CT("delay_preload_second_item_after_interact")
        public boolean delayPreloadSecondItemAfterInteract;

        @C09CT("delay_preload_second_item_idle")
        public boolean delayPreloadSecondItemIdle;

        @C09CT("post_notify_feedtotal_state")
        public boolean postNotifyFeedTotalState;

        @C09CT("delay_preload_second_item_interval")
        public long delayPreloadSecondItemInterval = 15000;

        @C09CT("delay_preload_second_item_idle_threshold")
        public long delayPreloadSecondItemIdleThreshold = 300;

        @C09CT("delay_preload_second_item_after_interact_check_interval")
        public long delayPreloadSecondItemAfterInteractCheckInterval = 100;

        @C09CT("delay_preload_second_item_after_interact_max_delay")
        public long delayPreloadSecondItemAfterInteractMaxDelay = 2000;

        @C09CT("delay_preload_second_item_after_interact_do_frame_count")
        public int delayPreloadSecondItemAfterInteractDoFrameCount = 15;
    }

    public static void LJ() {
        if (LIZ == null) {
            Config config = (Config) C0C64.LJIILLIIL().LJJII(Config.class, null, "optimize_startupjank", true);
            LIZ = config;
            if (config == null) {
                LIZ = new Config();
            }
        }
    }

    public static boolean LIZ() {
        LJ();
        return LIZ.delayPreloadSecondItem;
    }

    public static boolean LIZJ() {
        LJ();
        return LIZ.postNotifyFeedTotalState;
    }

    public static class MainHandler extends BPEAHandler {
        public MainHandler(Looper looper) {
            super(looper);
        }
    }

    public static void LIZIZ(ARunnableS124S0100000_24 aRunnableS124S0100000_24) {
        LJ();
        if (LIZ.delayPreloadSecondItemIdle) {
            boolean z = LIZLLL;
            LIZLLL = false;
            if (z) {
                C1620790sHN c1620790sHN = new C1620790sHN(aRunnableS124S0100000_24, 1);
                C786410Ut5.f3(c1620790sHN, Looper.getMainLooper().getQueue());
                Handler handler = LIZIZ;
                ARunnableS93S0200000_24 aRunnableS93S0200000_24 = new ARunnableS93S0200000_24(aRunnableS124S0100000_24, c1620790sHN, 7);
                LJ();
                C786410Ut5.LJLIIL(LIZ.delayPreloadSecondItemInterval, handler, aRunnableS93S0200000_24);
                return;
            }
        }
        LJ();
        if (LIZ.delayPreloadSecondItemAfterInteract) {
            if (C1150504el.LIZ().LJIIJJI == 0 && C1150504el.LIZ().LJIIIZ) {
                final Choreographer choreographerV2 = C786410Ut5.v2();
                LJ();
                final long jMax = Math.max(1L, LIZ.delayPreloadSecondItemAfterInteractCheckInterval);
                LJ();
                long jMax2 = Math.max(1L, LIZ.delayPreloadSecondItemAfterInteractMaxDelay);
                LJ();
                final int iMax = Math.max(1, LIZ.delayPreloadSecondItemAfterInteractDoFrameCount);
                final boolean[] zArr = {false};
                Runnable[] runnableArr = new Runnable[1];
                final ARunnableS5S0600000_24 aRunnableS5S0600000_24 = new ARunnableS5S0600000_24(zArr, runnableArr, runnableArr, frameCallbackArr, choreographerV2, aRunnableS124S0100000_24, 0);
                Runnable[] runnableArr2 = {new Runnable() { // from class: X.081u
                    public final void LIZ() {
                        if (zArr[0]) {
                            return;
                        }
                        Choreographer choreographer = choreographerV2;
                        try {
                            if (ColdBootStartJankOptimize.LIZJ == null) {
                                Field fieldExactField = Reflect.on((Class<?>) Choreographer.class).exactField("mFrameScheduled", new Class[0]);
                                ColdBootStartJankOptimize.LIZJ = fieldExactField;
                                fieldExactField.setAccessible(true);
                            }
                            if (!((Boolean) ColdBootStartJankOptimize.LIZJ.get(choreographer)).booleanValue()) {
                                aRunnableS5S0600000_24.run();
                                return;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        C786410Ut5.LJLIIL(jMax, ColdBootStartJankOptimize.LIZIZ, this);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ColdBootStartJankOptimize@acf0.postEnableViewPagerPreloadAfterDoFrame$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ColdBootStartJankOptimize@acf0.postEnableViewPagerPreloadAfterDoFrame$1");
                    }
                }};
                Choreographer.FrameCallback[] frameCallbackArr = {new Choreographer.FrameCallback() { // from class: X.08H0
                    public int LL;

                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j) {
                        if (zArr[0]) {
                            return;
                        }
                        int i = this.LL + 1;
                        this.LL = i;
                        if (i >= iMax) {
                            aRunnableS5S0600000_24.run();
                        } else {
                            choreographerV2.postFrameCallback(this);
                        }
                    }
                }};
                if (jMax2 > 0) {
                    ARunnableS72S0200000_3 aRunnableS72S0200000_3 = new ARunnableS72S0200000_3(zArr, aRunnableS5S0600000_24, 9);
                    runnableArr[0] = aRunnableS72S0200000_3;
                    C786410Ut5.LJLIIL(jMax2, LIZIZ, aRunnableS72S0200000_3);
                }
                C786410Ut5.LJLIIL(jMax, LIZIZ, runnableArr2[0]);
                choreographerV2.postFrameCallback(frameCallbackArr[0]);
                return;
            }
            aRunnableS124S0100000_24.run();
            return;
        }
        boolean z2 = LIZLLL;
        LIZLLL = false;
        if (!z2) {
            LIZLLL(aRunnableS124S0100000_24, "preload");
            return;
        }
        Handler handler2 = LIZIZ;
        ARunnableS124S0100000_24 aRunnableS124S0100000_242 = new ARunnableS124S0100000_24(aRunnableS124S0100000_24, 23);
        LJ();
        C786410Ut5.LJLIIL(LIZ.delayPreloadSecondItemInterval, handler2, aRunnableS124S0100000_242);
    }

    public static void LIZLLL(Runnable runnable, final String str) {
        if (!C0X35.LJIIL("optimize_startupjank_report")) {
            runnable.run();
            return;
        }
        final long jUptimeMillis = SystemClock.uptimeMillis() - C202094145s.LJIILL;
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        runnable.run();
        final long jUptimeMillis3 = SystemClock.uptimeMillis() - jUptimeMillis2;
        if (((Boolean) C0CEB.LIZ.getValue()).booleanValue()) {
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.05KB
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = str;
                    long j = jUptimeMillis;
                    long j2 = jUptimeMillis3;
                    C1C7U.LIZ("ColdBootStartJankOptimize@acf0.report$1L");
                    try {
                        JSONObject jSONObject = new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("type", str2);
                        jSONObject2.put("coordinate", j);
                        jSONObject2.put("duration", j2);
                        jSONObject.put("metric", jSONObject2);
                        AppLogNewUtils.onEventV3("second_feed_populate", jSONObject2);
                        C793770VBv.LJFF("second_feed_populate", null, jSONObject);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    C1C7U.LIZIZ("ColdBootStartJankOptimize@acf0.report$1L");
                }
            });
        }
    }
}

package com.bytedance.tiktok.homepage.mainactivity;

import X.C01GW;
import X.C073O;
import X.C073R;
import X.C08TN;
import X.C09JN;
import X.C0C64;
import X.C0TJI;
import X.C1150504el;
import X.C11N2;
import X.C1479130oat;
import X.C1483410ohn;
import X.C1565430qq5;
import X.C1610250s0N;
import X.C1785006yu;
import X.C1827607Du;
import X.C1906580ziK;
import X.C2179771ASp;
import X.C2214201BlK;
import X.C266210Abz;
import X.C452501pT;
import X.C582130MsN;
import X.C786410Ut5;
import X.C814290Vwx;
import X.C823050WQl;
import android.content.Context;
import android.os.HandlerThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.ss.ttvideoengine.TTVideoEngine;

/* JADX INFO: loaded from: classes25.dex */
public final class LegacyPlayerActivityAssem extends BaseMainContainerAssem {
    public final C01GW LL = C452501pT.LIZIZ(new C1565430qq5(this));

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"LegacyPlayerActivityAssem", "onCreate"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate();
        if (!C0TJI.LIZIZ) {
            C0TJI.LIZIZ = true;
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "player_background_release_codec_res", true) == 1) {
                C0TJI.LIZJ = C0C64.LJIILLIIL().LJIJJLI(31744, 30000L, "player_background_release_codec_res_countdown_duration", true);
                C0TJI.LIZ.LIZ(C2214201BlK.LIZLLL().LJJLJLI(new C09JN() { // from class: X.0TJE
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        boolean z;
                        C1C7U.LIZ("VideoPlayManager@3d5e.init$1");
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        if (!C20692815yA.LIZIZ()) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (zBooleanValue && !z) {
                            C0TJI.LIZ();
                        } else {
                            C11N2<Long> c11n2 = C0TJI.LIZLLL;
                            if (c11n2 != null) {
                                c11n2.dispose();
                                C0TJI.LIZLLL = null;
                            }
                        }
                        C1C7U.LIZIZ("VideoPlayManager@3d5e.init$1");
                    }
                }));
            }
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"LegacyPlayerActivityAssem", "onResume"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onResume();
        C814290Vwx.LIZIZ.LJIJ();
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onBeforeCreate() {
        super.onBeforeCreate();
        C08TN.LIZ().LJ("player_assem_on_before_create", false);
        C2179771ASp.LJIIL((Context) this.LL.getValue());
        C08TN.LIZ().LJI("player_assem_on_before_create");
        C582130MsN.LIZ().getConfig().getPlayerGlobalConfig().setForceHttps(false);
    }

    @Override // X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        Context context = (Context) this.LL.getValue();
        if (C2179771ASp.LIZLLL) {
            try {
                C786410Ut5.LJJIFFI(context, C2179771ASp.LJ);
                C2179771ASp.LJ = null;
                C2179771ASp.LIZLLL = false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (!((Boolean) C266210Abz.LIZ.getValue()).booleanValue() || C1906580ziK.LJI()) {
            C0TJI.LIZ.LJ();
            C11N2<Long> c11n2 = C0TJI.LIZLLL;
            if (c11n2 != null) {
                c11n2.dispose();
                C0TJI.LIZLLL = null;
            }
            if (!((IPipFeedService) C0TJI.LJ.getValue()).LJIIL()) {
                C1483410ohn.LJLJJI().release();
            }
            synchronized (C1610250s0N.LIZ) {
            }
            TTVideoEngine.LJLJJI();
            C0TJI.LIZIZ = false;
        }
        C1610250s0N.LIZ.getClass();
        LocalVideoPlayerManager localVideoPlayerManagerLJ = LocalVideoPlayerManager.LJ();
        if (localVideoPlayerManagerLJ.LLILZ == null) {
            HandlerThread handlerThread = new HandlerThread("local_video_cache_handler_thread");
            localVideoPlayerManagerLJ.LLILZ = handlerThread;
            handlerThread.start();
        }
        localVideoPlayerManagerLJ.LLILZ.quitSafely();
        localVideoPlayerManagerLJ.LLILZ = null;
        localVideoPlayerManagerLJ.LLILZIL = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "is_record_last_network_speed_enabled", true, true)) {
            SharePrefCache.inst().getLastUsableNetworkSpeed().LJ(Integer.valueOf((int) C1479130oat.LJIIIIZZ().getSpeed()));
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        LocalVideoPlayerManager.LJ().LJI();
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onWindowFocusChanged(boolean z, boolean z2) {
        super.onWindowFocusChanged(z, z2);
        if (z) {
            if (C1827607Du.LJ(new C073R(), C1785006yu.LIZJ()) && !C073O.LIZIZ) {
                C073O.LIZIZ = true;
                C823050WQl.LJFF().execute(new Runnable() { // from class: X.0s0L
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LegacyPlayerActivityAssem@49f3.onWindowFocusChanged$1");
                        try {
                            LocalVideoPlayerManager localVideoPlayerManagerLJ = LocalVideoPlayerManager.LJ();
                            localVideoPlayerManagerLJ.getClass();
                            try {
                                localVideoPlayerManagerLJ.LIZ();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LegacyPlayerActivityAssem@49f3.onWindowFocusChanged$1");
                    }
                });
            }
        }
    }
}

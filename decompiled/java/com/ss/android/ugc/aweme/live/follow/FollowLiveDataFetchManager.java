package com.ss.android.ugc.aweme.live.follow;

import X.C01GW;
import X.C09JN;
import X.C0CAU;
import X.C0IV6;
import X.C0IV8;
import X.C1161920gLG;
import X.C11JF;
import X.C11NZ;
import X.C11S5;
import X.C1701940uOG;
import X.C452501pT;
import X.C786410Ut5;
import X.C844470XAv;
import android.os.Handler;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSkylightColdStartOptSetting;
import com.ss.android.ugc.aweme.live.follow.FollowLiveDataFetchManager;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class FollowLiveDataFetchManager {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static volatile int LIZJ;
    public static C11JF LIZLLL;
    public static C0IV8 LJ;
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(145));
    public static final Set<String> LJI = new LinkedHashSet();
    public static final FollowLiveDataFetchManager$lifeCycleObserver$1 LJII = new FollowLiveDataFetchManager$lifeCycleObserver$1();

    public static void LIZIZ() {
        if (LJ == null) {
            LJ = ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).tv0();
        }
        if (!C0CAU.LIZ()) {
            C786410Ut5.LJJZZIII((Handler) LJFF.getValue(), new Runnable() { // from class: X.0IVD
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("FollowLiveDataFetchManager@1d6b.fetchOnce$1");
                    try {
                        C0IV8 c0iv8 = FollowLiveDataFetchManager.LJ;
                        if (c0iv8 != null) {
                            C0IV6.LIZ(c0iv8);
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("FollowLiveDataFetchManager@1d6b.fetchOnce$1");
                }
            });
            return;
        }
        C0IV8 c0iv8 = LJ;
        if (c0iv8 != null) {
            C0IV6.LIZ(c0iv8);
        }
    }

    public static boolean LIZ() {
        if (LiveSkylightColdStartOptSetting.enableFollowColdPrefetch() || LiveSkylightColdStartOptSetting.enableInboxColdPrefetch()) {
            return (LiveSkylightColdStartOptSetting.enableInboxColdPrefetch() && !LJI.contains("message")) || !(LiveSkylightColdStartOptSetting.enableFollowColdPrefetch() ? LJI.contains("homepage_follow") : true);
        }
        return false;
    }

    public static boolean LIZJ() {
        int globalFetchStrategy = LiveSkylightColdStartOptSetting.getGlobalFetchStrategy();
        if (globalFetchStrategy != 1 && globalFetchStrategy != 2) {
            return false;
        }
        if (LiveSkylightColdStartOptSetting.getGlobalFetchStrategy() == 2) {
            if (LiveSkylightColdStartOptSetting.getGlobalFetchInterval() <= 0) {
                return false;
            }
            long globalFetchInterval = LiveSkylightColdStartOptSetting.getGlobalFetchInterval();
            C844470XAv.LIZ.getClass();
            if (globalFetchInterval < (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test") ? 30 : 180)) {
                return false;
            }
        }
        return true;
    }

    public static boolean LIZLLL() {
        long globalFetchInterval = LiveSkylightColdStartOptSetting.getGlobalFetchInterval();
        C844470XAv.LIZ.getClass();
        if (globalFetchInterval < (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test") ? 30 : 180) || !LIZ()) {
            return false;
        }
        if ((LiveSkylightColdStartOptSetting.getExtraPollingFetchCount() > 0 && LIZJ >= LiveSkylightColdStartOptSetting.getExtraPollingFetchCount()) || LIZIZ) {
            return false;
        }
        LIZIZ = true;
        C11JF c11jf = LIZLLL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        LIZLLL = (C11JF) C11NZ.LJJJJLI(globalFetchInterval, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0IVC
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("FollowLiveDataFetchManager@1d6b.startPolling$1");
                C0IT6 c0it6 = C0IT6.LIZ;
                C0IV2 c0iv2 = C0IV2.GLOBAL_POLLING;
                Iterator it2 = ((CopyOnWriteArrayList) C0IT6.LJFF).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C0IUI c0iui = (C0IUI) it2.next();
                        if (c0iui.LIZIZ() != c0iv2 && c0iui.LIZ() == C0IUH.RUNNING) {
                            break;
                        }
                    } else {
                        FollowLiveDataFetchManager.LIZIZ();
                        break;
                    }
                }
                int i = FollowLiveDataFetchManager.LIZJ;
                boolean z = FollowLiveDataFetchManager.LIZ;
                FollowLiveDataFetchManager.LIZJ = i + 1;
                if (LiveSkylightColdStartOptSetting.getExtraPollingFetchCount() > 0 && FollowLiveDataFetchManager.LIZJ >= LiveSkylightColdStartOptSetting.getExtraPollingFetchCount()) {
                    AFwS193S0000000_7 aFwS193S0000000_7 = AFwS193S0000000_7.get$arr$(206);
                    if (FollowLiveDataFetchManager.LIZ && FollowLiveDataFetchManager.LIZJ() && LiveSkylightColdStartOptSetting.getGlobalFetchStrategy() == 2) {
                        aFwS193S0000000_7.invoke();
                    }
                }
                C1C7U.LIZIZ("FollowLiveDataFetchManager@1d6b.startPolling$1");
            }
        }, new C09JN() { // from class: X.0IVG
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("FollowLiveDataFetchManager@1d6b.startPolling$2");
                C20441214yg.LJI("FLDataFetchManager", (Throwable) obj);
                C1C7U.LIZIZ("FollowLiveDataFetchManager@1d6b.startPolling$2");
            }
        });
        return true;
    }
}

package com.ss.android.ugc.aweme.explore.monitor.ff;

import X.C15V4;
import com.ss.android.ugc.aweme.explore.monitor.lcp.ExploreLCPTracker;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreCustomFeedColdBootManager {
    public static final ExploreCustomFeedColdBootManager LIZ = new ExploreCustomFeedColdBootManager();
    public static final Map<Long, ExploreCustomFeedColdBootMonitor> LIZIZ = new LinkedHashMap();

    public static void LIZJ(Long l) {
        if (l != null && l.longValue() == 0) {
            ExploreColdBootMonitor.INSTANCE.startRender();
            return;
        }
        ExploreLCPTracker.INSTANCE.recordStage$explore_release(l, C15V4.DATA_BUILD);
        ExploreCustomFeedColdBootMonitor exploreCustomFeedColdBootMonitor = (ExploreCustomFeedColdBootMonitor) ((LinkedHashMap) LIZIZ).get(l);
        if (exploreCustomFeedColdBootMonitor != null) {
            exploreCustomFeedColdBootMonitor.startRender();
        }
    }

    public static void LIZIZ(int i, Long l) {
        if (l != null) {
            if (l.longValue() == 0) {
                ExploreColdBootMonitor.INSTANCE.enterMethod(i, false);
                return;
            }
            if (l.longValue() != 0 && l != null) {
                l.longValue();
                ExploreLCPTracker.INSTANCE.pullType$explore_release(l, i);
                ExploreCustomFeedColdBootMonitor exploreCustomFeedColdBootMonitor = (ExploreCustomFeedColdBootMonitor) ((LinkedHashMap) LIZIZ).get(l);
                if (exploreCustomFeedColdBootMonitor != null) {
                    exploreCustomFeedColdBootMonitor.pullType(i);
                }
            }
        }
    }

    public static void LIZ(String str, Long l, boolean z, String str2) {
        if (l != null && l.longValue() == 0) {
            ExploreColdBootMonitor exploreColdBootMonitor = ExploreColdBootMonitor.INSTANCE;
            exploreColdBootMonitor.endCardLoad(str2, z);
            exploreColdBootMonitor.end();
        } else {
            ExploreLCPTracker.INSTANCE.markCoverLoaded$explore_release(l, str2, z);
            ExploreCustomFeedColdBootMonitor exploreCustomFeedColdBootMonitor = (ExploreCustomFeedColdBootMonitor) ((LinkedHashMap) LIZIZ).get(l);
            if (exploreCustomFeedColdBootMonitor != null) {
                exploreCustomFeedColdBootMonitor.endCardLoad(str2, z);
                exploreCustomFeedColdBootMonitor.end(l, str);
            }
        }
    }

    public final void start(Long l, String str, String str2, String str3) {
        if (l != null) {
            l.longValue();
            if (l.longValue() == 0) {
                ExploreColdBootMonitor.INSTANCE.start(str, str2);
                return;
            }
            ExploreLCPTracker exploreLCPTracker = ExploreLCPTracker.INSTANCE;
            exploreLCPTracker.start(l, str, str2, null, str3, null);
            exploreLCPTracker.markVisible(l);
            Map<Long, ExploreCustomFeedColdBootMonitor> map = LIZIZ;
            if (map.containsKey(l)) {
                return;
            }
            map.put(l, new ExploreCustomFeedColdBootMonitor());
            ExploreCustomFeedColdBootMonitor exploreCustomFeedColdBootMonitor = (ExploreCustomFeedColdBootMonitor) ((LinkedHashMap) map).get(l);
            if (exploreCustomFeedColdBootMonitor != null) {
                exploreCustomFeedColdBootMonitor.start();
            }
        }
    }
}

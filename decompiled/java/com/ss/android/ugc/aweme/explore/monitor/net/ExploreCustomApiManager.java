package com.ss.android.ugc.aweme.explore.monitor.net;

import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreCustomApiManager {
    public static final ExploreCustomApiManager INSTANCE = new ExploreCustomApiManager();
    public static final Map<Long, ExploreCustomApiMonitor> monitorMap = new LinkedHashMap();

    public final void colorBallStart(Long l) {
        ExploreCustomApiMonitor exploreCustomApiMonitor = monitorMap.get(l);
        if (exploreCustomApiMonitor != null) {
            exploreCustomApiMonitor.colorBallStart();
        }
    }

    public final void end(Long l) throws JSONException {
        ExploreCustomApiMonitor exploreCustomApiMonitor = monitorMap.get(l);
        if (exploreCustomApiMonitor != null) {
            exploreCustomApiMonitor.end();
        }
    }

    public final void errorMsg(Long l, Map<String, String> map) {
        ExploreCustomApiMonitor exploreCustomApiMonitor = monitorMap.get(l);
        if (exploreCustomApiMonitor != null) {
            exploreCustomApiMonitor.errorMsg(map);
        }
    }

    public final ExploreCustomApiMonitor isSuccess(Long l, boolean z) {
        ExploreCustomApiMonitor exploreCustomApiMonitor = monitorMap.get(l);
        if (exploreCustomApiMonitor != null) {
            exploreCustomApiMonitor.isSuccess(z);
            return exploreCustomApiMonitor;
        }
        return null;
    }

    public final void itemCount(Long l, int i) {
        ExploreCustomApiMonitor exploreCustomApiMonitor = monitorMap.get(l);
        if (exploreCustomApiMonitor != null) {
            exploreCustomApiMonitor.itemCount(i);
        }
    }

    public final void recommendDuration(Long l, long j) {
        ExploreCustomApiMonitor exploreCustomApiMonitor = monitorMap.get(l);
        if (exploreCustomApiMonitor != null) {
            exploreCustomApiMonitor.recommendDuration(j);
        }
    }

    public final void requestId(Long l, String str) {
        ExploreCustomApiMonitor exploreCustomApiMonitor = monitorMap.get(l);
        if (exploreCustomApiMonitor != null) {
            exploreCustomApiMonitor.requestId(str);
        }
    }

    public final void start(Long l, int i) {
        if (l != null) {
            l.longValue();
            Map<Long, ExploreCustomApiMonitor> map = monitorMap;
            if (!map.containsKey(l)) {
                ExploreCustomApiMonitor exploreCustomApiMonitor = new ExploreCustomApiMonitor();
                exploreCustomApiMonitor.start(l);
                map.put(l, exploreCustomApiMonitor);
            }
            ExploreCustomApiMonitor exploreCustomApiMonitor2 = map.get(l);
            if (exploreCustomApiMonitor2 != null) {
                exploreCustomApiMonitor2.pullType(i);
            }
            ExploreCustomApiMonitor exploreCustomApiMonitor3 = map.get(l);
            if (exploreCustomApiMonitor3 != null) {
                exploreCustomApiMonitor3.isFirstFeed();
            }
        }
    }
}

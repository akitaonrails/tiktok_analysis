package com.ss.android.ugc.aweme.explore.monitor.ff;

import X.C15TI;
import X.C15V4;
import X.C15VR;
import X.C1848630yCr;
import X.C20530615Vg;
import X.C2188811AlT;
import X.InterfaceC1848620yCq;
import com.ss.android.ugc.aweme.explore.data.ExploreStage;
import com.ss.android.ugc.aweme.explore.monitor.lcp.ExploreLCPTracker;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreColdBootMonitor implements InterfaceC1848620yCq {
    public static C15VR data;
    public static C15TI firstFeedDataSource;
    public static boolean hasRecordedFirstCoverApiComplete;
    public static boolean hasRecordedFirstCoverCacheComplete;
    public static boolean hasRecordedFirstCoverIgnoreSource;
    public static boolean hasReportAllEvent;
    public static final ExploreColdBootMonitor INSTANCE = new ExploreColdBootMonitor();
    public static final String eventName = "perf_homepage_explore_first_frame";
    public static final HashMap<String, C20530615Vg> firstFeedCardEventMap = new HashMap<>();

    private final void clear() {
        data = null;
        hasReportAllEvent = true;
    }

    private final ExploreColdBootMonitor apiBuildTime() {
        C15VR c15vr;
        if (!hasReportAllEvent && (c15vr = data) != null && c15vr.LJI == null) {
            c15vr.LJI = Long.valueOf(System.currentTimeMillis() - c15vr.LIZJ);
        }
        return this;
    }

    private final ExploreColdBootMonitor cacheBuildTime() {
        C15VR c15vr;
        if (!hasReportAllEvent && (c15vr = data) != null && c15vr.LJFF == null) {
            c15vr.LJFF = Long.valueOf(System.currentTimeMillis() - c15vr.LIZJ);
        }
        return this;
    }

    private final void sendAllColdBootEvent() {
        C15VR c15vr = data;
        if (c15vr != null) {
            if (c15vr.LJIIL == null && hasRecordedFirstCoverCacheComplete) {
                HashMap<String, C20530615Vg> map = firstFeedCardEventMap;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, C20530615Vg> entry : map.entrySet()) {
                    if (entry.getValue().LIZJ) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    c15vr.LJIIL = Long.valueOf(System.currentTimeMillis() - c15vr.LIZJ);
                }
            }
            if (c15vr.LJIILIIL == null && hasRecordedFirstCoverApiComplete) {
                HashMap<String, C20530615Vg> map2 = firstFeedCardEventMap;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, C20530615Vg> entry2 : map2.entrySet()) {
                    if (!entry2.getValue().LIZJ) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                if (linkedHashMap2.isEmpty()) {
                    c15vr.LJIILIIL = Long.valueOf(System.currentTimeMillis() - c15vr.LIZJ);
                }
            }
        }
    }

    public final void end() throws JSONException {
        C15VR c15vr;
        if (hasReportAllEvent || (c15vr = data) == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("first_frame_duration", firstFeedDataSource == C15TI.CACHE ? c15vr.LJFF : c15vr.LJI);
        jSONObject.putOpt("cache_build_time", c15vr.LJFF);
        jSONObject.putOpt("api_build_time", c15vr.LJI);
        jSONObject.putOpt("first_cover_shown", c15vr.LJIIIZ);
        jSONObject.putOpt("first_cache_cover_shown", c15vr.LJIIJ);
        jSONObject.putOpt("first_api_cover_shown", c15vr.LJIIJJI);
        jSONObject.putOpt("first_cache_all_cover_shown", c15vr.LJIIL);
        jSONObject.putOpt("first_api_all_cover_shown", c15vr.LJIILIIL);
        jSONObject.putOpt("pull_type", c15vr.LJIIIIZZ);
        jSONObject.putOpt("enter_method", c15vr.LIZIZ);
        jSONObject.putOpt("enter_from", c15vr.LIZ);
        long jCurrentTimeMillis = c15vr.LJ;
        if (jCurrentTimeMillis <= 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        jSONObject.putOpt("client_render_duration", Long.valueOf(jCurrentTimeMillis - c15vr.LIZLLL));
        jSONObject.putOpt("topic_id", 0);
        if (c15vr.LJI != null) {
            for (Map.Entry entry : ((LinkedHashMap) c15vr.LJII).entrySet()) {
                jSONObject.putOpt((String) entry.getKey(), entry.getValue());
            }
        }
        ExploreColdBootMonitor exploreColdBootMonitor = INSTANCE;
        exploreColdBootMonitor.monitorEvent(jSONObject);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(exploreColdBootMonitor.getEventName());
        sbLIZ.append(' ');
        sbLIZ.append(jSONObject);
        exploreColdBootMonitor.recordLog(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final ExploreColdBootMonitor endRender() {
        C15VR c15vr;
        if (!hasReportAllEvent && (c15vr = data) != null && c15vr.LJ == 0) {
            c15vr.LJ = System.currentTimeMillis();
        }
        return this;
    }

    public final ExploreColdBootMonitor startRender() {
        C15VR c15vr;
        ExploreLCPTracker.INSTANCE.recordStage$explore_release(0L, C15V4.DATA_BUILD);
        if (!hasReportAllEvent && (c15vr = data) != null && c15vr.LIZLLL == 0) {
            c15vr.LIZLLL = System.currentTimeMillis();
        }
        return this;
    }

    @Override // X.InterfaceC1848620yCq
    public String getEventName() {
        return eventName;
    }

    public final ExploreColdBootMonitor bindCell(C20530615Vg c20530615Vg) {
        C15TI c15ti;
        ExploreLCPTracker exploreLCPTracker = ExploreLCPTracker.INSTANCE;
        exploreLCPTracker.bindFirstScreenCell$explore_release(0L, c20530615Vg.LIZ, c20530615Vg.LIZJ, c20530615Vg.LIZLLL);
        if (hasReportAllEvent) {
            return this;
        }
        if (c20530615Vg.LIZIZ) {
            exploreLCPTracker.recordStage$explore_release(0L, C15V4.DATA_BUILD);
            if (firstFeedDataSource == null) {
                if (c20530615Vg.LIZJ) {
                    c15ti = C15TI.CACHE;
                } else {
                    c15ti = C15TI.REFRESH;
                }
                firstFeedDataSource = c15ti;
            }
            HashMap<String, C20530615Vg> map = firstFeedCardEventMap;
            if (!map.containsKey(c20530615Vg.LIZ)) {
                map.put(c20530615Vg.LIZ, c20530615Vg);
            }
            if (c20530615Vg.LIZJ) {
                cacheBuildTime();
                return this;
            }
            apiBuildTime();
            return this;
        }
        clear();
        return this;
    }

    public void monitorEvent(JSONObject jSONObject) {
        C1848630yCr.LIZ(this, jSONObject);
    }

    public void recordLog(String str) {
        C1848630yCr.LIZIZ(this, str);
    }

    public final ExploreColdBootMonitor stage(List<ExploreStage> list) {
        Map<String, String> map;
        if (list == null) {
            return this;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ExploreStage exploreStage : list) {
            linkedHashMap.put(exploreStage.type, exploreStage.duration);
        }
        C15VR c15vr = data;
        if (c15vr != null && (map = c15vr.LJII) != null) {
            map.putAll(linkedHashMap);
        }
        return this;
    }

    public final ExploreColdBootMonitor endCardLoad(String str, boolean z) {
        C15VR c15vr;
        C15VR c15vr2;
        C15VR c15vr3;
        ExploreLCPTracker.INSTANCE.markCoverLoaded$explore_release(0L, str, z);
        if (hasReportAllEvent || str == null) {
            return this;
        }
        HashMap<String, C20530615Vg> map = firstFeedCardEventMap;
        if (map.containsKey(str)) {
            C20530615Vg c20530615VgRemove = map.remove(str);
            if (z) {
                if (!hasRecordedFirstCoverIgnoreSource && (c15vr3 = data) != null) {
                    c15vr3.LJIIIZ = Long.valueOf(System.currentTimeMillis() - c15vr3.LIZJ);
                    hasRecordedFirstCoverIgnoreSource = true;
                }
                if (!hasRecordedFirstCoverCacheComplete && (c15vr2 = data) != null && c20530615VgRemove != null && c20530615VgRemove.LIZJ) {
                    if (c15vr2.LJIIJ == null) {
                        c15vr2.LJIIJ = Long.valueOf(System.currentTimeMillis() - c15vr2.LIZJ);
                    }
                    hasRecordedFirstCoverCacheComplete = true;
                }
                if (!hasRecordedFirstCoverApiComplete && (c15vr = data) != null && c20530615VgRemove != null && !c20530615VgRemove.LIZJ) {
                    if (c15vr.LJIIJJI == null) {
                        c15vr.LJIIJJI = Long.valueOf(System.currentTimeMillis() - c15vr.LIZJ);
                    }
                    hasRecordedFirstCoverApiComplete = true;
                }
            }
            sendAllColdBootEvent();
        }
        return this;
    }

    public final ExploreColdBootMonitor enterMethod(int i, boolean z) {
        C15VR c15vr;
        ExploreLCPTracker.INSTANCE.pullType$explore_release(0L, i);
        if (!hasReportAllEvent && (c15vr = data) != null && (c15vr.LJIIIIZZ == null || z)) {
            c15vr.LJIIIIZZ = Integer.valueOf(i);
        }
        return this;
    }

    public final ExploreColdBootMonitor start(String str, String str2) {
        ExploreLCPTracker.INSTANCE.start(0L, str, str2, null, null, null);
        if (hasReportAllEvent || data != null) {
            return this;
        }
        C15VR c15vr = new C15VR();
        data = c15vr;
        c15vr.LIZJ = System.currentTimeMillis();
        C15VR c15vr2 = data;
        if (c15vr2 != null) {
            c15vr2.LIZIZ = str;
            c15vr2.LIZ = str2;
        }
        return this;
    }
}

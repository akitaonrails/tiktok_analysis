package com.ss.android.ugc.aweme.explore.monitor.ff;

import X.C15TI;
import X.C15VR;
import X.C1848630yCr;
import X.C20530615Vg;
import X.C2188811AlT;
import X.InterfaceC1848620yCq;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreCustomFeedColdBootMonitor implements InterfaceC1848620yCq {
    public C15VR data;
    public final String eventName = "perf_homepage_explore_custom_feed_first_frame";
    public final HashMap<String, C20530615Vg> firstFeedCardEventMap = new HashMap<>();
    public C15TI firstFeedDataSource;
    public boolean hasRecordedFirstCoverApiComplete;
    public boolean hasRecordedFirstCoverCacheComplete;
    public boolean hasRecordedFirstCoverIgnoreSource;
    public boolean hasReportAllEvent;

    private final void clear() {
        this.data = null;
        this.hasReportAllEvent = true;
    }

    private final ExploreCustomFeedColdBootMonitor apiBuildTime() {
        C15VR c15vr;
        if (!this.hasReportAllEvent && (c15vr = this.data) != null && c15vr.LJI == null) {
            c15vr.LJI = Long.valueOf(System.currentTimeMillis() - c15vr.LIZJ);
        }
        return this;
    }

    private final ExploreCustomFeedColdBootMonitor cacheBuildTime() {
        C15VR c15vr;
        if (!this.hasReportAllEvent && (c15vr = this.data) != null && c15vr.LJFF == null) {
            c15vr.LJFF = Long.valueOf(System.currentTimeMillis() - c15vr.LIZJ);
        }
        return this;
    }

    private final void sendAllColdBootEvent() {
        C15VR c15vr = this.data;
        if (c15vr != null) {
            if (c15vr.LJIIL == null && this.hasRecordedFirstCoverCacheComplete) {
                HashMap<String, C20530615Vg> map = this.firstFeedCardEventMap;
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
            if (c15vr.LJIILIIL == null && this.hasRecordedFirstCoverApiComplete) {
                HashMap<String, C20530615Vg> map2 = this.firstFeedCardEventMap;
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

    public final ExploreCustomFeedColdBootMonitor endRender() {
        C15VR c15vr;
        if (!this.hasReportAllEvent && (c15vr = this.data) != null && c15vr.LJ == 0) {
            c15vr.LJ = System.currentTimeMillis();
        }
        return this;
    }

    public final ExploreCustomFeedColdBootMonitor start() {
        if (this.hasReportAllEvent) {
            return this;
        }
        C15VR c15vr = new C15VR();
        this.data = c15vr;
        c15vr.LIZJ = System.currentTimeMillis();
        return this;
    }

    public final ExploreCustomFeedColdBootMonitor startRender() {
        C15VR c15vr;
        if (!this.hasReportAllEvent && (c15vr = this.data) != null && c15vr.LIZLLL == 0) {
            c15vr.LIZLLL = System.currentTimeMillis();
        }
        return this;
    }

    @Override // X.InterfaceC1848620yCq
    public String getEventName() {
        return this.eventName;
    }

    public final ExploreCustomFeedColdBootMonitor bindCell(C20530615Vg c20530615Vg) {
        C15TI c15ti;
        if (this.hasReportAllEvent) {
            return this;
        }
        if (c20530615Vg.LIZIZ) {
            if (this.firstFeedDataSource == null) {
                if (c20530615Vg.LIZJ) {
                    c15ti = C15TI.CACHE;
                } else {
                    c15ti = C15TI.REFRESH;
                }
                this.firstFeedDataSource = c15ti;
            }
            if (!this.firstFeedCardEventMap.containsKey(c20530615Vg.LIZ)) {
                this.firstFeedCardEventMap.put(c20530615Vg.LIZ, c20530615Vg);
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

    public final ExploreCustomFeedColdBootMonitor enterMethod(String str) {
        C15VR c15vr;
        if (!this.hasReportAllEvent && (c15vr = this.data) != null && c15vr.LIZIZ == null) {
            c15vr.LIZIZ = str;
        }
        return this;
    }

    public void monitorEvent(JSONObject jSONObject) {
        C1848630yCr.LIZ(this, jSONObject);
    }

    public final ExploreCustomFeedColdBootMonitor pullType(int i) {
        C15VR c15vr;
        if (!this.hasReportAllEvent && (c15vr = this.data) != null && c15vr.LJIIIIZZ == null) {
            c15vr.LJIIIIZZ = Integer.valueOf(i);
        }
        return this;
    }

    public void recordLog(String str) {
        C1848630yCr.LIZIZ(this, str);
    }

    public final void end(Long l, String str) throws JSONException {
        C15VR c15vr;
        Long l2;
        if (!this.hasReportAllEvent && (c15vr = this.data) != null) {
            JSONObject jSONObject = new JSONObject();
            if (this.firstFeedDataSource == C15TI.CACHE) {
                l2 = c15vr.LJFF;
            } else {
                l2 = c15vr.LJI;
            }
            jSONObject.putOpt("first_frame_duration", l2);
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
            jSONObject.putOpt("topic_id", l);
            jSONObject.putOpt("from_explore_page", str);
            monitorEvent(jSONObject);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getEventName());
            sbLIZ.append(' ');
            sbLIZ.append(jSONObject);
            recordLog(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final ExploreCustomFeedColdBootMonitor endCardLoad(String str, boolean z) {
        C15VR c15vr;
        C15VR c15vr2;
        C15VR c15vr3;
        if (!this.hasReportAllEvent && str != null && this.firstFeedCardEventMap.containsKey(str)) {
            C20530615Vg c20530615VgRemove = this.firstFeedCardEventMap.remove(str);
            if (z) {
                if (!this.hasRecordedFirstCoverIgnoreSource && (c15vr3 = this.data) != null) {
                    c15vr3.LJIIIZ = Long.valueOf(System.currentTimeMillis() - c15vr3.LIZJ);
                    this.hasRecordedFirstCoverIgnoreSource = true;
                }
                if (!this.hasRecordedFirstCoverCacheComplete && (c15vr2 = this.data) != null && c20530615VgRemove != null && c20530615VgRemove.LIZJ) {
                    if (c15vr2.LJIIJ == null) {
                        c15vr2.LJIIJ = Long.valueOf(System.currentTimeMillis() - c15vr2.LIZJ);
                    }
                    this.hasRecordedFirstCoverCacheComplete = true;
                }
                if (!this.hasRecordedFirstCoverApiComplete && (c15vr = this.data) != null && c20530615VgRemove != null && !c20530615VgRemove.LIZJ) {
                    if (c15vr.LJIIJJI == null) {
                        c15vr.LJIIJJI = Long.valueOf(System.currentTimeMillis() - c15vr.LIZJ);
                    }
                    this.hasRecordedFirstCoverApiComplete = true;
                }
            }
            sendAllColdBootEvent();
        }
        return this;
    }
}

package com.ss.android.ugc.feed.platform.componentmanager.metric.staytime;

import X.C18KB;
import X.C18KC;
import X.C700460Rdk;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes33.dex */
public final class FcpComponentTracker implements Serializable {
    public final FcpAwemeInfo awemeInfo;
    public final Map<String, String> bizExtra;
    public final String componentKey;
    public final String containerKey;
    public final Integer needPreload;
    public static final C18KC Companion = new Object() { // from class: X.18KC
    };
    public static final int $stable = 8;
    public final String trackerId = UUID.randomUUID().toString();
    public String state = "Init";
    public final Map<String, String> params = new LinkedHashMap();
    public final Map<String, Object> attach = new LinkedHashMap();
    public long startTimeStamp = -1;
    public final HashSet<Long> durationSet = new HashSet<>();
    public final AtomicBoolean isMarkAction = new AtomicBoolean(false);

    public static /* synthetic */ void getState$annotations() {
    }

    private final long calculateDuration() {
        if (this.startTimeStamp == -1) {
            return -1L;
        }
        return System.currentTimeMillis() - this.startTimeStamp;
    }

    public final long getDuration() {
        Iterator<Long> it2 = this.durationSet.iterator();
        long jLongValue = 0;
        while (it2.hasNext()) {
            jLongValue += it2.next().longValue();
        }
        return jLongValue;
    }

    public final void reset() {
        this.startTimeStamp = -1L;
        this.durationSet.clear();
        this.state = "Init";
    }

    public final void pause() {
        long jCalculateDuration = calculateDuration();
        if (jCalculateDuration == -1) {
            return;
        }
        this.durationSet.add(Long.valueOf(jCalculateDuration));
        this.state = "Pause";
    }

    public final void start() {
        this.startTimeStamp = System.currentTimeMillis() - 100;
        this.state = "Record";
    }

    public final Map<String, Object> getAttach() {
        return this.attach;
    }

    public final FcpAwemeInfo getAwemeInfo() {
        return this.awemeInfo;
    }

    public final Map<String, String> getBizExtra() {
        return this.bizExtra;
    }

    public final String getComponentKey() {
        return this.componentKey;
    }

    public final String getContainerKey() {
        return this.containerKey;
    }

    public final Integer getNeedPreload() {
        return this.needPreload;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    public final long getStartTimeStamp() {
        return this.startTimeStamp;
    }

    public final String getState() {
        return this.state;
    }

    public final String getTrackerId() {
        return this.trackerId;
    }

    public final void resume() {
        start();
    }

    public final void markPositive(String str) {
        if (this.isMarkAction.compareAndSet(false, true)) {
            this.params.put("is_positive_click", str);
        }
    }

    public final void report(C18KB c18kb) {
        if (c18kb != null) {
            c18kb.LIZ(this);
        }
        this.durationSet.clear();
        this.state = "Report";
    }

    public final void setStartTimeStamp(long j) {
        this.startTimeStamp = j;
    }

    public final void stop(String str) {
        Map<String, String> map = this.params;
        String str2 = this.awemeInfo.groupId;
        if (str2 == null) {
            str2 = "";
        }
        map.put("group_id", str2);
        Map<String, String> map2 = this.params;
        String str3 = this.awemeInfo.authorId;
        if (str3 == null) {
            str3 = "";
        }
        map2.put("author_id", str3);
        Map<String, String> map3 = this.params;
        String str4 = this.awemeInfo.enterFrom;
        if (str4 == null) {
            str4 = "";
        }
        map3.put("enter_from", str4);
        Map<String, String> map4 = this.params;
        String str5 = this.awemeInfo.enterMethod;
        if (str5 == null) {
            str5 = "";
        }
        map4.put("enter_method", str5);
        this.params.put("duration", String.valueOf((int) getDuration()));
        this.params.put("component_key", this.componentKey);
        Map<String, String> map5 = this.params;
        String strLIZIZ = C700460Rdk.LIZIZ(this.containerKey);
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        map5.put("component_type", strLIZIZ);
        String str6 = this.params.get("is_positive_click");
        if (str6 == null || str6.length() == 0) {
            this.params.put("is_positive_click", "");
        }
        this.params.put("quit_method", str);
        this.params.put("should_preload", String.valueOf(this.needPreload));
        Map<String, String> map6 = this.bizExtra;
        if (map6 != null) {
            for (Map.Entry<String, String> entry : map6.entrySet()) {
                this.params.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public FcpComponentTracker(String str, String str2, FcpAwemeInfo fcpAwemeInfo, Map<String, String> map, Integer num) {
        this.componentKey = str;
        this.containerKey = str2;
        this.awemeInfo = fcpAwemeInfo;
        this.bizExtra = map;
        this.needPreload = num;
    }
}

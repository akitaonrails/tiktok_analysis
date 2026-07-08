package com.bytedance.hybrid.spark.raven.data;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public final class Events implements Serializable {
    public final Map<String, EventModel> event;

    public Events() {
        this(null);
    }

    public final EventModel changeTab() {
        Map<String, EventModel> map = this.event;
        if (map != null) {
            return map.get("change_tab");
        }
        return null;
    }

    public final EventModel loadMore() {
        Map<String, EventModel> map = this.event;
        if (map != null) {
            return map.get("load_more");
        }
        return null;
    }

    public Events(Map<String, EventModel> map) {
        this.event = map;
    }
}

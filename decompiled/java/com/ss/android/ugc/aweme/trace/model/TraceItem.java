package com.ss.android.ugc.aweme.trace.model;

import X.C09CT;
import com.bytedance.scene.Scene;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class TraceItem {

    @C09CT("business")
    public final String business;

    @C09CT("context")
    public final Map<String, String> context;

    @C09CT("event_id")
    public final String eventId;

    @C09CT("event_name")
    public final String eventName;

    @C09CT("level")
    public final String level;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("tenant")
    public final String tenant;

    @C09CT("timestamp")
    public final Long timestamp;

    @C09CT("trace_id")
    public final String traceId;

    public TraceItem(String str, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, Long l, String str7) {
        this.eventId = str;
        this.traceId = str2;
        this.business = str3;
        this.scene = str4;
        this.tenant = str5;
        this.eventName = str6;
        this.context = map;
        this.timestamp = l;
        this.level = str7;
    }
}

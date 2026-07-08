package com.ss.android.ugc.tools.common.mob;

import X.C09CT;
import X.C2097608Jq;
import com.bytedance.scene.Scene;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class AiTraceItem {

    @C09CT("business")
    public final String businessId;

    @C09CT("context")
    public final Map<String, String> context;

    @C09CT("event_name")
    public final String eventName;

    @C09CT("level")
    public final String level;

    @C09CT(Scene.SCENE_SERVICE)
    public final String scene;

    @C09CT("tenant")
    public final String tenant;

    @C09CT("timestamp")
    public final long timestamp;

    @C09CT("trace_id")
    public final String traceId;

    public AiTraceItem() {
        this("", "", "", "", "", 0L, "", C2097608Jq.LJ());
    }

    public AiTraceItem(String str, String str2, String str3, String str4, String str5, long j, String str6, Map<String, String> map) {
        this.traceId = str;
        this.tenant = str2;
        this.businessId = str3;
        this.scene = str4;
        this.eventName = str5;
        this.timestamp = j;
        this.level = str6;
        this.context = map;
    }
}

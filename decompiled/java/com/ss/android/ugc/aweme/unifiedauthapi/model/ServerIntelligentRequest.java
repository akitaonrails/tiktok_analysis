package com.ss.android.ugc.aweme.unifiedauthapi.model;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class ServerIntelligentRequest {

    @C09CT("dynamic_info")
    public final DynamicInfo dynamicInfo;

    @C09CT("extra")
    public final String extra;

    @C09CT("intelligent_trigger_id")
    public final String intelligentTriggerId;

    @C09CT("event_type")
    public final String panelType;

    @C09CT("trace_id")
    public final String traceId;

    @C09CT("src_type")
    public final String trigger;

    public ServerIntelligentRequest(String str, String str2, String str3, String str4, String str5, DynamicInfo dynamicInfo) {
        this.traceId = str;
        this.intelligentTriggerId = str2;
        this.trigger = str3;
        this.panelType = str4;
        this.extra = str5;
        this.dynamicInfo = dynamicInfo;
    }
}

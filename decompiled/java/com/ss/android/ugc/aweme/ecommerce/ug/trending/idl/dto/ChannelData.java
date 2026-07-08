package com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto;

import X.C09CT;
import X.C2097608Jq;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class ChannelData implements Serializable {

    @C09CT("component_map")
    public final Map<String, WesternChannelComponent> componentMap;

    @C09CT("extra_data")
    public final ExtraData extraData;

    @C09CT("request_id")
    public final String requestId;

    @C09CT("session_id")
    public final String sessionId;

    public ChannelData() {
        this(C2097608Jq.LJ(), null, null, null);
    }

    public ChannelData(Map<String, WesternChannelComponent> map, ExtraData extraData, String str, String str2) {
        this.componentMap = map;
        this.extraData = extraData;
        this.sessionId = str;
        this.requestId = str2;
    }
}

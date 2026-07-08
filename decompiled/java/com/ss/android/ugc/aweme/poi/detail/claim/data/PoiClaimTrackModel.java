package com.ss.android.ugc.aweme.poi.detail.claim.data;

import X.C09CT;
import X.C2097608Jq;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public final class PoiClaimTrackModel implements Serializable {

    @C09CT("event_name")
    public final String eventName;

    @C09CT("event_params")
    public final Map<String, Object> eventParamsModel;

    public PoiClaimTrackModel() {
        this(null, C2097608Jq.LJ());
    }

    public PoiClaimTrackModel(String str, Map<String, ? extends Object> map) {
        this.eventName = str;
        this.eventParamsModel = map;
    }
}

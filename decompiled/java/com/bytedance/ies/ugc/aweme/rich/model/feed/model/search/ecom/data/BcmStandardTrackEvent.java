package com.bytedance.ies.ugc.aweme.rich.model.feed.model.search.ecom.data;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class BcmStandardTrackEvent implements Serializable {

    @C09CT("chain_param")
    public final Map<String, String> chainParamMap;

    @C09CT("track_param")
    public final Map<String, String> trackParamMap;

    public BcmStandardTrackEvent() {
        this(null, null);
    }

    public BcmStandardTrackEvent(Map<String, String> map, Map<String, String> map2) {
        this.trackParamMap = map;
        this.chainParamMap = map2;
    }
}

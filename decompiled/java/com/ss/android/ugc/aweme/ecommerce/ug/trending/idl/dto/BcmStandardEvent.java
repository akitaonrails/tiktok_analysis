package com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto;

import X.C09CT;
import X.C2097608Jq;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class BcmStandardEvent implements Serializable {

    @C09CT("chain_param")
    public final Map<String, String> chainParam;

    @C09CT("track_param")
    public final Map<String, String> trackParam;

    public BcmStandardEvent() {
        this(C2097608Jq.LJ(), C2097608Jq.LJ());
    }

    public BcmStandardEvent(Map<String, String> map, Map<String, String> map2) {
        this.trackParam = map;
        this.chainParam = map2;
    }
}

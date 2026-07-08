package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class BcmStandardTrack implements Serializable {

    @C09CT("chain_param")
    public final Map<String, String> chainParam;

    @C09CT("track_param")
    public final Map<String, String> trackParam;

    public BcmStandardTrack() {
        this(null, null);
    }

    public BcmStandardTrack(Map<String, String> map, Map<String, String> map2) {
        this.trackParam = map;
        this.chainParam = map2;
    }
}

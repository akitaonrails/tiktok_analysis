package com.ss.android.ugc.aweme.ecommerce.ug.btm;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class BcmStandardTrackData {

    @C09CT("chain_param")
    public final Map<String, Object> chainParam;

    @C09CT("track_param")
    public final Map<String, Object> trackParam;

    public BcmStandardTrackData() {
        this(null, null);
    }

    public BcmStandardTrackData(Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        this.trackParam = map;
        this.chainParam = map2;
    }
}

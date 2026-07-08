package com.ss.android.ugc.aweme.search.ecom.data;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class BcmStandardTrackEvent implements Serializable {

    @C09CT("chain_param")
    public final Map<String, String> chainParamMap;

    @C09CT("track_param")
    public final Map<String, String> trackParamMap;

    public BcmStandardTrackEvent() {
        this(null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BcmStandardTrackEvent(trackParamMap=");
        sbLIZ.append(this.trackParamMap);
        sbLIZ.append(", chainParamMap=");
        sbLIZ.append(this.chainParamMap);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public BcmStandardTrackEvent(Map<String, String> map, Map<String, String> map2) {
        this.trackParamMap = map;
        this.chainParamMap = map2;
    }
}

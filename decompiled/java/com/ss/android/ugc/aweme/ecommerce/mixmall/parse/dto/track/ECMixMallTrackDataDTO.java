package com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.track;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class ECMixMallTrackDataDTO {

    @C09CT("ad")
    public Map<String, ECMixMallTrackEventGroup> ad;

    @C09CT("applog")
    public Map<String, ECMixMallTrackEventGroup> appLog;

    public ECMixMallTrackDataDTO() {
        this(null, null);
    }

    public ECMixMallTrackDataDTO(Map<String, ECMixMallTrackEventGroup> map, Map<String, ECMixMallTrackEventGroup> map2) {
        this.appLog = map;
        this.ad = map2;
    }
}

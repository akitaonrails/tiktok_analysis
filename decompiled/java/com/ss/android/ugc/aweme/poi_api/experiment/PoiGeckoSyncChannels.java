package com.ss.android.ugc.aweme.poi_api.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiGeckoSyncChannels {

    @C09CT("nearby")
    public final List<String> nearbyGeckoChannels;

    @C09CT("poi_detail")
    public final List<String> poiDetailGeckoChannels;

    @C09CT("review_banner")
    public final List<String> poiReviewBannerGeckoChannels;

    public PoiGeckoSyncChannels() {
        this(null, null, null, 7, null);
    }

    public PoiGeckoSyncChannels(List<String> list, List<String> list2, List<String> list3) {
        this.nearbyGeckoChannels = list;
        this.poiDetailGeckoChannels = list2;
        this.poiReviewBannerGeckoChannels = list3;
    }

    public PoiGeckoSyncChannels(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C13BV.INSTANCE : list3);
    }
}

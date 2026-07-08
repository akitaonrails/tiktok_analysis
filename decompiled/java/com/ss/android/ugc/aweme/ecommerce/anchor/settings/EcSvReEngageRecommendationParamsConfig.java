package com.ss.android.ugc.aweme.ecommerce.anchor.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class EcSvReEngageRecommendationParamsConfig {

    @C09CT("is_order_submit_required")
    public final boolean isOrderSubmitRequired;

    @C09CT("is_scrolling_required")
    public final boolean isScrollingRequired;

    @C09CT("min_pdp_stay_duration")
    public final int minPDPStayDuration;

    @C09CT("min_same_video_visit_count")
    public final int minSameVideoVisitCount;

    public EcSvReEngageRecommendationParamsConfig() {
        this(true, true, 8000, 2);
    }

    public EcSvReEngageRecommendationParamsConfig(boolean z, boolean z2, int i, int i2) {
        this.isOrderSubmitRequired = z;
        this.isScrollingRequired = z2;
        this.minPDPStayDuration = i;
        this.minSameVideoVisitCount = i2;
    }
}

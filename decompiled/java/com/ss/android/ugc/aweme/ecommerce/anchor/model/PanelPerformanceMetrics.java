package com.ss.android.ugc.aweme.ecommerce.anchor.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class PanelPerformanceMetrics implements Serializable {

    @C09CT("anchor_click_time")
    public long anchorClickTime;

    @C09CT("is_promotion_info_first_bind")
    public boolean isPromotionInfoFirstBind;

    @C09CT("is_promotion_info_from_cache")
    public boolean isPromotionInfoFromCache;

    public PanelPerformanceMetrics() {
        this(0L, false, true);
    }

    public final long getAnchorClickTime() {
        return this.anchorClickTime;
    }

    public final boolean isPromotionInfoFirstBind() {
        return this.isPromotionInfoFirstBind;
    }

    public final boolean isPromotionInfoFromCache() {
        return this.isPromotionInfoFromCache;
    }

    public final void setAnchorClickTime(long j) {
        this.anchorClickTime = j;
    }

    public final void setPromotionInfoFirstBind(boolean z) {
        this.isPromotionInfoFirstBind = z;
    }

    public final void setPromotionInfoFromCache(boolean z) {
        this.isPromotionInfoFromCache = z;
    }

    public PanelPerformanceMetrics(long j, boolean z, boolean z2) {
        this.anchorClickTime = j;
        this.isPromotionInfoFromCache = z;
        this.isPromotionInfoFirstBind = z2;
    }
}

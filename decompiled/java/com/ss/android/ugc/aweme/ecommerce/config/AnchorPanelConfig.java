package com.ss.android.ugc.aweme.ecommerce.config;

import X.C09CT;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public final class AnchorPanelConfig implements Serializable {

    @C09CT("custom_params")
    public Map<String, Object> customParams;

    @C09CT("enable_claim_voucher")
    public boolean enableClaimVoucher;

    @C09CT("enable_maybe_you_like")
    public boolean enableMaybeYouLike;

    @C09CT("enable_promotion_banner")
    public boolean enablePromotionBanner;

    @C09CT("enable_search_entrance")
    public boolean enableSearchEntrance;

    @C09CT("panel_click_method")
    public int panelClickMethod;

    @C09CT("panel_full_screen")
    public boolean panelFullScreen;

    @C09CT("panel_open_source")
    public String panelOpenSource;

    @C09CT("panel_open_way")
    public int panelOpenWay;

    @C09CT("panel_style")
    public int panelStyle;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchorPanelConfig)) {
            return false;
        }
        AnchorPanelConfig anchorPanelConfig = (AnchorPanelConfig) obj;
        return this.panelOpenWay == anchorPanelConfig.panelOpenWay && Intrinsics.LJFF(this.panelOpenSource, anchorPanelConfig.panelOpenSource) && this.panelStyle == anchorPanelConfig.panelStyle && this.enableMaybeYouLike == anchorPanelConfig.enableMaybeYouLike && this.panelClickMethod == anchorPanelConfig.panelClickMethod && this.enableSearchEntrance == anchorPanelConfig.enableSearchEntrance && this.enablePromotionBanner == anchorPanelConfig.enablePromotionBanner && this.enableClaimVoucher == anchorPanelConfig.enableClaimVoucher && this.panelFullScreen == anchorPanelConfig.panelFullScreen && Intrinsics.LJFF(this.customParams, anchorPanelConfig.customParams);
    }

    public AnchorPanelConfig() {
        this(0, "video_anchor", 0, false, 0, false, false, false, false, new LinkedHashMap());
    }

    public final void setCustomParams(Map<String, Object> map) {
        this.customParams = map;
    }

    public final void setEnableClaimVoucher(boolean z) {
        this.enableClaimVoucher = z;
    }

    public final void setEnableMaybeYouLike(boolean z) {
        this.enableMaybeYouLike = z;
    }

    public final void setEnablePromotionBanner(boolean z) {
        this.enablePromotionBanner = z;
    }

    public final void setEnableSearchEntrance(boolean z) {
        this.enableSearchEntrance = z;
    }

    public final void setPanelClickMethod(int i) {
        this.panelClickMethod = i;
    }

    public final void setPanelFullScreen(boolean z) {
        this.panelFullScreen = z;
    }

    public final void setPanelOpenSource(String str) {
        this.panelOpenSource = str;
    }

    public final void setPanelOpenWay(int i) {
        this.panelOpenWay = i;
    }

    public final void setPanelStyle(int i) {
        this.panelStyle = i;
    }

    public AnchorPanelConfig(int i, String str, int i2, boolean z, int i3, boolean z2, boolean z3, boolean z4, boolean z5, Map<String, Object> map) {
        this.panelOpenWay = i;
        this.panelOpenSource = str;
        this.panelStyle = i2;
        this.enableMaybeYouLike = z;
        this.panelClickMethod = i3;
        this.enableSearchEntrance = z2;
        this.enablePromotionBanner = z3;
        this.enableClaimVoucher = z4;
        this.panelFullScreen = z5;
        this.customParams = map;
    }
}

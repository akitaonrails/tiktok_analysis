package com.ss.android.ugc.aweme.ecommerce.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public final class PromotionResource implements Serializable {

    @C09CT("promotion_top_banner")
    public final PanelBannerInfo panelBannerInfo;

    public PromotionResource() {
        this(null);
    }

    public PromotionResource(PanelBannerInfo panelBannerInfo) {
        this.panelBannerInfo = panelBannerInfo;
    }
}

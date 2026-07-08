package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public final class AnchorsExtras implements Serializable {

    @C09CT("ad_label")
    public AdLabel adLabel;

    @C09CT("anchor_layout_priority")
    public final AnchorLayoutPriority anchorLayoutPriority;

    @C09CT("cta_info")
    public final ECCtaInfo ctaInfo;

    @C09CT("dynamic_photo_mode_info")
    public final DynamicPhotoModeInfo dynamicPhotoModeInfo;

    @C09CT("ec_anchor_info")
    public final ECAnchorInfo ecAnchorInfo;

    @C09CT("image_product_map")
    public final Map<Integer, String> imageProductMap;

    @C09CT("image_product_style")
    public final Integer imageProductStyle;

    @C09CT("panel_top_disclosure_label")
    public final PanelTopDisclosureLabel panelTopDisclosureLabel;

    @C09CT("product_cnt")
    public Integer productCnt;

    @C09CT("tips")
    public Tips tips;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnchorsExtras(tips=");
        sbLIZ.append(this.tips);
        sbLIZ.append(", adLabel=");
        sbLIZ.append(this.adLabel);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final AdLabel getAdLabel() {
        return this.adLabel;
    }

    public final AnchorLayoutPriority getAnchorLayoutPriority() {
        return this.anchorLayoutPriority;
    }

    public final ECCtaInfo getCtaInfo() {
        return this.ctaInfo;
    }

    public final DynamicPhotoModeInfo getDynamicPhotoModeInfo() {
        return this.dynamicPhotoModeInfo;
    }

    public final ECAnchorInfo getEcAnchorInfo() {
        return this.ecAnchorInfo;
    }

    public final Map<Integer, String> getImageProductMap() {
        return this.imageProductMap;
    }

    public final Integer getImageProductStyle() {
        return this.imageProductStyle;
    }

    public final PanelTopDisclosureLabel getPanelTopDisclosureLabel() {
        return this.panelTopDisclosureLabel;
    }

    public final Integer getProductCnt() {
        return this.productCnt;
    }

    public final Tips getTips() {
        return this.tips;
    }

    public final void setAdLabel(AdLabel adLabel) {
        this.adLabel = adLabel;
    }

    public final void setProductCnt(Integer num) {
        this.productCnt = num;
    }

    public final void setTips(Tips tips) {
        this.tips = tips;
    }
}

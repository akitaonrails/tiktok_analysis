package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SmallProductCard implements Serializable {

    @C09CT("did_show_enhance_product_animation")
    public boolean didShowAnimation;

    @C09CT("need_popup_card_animation")
    public final boolean needPopupCardAnimation;

    @C09CT("product_id_str")
    public String productIdSt;

    @C09CT("promotion_info_color")
    public final Color promotionInfoColor;

    @C09CT("title")
    public String title;

    @C09CT("promotion_info")
    public final String promotionInfo = "";

    @C09CT("anchor_text_parent_type")
    public final String anchorTextParentType = "";

    @C09CT("cover")
    public final String cover = "";

    public final String getAnchorTextParentType() {
        return this.anchorTextParentType;
    }

    public final String getCover() {
        return this.cover;
    }

    public final boolean getDidShowAnimation() {
        return this.didShowAnimation;
    }

    public final boolean getNeedPopupCardAnimation() {
        return this.needPopupCardAnimation;
    }

    public final String getProductIdSt() {
        return this.productIdSt;
    }

    public final String getPromotionInfo() {
        return this.promotionInfo;
    }

    public final Color getPromotionInfoColor() {
        return this.promotionInfoColor;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setDidShowAnimation(boolean z) {
        this.didShowAnimation = z;
    }

    public final void setProductIdSt(String str) {
        this.productIdSt = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}

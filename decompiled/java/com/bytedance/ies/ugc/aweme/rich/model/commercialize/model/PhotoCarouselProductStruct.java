package com.bytedance.ies.ugc.aweme.rich.model.commercialize.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class PhotoCarouselProductStruct implements Serializable {

    @C09CT("anchor_title")
    public final String anchorTitle;

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("button_color")
    public final String color;

    @C09CT("disable_label")
    public final boolean disableLabel;

    @C09CT("native_site_custom_data")
    public final String nativeSiteCustomData;

    @C09CT("open_url")
    public final String openUrl;

    @C09CT("product_id")
    public final String productId;

    @C09CT("use_jump_data_in_raw_ad_data")
    public final boolean useJumpDataInRawAdData;

    @C09CT("web_url")
    public final String webUrl;

    public PhotoCarouselProductStruct() {
        this("", "", "", "", "", "", "", false, false);
    }

    public final String getAnchorTitle() {
        return this.anchorTitle;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getColor() {
        return this.color;
    }

    public final boolean getDisableLabel() {
        return this.disableLabel;
    }

    public final String getNativeSiteCustomData() {
        return this.nativeSiteCustomData;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final boolean getUseJumpDataInRawAdData() {
        return this.useJumpDataInRawAdData;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public PhotoCarouselProductStruct(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2) {
        this.webUrl = str;
        this.openUrl = str2;
        this.anchorTitle = str3;
        this.productId = str4;
        this.nativeSiteCustomData = str5;
        this.color = str6;
        this.buttonText = str7;
        this.disableLabel = z;
        this.useJumpDataInRawAdData = z2;
    }
}

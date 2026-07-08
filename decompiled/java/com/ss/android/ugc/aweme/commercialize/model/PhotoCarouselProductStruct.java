package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.BotConfig;
import com.ss.android.ugc.aweme.feed.model.ad.QuickActionModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class PhotoCarouselProductStruct implements Serializable {

    @C09CT("anchor_title")
    public final String anchorTitle;

    @C09CT("product_bot_config")
    public final BotConfig botConfig;

    @C09CT("button_text")
    public final String buttonText;

    @C09CT("button_color")
    public final String color;

    @C09CT("disable_label")
    public final boolean disableLabel;

    @C09CT("hints_config")
    public final HintsConfig hintsConfig;

    @C09CT("link_icon")
    public final UrlModel linkIcon;

    @C09CT("native_site_custom_data")
    public final String nativeSiteCustomData;

    @C09CT("open_url")
    public final String openUrl;

    @C09CT("product_id")
    public final String productId;

    @C09CT("product_tag")
    public final String productTag;

    @C09CT("quick_action_model")
    public final QuickActionModel quickActionModel;

    @C09CT("use_jump_data_in_raw_ad_data")
    public final boolean useJumpDataInRawAdData;

    @C09CT("web_url")
    public final String webUrl;

    public PhotoCarouselProductStruct() {
        this("", "", "", "", "", "", "", false, false, null, null, null, null, null);
    }

    public final String getAnchorTitle() {
        return this.anchorTitle;
    }

    public final BotConfig getBotConfig() {
        return this.botConfig;
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

    public final HintsConfig getHintsConfig() {
        return this.hintsConfig;
    }

    public final UrlModel getLinkIcon() {
        return this.linkIcon;
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

    public final String getProductTag() {
        return this.productTag;
    }

    public final QuickActionModel getQuickActionModel() {
        return this.quickActionModel;
    }

    public final boolean getUseJumpDataInRawAdData() {
        return this.useJumpDataInRawAdData;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public PhotoCarouselProductStruct(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, String str8, UrlModel urlModel, QuickActionModel quickActionModel, BotConfig botConfig, HintsConfig hintsConfig) {
        this.webUrl = str;
        this.openUrl = str2;
        this.anchorTitle = str3;
        this.productId = str4;
        this.nativeSiteCustomData = str5;
        this.color = str6;
        this.buttonText = str7;
        this.disableLabel = z;
        this.useJumpDataInRawAdData = z2;
        this.productTag = str8;
        this.linkIcon = urlModel;
        this.quickActionModel = quickActionModel;
        this.botConfig = botConfig;
        this.hintsConfig = hintsConfig;
    }
}

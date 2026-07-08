package com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model;

import X.C09CT;
import com.ss.android.ugc.aweme.commercialize.anchor.model.CommerceAnchorInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class NonAdWebModel implements Serializable {
    public final CommerceAnchorInfo anchorInfo;

    @C09CT("anchor_partner")
    public final Integer anchorPartner;

    @C09CT("anchor_type")
    public final Integer anchorType;

    @C09CT("author_id")
    public final String authorId;

    @C09CT("ba_cta")
    public final int baCta;

    @C09CT("ba_pixel_id")
    public final String baPixelId;

    @C09CT("ba_url")
    public final String baUrl;
    public final Integer dataflowId;

    @C09CT("enter_method")
    public final String enterMethod;
    public final Extra extra;

    @C09CT("from_user_id")
    public final String fromUserId;
    public final Boolean hideNavBar;
    public final transient String initialData;
    public final Boolean isFromJsb;
    public final Integer isPseudoAd;

    @C09CT("item_id")
    public final String itemId;

    @C09CT("multi_anchor")
    public final int multiAnchor;

    @C09CT("organic_log_extra")
    public final String organicLogExtra;

    @C09CT("page_type")
    public final String pageType;
    public final Boolean showReport;
    public final Boolean slideFromBottom;

    public NonAdWebModel() {
        this(null, null, null, null, 0, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final CommerceAnchorInfo getAnchorInfo() {
        return this.anchorInfo;
    }

    public final Integer getAnchorPartner() {
        return this.anchorPartner;
    }

    public final Integer getAnchorType() {
        return this.anchorType;
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final int getBaCta() {
        return this.baCta;
    }

    public final String getBaPixelId() {
        return this.baPixelId;
    }

    public final String getBaUrl() {
        return this.baUrl;
    }

    public final Integer getDataflowId() {
        return this.dataflowId;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final Extra getExtra() {
        return this.extra;
    }

    public final String getFromUserId() {
        return this.fromUserId;
    }

    public final Boolean getHideNavBar() {
        return this.hideNavBar;
    }

    public final String getInitialData() {
        return this.initialData;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final int getMultiAnchor() {
        return this.multiAnchor;
    }

    public final String getOrganicLogExtra() {
        return this.organicLogExtra;
    }

    public final String getPageType() {
        return this.pageType;
    }

    public final Boolean getShowReport() {
        return this.showReport;
    }

    public final Boolean getSlideFromBottom() {
        return this.slideFromBottom;
    }

    public final Boolean isFromJsb() {
        return this.isFromJsb;
    }

    public final Integer isPseudoAd() {
        return this.isPseudoAd;
    }

    public NonAdWebModel(String str, String str2, String str3, String str4, int i, String str5, int i2, Integer num, String str6, String str7, Integer num2, String str8, String str9, Integer num3, Boolean bool, Extra extra, Boolean bool2, Integer num4, CommerceAnchorInfo commerceAnchorInfo, Boolean bool3, Boolean bool4) {
        this.itemId = str;
        this.enterMethod = str2;
        this.authorId = str3;
        this.fromUserId = str4;
        this.baCta = i;
        this.baUrl = str5;
        this.multiAnchor = i2;
        this.anchorType = num;
        this.baPixelId = str6;
        this.pageType = str7;
        this.anchorPartner = num2;
        this.organicLogExtra = str8;
        this.initialData = str9;
        this.isPseudoAd = num3;
        this.slideFromBottom = bool;
        this.extra = extra;
        this.isFromJsb = bool2;
        this.dataflowId = num4;
        this.anchorInfo = commerceAnchorInfo;
        this.hideNavBar = bool3;
        this.showReport = bool4;
    }
}

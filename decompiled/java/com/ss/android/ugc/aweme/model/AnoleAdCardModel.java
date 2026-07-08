package com.ss.android.ugc.aweme.model;

import X.C09CT;
import com.ss.android.ugc.aweme.commercialize.model.AnoleLogInfo;
import com.ss.android.ugc.aweme.commercialize.model.NativeSiteConfig;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleAdCardModel implements Serializable {

    @C09CT("log_info")
    public final AnoleLogInfo anoleLogInfo;

    @C09CT("bg_img_url")
    public final String bgImgUrl;

    @C09CT("card_background_color")
    public final String cardBgColor;

    @C09CT("content_type")
    public final int contentType;

    @C09CT("default_background_color")
    public final List<String> defaultBgColorList;

    @C09CT("native_site_config")
    public final NativeSiteConfig nativeSiteConfig;

    @C09CT("no_interest_button_title")
    public final String noInterestedButtonText;

    @C09CT("products")
    public final List<AnoleProductModel> productList;

    @C09CT("title")
    public final String title;

    @C09CT("view_more_button_title")
    public final String viewMoreButtonText;

    public AnoleAdCardModel() {
        this("", null, 0, "", "", "", null, null, null, null);
    }

    public final AnoleLogInfo getAnoleLogInfo() {
        return this.anoleLogInfo;
    }

    public final String getBgImgUrl() {
        return this.bgImgUrl;
    }

    public final String getCardBgColor() {
        return this.cardBgColor;
    }

    public final int getContentType() {
        return this.contentType;
    }

    public final List<String> getDefaultBgColorList() {
        return this.defaultBgColorList;
    }

    public final NativeSiteConfig getNativeSiteConfig() {
        return this.nativeSiteConfig;
    }

    public final String getNoInterestedButtonText() {
        return this.noInterestedButtonText;
    }

    public final List<AnoleProductModel> getProductList() {
        return this.productList;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getViewMoreButtonText() {
        return this.viewMoreButtonText;
    }

    public AnoleAdCardModel(String str, List<String> list, int i, String str2, String str3, String str4, NativeSiteConfig nativeSiteConfig, List<AnoleProductModel> list2, AnoleLogInfo anoleLogInfo, String str5) {
        this.title = str;
        this.defaultBgColorList = list;
        this.contentType = i;
        this.cardBgColor = str2;
        this.noInterestedButtonText = str3;
        this.viewMoreButtonText = str4;
        this.nativeSiteConfig = nativeSiteConfig;
        this.productList = list2;
        this.anoleLogInfo = anoleLogInfo;
        this.bgImgUrl = str5;
    }
}

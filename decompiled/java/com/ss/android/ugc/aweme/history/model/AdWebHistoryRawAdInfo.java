package com.ss.android.ugc.aweme.history.model;

import X.C09CT;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.OmVast;
import com.ss.android.ugc.aweme.feed.model.AutofillModel;
import com.ss.android.ugc.aweme.feed.model.EcUgVSAData;
import com.ss.android.ugc.aweme.feed.model.LandingPageConfig;
import com.ss.android.ugc.aweme.feed.model.commercialize.adexperience.CommerceAceSurveyInfo;
import com.ss.android.ugc.aweme.feed.model.commercialize.adshopifycheckout.ShopifyCheckoutEntity;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AdWebHistoryRawAdInfo implements Serializable {
    public static final int $stable = 8;

    @C09CT("ad_id")
    public Long adId;

    @C09CT("autofill")
    public AutofillModel autofill;

    @C09CT("click_track_url_list")
    public UrlModel clickTrackUrlList;

    @C09CT("ace_layer")
    public CommerceAceSurveyInfo commerceAceSurveyInfo;

    @C09CT("creative_id")
    public Long creativeId;

    @C09CT("disable_left_slide_follow")
    public boolean disableLeftSlideFollow;

    @C09CT("vsa_for_tt_mall")
    public EcUgVSAData ecUgVSAData;

    @C09CT("enable_click_id_attach")
    public int enableClickIdAttach;

    @C09CT("enable_web_google_login")
    public boolean enableWebGoogleLogin;

    @C09CT("enable_web_report")
    public boolean enableWebReport;

    @C09CT("iab_auto_jump_allow_list")
    public List<String> iabAutoJumpAllowList;

    @C09CT("is_amazon_ad")
    public Boolean isAmazonAd;

    @C09CT("landing_page_config")
    public LandingPageConfig landingPageConfig;

    @C09CT("landing_page_info")
    public String landingPageInfo;

    @C09CT("log_extra")
    public String logExtra;

    @C09CT("native_site_custom_data")
    public String nativeSiteCustomData;

    @C09CT("vast")
    public OmVast omVast;

    @C09CT("preload_h5_type")
    public int preloadH5Type;

    @C09CT("preload_web")
    public int preloadWeb;

    @C09CT("report_enable")
    public boolean reportEnable;

    @C09CT("shopify_data")
    public ShopifyCheckoutEntity shopifyData;

    @C09CT("system_origin")
    public int systemOrigin;

    @C09CT("ttclid")
    public String ttclid;

    @C09CT("web_title")
    public String webTitle;

    @C09CT("web_url")
    public String webUrl;

    public AdWebHistoryRawAdInfo() {
        this(null, null, null, null, false, false, -1, null, null, false, false, null, null, 0, 0, null, null, null, null, null, 0, null, null, null, null);
    }

    public final Boolean isAmazonAd() {
        return this.isAmazonAd;
    }

    public final void setAdId(Long l) {
        this.adId = l;
    }

    public final void setAmazonAd(Boolean bool) {
        this.isAmazonAd = bool;
    }

    public final void setAutofill(AutofillModel autofillModel) {
        this.autofill = autofillModel;
    }

    public final void setClickTrackUrlList(UrlModel urlModel) {
        this.clickTrackUrlList = urlModel;
    }

    public final void setCommerceAceSurveyInfo(CommerceAceSurveyInfo commerceAceSurveyInfo) {
        this.commerceAceSurveyInfo = commerceAceSurveyInfo;
    }

    public final void setCreativeId(Long l) {
        this.creativeId = l;
    }

    public final void setDisableLeftSlideFollow(boolean z) {
        this.disableLeftSlideFollow = z;
    }

    public final void setEcUgVSAData(EcUgVSAData ecUgVSAData) {
        this.ecUgVSAData = ecUgVSAData;
    }

    public final void setEnableClickIdAttach(int i) {
        this.enableClickIdAttach = i;
    }

    public final void setEnableWebGoogleLogin(boolean z) {
        this.enableWebGoogleLogin = z;
    }

    public final void setEnableWebReport(boolean z) {
        this.enableWebReport = z;
    }

    public final void setIabAutoJumpAllowList(List<String> list) {
        this.iabAutoJumpAllowList = list;
    }

    public final void setLandingPageConfig(LandingPageConfig landingPageConfig) {
        this.landingPageConfig = landingPageConfig;
    }

    public final void setLandingPageInfo(String str) {
        this.landingPageInfo = str;
    }

    public final void setLogExtra(String str) {
        this.logExtra = str;
    }

    public final void setNativeSiteCustomData(String str) {
        this.nativeSiteCustomData = str;
    }

    public final void setOmVast(OmVast omVast) {
        this.omVast = omVast;
    }

    public final void setPreloadH5Type(int i) {
        this.preloadH5Type = i;
    }

    public final void setPreloadWeb(int i) {
        this.preloadWeb = i;
    }

    public final void setReportEnable(boolean z) {
        this.reportEnable = z;
    }

    public final void setShopifyData(ShopifyCheckoutEntity shopifyCheckoutEntity) {
        this.shopifyData = shopifyCheckoutEntity;
    }

    public final void setSystemOrigin(int i) {
        this.systemOrigin = i;
    }

    public final void setTtclid(String str) {
        this.ttclid = str;
    }

    public final void setWebTitle(String str) {
        this.webTitle = str;
    }

    public final void setWebUrl(String str) {
        this.webUrl = str;
    }

    public AdWebHistoryRawAdInfo(Long l, UrlModel urlModel, String str, Long l2, boolean z, boolean z2, int i, String str2, CommerceAceSurveyInfo commerceAceSurveyInfo, boolean z3, boolean z4, String str3, String str4, int i2, int i3, Boolean bool, ShopifyCheckoutEntity shopifyCheckoutEntity, OmVast omVast, List<String> list, String str5, int i4, LandingPageConfig landingPageConfig, String str6, EcUgVSAData ecUgVSAData, AutofillModel autofillModel) {
        this.creativeId = l;
        this.clickTrackUrlList = urlModel;
        this.logExtra = str;
        this.adId = l2;
        this.reportEnable = z;
        this.enableWebReport = z2;
        this.systemOrigin = i;
        this.landingPageInfo = str2;
        this.commerceAceSurveyInfo = commerceAceSurveyInfo;
        this.enableWebGoogleLogin = z3;
        this.disableLeftSlideFollow = z4;
        this.webTitle = str3;
        this.webUrl = str4;
        this.preloadWeb = i2;
        this.preloadH5Type = i3;
        this.isAmazonAd = bool;
        this.shopifyData = shopifyCheckoutEntity;
        this.omVast = omVast;
        this.iabAutoJumpAllowList = list;
        this.ttclid = str5;
        this.enableClickIdAttach = i4;
        this.landingPageConfig = landingPageConfig;
        this.nativeSiteCustomData = str6;
        this.ecUgVSAData = ecUgVSAData;
        this.autofill = autofillModel;
    }
}

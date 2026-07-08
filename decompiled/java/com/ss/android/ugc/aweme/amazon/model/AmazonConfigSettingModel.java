package com.ss.android.ugc.aweme.amazon.model;

import X.C09CT;
import java.io.Serializable;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes5.dex */
public final class AmazonConfigSettingModel implements Serializable {
    public static final int $stable = 0;

    @C09CT("commerce_amazon_api_key")
    public final String commerceAmazonApiKey;

    @C09CT("commerce_amazon_client_id")
    public final String commerceAmazonClientId;

    @C09CT("commerce_redirect_uri")
    public final String commerceRedirectUri;

    @C09CT("domain_list")
    public final String domainList;

    @C09CT("enable_amazon_a2bsso")
    public final Boolean enableAmazonA2BSSO;

    @C09CT("enable_android_precheck")
    public final Boolean enableAndroidPrecheck;

    public AmazonConfigSettingModel() {
        this(Boolean.FALSE, "ETF1c8ID1o2vUvYyCOWES4YSTrA7AUKo931bY54M", "amzn1.application-oa2-client.1f48737b5c6043faac96a2ea9b359aa9", "https://www.tiktok.com/third-party-oauth-redirect/commerce/buy-with-amazon", Boolean.FALSE, ".shop-external.amazon,.social.amazon.com,.social.amazon.ca,social.amazon.com,social.amazon.ca");
    }

    public final String getCommerceAmazonApiKey() {
        String str = this.commerceAmazonApiKey;
        return (str == null || a0.LJJJIL(str)) ? "ETF1c8ID1o2vUvYyCOWES4YSTrA7AUKo931bY54M" : this.commerceAmazonApiKey;
    }

    public final String getCommerceAmazonClientId() {
        String str = this.commerceAmazonClientId;
        return (str == null || a0.LJJJIL(str)) ? "amzn1.application-oa2-client.1f48737b5c6043faac96a2ea9b359aa9" : this.commerceAmazonClientId;
    }

    public final String getCommerceRedirectUri() {
        String str = this.commerceRedirectUri;
        return (str == null || a0.LJJJIL(str)) ? "https://www.tiktok.com/third-party-oauth-redirect/commerce/buy-with-amazon" : this.commerceRedirectUri;
    }

    public AmazonConfigSettingModel(Boolean bool, String str, String str2, String str3, Boolean bool2, String str4) {
        this.enableAmazonA2BSSO = bool;
        this.commerceAmazonApiKey = str;
        this.commerceAmazonClientId = str2;
        this.commerceRedirectUri = str3;
        this.enableAndroidPrecheck = bool2;
        this.domainList = str4;
    }
}

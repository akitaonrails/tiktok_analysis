package com.bytedance.ies.ugc.aweme.rich.model.feed.model.commercialize.amazoncheckoutad;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AmazonCheckoutAdModel implements Serializable {

    @C09CT("access_token")
    public String accessToken;

    @C09CT("amazon_product_details")
    public List<Object> amazonProductDetails;

    @C09CT("asins")
    public final List<String> asins;

    @C09CT("cta_button_text")
    public final AmazonCtaButtonStyleModel ctaButtonStyle;

    @C09CT("enable_bwa_pa_serving")
    public final boolean enableBWAPaServing;

    @C09CT("expire_ttl_sec")
    public final Long expireTtlSec;

    @C09CT("issue_at")
    public final Long issueAt;

    @C09CT("pkce")
    public final String pkce;

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final List<Object> getAmazonProductDetails() {
        return this.amazonProductDetails;
    }

    public final List<String> getAsins() {
        return this.asins;
    }

    public final AmazonCtaButtonStyleModel getCtaButtonStyle() {
        return this.ctaButtonStyle;
    }

    public final boolean getEnableBWAPaServing() {
        return this.enableBWAPaServing;
    }

    public final Long getExpireTtlSec() {
        return this.expireTtlSec;
    }

    public final Long getIssueAt() {
        return this.issueAt;
    }

    public final String getPkce() {
        return this.pkce;
    }

    public final void setAccessToken(String str) {
        this.accessToken = str;
    }

    public final void setAmazonProductDetails(List<Object> list) {
        this.amazonProductDetails = list;
    }
}

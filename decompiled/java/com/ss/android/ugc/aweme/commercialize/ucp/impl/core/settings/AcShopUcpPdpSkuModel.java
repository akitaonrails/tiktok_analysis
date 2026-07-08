package com.ss.android.ugc.aweme.commercialize.ucp.impl.core.settings;

import X.C09CT;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class AcShopUcpPdpSkuModel {

    @C09CT("agent_profile_url")
    public final String agentProfileUrl;

    @C09CT("catalog_context_currency")
    public final String catalogContextCurrency;

    @C09CT("color_visual_max_count")
    public final int colorVisualMaxCount;

    @C09CT("enable_fresco_post_delayed_fix")
    public final boolean enableFrescoPostDelayedFix;

    @C09CT("enable_text_mode_when_color_exceed")
    public final boolean enableTextModeWhenColorExceed;

    @C09CT("max_concurrent_sku_requests")
    public final int maxConcurrentSkuRequests;

    @C09CT("price_fraction_digits")
    public final int priceFractionDigits;

    @C09CT("token_expiry_seconds")
    public final Integer tokenExpirySeconds;

    public AcShopUcpPdpSkuModel() {
        this(8, true, 5, "USD", 2, true, "https://ads.tiktok.com/openapi_bff/ucp/agent-profiles/default", null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AcShopUcpPdpSkuModel)) {
            return false;
        }
        AcShopUcpPdpSkuModel acShopUcpPdpSkuModel = (AcShopUcpPdpSkuModel) obj;
        return this.colorVisualMaxCount == acShopUcpPdpSkuModel.colorVisualMaxCount && this.enableTextModeWhenColorExceed == acShopUcpPdpSkuModel.enableTextModeWhenColorExceed && this.maxConcurrentSkuRequests == acShopUcpPdpSkuModel.maxConcurrentSkuRequests && Intrinsics.LJFF(this.catalogContextCurrency, acShopUcpPdpSkuModel.catalogContextCurrency) && this.priceFractionDigits == acShopUcpPdpSkuModel.priceFractionDigits && this.enableFrescoPostDelayedFix == acShopUcpPdpSkuModel.enableFrescoPostDelayedFix && Intrinsics.LJFF(this.agentProfileUrl, acShopUcpPdpSkuModel.agentProfileUrl) && Intrinsics.LJFF(this.tokenExpirySeconds, acShopUcpPdpSkuModel.tokenExpirySeconds);
    }

    public final int hashCode() {
        int iZ2 = ((((((((((((this.colorVisualMaxCount * 31) + C786410Ut5.Z2(this.enableTextModeWhenColorExceed)) * 31) + this.maxConcurrentSkuRequests) * 31) + this.catalogContextCurrency.hashCode()) * 31) + this.priceFractionDigits) * 31) + C786410Ut5.Z2(this.enableFrescoPostDelayedFix)) * 31) + this.agentProfileUrl.hashCode()) * 31;
        Integer num = this.tokenExpirySeconds;
        return iZ2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AcShopUcpPdpSkuModel(colorVisualMaxCount=");
        sbLIZ.append(this.colorVisualMaxCount);
        sbLIZ.append(", enableTextModeWhenColorExceed=");
        sbLIZ.append(this.enableTextModeWhenColorExceed);
        sbLIZ.append(", maxConcurrentSkuRequests=");
        sbLIZ.append(this.maxConcurrentSkuRequests);
        sbLIZ.append(", catalogContextCurrency=");
        sbLIZ.append(this.catalogContextCurrency);
        sbLIZ.append(", priceFractionDigits=");
        sbLIZ.append(this.priceFractionDigits);
        sbLIZ.append(", enableFrescoPostDelayedFix=");
        sbLIZ.append(this.enableFrescoPostDelayedFix);
        sbLIZ.append(", agentProfileUrl=");
        sbLIZ.append(this.agentProfileUrl);
        sbLIZ.append(", tokenExpirySeconds=");
        sbLIZ.append(this.tokenExpirySeconds);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AcShopUcpPdpSkuModel(int i, boolean z, int i2, String str, int i3, boolean z2, String str2, Integer num) {
        this.colorVisualMaxCount = i;
        this.enableTextModeWhenColorExceed = z;
        this.maxConcurrentSkuRequests = i2;
        this.catalogContextCurrency = str;
        this.priceFractionDigits = i3;
        this.enableFrescoPostDelayedFix = z2;
        this.agentProfileUrl = str2;
        this.tokenExpirySeconds = num;
    }
}

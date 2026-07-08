package com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes31.dex */
public final class ShopifySkuCheckoutProductDetailData implements Serializable {

    @C09CT("description")
    public final String description;
    public Long errorCode;
    public String errorMessage;
    public String errorResponse;

    @C09CT("image_url")
    public final String imageUrl;

    @C09CT("images")
    public final List<Object> images;

    @C09CT("options")
    public final List<ShopifySkuCheckoutProductOption> options;

    @C09CT("price_range")
    public final ShopifySkuCheckoutPriceRange priceRange;

    @C09CT("product_id")
    public final String productId;
    public String rawResponse;
    public String requestBody;
    public String requestUrl;

    @C09CT("selectedOrFirstAvailableVariant")
    public final ShopifySkuCheckoutProductVariant selectedOrFirstAvailableVariant;

    @C09CT("title")
    public final String title;

    @C09CT("url")
    public final String url;

    public ShopifySkuCheckoutProductDetailData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public final void setErrorCode(Long l) {
        this.errorCode = l;
    }

    public final void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public final void setErrorResponse(String str) {
        this.errorResponse = str;
    }

    public final void setRawResponse(String str) {
        this.rawResponse = str;
    }

    public final void setRequestBody(String str) {
        this.requestBody = str;
    }

    public final void setRequestUrl(String str) {
        this.requestUrl = str;
    }

    public ShopifySkuCheckoutProductDetailData(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List<Object> list, List<ShopifySkuCheckoutProductOption> list2, ShopifySkuCheckoutPriceRange shopifySkuCheckoutPriceRange, ShopifySkuCheckoutProductVariant shopifySkuCheckoutProductVariant) {
        this.rawResponse = str;
        this.requestUrl = str2;
        this.requestBody = str3;
        this.errorCode = l;
        this.errorMessage = str4;
        this.errorResponse = str5;
        this.productId = str6;
        this.title = str7;
        this.description = str8;
        this.url = str9;
        this.imageUrl = str10;
        this.images = list;
        this.options = list2;
        this.priceRange = shopifySkuCheckoutPriceRange;
        this.selectedOrFirstAvailableVariant = shopifySkuCheckoutProductVariant;
    }

    public ShopifySkuCheckoutProductDetailData(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, List list2, ShopifySkuCheckoutPriceRange shopifySkuCheckoutPriceRange, ShopifySkuCheckoutProductVariant shopifySkuCheckoutProductVariant, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? 0L : l, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C13BV.INSTANCE : list, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? C13BV.INSTANCE : list2, (i & 8192) != 0 ? new ShopifySkuCheckoutPriceRange("", "", "") : shopifySkuCheckoutPriceRange, (i & 16384) != 0 ? new ShopifySkuCheckoutProductVariant("", "", "", "", null, Boolean.TRUE) : shopifySkuCheckoutProductVariant);
    }
}

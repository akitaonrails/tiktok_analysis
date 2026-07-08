package com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad;

import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AmazonAdRealtimeInfoResult {
    public final JSONObject adInfoJsonObject;
    public final String awemeId;
    public final AmazonCtaButtonStyleModel ctaButtonText;
    public final String errorCode;
    public List<AmazonProductDetailsModel> productList;

    public final void setProductList(List<AmazonProductDetailsModel> list) {
        this.productList = list;
    }

    public AmazonAdRealtimeInfoResult(String str, String str2, JSONObject jSONObject, List<AmazonProductDetailsModel> list, AmazonCtaButtonStyleModel amazonCtaButtonStyleModel) {
        this.awemeId = str;
        this.errorCode = str2;
        this.adInfoJsonObject = jSONObject;
        this.productList = list;
        this.ctaButtonText = amazonCtaButtonStyleModel;
    }
}

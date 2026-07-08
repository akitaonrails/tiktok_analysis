package com.ss.android.ugc.aweme.feed.model.commercialize.amazoncheckoutad;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AmazonAdRealtimeInfoResponse implements Serializable {

    @C09CT("amazon_product_details")
    public List<AmazonProductDetailsModel> productList;

    @C09CT("status_code")
    public int statusCode = -1;

    @C09CT("status_msg")
    public String statusMsg;

    public final List<AmazonProductDetailsModel> getProductList() {
        return this.productList;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final void setProductList(List<AmazonProductDetailsModel> list) {
        this.productList = list;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }
}

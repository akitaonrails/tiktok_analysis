package com.bytedance.pipo.verify.base.model.request;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class GetPageRequest {

    @C09CT("biz_type")
    public final String bizType;

    @C09CT("lang")
    public final String lang;

    @C09CT("merchant_id")
    public final String merchantId;

    @C09CT("pipo_product_cat")
    public final String pipoProductCat;

    @C09CT("verify_type")
    public final String verifyType;

    public GetPageRequest() {
        this(null, null, null, null, null);
    }

    public GetPageRequest(String str, String str2, String str3, String str4, String str5) {
        this.verifyType = str;
        this.pipoProductCat = str2;
        this.bizType = str3;
        this.lang = str4;
        this.merchantId = str5;
    }
}

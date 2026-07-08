package com.ss.android.ugc.aweme.ecommerce.service.cartservice;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class SkuPanelParam {

    @C09CT("bcm")
    public final String bcm;

    @C09CT("biz_type")
    public final Integer bizType;

    @C09CT("btm")
    public final String btm;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("need_request")
    public final Boolean needRequest;

    @C09CT("other_params")
    public final Map<String, Object> otherParams;

    @C09CT("sku_type")
    public final Integer skuType;

    @C09CT("trackParams")
    public final String trackParams;

    public SkuPanelParam(Integer num, Integer num2, String str, String str2, Boolean bool, String str3, String str4, Map<String, ? extends Object> map) {
        this.bizType = num;
        this.skuType = num2;
        this.btm = str;
        this.bcm = str2;
        this.needRequest = bool;
        this.enterFrom = str3;
        this.trackParams = str4;
        this.otherParams = map;
    }
}

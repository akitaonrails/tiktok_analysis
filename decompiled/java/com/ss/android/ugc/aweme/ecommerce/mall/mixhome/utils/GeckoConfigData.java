package com.ss.android.ugc.aweme.ecommerce.mall.mixhome.utils;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes27.dex */
public final class GeckoConfigData {

    @C09CT("ab_key")
    public final ABKeyModel abKeyModel;

    @C09CT("request_params")
    public final Map<String, Object> requestParams;

    public GeckoConfigData(ABKeyModel aBKeyModel, Map<String, ? extends Object> map) {
        this.abKeyModel = aBKeyModel;
        this.requestParams = map;
    }
}

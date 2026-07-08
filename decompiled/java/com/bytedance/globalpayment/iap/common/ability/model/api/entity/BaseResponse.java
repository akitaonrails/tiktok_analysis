package com.bytedance.globalpayment.iap.common.ability.model.api.entity;

import X.C09CT;
import X.C1792580wkS;

/* JADX INFO: loaded from: classes28.dex */
public class BaseResponse<T, R extends C1792580wkS> {

    @C09CT("data")
    public T data;

    @C09CT("extra")
    public R extra;

    @C09CT("status_code")
    public int statusCode;
}

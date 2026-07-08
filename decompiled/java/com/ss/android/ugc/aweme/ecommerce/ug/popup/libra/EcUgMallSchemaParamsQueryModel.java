package com.ss.android.ugc.aweme.ecommerce.ug.popup.libra;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class EcUgMallSchemaParamsQueryModel {

    @C09CT("key")
    public final String key;

    @C09CT("operate_type")
    public final Integer operateType;

    @C09CT("value")
    public final Object value;

    @C09CT("value_type")
    public final String valueType;

    public EcUgMallSchemaParamsQueryModel() {
        this("", null, null, null);
    }

    public EcUgMallSchemaParamsQueryModel(String str, Object obj, String str2, Integer num) {
        this.key = str;
        this.value = obj;
        this.valueType = str2;
        this.operateType = num;
    }
}

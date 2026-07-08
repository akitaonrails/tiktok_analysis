package com.ss.android.ugc.aweme.ecommerce.ug.popup.libra;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class EcUgMallSchemaParamsOperateModel {

    @C09CT("deep_key_chain")
    public final List<String> deepKeyChain;

    @C09CT("ignore_deep_key_null")
    public final Boolean ignoreDeepKeyNull;

    @C09CT("params")
    public final List<EcUgMallSchemaParamsQueryModel> params;

    public EcUgMallSchemaParamsOperateModel() {
        this(null, null, null);
    }

    public EcUgMallSchemaParamsOperateModel(List<EcUgMallSchemaParamsQueryModel> list, List<String> list2, Boolean bool) {
        this.params = list;
        this.deepKeyChain = list2;
        this.ignoreDeepKeyNull = bool;
    }
}

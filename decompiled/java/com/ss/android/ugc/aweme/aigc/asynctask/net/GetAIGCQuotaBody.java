package com.ss.android.ugc.aweme.aigc.asynctask.net;

import X.C09CT;

/* JADX INFO: loaded from: classes9.dex */
public final class GetAIGCQuotaBody {

    @C09CT("algo_raw")
    public final AlgoRaw algoRaw;

    @C09CT("algo_type")
    public final int algoType;

    @C09CT("creation_id")
    public final String creationId;

    @C09CT("from_asset_id")
    public final String fromAssetId;

    @C09CT("from_asset_type")
    public final int fromAssetType;

    @C09CT("style_conf")
    public final StyleConfig styleConfig;

    public GetAIGCQuotaBody() {
        this(new AlgoRaw("", "", ""), 3, new StyleConfig(0L, 0), 18, "", "");
    }

    public GetAIGCQuotaBody(AlgoRaw algoRaw, int i, StyleConfig styleConfig, int i2, String str, String str2) {
        this.algoRaw = algoRaw;
        this.algoType = i;
        this.styleConfig = styleConfig;
        this.fromAssetType = i2;
        this.fromAssetId = str;
        this.creationId = str2;
    }
}

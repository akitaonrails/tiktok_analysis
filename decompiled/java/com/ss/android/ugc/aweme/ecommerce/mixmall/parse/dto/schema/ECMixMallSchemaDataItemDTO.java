package com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.schema;

import X.C09CT;

/* JADX INFO: loaded from: classes33.dex */
public final class ECMixMallSchemaDataItemDTO {

    @C09CT("merge_data")
    public ECMixMallSchemaParamsDTO mergeData;

    @C09CT("url")
    public String url;

    public ECMixMallSchemaDataItemDTO() {
        this(null, null);
    }

    public ECMixMallSchemaDataItemDTO(String str, ECMixMallSchemaParamsDTO eCMixMallSchemaParamsDTO) {
        this.url = str;
        this.mergeData = eCMixMallSchemaParamsDTO;
    }
}

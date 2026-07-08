package com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.schema;

import X.C09CT;
import com.google.gson.n;
import java.util.Map;

/* JADX INFO: loaded from: classes33.dex */
public final class ECMixMallSchemaParamsDTO {

    @C09CT("merge_mode")
    public int mergeMode;

    @C09CT("object_params")
    public Map<String, ECMixMallSchemaParamsDTO> objParams;

    @C09CT("page_params")
    public Map<String, String> pageParams;

    @C09CT("static_params")
    public n staticParams;

    @C09CT("trace_params")
    public Map<String, String> traceParams;

    public ECMixMallSchemaParamsDTO() {
        this(0, null, null, null, null);
    }

    public ECMixMallSchemaParamsDTO(int i, n nVar, Map<String, String> map, Map<String, String> map2, Map<String, ECMixMallSchemaParamsDTO> map3) {
        this.mergeMode = i;
        this.staticParams = nVar;
        this.pageParams = map;
        this.traceParams = map2;
        this.objParams = map3;
    }
}

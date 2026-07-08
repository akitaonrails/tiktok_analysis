package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class PDPBatchResponseData {

    @C09CT("pdp_response")
    public final Map<String, PDPResponse> pdpResponses;

    public PDPBatchResponseData() {
        this(null);
    }

    public PDPBatchResponseData(Map<String, PDPResponse> map) {
        this.pdpResponses = map;
    }
}

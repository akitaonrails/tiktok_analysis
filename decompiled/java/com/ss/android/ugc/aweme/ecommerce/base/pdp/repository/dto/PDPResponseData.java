package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import com.bytedance.goda.model.dto.GodaProtocol;
import com.bytedance.goda.v2.model.dto.GodaV2Protocol;

/* JADX INFO: loaded from: classes2.dex */
public final class PDPResponseData {

    @C09CT("goda_protocol")
    public final GodaProtocol godaProtocol;

    @C09CT("goda_protocol_v2")
    public final GodaV2Protocol<ProductInfoPackData> godaV2Protocol;

    public PDPResponseData() {
        this(null, null);
    }

    public PDPResponseData(GodaProtocol godaProtocol, GodaV2Protocol<ProductInfoPackData> godaV2Protocol) {
        this.godaProtocol = godaProtocol;
        this.godaV2Protocol = godaV2Protocol;
    }
}

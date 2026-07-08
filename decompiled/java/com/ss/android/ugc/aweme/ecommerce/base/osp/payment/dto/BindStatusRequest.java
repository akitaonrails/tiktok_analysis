package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class BindStatusRequest {

    @C09CT("idempotency_keys")
    public final List<String> idempotencyKeys;

    @C09CT("pipo_error_code_params")
    public String pipoErrorCodeParams;

    @C09CT("sale_region")
    public final String saleRegion;

    public BindStatusRequest(List<String> list, String str, String str2) {
        this.idempotencyKeys = list;
        this.saleRegion = str;
        this.pipoErrorCodeParams = str2;
    }
}

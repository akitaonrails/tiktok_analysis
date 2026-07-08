package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class BindInfoRequest implements Serializable {
    public static final int $stable = 8;

    @C09CT("extra_info")
    public final String extraInfo;

    @C09CT("payment_method_list")
    public final List<BindInfoReqInfo> paymentMethodList;

    @C09CT("pipo_error_code_params")
    public String pipoErrorCodeParams;

    @C09CT("sale_region")
    public final String saleRegion;

    public BindInfoRequest() {
        this(null, null, null, null);
    }

    public final void setPipoErrorCodeParams(String str) {
        this.pipoErrorCodeParams = str;
    }

    public BindInfoRequest(List<BindInfoReqInfo> list, String str, String str2, String str3) {
        this.paymentMethodList = list;
        this.saleRegion = str;
        this.extraInfo = str2;
        this.pipoErrorCodeParams = str3;
    }
}

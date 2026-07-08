package com.bytedance.pipo.kyc.singpass.network.model.request;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class VendorReq {

    @C09CT("caller_idempotent_id")
    public final String callerIdempotentId;

    @C09CT("extra_params")
    public final String extraParams;

    @C09CT("scenario")
    public final int scenario;

    @C09CT("vendor_id")
    public final String vendorId;

    public VendorReq(int i, String str, String str2, String str3) {
        this.scenario = i;
        this.callerIdempotentId = str;
        this.vendorId = str2;
        this.extraParams = str3;
    }
}

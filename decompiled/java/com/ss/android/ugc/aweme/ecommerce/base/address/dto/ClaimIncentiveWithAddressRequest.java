package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class ClaimIncentiveWithAddressRequest {

    @C09CT("target_address_id")
    public final String addressId;

    @C09CT("pre_log_id")
    public final String preLogId;

    @C09CT("incentive_record_id")
    public final String recordId;

    public ClaimIncentiveWithAddressRequest(String str, String str2, String str3) {
        this.recordId = str;
        this.addressId = str2;
        this.preLogId = str3;
    }
}

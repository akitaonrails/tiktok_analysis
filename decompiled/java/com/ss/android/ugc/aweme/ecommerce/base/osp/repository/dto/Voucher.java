package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class Voucher {

    @C09CT("claim_user_type")
    public final Integer claimUserType;

    @C09CT("cost_type")
    public final Integer costType;

    @C09CT("instance_key")
    public final String instanceKey;

    @C09CT("voucher_id")
    public final String voucherId;

    @C09CT("voucher_type_id")
    public final String voucherTypeId;

    public Voucher(String str, String str2, String str3, Integer num, Integer num2) {
        this.voucherId = str;
        this.voucherTypeId = str2;
        this.instanceKey = str3;
        this.claimUserType = num;
        this.costType = num2;
    }
}

package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class DonationInfo {

    @C09CT("currency")
    public String currency;

    @C09CT("donation_fee")
    public String donationFee;

    @C09CT("donation_id")
    public String donationId;

    public DonationInfo() {
        this(null, null, null);
    }

    public DonationInfo(String str, String str2, String str3) {
        this.donationId = str;
        this.donationFee = str2;
        this.currency = str3;
    }
}

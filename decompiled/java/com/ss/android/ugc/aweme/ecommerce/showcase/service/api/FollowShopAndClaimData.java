package com.ss.android.ugc.aweme.ecommerce.showcase.service.api;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class FollowShopAndClaimData {

    @C09CT("is_followed")
    public final Boolean isFollowed;

    @C09CT("claimed_text")
    public final String text;

    @C09CT("voucher")
    public final VoucherData voucher;

    public FollowShopAndClaimData() {
        this(null, null, null);
    }

    public FollowShopAndClaimData(String str, Boolean bool, VoucherData voucherData) {
        this.text = str;
        this.isFollowed = bool;
        this.voucher = voucherData;
    }
}

package com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit;

import X.C09CT;

/* JADX INFO: loaded from: classes2.dex */
public final class CartEntryOptions {

    @C09CT("entry_position")
    public final Integer entryPosition;

    @C09CT("is_after_add_success")
    public final boolean isAfterAddSuccess;

    public CartEntryOptions(boolean z, Integer num) {
        this.isAfterAddSuccess = z;
        this.entryPosition = num;
    }
}

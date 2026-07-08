package com.ss.android.ugc.aweme.ecommerce.showcase.service.api;

import X.C09CT;
import X.EnumC1996107rr;

/* JADX INFO: loaded from: classes5.dex */
public final class ShopPromoPriorityFilter {

    @C09CT("filter_type")
    public final int filterType;

    @C09CT("voucher_type_id")
    public final String voucherTypeId;

    public ShopPromoPriorityFilter() {
        this(EnumC1996107rr.UNKNOWN.getValue(), "");
    }

    public ShopPromoPriorityFilter(int i, String str) {
        this.filterType = i;
        this.voucherTypeId = str;
    }
}

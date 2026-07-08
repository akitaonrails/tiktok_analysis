package com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.voucher.repo;

import X.C09CT;
import X.C2097608Jq;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ClaimVoucherResponseData implements Serializable {

    @C09CT("voucher")
    public final Map<String, Object> voucher;

    public ClaimVoucherResponseData() {
        this(C2097608Jq.LJ());
    }

    public ClaimVoucherResponseData(Map<String, ? extends Object> map) {
        this.voucher = map;
    }
}

package com.ss.android.ugc.aweme.profile.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class TTSeller implements Serializable {

    @C09CT("is_allow_list_seller")
    public final boolean isAllowListSeller;

    @C09CT("seller_account_type")
    public final int type;

    public TTSeller() {
        this(0, false);
    }

    public final int getType() {
        return this.type;
    }

    public final boolean isAllowListSeller() {
        return this.isAllowListSeller;
    }

    public TTSeller(int i, boolean z) {
        this.type = i;
        this.isAllowListSeller = z;
    }
}

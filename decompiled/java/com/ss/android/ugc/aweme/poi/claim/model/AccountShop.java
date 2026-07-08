package com.ss.android.ugc.aweme.poi.claim.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class AccountShop {

    @C09CT("filter_l0")
    public final Integer filterL0;

    @C09CT("filter_l1")
    public final Integer filterL1;

    @C09CT("filter_l2")
    public final Integer filterL2;

    @C09CT("filter_tt_level1_code")
    public final List<String> filterTTLevel1Code;

    public AccountShop() {
        this(null, null, null, null);
    }

    public AccountShop(Integer num, Integer num2, Integer num3, List<String> list) {
        this.filterL0 = num;
        this.filterL1 = num2;
        this.filterL2 = num3;
        this.filterTTLevel1Code = list;
    }
}

package com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class CountDownItem {

    @C09CT("count_down_sec")
    public final Long countDownSec;

    @C09CT("placeholder")
    public final String placeholder;

    public CountDownItem(String str, Long l) {
        this.placeholder = str;
        this.countDownSec = l;
    }
}

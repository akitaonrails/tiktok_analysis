package com.ss.android.ugc.aweme.ecommerce.search.pendant.coin.model;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchCoinData {

    @C09CT("coins_count")
    public final String coinsCount;

    @C09CT("countdown_time")
    public final Long countDownTime;

    @C09CT("keyword")
    public String keyword;

    @C09CT("root_enter_from_type")
    public Integer rootEnterFromType;

    public EcSearchCoinData() {
        this(null, null, null, null);
    }

    public EcSearchCoinData(String str, Long l, Integer num, String str2) {
        this.coinsCount = str;
        this.countDownTime = l;
        this.rootEnterFromType = num;
        this.keyword = str2;
    }
}

package com.ss.android.ugc.aweme.ecommerce.search.pendant.coin.model;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchCoinModel {

    @C09CT("data")
    public final EcSearchCoinData ecSearchCoinData;

    @C09CT("state")
    public final Integer state;

    public EcSearchCoinModel() {
        this(null, null);
    }

    public EcSearchCoinModel(Integer num, EcSearchCoinData ecSearchCoinData) {
        this.state = num;
        this.ecSearchCoinData = ecSearchCoinData;
    }
}

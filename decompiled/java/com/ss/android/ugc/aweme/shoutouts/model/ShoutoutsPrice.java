package com.ss.android.ugc.aweme.shoutouts.model;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class ShoutoutsPrice {

    @C09CT("buyer_payment")
    public final StandardMoney buyerPayment;

    @C09CT("coin")
    public final int coin;

    @C09CT("creator_earning")
    public final StandardMoney creatorEarning;

    public ShoutoutsPrice(int i, StandardMoney standardMoney, StandardMoney standardMoney2) {
        this.coin = i;
        this.buyerPayment = standardMoney;
        this.creatorEarning = standardMoney2;
    }
}

package com.ss.android.ugc.aweme.shoutouts.model;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class StandardMoney {

    @C09CT("currency_character")
    public final String currencyCharacter;

    @C09CT("currency_name")
    public final String currencyName;

    @C09CT("money")
    public final int money;

    @C09CT("money_str")
    public final String moneyStr;

    public StandardMoney(int i, String str, String str2, String str3) {
        this.money = i;
        this.currencyName = str;
        this.currencyCharacter = str2;
        this.moneyStr = str3;
    }
}

package com.ss.android.ugc.aweme.minis.payment;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class MerchantIdList {

    @C09CT("mid_mini_type_app")
    public final String midMinisTypeApp;

    @C09CT("mid_mini_type_app_subscribe")
    public final String midMinisTypeAppSubscribe;

    @C09CT("mid_mini_type_game")
    public final String midMinisTypeGame;

    public MerchantIdList() {
        this(null, null, null);
    }

    public MerchantIdList(String str, String str2, String str3) {
        this.midMinisTypeApp = str;
        this.midMinisTypeGame = str2;
        this.midMinisTypeAppSubscribe = str3;
    }
}

package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoNimbleConfig {

    @C09CT("nimble_gecko_key")
    public final String nimbleGeckoKey;

    @C09CT("nimble_key")
    public String nimbleKey;

    public TakoNimbleConfig() {
        this(null, null);
    }

    public TakoNimbleConfig(String str, String str2) {
        this.nimbleKey = str;
        this.nimbleGeckoKey = str2;
    }
}

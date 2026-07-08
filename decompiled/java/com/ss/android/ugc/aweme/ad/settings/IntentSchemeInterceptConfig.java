package com.ss.android.ugc.aweme.ad.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes17.dex */
public final class IntentSchemeInterceptConfig {

    @C09CT("pattern")
    public String pattern;

    @C09CT("type")
    public int type;

    public IntentSchemeInterceptConfig() {
        this("", -1);
    }

    public IntentSchemeInterceptConfig(String str, int i) {
        this.pattern = str;
        this.type = i;
    }
}

package com.ss.android.ugc.aweme.slash.data;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public final class SlashLoadTimeMs implements Serializable {

    @C09CT("android")
    public final Integer androidTimeMs;

    @C09CT("iOS")
    public final Integer iosTimeMs;

    public SlashLoadTimeMs() {
        this(null, null);
    }

    public SlashLoadTimeMs(Integer num, Integer num2) {
        this.androidTimeMs = num;
        this.iosTimeMs = num2;
    }
}

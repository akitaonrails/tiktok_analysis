package com.ss.android.ugc.aweme.im.lightinteract.impl.exp;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class TIMStaggerConfig {

    @C09CT("is_enable")
    public final int isEnable;

    @C09CT("windows")
    public final long windows;

    public TIMStaggerConfig() {
        this(60L, 1);
    }

    public TIMStaggerConfig(long j, int i) {
        this.windows = j;
        this.isEnable = i;
    }
}

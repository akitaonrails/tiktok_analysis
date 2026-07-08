package com.ss.android.ugc.aweme.notification.frequency;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class Config {
    public static final int $stable = 0;

    @C09CT("userAction")
    public final int actionName;

    @C09CT("maxRecordCount")
    public final int saveMaxCount;

    public Config() {
        this(0, 100);
    }

    public Config(int i, int i2) {
        this.actionName = i;
        this.saveMaxCount = i2;
    }
}

package com.ss.android.ugc.aweme.tako.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes36.dex */
public final class TakoPerfMessageCountConfig {

    @C09CT("init_message_count")
    public final int initMessageCount;

    @C09CT("load_message_count")
    public final int loadMessageCount;

    public TakoPerfMessageCountConfig() {
        this(20, 20);
    }

    public TakoPerfMessageCountConfig(int i, int i2) {
        this.initMessageCount = i;
        this.loadMessageCount = i2;
    }
}

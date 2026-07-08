package com.ss.android.ugc.aweme.im.common.setting;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageContentRefreshConfig {

    @C09CT("interval")
    public final int interval;

    @C09CT("time_stamp")
    public final long version;

    public MessageContentRefreshConfig() {
        this(-1L, 30);
    }

    public MessageContentRefreshConfig(long j, int i) {
        this.version = j;
        this.interval = i;
    }
}

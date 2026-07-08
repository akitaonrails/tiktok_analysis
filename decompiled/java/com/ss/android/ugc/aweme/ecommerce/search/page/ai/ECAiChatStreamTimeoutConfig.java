package com.ss.android.ugc.aweme.ecommerce.search.page.ai;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class ECAiChatStreamTimeoutConfig {

    @C09CT("connect_timeout_ms")
    public final long connectTimeoutMs;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("read_timeout_ms")
    public final long readTimeoutMs;

    @C09CT("write_timeout_ms")
    public final long writeTimeoutMs;

    public ECAiChatStreamTimeoutConfig() {
        this(true, -1L, -1L, -1L);
    }

    public ECAiChatStreamTimeoutConfig(boolean z, long j, long j2, long j3) {
        this.enable = z;
        this.connectTimeoutMs = j;
        this.writeTimeoutMs = j2;
        this.readTimeoutMs = j3;
    }
}

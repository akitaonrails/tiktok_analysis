package com.bytedance.im.core.client.configs;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class IMSDKInvalidTokenStatusCodeFixV2Config {

    @C09CT("delay_between_token_refresh")
    public final long delayBetweenTokenRefreshes;

    @C09CT("delay_between_reconnections")
    public final long delayBetweenWsReconnections;

    @C09CT("enable")
    public final boolean isEnabled;

    @C09CT("should_reconnect_web_socket")
    public final boolean shouldReconnectWebSocket;

    @C09CT("should_refresh_token")
    public final boolean shouldRefreshToken;

    @C09CT("should_retry_http")
    public final boolean shouldRetryHttp;

    public IMSDKInvalidTokenStatusCodeFixV2Config() {
        this(false, false, false, 0L, 0L, false);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public IMSDKInvalidTokenStatusCodeFixV2Config(boolean z, boolean z2, boolean z3, long j, long j2, boolean z4) {
        this.isEnabled = z;
        this.shouldRetryHttp = z2;
        this.shouldReconnectWebSocket = z3;
        this.delayBetweenWsReconnections = j;
        this.delayBetweenTokenRefreshes = j2;
        this.shouldRefreshToken = z4;
    }
}

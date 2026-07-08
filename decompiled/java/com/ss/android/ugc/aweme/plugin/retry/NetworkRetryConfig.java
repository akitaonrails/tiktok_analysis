package com.ss.android.ugc.aweme.plugin.retry;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class NetworkRetryConfig {

    @C09CT("delay_ms")
    public final Integer delayMs;

    @C09CT("endpoints")
    public final List<String> endpoints;

    @C09CT("retry_number")
    public final Integer retryNumber;

    @C09CT("retry_strategy")
    public final RetryStrategy retryStrategy;

    @C09CT("timeout_ms")
    public final Integer timeoutMs;

    public NetworkRetryConfig() {
        this(null, null, null, null, null, 31, null);
    }

    public NetworkRetryConfig(RetryStrategy retryStrategy, Integer num, Integer num2, Integer num3, List<String> list) {
        this.retryStrategy = retryStrategy;
        this.retryNumber = num;
        this.delayMs = num2;
        this.timeoutMs = num3;
        this.endpoints = list;
    }

    public NetworkRetryConfig(RetryStrategy retryStrategy, Integer num, Integer num2, Integer num3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? RetryStrategy.NO_RETRY : retryStrategy, (i & 2) != 0 ? 0 : num, (i & 4) != 0 ? 0 : num2, (i & 8) != 0 ? 0 : num3, (i & 16) != 0 ? C13BV.INSTANCE : list);
    }
}

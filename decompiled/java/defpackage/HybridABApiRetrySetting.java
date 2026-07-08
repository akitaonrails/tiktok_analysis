package defpackage;

import X.C09CT;

/* JADX INFO: loaded from: classes5.dex */
public final class HybridABApiRetrySetting {

    @C09CT("delay_ms")
    public final long delayMs;

    @C09CT("disable_retry_when_network_change")
    public final boolean disableRetryWhenNetworkChange;

    @C09CT("enable_retry")
    public final boolean enableRetry;

    @C09CT("enable_when_network_change")
    public final boolean enableWhenNetworkChange;

    @C09CT("max_retry_times")
    public final int maxRetryTimes;

    @C09CT("max_times_when_network_change")
    public final int maxTimesWhenNetworkChange;

    @C09CT("request_after_boot_finish")
    public final boolean requestAfterBootFinish;

    @C09CT("retry_interval_ms")
    public final long retryIntervalMs;

    public HybridABApiRetrySetting() {
        this(true, 3, 1500L, 0L, true, 3, true, false);
    }

    public HybridABApiRetrySetting(boolean z, int i, long j, long j2, boolean z2, int i2, boolean z3, boolean z4) {
        this.enableRetry = z;
        this.maxRetryTimes = i;
        this.retryIntervalMs = j;
        this.delayMs = j2;
        this.enableWhenNetworkChange = z2;
        this.maxTimesWhenNetworkChange = i2;
        this.disableRetryWhenNetworkChange = z3;
        this.requestAfterBootFinish = z4;
    }
}

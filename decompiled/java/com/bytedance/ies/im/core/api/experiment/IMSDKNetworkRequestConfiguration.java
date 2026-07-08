package com.bytedance.ies.im.core.api.experiment;

import X.C09CT;
import X.C0YIK;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: loaded from: classes15.dex */
public final class IMSDKNetworkRequestConfiguration {

    @C09CT("composite_request_configuration")
    public final IMSDKCompositeRequestConfiguration compositeRequestConfig;

    @C09CT("enable_timeout_adjustment")
    public final boolean enableTimeoutAdjustment;

    @C09CT("http_max_retry")
    public final int httpMaxRetry;

    @C09CT("http_retry_interval_millis")
    public final long httpRetryIntervalMs;

    @C09CT("ws_max_request")
    public final int wsMaxRequest;

    @C09CT("ws_request_timeout_millis")
    public final long wsRequestTimeoutMs;

    @C09CT("ws_retry_interval_millis")
    public final long wsRetryIntervalMs;

    public IMSDKNetworkRequestConfiguration() {
        this(new IMSDKCompositeRequestConfiguration(null, 0, 0L, 7, null), 3, Mp4ScreenVideoLoadTimeout.CONTROL, 0, 2000L, 0L, false);
    }

    public final C0YIK toSDKModel() {
        return new C0YIK(this.wsMaxRequest, this.wsRetryIntervalMs, this.httpMaxRetry, this.httpRetryIntervalMs, this.compositeRequestConfig.toSDKModel(), 80);
    }

    public IMSDKNetworkRequestConfiguration(IMSDKCompositeRequestConfiguration iMSDKCompositeRequestConfiguration, int i, long j, int i2, long j2, long j3, boolean z) {
        this.compositeRequestConfig = iMSDKCompositeRequestConfiguration;
        this.wsMaxRequest = i;
        this.wsRetryIntervalMs = j;
        this.httpMaxRetry = i2;
        this.httpRetryIntervalMs = j2;
        this.wsRequestTimeoutMs = j3;
        this.enableTimeoutAdjustment = z;
    }
}

package com.bytedance.im.core.client.configs;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class IMSDKStrangerMessageRequestOptConfig {

    @C09CT("batch_ack_sample_rate")
    public final float batchAckSampleRate;

    @C09CT("optimise_get_conversation_type")
    public final boolean optimiseGetConversationType;

    @C09CT("retry_buffer_activity_sample_rate")
    public final float retryBufferActivitySampleRate;

    @C09CT("throttle_provide_message_request_data_interval_ms")
    public final long throttleProvideMessageRequestDataIntervalMs;

    public IMSDKStrangerMessageRequestOptConfig() {
        this(1.0f, 1.0f, false, -1L);
    }

    public IMSDKStrangerMessageRequestOptConfig(float f, float f2, boolean z, long j) {
        this.retryBufferActivitySampleRate = f;
        this.batchAckSampleRate = f2;
        this.optimiseGetConversationType = z;
        this.throttleProvideMessageRequestDataIntervalMs = j;
    }
}

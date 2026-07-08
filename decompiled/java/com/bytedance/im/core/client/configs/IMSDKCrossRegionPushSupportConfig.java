package com.bytedance.im.core.client.configs;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class IMSDKCrossRegionPushSupportConfig {

    @C09CT("is_cross_region_push_supported")
    public final boolean isCrossRegionPushSupported;

    @C09CT("recovery_time_event_sample_rate")
    public final float recoveryTimeEventSampleRate;

    @C09CT("update_message_batch_size")
    public final int updateMessageBatchSize;

    @C09CT("update_message_max_message_count")
    public final int updateMessageMaxMessageCount;

    public IMSDKCrossRegionPushSupportConfig() {
        this(0.0f, false, 100, 100);
    }

    public final boolean isCrossRegionPushSupported() {
        return this.isCrossRegionPushSupported;
    }

    public IMSDKCrossRegionPushSupportConfig(float f, boolean z, int i, int i2) {
        this.recoveryTimeEventSampleRate = f;
        this.isCrossRegionPushSupported = z;
        this.updateMessageBatchSize = i;
        this.updateMessageMaxMessageCount = i2;
    }
}

package com.bytedance.im.core.client.configs;

import X.C09CT;

/* JADX INFO: loaded from: classes15.dex */
public final class IMSDKOutOfOrderPushConfig {

    @C09CT("buffer_item_timeout")
    public final long bufferItemTimeout;

    @C09CT("enable")
    public final boolean isEnabled;

    @C09CT("max_buffer_size")
    public final int maxBufferSize;

    @C09CT("should_save_message_when_cursor_too_old")
    public final boolean shouldSaveMessageWhenCursorTooOld;

    @C09CT("should_trigger_pull_when_cursor_too_old")
    public final boolean shouldTriggerPullWhenCursorTooOld;

    public IMSDKOutOfOrderPushConfig() {
        this(false, 0L, 0, false, false);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public IMSDKOutOfOrderPushConfig(boolean z, long j, int i, boolean z2, boolean z3) {
        this.isEnabled = z;
        this.bufferItemTimeout = j;
        this.maxBufferSize = i;
        this.shouldSaveMessageWhenCursorTooOld = z2;
        this.shouldTriggerPullWhenCursorTooOld = z3;
    }
}

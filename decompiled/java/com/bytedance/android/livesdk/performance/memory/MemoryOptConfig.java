package com.bytedance.android.livesdk.performance.memory;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class MemoryOptConfig {
    public static final TypeAdapter ADAPTER = new MemoryOptConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("low_mem_buffer_threshold")
    public int bufferThreshold;

    @C09CT("exit_clear_gift_cache")
    public boolean exitClearGiftCache;

    @C09CT("is_enabled")
    public boolean isEnabled;

    @C09CT("opt_event_deliver_size")
    public int optCommonEventDeliverQueueSize;

    @C09CT("apm_buffer_adjust_size")
    public int optedBufferSize;

    public MemoryOptConfig() {
        this(false, false, 0, 0, 0);
    }

    public final int getBufferThreshold() {
        return this.bufferThreshold;
    }

    public final boolean getExitClearGiftCache() {
        return this.exitClearGiftCache;
    }

    public final int getOptCommonEventDeliverQueueSize() {
        return this.optCommonEventDeliverQueueSize;
    }

    public final int getOptedBufferSize() {
        return this.optedBufferSize;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void setBufferThreshold(int i) {
        this.bufferThreshold = i;
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
    }

    public final void setExitClearGiftCache(boolean z) {
        this.exitClearGiftCache = z;
    }

    public final void setOptCommonEventDeliverQueueSize(int i) {
        this.optCommonEventDeliverQueueSize = i;
    }

    public final void setOptedBufferSize(int i) {
        this.optedBufferSize = i;
    }

    public MemoryOptConfig(boolean z, boolean z2, int i, int i2, int i3) {
        this.isEnabled = z;
        this.exitClearGiftCache = z2;
        this.optedBufferSize = i;
        this.bufferThreshold = i2;
        this.optCommonEventDeliverQueueSize = i3;
    }
}

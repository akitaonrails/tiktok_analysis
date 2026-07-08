package com.bytedance.android.livesdk.livesetting;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes36.dex */
public final class AnimFactoryConfig {
    public static final TypeAdapter ADAPTER = new AnimFactoryConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("disable_reusing_bitmap")
    public boolean disableReusingBitmap;

    @C09CT("enable_clear_opt")
    public boolean enableClearOpt;

    @C09CT("enable_memory_opt")
    public boolean enableMemoryOpt;

    @C09CT("enable_share_key")
    public boolean enableShareKey;

    @C09CT("enable_single_cache")
    public boolean enableSingleCache;

    public final boolean getDisableReusingBitmap() {
        return this.disableReusingBitmap;
    }

    public final boolean getEnableClearOpt() {
        return this.enableClearOpt;
    }

    public final boolean getEnableMemoryOpt() {
        return this.enableMemoryOpt;
    }

    public final boolean getEnableShareKey() {
        return this.enableShareKey;
    }

    public final boolean getEnableSingleCache() {
        return this.enableSingleCache;
    }

    public final void setDisableReusingBitmap(boolean z) {
        this.disableReusingBitmap = z;
    }

    public final void setEnableClearOpt(boolean z) {
        this.enableClearOpt = z;
    }

    public final void setEnableMemoryOpt(boolean z) {
        this.enableMemoryOpt = z;
    }

    public final void setEnableShareKey(boolean z) {
        this.enableShareKey = z;
    }

    public final void setEnableSingleCache(boolean z) {
        this.enableSingleCache = z;
    }
}

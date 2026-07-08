package com.bytedance.android.livesdk.livesetting.message;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: classes18.dex */
public final class HoldMessageDispatchConfig {
    public static final TypeAdapter ADAPTER = new HoldMessageDispatchConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enabled")
    public boolean enabled;

    @C09CT("max_hold_count")
    public int maxHoldCount = 100;

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getMaxHoldCount() {
        return this.maxHoldCount;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setMaxHoldCount(int i) {
        this.maxHoldCount = i;
    }
}

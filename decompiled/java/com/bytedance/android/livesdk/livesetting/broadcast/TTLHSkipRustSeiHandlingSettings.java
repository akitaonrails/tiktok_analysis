package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttlh_skip_rust_sei_handling_opt")
public final class TTLHSkipRustSeiHandlingSettings {
    public static final int DEFAULT = 0;
    public static final TTLHSkipRustSeiHandlingSettings INSTANCE = new TTLHSkipRustSeiHandlingSettings();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("ttlh_skip_rust_sei_handling_opt", DEFAULT) == 1;
    }
}

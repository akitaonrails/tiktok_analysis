package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_pad_multi_screen_state_persistence")
public final class LivePadMultiScreenStatePersistenceSetting {
    public static final boolean DEFAULT = false;
    public static final LivePadMultiScreenStatePersistenceSetting INSTANCE = new LivePadMultiScreenStatePersistenceSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_pad_multi_screen_state_persistence", DEFAULT);
    }
}

package com.bytedance.android.livesdk.livesetting.privilege;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_advanced_message_universe_purple_background")
public final class LiveAdvanceMessageBackgroundSetting {
    public static final boolean DEFAULT = false;
    public static final LiveAdvanceMessageBackgroundSetting INSTANCE = new LiveAdvanceMessageBackgroundSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_advanced_message_universe_purple_background", DEFAULT);
    }
}

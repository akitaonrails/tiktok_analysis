package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_makeup_entry_enable")
public final class LiveMakeupEntrySetting {
    public static final int DEFAULT = 0;
    public static final LiveMakeupEntrySetting INSTANCE = new LiveMakeupEntrySetting();

    public final boolean show() {
        return SettingsManager.INSTANCE.getIntValue("live_makeup_entry_enable", DEFAULT) == 1;
    }
}

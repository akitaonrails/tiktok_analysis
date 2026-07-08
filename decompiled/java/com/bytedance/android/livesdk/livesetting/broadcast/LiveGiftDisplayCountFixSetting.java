package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_gift_display_count_fix_setting")
public final class LiveGiftDisplayCountFixSetting {
    public static final LiveGiftDisplayCountFixSetting INSTANCE = new LiveGiftDisplayCountFixSetting();
    public static final boolean DEFAULT = false;
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue("live_gift_display_count_fix_setting", DEFAULT);

    public final boolean getValue() {
        return value;
    }
}

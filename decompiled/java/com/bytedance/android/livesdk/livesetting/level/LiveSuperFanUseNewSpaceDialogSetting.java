package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_super_fan_use_new_space_dialog")
public final class LiveSuperFanUseNewSpaceDialogSetting {
    public static final boolean DEFAULT = true;
    public static final LiveSuperFanUseNewSpaceDialogSetting INSTANCE = new LiveSuperFanUseNewSpaceDialogSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_super_fan_use_new_space_dialog", DEFAULT);
    }
}

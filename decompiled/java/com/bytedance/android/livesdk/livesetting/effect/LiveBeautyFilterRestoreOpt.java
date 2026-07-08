package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_beauty_filter_restore_opt")
public final class LiveBeautyFilterRestoreOpt {
    public static final LiveBeautyFilterRestoreOpt INSTANCE = new LiveBeautyFilterRestoreOpt();
    public static final boolean DEFAULT = false;
    public static final boolean setting = SettingsManager.INSTANCE.getBooleanValue("live_beauty_filter_restore_opt", DEFAULT);

    public final boolean disable() {
        return !setting;
    }

    public final boolean enable() {
        return setting;
    }
}

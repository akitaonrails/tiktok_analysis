package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_ai_beauty_setting")
public final class LiveAIBeautySetting {
    public static final int DEFAULT = 0;
    public static final LiveAIBeautySetting INSTANCE = new LiveAIBeautySetting();

    private final int getSettingValue() {
        return SettingsManager.INSTANCE.getIntValue("live_ai_beauty_setting", DEFAULT);
    }

    public final boolean enableAIBeauty() {
        return getSettingValue() > 1 && !LiveBeautyReverseExperiment.INSTANCE.isInExperiment();
    }

    public final boolean enableDialogUpdate() {
        return getSettingValue() > 0 && getSettingValue() < 3;
    }
}

package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_effect_redundant_message_opt")
public final class LiveEffectMessageBlockSetting {
    public static final int DEFAULT = 0;
    public static final LiveEffectMessageBlockSetting INSTANCE = new LiveEffectMessageBlockSetting();

    private final int getSettingValue() {
        return SettingsManager.INSTANCE.getIntValue("live_effect_redundant_message_opt", DEFAULT);
    }

    public final boolean newOPT() {
        return getSettingValue() == 3;
    }

    public final boolean shouldBlockRedundantMessage() {
        return getSettingValue() == 2;
    }

    public final boolean shouldReportMessage() {
        return getSettingValue() > 0;
    }
}

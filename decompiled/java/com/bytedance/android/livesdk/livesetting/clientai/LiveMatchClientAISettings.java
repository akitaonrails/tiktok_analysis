package com.bytedance.android.livesdk.livesetting.clientai;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_match_client_ai_setting")
public final class LiveMatchClientAISettings {
    public static final LiveMatchClientAISettings INSTANCE = new LiveMatchClientAISettings();
    public static final MpuClientAIParams DEFAULT = new MpuClientAIParams(null, 0, 0, 0, 15, null);

    public final MpuClientAIParams getSettingParams() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        MpuClientAIParams mpuClientAIParams = DEFAULT;
        MpuClientAIParams mpuClientAIParams2 = (MpuClientAIParams) settingsManager.getValueSafely("live_match_client_ai_setting", mpuClientAIParams);
        return mpuClientAIParams2 != null ? mpuClientAIParams2 : mpuClientAIParams;
    }
}

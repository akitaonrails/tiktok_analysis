package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_fans_entrance_ai_config")
public final class LiveFansClubEntranceAiConfigSettings {
    public static final FansClubGuideEntranceAIConfig DEFAULT;
    public static final LiveFansClubEntranceAiConfigSettings INSTANCE = new LiveFansClubEntranceAiConfigSettings();
    public static final FansClubGuideEntranceAIConfig value;

    static {
        FansClubGuideEntranceAIConfig fansClubGuideEntranceAIConfig = new FansClubGuideEntranceAIConfig(0, "", "");
        DEFAULT = fansClubGuideEntranceAIConfig;
        FansClubGuideEntranceAIConfig fansClubGuideEntranceAIConfig2 = (FansClubGuideEntranceAIConfig) SettingsManager.INSTANCE.getValueSafely("live_fans_entrance_ai_config", fansClubGuideEntranceAIConfig);
        if (fansClubGuideEntranceAIConfig2 != null) {
            fansClubGuideEntranceAIConfig = fansClubGuideEntranceAIConfig2;
        }
        value = fansClubGuideEntranceAIConfig;
    }

    public final FansClubGuideEntranceAIConfig getDEFAULT() {
        return DEFAULT;
    }

    public final FansClubGuideEntranceAIConfig getValue() {
        return value;
    }
}

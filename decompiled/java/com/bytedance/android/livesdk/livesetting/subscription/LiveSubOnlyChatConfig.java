package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_subscribe_sub_only_chat")
public final class LiveSubOnlyChatConfig {
    public static final LiveSubOnlyChatSetting DEFAULT;
    public static final LiveSubOnlyChatConfig INSTANCE = new LiveSubOnlyChatConfig();
    public static LiveSubOnlyChatSetting liveSubOnlyChatSetting;

    static {
        LiveSubOnlyChatSetting liveSubOnlyChatSetting2 = new LiveSubOnlyChatSetting(1, false, false);
        DEFAULT = liveSubOnlyChatSetting2;
        LiveSubOnlyChatSetting liveSubOnlyChatSetting3 = (LiveSubOnlyChatSetting) SettingsManager.INSTANCE.getValueSafely("live_subscribe_sub_only_chat", liveSubOnlyChatSetting2);
        if (liveSubOnlyChatSetting3 != null) {
            liveSubOnlyChatSetting2 = liveSubOnlyChatSetting3;
        }
        liveSubOnlyChatSetting = liveSubOnlyChatSetting2;
    }

    public final boolean animationEnable() {
        return liveSubOnlyChatSetting.getAnimationEnable();
    }

    public final boolean onLiveSwitchEnable() {
        return liveSubOnlyChatSetting.getOnLiveSwitchEnable();
    }

    public final int onLiveSwitchFrequencyMin() {
        return liveSubOnlyChatSetting.getOnLiveSwitchFrequencyMin();
    }

    public final LiveSubOnlyChatSetting getDEFAULT() {
        return DEFAULT;
    }
}

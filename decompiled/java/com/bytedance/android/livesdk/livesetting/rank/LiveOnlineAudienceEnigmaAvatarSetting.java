package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_online_audience_enigma_avatar_condition")
public final class LiveOnlineAudienceEnigmaAvatarSetting {
    public static final LiveOnlineAudienceEnigmaAvatarSetting INSTANCE = new LiveOnlineAudienceEnigmaAvatarSetting();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_online_audience_enigma_avatar_condition", DEFAULT);
    }
}

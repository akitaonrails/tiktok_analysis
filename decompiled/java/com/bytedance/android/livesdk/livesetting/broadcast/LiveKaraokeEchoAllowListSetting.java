package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_karaoke_echo_allow_list")
public final class LiveKaraokeEchoAllowListSetting {
    public static final int DEFAULT = 0;
    public static final LiveKaraokeEchoAllowListSetting INSTANCE = new LiveKaraokeEchoAllowListSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_karaoke_echo_allow_list", DEFAULT) == 1;
    }
}

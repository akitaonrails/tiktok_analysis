package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "ttlive_hangout_enable_live_card_audio_player")
public final class TtliveHangoutEnableLiveCardAudioPlayerSetting {
    public static final boolean DEFAULT = false;
    public static final TtliveHangoutEnableLiveCardAudioPlayerSetting INSTANCE = new TtliveHangoutEnableLiveCardAudioPlayerSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("ttlive_hangout_enable_live_card_audio_player", DEFAULT);
    }
}

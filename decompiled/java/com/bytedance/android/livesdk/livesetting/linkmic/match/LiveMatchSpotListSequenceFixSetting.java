package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_match_spot_list_sequence_fix")
public final class LiveMatchSpotListSequenceFixSetting {
    public static final LiveMatchSpotListSequenceFixSetting INSTANCE = new LiveMatchSpotListSequenceFixSetting();
    public static final boolean DEFAULT = true;

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_match_spot_list_sequence_fix", DEFAULT);
    }
}

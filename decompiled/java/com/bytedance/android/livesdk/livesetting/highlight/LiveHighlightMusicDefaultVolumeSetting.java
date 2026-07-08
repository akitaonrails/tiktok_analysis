package com.bytedance.android.livesdk.livesetting.highlight;

import X.C13LZ;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_replay_highlight_bgmusic_volume")
public final class LiveHighlightMusicDefaultVolumeSetting {
    public static final LiveHighlightMusicDefaultVolumeSetting INSTANCE = new LiveHighlightMusicDefaultVolumeSetting();
    public static final int DEFAULT = 30;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_replay_highlight_bgmusic_volume", DEFAULT);

    public static final int volume() {
        return C13LZ.LJ(value, 0, 100);
    }
}

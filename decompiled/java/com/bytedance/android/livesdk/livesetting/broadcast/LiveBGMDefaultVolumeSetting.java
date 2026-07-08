package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_bg_music_default_volume_v2")
public final class LiveBGMDefaultVolumeSetting {
    public static final float DEFAULT = 0.15f;
    public static final LiveBGMDefaultVolumeSetting INSTANCE = new LiveBGMDefaultVolumeSetting();

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue("live_bg_music_default_volume_v2", DEFAULT);
    }
}

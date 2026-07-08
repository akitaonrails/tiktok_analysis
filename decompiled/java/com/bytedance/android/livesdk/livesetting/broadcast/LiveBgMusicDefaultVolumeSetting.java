package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C1161920gLG;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostSetting;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_bg_music_default_volume")
public final class LiveBgMusicDefaultVolumeSetting {
    public static final float DEFAULT = 0.3f;
    public static final LiveBgMusicDefaultVolumeSetting INSTANCE = new LiveBgMusicDefaultVolumeSetting();

    public final float getValue() {
        if (((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).eR1()) {
            return 0.3f;
        }
        return SettingsManager.INSTANCE.getFloatValue("live_bg_music_default_volume", DEFAULT);
    }
}

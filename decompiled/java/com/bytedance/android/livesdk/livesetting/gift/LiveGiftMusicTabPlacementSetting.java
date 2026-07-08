package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_gift_music_tab_placement")
public final class LiveGiftMusicTabPlacementSetting {
    public static final LiveGiftMusicTabPlacementSetting INSTANCE = new LiveGiftMusicTabPlacementSetting();
    public static final MusicGiftTabPlacementConfig DEFAULT = new MusicGiftTabPlacementConfig();

    private final MusicGiftTabPlacementConfig value() {
        MusicGiftTabPlacementConfig musicGiftTabPlacementConfig = (MusicGiftTabPlacementConfig) SettingsManager.INSTANCE.getValueSafely(LiveGiftMusicTabPlacementSetting.class);
        return musicGiftTabPlacementConfig == null ? DEFAULT : musicGiftTabPlacementConfig;
    }

    public final int firstExposureThreshold() {
        Integer numValueOf = Integer.valueOf(value().firstExposureThreshold);
        return numValueOf.intValue() > 0 ? numValueOf.intValue() : DEFAULT.firstExposureThreshold;
    }

    public final int secondExposureThreshold() {
        int iFirstExposureThreshold = firstExposureThreshold();
        Integer numValueOf = Integer.valueOf(value().secondExposureThreshold);
        if (!(numValueOf.intValue() > iFirstExposureThreshold)) {
            numValueOf = null;
        }
        Integer numValueOf2 = Integer.valueOf(DEFAULT.secondExposureThreshold);
        return numValueOf != null ? numValueOf.intValue() : numValueOf2.intValue() > iFirstExposureThreshold ? numValueOf2.intValue() : iFirstExposureThreshold + 1;
    }
}

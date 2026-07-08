package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_karaoke_vocal")
public final class LiveKaraokeVocalSetting {
    public static final LiveKaraokeVocalSetting INSTANCE = new LiveKaraokeVocalSetting();
    public static final LiveKaraokeVocal DEFAULT = new LiveKaraokeVocal(1.0f, 0.0f, 0.5f);

    public final LiveKaraokeVocal getSetting() {
        return (LiveKaraokeVocal) SettingsManager.INSTANCE.getValueSafely("live_karaoke_vocal", DEFAULT);
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final float m122default() {
        LiveKaraokeVocal setting = getSetting();
        if (setting == null) {
            setting = DEFAULT;
        }
        return setting.f27default;
    }

    public final float max() {
        LiveKaraokeVocal setting = getSetting();
        if (setting == null) {
            setting = DEFAULT;
        }
        return setting.max;
    }

    public final float min() {
        LiveKaraokeVocal setting = getSetting();
        if (setting == null) {
            setting = DEFAULT;
        }
        return setting.min;
    }

    public final int uiDefault() {
        float fMax = max();
        float fMin = min();
        float fM122default = m122default();
        if (fMin >= fMax) {
            fMax = 1.0f;
            fMin = 0.0f;
        }
        if (fM122default > fMax) {
            fM122default = fMax;
        }
        if (fM122default < fMin) {
            fM122default = fMin;
        }
        return (int) ((fM122default * 100) / (fMax - fMin));
    }
}

package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_karaoke_accompaniment")
public final class LiveKaraokeAccompanySetting {
    public static final LiveKaraokeAccompanySetting INSTANCE = new LiveKaraokeAccompanySetting();
    public static final LiveKaraokeAccompany DEFAULT = new LiveKaraokeAccompany(1.0f, 0.0f, 0.5f);

    public final LiveKaraokeAccompany getSetting() {
        return (LiveKaraokeAccompany) SettingsManager.INSTANCE.getValueSafely("live_karaoke_accompaniment", DEFAULT);
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final float m121default() {
        LiveKaraokeAccompany setting = getSetting();
        if (setting == null) {
            setting = DEFAULT;
        }
        return setting.f26default;
    }

    public final float max() {
        LiveKaraokeAccompany setting = getSetting();
        if (setting == null) {
            setting = DEFAULT;
        }
        return setting.max;
    }

    public final float min() {
        LiveKaraokeAccompany setting = getSetting();
        if (setting == null) {
            setting = DEFAULT;
        }
        return setting.min;
    }

    public final int uiDefault() {
        float fMax = max();
        float fMin = min();
        float fM121default = m121default();
        if (fMin >= fMax) {
            fMax = 1.0f;
            fMin = 0.0f;
        }
        if (fM121default > fMax) {
            fM121default = fMax;
        }
        if (fM121default < fMin) {
            fM121default = fMin;
        }
        return (int) ((fM121default * 100) / (fMax - fMin));
    }
}

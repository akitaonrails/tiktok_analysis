package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_karaoke_log_opt")
public final class MultiGuestKaraokeLogOptSetting {
    public static final int DEFAULT = 0;
    public static final MultiGuestKaraokeLogOptSetting INSTANCE;
    public static final int logValue;

    static {
        MultiGuestKaraokeLogOptSetting multiGuestKaraokeLogOptSetting = new MultiGuestKaraokeLogOptSetting();
        INSTANCE = multiGuestKaraokeLogOptSetting;
        logValue = multiGuestKaraokeLogOptSetting.getValue();
    }

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("multi_guest_karaoke_log_opt", DEFAULT);
    }

    public final boolean shouldCloseLog() {
        return logValue == 0;
    }

    public final boolean shouldUseALog() {
        return logValue == 1;
    }

    public final boolean shouldUseAndroidLog() {
        return logValue == 2;
    }
}

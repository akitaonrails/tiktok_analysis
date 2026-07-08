package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_io_opt_experience")
public final class LiveIoOptExperience {
    public static final LiveIoOptExperience INSTANCE = new LiveIoOptExperience();
    public static final int DEFAULT = 0;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_io_opt_experience", DEFAULT);

    public final boolean enableGiftManagerOpt() {
        return (value & 2) == 2;
    }

    public final boolean enableLiveDslOpt() {
        return (value & 4) == 4;
    }

    public final boolean enableStrategyOpt() {
        return (value & 1) == 1;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getValue() {
        return value;
    }
}

package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C1338270kvh;
import com.bytedance.android.live.annotation.SettingsKey;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "live_public_screen_log_interval")
public final class LivePublicScreenLogIntervalSetting {
    public static final int DEFAULT = 60;
    public static final LivePublicScreenLogIntervalSetting INSTANCE = new LivePublicScreenLogIntervalSetting();

    public final int getValue() {
        Map<String, Object> map = C1338270kvh.LIZ;
        return 60;
    }
}

package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("cohost_recognize_setting")
public final class DebugToolCoHostRecognizeSetting {
    public static final DebugToolCoHostRecognizeSetting INSTANCE = new DebugToolCoHostRecognizeSetting();
    public static final CoHostRecognizeSetting DEFAULT = new CoHostRecognizeSetting(false, true);

    public final CoHostRecognizeSetting getValue() {
        return (CoHostRecognizeSetting) SettingsManager.INSTANCE.getValueSafely("cohost_recognize_setting", DEFAULT);
    }

    public final boolean isLog() {
        CoHostRecognizeSetting value = getValue();
        if (value == null) {
            value = DEFAULT;
        }
        return value.isLog;
    }

    public final boolean isNewCheck() {
        CoHostRecognizeSetting value = getValue();
        return value != null ? value.isLog : DEFAULT.isNewCheck;
    }

    public final CoHostRecognizeSetting getDEFAULT() {
        return DEFAULT;
    }
}

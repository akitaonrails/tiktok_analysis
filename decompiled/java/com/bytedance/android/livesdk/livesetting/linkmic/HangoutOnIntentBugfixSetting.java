package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "hangout_on_intent_bugfix")
public final class HangoutOnIntentBugfixSetting {
    public static final int DEFAULT = 1;
    public static final HangoutOnIntentBugfixSetting INSTANCE = new HangoutOnIntentBugfixSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("hangout_on_intent_bugfix", DEFAULT);
    }

    public final boolean isFix() {
        return getValue() == 1;
    }
}

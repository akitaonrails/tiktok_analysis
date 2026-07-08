package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes32.dex */
@SettingsKey(preciseExperiment = false, value = "playbook_auto_run_type")
public final class PlaybookAutoRunTypeSetting {
    public static final int DEFAULT = 0;
    public static final int ENABLE_WITH_SWITCH_OFF = 2;
    public static final int ENABLE_WITH_SWITCH_ON = 1;
    public static final PlaybookAutoRunTypeSetting INSTANCE = new PlaybookAutoRunTypeSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("playbook_auto_run_type", DEFAULT);
    }

    public final boolean enable() {
        return getValue() == 1 || getValue() == 2;
    }

    public final boolean isEnableWithSwitchOff() {
        return getValue() == 2;
    }

    public final boolean isEnableWithSwitchOn() {
        return getValue() == 1;
    }
}

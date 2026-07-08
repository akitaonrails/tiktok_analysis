package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_composer_gift_priority_switch")
public final class LiveComposerGiftPrioritySwitch {
    public static final LiveComposerGiftPrioritySwitch INSTANCE = new LiveComposerGiftPrioritySwitch();
    public static final int DEFAULT = 1;
    public static final int value = SettingsManager.INSTANCE.getIntValue("live_composer_gift_priority_switch", DEFAULT);

    public final boolean isEnable() {
        return value > 0;
    }
}

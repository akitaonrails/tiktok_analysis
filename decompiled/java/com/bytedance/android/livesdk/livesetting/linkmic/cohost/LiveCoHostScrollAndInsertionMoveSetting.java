package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "live_cohost_scroll_and_insertion_move")
public final class LiveCoHostScrollAndInsertionMoveSetting {
    public static final boolean DEFAULT = true;
    public static final LiveCoHostScrollAndInsertionMoveSetting INSTANCE = new LiveCoHostScrollAndInsertionMoveSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_cohost_scroll_and_insertion_move", DEFAULT);
    }

    public final boolean isEnable() {
        return getValue();
    }
}

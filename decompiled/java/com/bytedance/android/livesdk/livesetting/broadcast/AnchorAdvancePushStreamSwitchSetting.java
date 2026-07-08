package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_advance_push_stream_switch")
public final class AnchorAdvancePushStreamSwitchSetting {
    public static final int DEFAULT = 0;
    public static final AnchorAdvancePushStreamSwitchSetting INSTANCE = new AnchorAdvancePushStreamSwitchSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("anchor_advance_push_stream_switch", DEFAULT) == 1;
    }
}

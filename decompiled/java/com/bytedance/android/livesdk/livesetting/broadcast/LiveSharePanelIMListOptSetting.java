package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "anchor_share_list_type")
public final class LiveSharePanelIMListOptSetting {
    public static final int DEFAULT = 0;
    public static final LiveSharePanelIMListOptSetting INSTANCE = new LiveSharePanelIMListOptSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("anchor_share_list_type", DEFAULT) != 0;
    }
}

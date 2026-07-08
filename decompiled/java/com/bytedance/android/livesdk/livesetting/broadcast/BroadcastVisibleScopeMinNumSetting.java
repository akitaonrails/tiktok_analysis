package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_visible_scope_picker_min_num")
public final class BroadcastVisibleScopeMinNumSetting {
    public static final int DEFAULT = -1;
    public static final BroadcastVisibleScopeMinNumSetting INSTANCE = new BroadcastVisibleScopeMinNumSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_visible_scope_picker_min_num", DEFAULT);
    }
}

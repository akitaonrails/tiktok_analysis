package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "live_visible_scope_picker_max_num")
public final class BroadcastVisibleScopeMaxNumSetting {
    public static final int DEFAULT = 1000;
    public static final BroadcastVisibleScopeMaxNumSetting INSTANCE = new BroadcastVisibleScopeMaxNumSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_visible_scope_picker_max_num", DEFAULT);
    }
}

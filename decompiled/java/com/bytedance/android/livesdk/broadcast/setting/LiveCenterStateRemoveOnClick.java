package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_center_state_remove_on_click")
public final class LiveCenterStateRemoveOnClick {
    public static final LiveCenterStateRemoveOnClick INSTANCE = new LiveCenterStateRemoveOnClick();
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_center_state_remove_on_click", DEFAULT);
    }
}

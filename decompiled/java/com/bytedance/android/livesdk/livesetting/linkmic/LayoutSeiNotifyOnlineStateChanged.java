package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "layout_sei_notify_online_state_changed")
public final class LayoutSeiNotifyOnlineStateChanged {
    public static final boolean DEFAULT = true;
    public static final LayoutSeiNotifyOnlineStateChanged INSTANCE = new LayoutSeiNotifyOnlineStateChanged();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("layout_sei_notify_online_state_changed", DEFAULT);
    }
}

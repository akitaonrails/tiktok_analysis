package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey(preciseExperiment = false, value = "first_frame_suc_fix_while_connecting_setting")
public final class FirstFrameSucFixWhileConnectingSetting {
    public static final boolean DEFAULT = false;
    public static final FirstFrameSucFixWhileConnectingSetting INSTANCE = new FirstFrameSucFixWhileConnectingSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("first_frame_suc_fix_while_connecting_setting", DEFAULT);
    }
}

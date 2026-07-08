package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey(preciseExperiment = false, value = "live_inflater_hook")
public final class LiveInflaterHookSetting {
    public static final LiveInflaterHookSetting INSTANCE = new LiveInflaterHookSetting();
    public static final boolean DEFAULT = true;

    public static /* synthetic */ void getEnable$annotations() {
    }

    public static final boolean getEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_inflater_hook", DEFAULT) && LiveTextViewOptSetting.enable();
    }
}

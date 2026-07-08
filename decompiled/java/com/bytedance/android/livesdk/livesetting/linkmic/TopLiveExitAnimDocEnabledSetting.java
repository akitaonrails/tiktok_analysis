package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_toplive_exit_anim_doc_enabled")
public final class TopLiveExitAnimDocEnabledSetting {
    public static final boolean DEFAULT = true;
    public static final TopLiveExitAnimDocEnabledSetting INSTANCE = new TopLiveExitAnimDocEnabledSetting();

    public static final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("live_toplive_exit_anim_doc_enabled", DEFAULT);
    }
}

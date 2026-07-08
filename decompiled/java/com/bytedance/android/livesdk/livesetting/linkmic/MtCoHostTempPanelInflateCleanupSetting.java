package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("mt_co_host_temp_panel_inflate_cleanup")
public final class MtCoHostTempPanelInflateCleanupSetting {
    public static final boolean DEFAULT = true;
    public static final MtCoHostTempPanelInflateCleanupSetting INSTANCE = new MtCoHostTempPanelInflateCleanupSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("mt_co_host_temp_panel_inflate_cleanup", DEFAULT);
    }
}

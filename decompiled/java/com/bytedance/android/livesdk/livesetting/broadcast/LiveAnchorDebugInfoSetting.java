package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_anchor_debug_info_setting")
public final class LiveAnchorDebugInfoSetting {
    public static final int DEFAULT = 0;
    public static final LiveAnchorDebugInfoSetting INSTANCE = new LiveAnchorDebugInfoSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getIntValue("live_anchor_debug_info_setting", DEFAULT) == 1;
    }
}

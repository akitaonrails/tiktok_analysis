package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_anchor_applog_opt")
public final class LiveAnchorApplogOpt {
    public static final LiveAnchorApplogOpt INSTANCE = new LiveAnchorApplogOpt();
    public static final int DEFAULT = 1;

    private final int getSettingValue() {
        return SettingsManager.INSTANCE.getIntValue("live_anchor_applog_opt", DEFAULT);
    }

    public final boolean enable() {
        return getSettingValue() > 0;
    }
}

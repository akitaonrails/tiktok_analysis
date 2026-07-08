package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("ttkec_billboard_limit_drag")
public final class LiveBillboardLimitSetting {
    public static final boolean DEFAULT = false;
    public static final LiveBillboardLimitSetting INSTANCE = new LiveBillboardLimitSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("ttkec_billboard_limit_drag", DEFAULT);
    }
}

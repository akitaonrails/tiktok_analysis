package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("co_host_audience_reuse_window_setting")
public final class CoHostAudienceReuseWindowViewSetting {
    public static final boolean DEFAULT = true;
    public static final CoHostAudienceReuseWindowViewSetting INSTANCE = new CoHostAudienceReuseWindowViewSetting();

    public static final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("co_host_audience_reuse_window_setting", DEFAULT);
    }
}

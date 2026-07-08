package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_permission_apply_lynx_url")
public final class LivePermissionApplyLynx {
    public static final String DEFAULT = "";
    public static final LivePermissionApplyLynx INSTANCE = new LivePermissionApplyLynx();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_permission_apply_lynx_url", DEFAULT);
    }
}

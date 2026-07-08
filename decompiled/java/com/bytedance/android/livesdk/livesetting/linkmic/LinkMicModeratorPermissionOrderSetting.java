package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey(preciseExperiment = false, value = "mg_anchor_admin_permissions_order_opt")
public final class LinkMicModeratorPermissionOrderSetting {
    public static final boolean DEFAULT = false;
    public static final LinkMicModeratorPermissionOrderSetting INSTANCE = new LinkMicModeratorPermissionOrderSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue("mg_anchor_admin_permissions_order_opt", DEFAULT);
    }
}

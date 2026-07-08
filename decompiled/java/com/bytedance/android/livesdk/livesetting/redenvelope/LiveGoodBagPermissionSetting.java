package com.bytedance.android.livesdk.livesetting.redenvelope;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_good_bag_tool_bar_permission")
public final class LiveGoodBagPermissionSetting {
    public static final boolean DEFAULT = true;
    public static final LiveGoodBagPermissionSetting INSTANCE = new LiveGoodBagPermissionSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("live_good_bag_tool_bar_permission", DEFAULT);
    }
}

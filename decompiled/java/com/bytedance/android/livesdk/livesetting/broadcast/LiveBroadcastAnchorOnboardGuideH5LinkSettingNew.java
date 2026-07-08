package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("live_anchor_onboard_guide_h5_new")
public final class LiveBroadcastAnchorOnboardGuideH5LinkSettingNew {
    public static final String DEFAULT = "";
    public static final LiveBroadcastAnchorOnboardGuideH5LinkSettingNew INSTANCE = new LiveBroadcastAnchorOnboardGuideH5LinkSettingNew();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_anchor_onboard_guide_h5_new", DEFAULT);
    }
}

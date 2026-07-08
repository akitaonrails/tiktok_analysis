package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey(preciseExperiment = false, value = "linkmic_intercept_im_for_channel_id")
public final class LinkMicInterceptImForChannelId {
    public static final boolean DEFAULT = true;
    public static final LinkMicInterceptImForChannelId INSTANCE = new LinkMicInterceptImForChannelId();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue("linkmic_intercept_im_for_channel_id", DEFAULT);
    }
}

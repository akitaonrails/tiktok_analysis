package com.bytedance.android.livesdk.livesetting.other.subscribe;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("tikcast_sub_community")
public final class SubscribeCommunitySetting {
    public static final boolean DEFAULT = true;
    public static final SubscribeCommunitySetting INSTANCE = new SubscribeCommunitySetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue("tikcast_sub_community", DEFAULT);
    }
}

package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_enable_preview_commerce_tag")
public final class LiveForYouPageCommerceTagSetting {
    public static final int DEFAULT = 0;
    public static final LiveForYouPageCommerceTagSetting INSTANCE = new LiveForYouPageCommerceTagSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue("live_enable_preview_commerce_tag", DEFAULT);
    }
}

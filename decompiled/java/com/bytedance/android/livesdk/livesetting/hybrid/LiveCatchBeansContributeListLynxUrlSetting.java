package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_catch_bean_contributor_list_lynx_url")
public final class LiveCatchBeansContributeListLynxUrlSetting {
    public static final String DEFAULT = "";
    public static final LiveCatchBeansContributeListLynxUrlSetting INSTANCE = new LiveCatchBeansContributeListLynxUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue("live_catch_bean_contributor_list_lynx_url", DEFAULT);
    }
}

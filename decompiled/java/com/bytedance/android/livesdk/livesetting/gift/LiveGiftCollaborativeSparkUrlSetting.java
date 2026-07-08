package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("collaborative_spark_scheme_url")
public final class LiveGiftCollaborativeSparkUrlSetting {
    public static final String DEFAULT = "aweme://roma_redirect/?spark_page=moy_collaborative_gift_main";
    public static final LiveGiftCollaborativeSparkUrlSetting INSTANCE = new LiveGiftCollaborativeSparkUrlSetting();

    public final String getUrl() {
        return SettingsManager.INSTANCE.getStringValue("collaborative_spark_scheme_url", DEFAULT);
    }
}

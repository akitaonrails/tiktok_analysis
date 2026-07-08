package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_disable_audience_intro")
public final class BroadcastLiveAudienceIntroSetting {
    public static final int DEFAULT = 1;
    public static final BroadcastLiveAudienceIntroSetting INSTANCE = new BroadcastLiveAudienceIntroSetting();

    public final boolean disable() {
        return SettingsManager.INSTANCE.getIntValue("live_disable_audience_intro", DEFAULT) == 1;
    }
}

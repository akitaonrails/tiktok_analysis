package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("live_gurd_patterns")
public final class LiveGurdPatternsSetting {
    public static final LiveGurdPatternsSetting INSTANCE = new LiveGurdPatternsSetting();
    public static final String[] DEFAULT = {".tiktokv.com/falcon/", ".akamaized.net/ies/resource/falcon/", ".tiktokcdn.com/ies/resource/falcon/"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue("live_gurd_patterns", DEFAULT);
    }
}

package com.bytedance.android.livesdk.livesetting.message;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_message_reach_sampling")
public final class LiveMessageReachSamplingSetting {
    public static final LiveMessageReachSamplingSetting INSTANCE = new LiveMessageReachSamplingSetting();
    public static final Map<String, Float> DEFAULT = C2097608Jq.LJ();

    public final Map<String, Object> getValue() {
        Map<String, Object> map = (Map) SettingsManager.INSTANCE.getValueSafely(LiveMessageReachSamplingSetting.class);
        return map == null ? DEFAULT : map;
    }

    public final Map<String, Float> getDEFAULT() {
        return DEFAULT;
    }
}

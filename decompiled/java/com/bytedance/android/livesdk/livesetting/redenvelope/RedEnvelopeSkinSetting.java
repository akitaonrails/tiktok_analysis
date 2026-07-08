package com.bytedance.android.livesdk.livesetting.redenvelope;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("treasure_skin_configuration")
public final class RedEnvelopeSkinSetting {
    public static final RedEnvelopeSkinSetting INSTANCE = new RedEnvelopeSkinSetting();
    public static final Map<String, Map<String, String>> DEFAULT = new LinkedHashMap();

    public final Map<String, Map<String, String>> getValue() {
        return (Map) SettingsManager.INSTANCE.getValueSafely("treasure_skin_configuration", DEFAULT);
    }

    public final Map<String, Map<String, String>> getDEFAULT() {
        return DEFAULT;
    }
}

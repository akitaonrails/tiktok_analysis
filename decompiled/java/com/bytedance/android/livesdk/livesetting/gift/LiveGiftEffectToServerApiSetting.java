package com.bytedance.android.livesdk.livesetting.gift;

import X.C2097908Jt;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_gift_effect_to_server_api_map")
public final class LiveGiftEffectToServerApiSetting {
    public static final LiveGiftEffectToServerApiSetting INSTANCE = new LiveGiftEffectToServerApiSetting();
    public static final Map<String, String> DEFAULT = C2097908Jt.LIZJ(new Pair("reportEffectResult", "/gift/effect_ack/"));

    public final Map<String, String> getValue() {
        return (Map) SettingsManager.INSTANCE.getValueSafely("live_gift_effect_to_server_api_map", DEFAULT);
    }

    public final String getUrl(String str) {
        boolean z;
        String str2;
        Map<String, String> value = getValue();
        if (value != null && !value.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z || (str2 = value.get(str)) == null) {
            return "";
        }
        return str2;
    }
}

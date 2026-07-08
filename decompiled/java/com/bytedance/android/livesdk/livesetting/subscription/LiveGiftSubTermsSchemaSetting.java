package com.bytedance.android.livesdk.livesetting.subscription;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
@SettingsKey("subscription_legal_urls")
public final class LiveGiftSubTermsSchemaSetting {
    public static final LiveGiftSubTermsSchemaSetting INSTANCE = new LiveGiftSubTermsSchemaSetting();
    public static final HashMap<String, String> DEFAULT = C2097608Jq.LJI(new Pair("en", "https://lf16-web.tiktokcdn.com/obj/ies-hotsoon-draft-sg/tiktok-live/12e180d0-1adc-47fa-9def-d9b2aaddfd10_en-US.html"));

    public final Map<String, String> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        HashMap<String, String> map = DEFAULT;
        Map<String, String> map2 = (Map) settingsManager.getValueSafely("subscription_legal_urls", map);
        return map2 != null ? map2 : map;
    }

    public final String getSchema(String str) {
        String str2 = getValue().get(str);
        if (str2 == null) {
            String str3 = getValue().get("en");
            if (str3 == null) {
                return "";
            }
            return str3;
        }
        return str2;
    }
}

package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_ranking_sticker_faq_urls")
public final class LiveRankStickerFaqUrlSettings {
    public static final LiveRankStickerFaqUrlSettings INSTANCE = new LiveRankStickerFaqUrlSettings();
    public static final Map<String, String> DEFAULT = new LinkedHashMap();

    public final Map<String, String> getValue() {
        return (Map) SettingsManager.INSTANCE.getValueSafely("live_ranking_sticker_faq_urls", DEFAULT);
    }

    public final String obtainRankFaqUrl(String str) {
        Map<String, String> value;
        String str2;
        if (str == null || (value = getValue()) == null || (str2 = value.get(str)) == null) {
            return "";
        }
        return str2;
    }
}

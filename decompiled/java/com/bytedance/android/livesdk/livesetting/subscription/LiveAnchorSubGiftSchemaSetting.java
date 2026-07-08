package com.bytedance.android.livesdk.livesetting.subscription;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes8.dex */
@SettingsKey("live_subscription_tricks_gift_url")
public final class LiveAnchorSubGiftSchemaSetting {
    public static final LiveAnchorSubGiftSchemaSetting INSTANCE = new LiveAnchorSubGiftSchemaSetting();
    public static final HashMap<String, String> DEFAULT = C2097608Jq.LJI(new Pair("gift_management", "sslocal://webcast_lynxview?type=fullscreen&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_sub_tricks%2Fpages%2Fgift-management%2Ftemplate.js&hide_nav_bar=1&hide_status_bar=0&use_spark=1&container_bg_color=F5F5F5&status_font_mode=dark"));

    public final Map<String, String> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        HashMap<String, String> map = DEFAULT;
        Map<String, String> map2 = (Map) settingsManager.getValueSafely("live_subscription_tricks_gift_url", map);
        return map2 != null ? map2 : map;
    }

    public final String getGiftSubFaqSchema() {
        return getValue().get("gift_faq");
    }

    public final String getLiveCommunityGiftSubSchema() {
        return getValue().get("gift_management_live");
    }

    public final String getSubSettingGiftSubSchema() {
        return getValue().get("gift_management");
    }
}

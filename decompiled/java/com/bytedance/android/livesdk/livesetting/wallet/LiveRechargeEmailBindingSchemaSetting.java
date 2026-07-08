package com.bytedance.android.livesdk.livesetting.wallet;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey("recharge_email_binding_url")
public final class LiveRechargeEmailBindingSchemaSetting {
    public static final LiveRechargeEmailBindingSchemaSetting INSTANCE = new LiveRechargeEmailBindingSchemaSetting();
    public static final HashMap<String, String> DEFAULT = C2097608Jq.LJI(new Pair("email_collect_entry", "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue%2Frevenue%2Fpages%2Fauthorize%2Femail_collect_entry.js&loading_bg_color=ffffff&gravity=bottom&height=60%25&radius=8&show_mask=1&mask_bg_color=00000055&disable_outside_click_close=0&transition_animation=bottom"));

    public final Map<String, String> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        HashMap<String, String> map = DEFAULT;
        Map<String, String> map2 = (Map) settingsManager.getValueSafely("recharge_email_binding_url", map);
        return map2 != null ? map2 : map;
    }

    public final String getEmailCollectUrl() {
        String str = getValue().get("email_collect_entry");
        return str == null ? "" : str;
    }
}

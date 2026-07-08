package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes13.dex */
@SettingsKey("live_upgrade_main_panel_schema")
public final class LiveBroadcaseAnchorLevelUpPanelLinkSetting {
    public static final LiveBroadcaseAnchorLevelUpPanelLinkSetting INSTANCE = new LiveBroadcaseAnchorLevelUpPanelLinkSetting();
    public static final HashMap<String, String> DEFAULT = C2097608Jq.LJI(new Pair("open_live", "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_fundamental_live_center%2Fpages%2Fupgrade%2Ftemplate.js&enter_from=live_take_page_banner&radius=8&gravity=bottom&height=484&use_spark=1"));

    private final Map<String, String> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        HashMap<String, String> map = DEFAULT;
        Map<String, String> map2 = (Map) settingsManager.getValueSafely("live_upgrade_main_panel_schema", map);
        return map2 != null ? map2 : map;
    }

    public final String getEndLive() {
        return getValue().get("end_live");
    }

    public final String getFaqFull() {
        return getValue().get("faq_full");
    }

    public final String getFaqPop() {
        return getValue().get("faq_popup");
    }

    public final String getLevelUpPanelFromGuideDialogSchema() {
        return getValue().get("live_take_detail_pop_up");
    }

    public final String getLevelUpPanelSchema() {
        return getValue().get("open_live");
    }

    public final String getLiveRoom() {
        return getValue().get("live_room");
    }
}

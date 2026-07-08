package com.bytedance.android.livesdk.livesetting.portal;

import X.C1697810uHb;
import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_portal_short_touch_view_infos")
public final class PortalShortTouchSetting {
    public static final PortalShortTouchSetting INSTANCE = new PortalShortTouchSetting();
    public static final List<Map<String, String>> DEFAULT = C1697810uHb.LJIIJJI(C2097608Jq.LJIIIIZZ(new Pair("push_into_lottie", "liveroom_portal_entrance_pushinto"), new Pair("view_type", "1"), new Pair("extend_lottie_time", "2670"), new Pair("short_touch_key", "shortTouchPortalEntrance"), new Pair("short_touch_schema", "sslocal://webcast_lynxview_card?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_golden_envelope%2Fpages%2Fshort_touch_portal%2Ftemplate.js"), new Pair("click_target", "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_golden_envelope%2Fpages%2Fportal_go%2Ftemplate.js&gravity=bottom&height=684rpx&landscape_screen_size_as_portrait=1&bd_hybrid_monitor_bid=tiktok_live_revenue%2Ftreasure_box")), C2097608Jq.LJIIIIZZ(new Pair("push_into_lottie", "liveroom_portal_data_pushinto"), new Pair("view_type", "2"), new Pair("extend_lottie_time", CardStruct.IStatusCode.DEFAULT), new Pair("short_touch_key", "shortTouchPortalOverView"), new Pair("short_touch_schema", "sslocal://webcast_lynxview_card?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_golden_envelope%2Fpages%2Fshort_touch_people%2Ftemplate.js"), new Pair("click_target", "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_golden_envelope%2Fpages%2Fportals_detail%2Ftemplate.js&gravity=bottom&landscape_screen_size_as_portrait=1")));

    public final List<Map<String, String>> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        List<Map<String, String>> list = DEFAULT;
        List<Map<String, String>> list2 = (List) settingsManager.getValueSafely("live_portal_short_touch_view_infos", list);
        return list2 != null ? list2 : list;
    }

    public final List<Map<String, String>> getDEFAULT() {
        return DEFAULT;
    }
}

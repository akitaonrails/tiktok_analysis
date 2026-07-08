package com.bytedance.android.livesdk.livesetting.redenvelope;

import X.C1697810uHb;
import X.C2097608Jq;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes18.dex */
@SettingsKey("live_treasurebox_animation_image")
public final class TreasureBoxAnimationImageSetting {
    public static final TreasureBoxAnimationImageSetting INSTANCE = new TreasureBoxAnimationImageSetting();
    public static final List<Map<String, String>> DEFAULT = C1697810uHb.LJIIJJI(C2097608Jq.LJIIIIZZ(new Pair("business_type", "1"), new Pair("type_name", "shortTouchTreasureBox"), new Pair("effect_url", "tlive_treasure_box_anim_pic.png"), new Pair("short_touch", "sslocal://webcast_lynxview_card?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_golden_envelope%2Fpages%2Fshort_touch%2Ftemplate.js")), C2097608Jq.LJIIIIZZ(new Pair("business_type", "2"), new Pair("type_name", "shortTouchTreasureBox"), new Pair("effect_url", "tlive_treasure_box_anim_pic.png"), new Pair("short_touch", "sslocal://webcast_lynxview_card?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_golden_envelope%2Fpages%2Fshort_touch%2Ftemplate.js")), C2097608Jq.LJIIIIZZ(new Pair("business_type", "3"), new Pair("type_name", "shortTouchActivityShell"), new Pair("effect_url", "ttlive_gbl_treasure_box_shell_push_in_image.png"), new Pair("short_touch", "sslocal://webcast_lynxview_card?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue_treasure_box%2Fpages%2Fshort_touch%2Ftemplate.js&landscape_screen_size_as_portrait=1&bd_hybrid_monitor_bid=tiktok_live_revenue%2Ftreasure_box")), C2097608Jq.LJIIIIZZ(new Pair("business_type", "20"), new Pair("type_name", "shortTouchVirtualTicketBox"), new Pair("effect_url", "tlive_treasure_box_anim_pic.png"), new Pair("short_touch", "aweme://roma_redirect/?spark_page=treasure_box_short_touch_virtual")));

    public final List<Map<String, String>> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        List<Map<String, String>> list = DEFAULT;
        List<Map<String, String>> list2 = (List) settingsManager.getValueSafely("live_treasurebox_animation_image", list);
        return list2 != null ? list2 : list;
    }

    public final List<Map<String, String>> getDEFAULT() {
        return DEFAULT;
    }
}

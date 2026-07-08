package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
public final class TopLiveParmasConfig {
    public static final TypeAdapter ADAPTER = new TopLiveParmasConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("feed_card_enter_method")
    public String feedCardEnterMethod;

    @C09CT("feed_card_enter_method_v2")
    public String feedCardEnterMethodV2;

    @C09CT("join_button_enter_method")
    public String joinButtonEnterMethod;

    @C09CT("other_end_at_mg_top_live")
    public List<String> otherEndAtMgTopLive;

    @C09CT("top_live_page_enter_from")
    public String topLivePageEnterFrom;

    public TopLiveParmasConfig() {
        this("toplive_mg", "hangout_live_cell", "hangout_live_cell_all", "hangout_join_live", C1697810uHb.LJIIJJI("live_merge_hangout_mg_agg_playlabel_boxbattle", "live_merge_hangout_mg_agg_playlabel_debating", "live_merge_hangout_mg_agg_playlabel_talent_show", "live_merge_hangout_mg_agg_playlabel_random_chat", "live_merge_hangout_mg_agg_playlabel_dating", "live_merge_hangout_live_cell_boxbattle", "live_merge_hangout_live_cell_debating", "live_merge_hangout_live_cell_talent_show", "live_merge_hangout_cover"));
    }

    public TopLiveParmasConfig(String str, String str2, String str3, String str4, List<String> list) {
        this.topLivePageEnterFrom = str;
        this.feedCardEnterMethod = str2;
        this.feedCardEnterMethodV2 = str3;
        this.joinButtonEnterMethod = str4;
        this.otherEndAtMgTopLive = list;
    }
}

package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import X.C1697810uHb;
import com.bytedance.android.live_settings.NormalGson;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class TopLivePreloadConfig {
    public static final TypeAdapter ADAPTER = new TopLivePreloadConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("enable_cache_top_module_data")
    public boolean enableCacheTopModuleData;

    @C09CT("enable_fetch_top_module_room_data")
    public boolean enableFetchTopModuleRoomData;

    @C09CT("enable_init_top_tab_from_setting_config")
    public boolean enableInitTopLiveTabFromSetting;

    @C09CT("enable_opt_toplive_ui_fluency")
    public boolean enableOptTopLiveUIFluency;

    @C09CT("enable_preload_hangout_tab")
    public boolean enablePreloadHangoutTab;

    @C09CT("enable_remove_live_end_card")
    public boolean enableRemoveLiveEndCard;

    @C09CT("enable_top_live_tech_track_event")
    public boolean enableTopLiveTechTrackEvent;

    @C09CT("feed_data_timeout_threshold")
    public int feedDataTimeoutThreshold;

    @C09CT("top_module_cache_timeout_duration")
    public int topModuleCacheTimeoutDuration;

    @C09CT("top_module_preload_module_name_list")
    public List<String> topModulePreloadNameList;

    @C09CT("top_module_preload_room_data_interval")
    public int topModulePreloadRoomDataInterval;

    public TopLivePreloadConfig() {
        this(false, false, false, false, 1800, false, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, C1697810uHb.LJIIJJI("hangout_mg_agg_playlabel_dating", "hangout_mg_agg_playlabel_debating"), 0, false, false);
    }

    public TopLivePreloadConfig(boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5, int i2, List<String> list, int i3, boolean z6, boolean z7) {
        this.enableInitTopLiveTabFromSetting = z;
        this.enableOptTopLiveUIFluency = z2;
        this.enablePreloadHangoutTab = z3;
        this.enableCacheTopModuleData = z4;
        this.topModuleCacheTimeoutDuration = i;
        this.enableFetchTopModuleRoomData = z5;
        this.topModulePreloadRoomDataInterval = i2;
        this.topModulePreloadNameList = list;
        this.feedDataTimeoutThreshold = i3;
        this.enableRemoveLiveEndCard = z6;
        this.enableTopLiveTechTrackEvent = z7;
    }
}

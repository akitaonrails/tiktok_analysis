package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;

/* JADX INFO: loaded from: classes36.dex */
@SettingsKey(preciseExperiment = false, value = "multi_guest_top_live_parmas_config")
public final class MultiGuestTopLiveParmasConfigSetting {
    public static final MultiGuestTopLiveParmasConfigSetting INSTANCE = new MultiGuestTopLiveParmasConfigSetting();
    public static final TopLiveParmasConfig DEFAULT = new TopLiveParmasConfig("toplive_mg", "hangout_live_cell", "hangout_live_cell_all", "hangout_join_live", C1697810uHb.LJIIJJI("live_merge_hangout_mg_agg_playlabel_boxbattle", "live_merge_hangout_mg_agg_playlabel_debating", "live_merge_hangout_mg_agg_playlabel_talent_show", "live_merge_hangout_mg_agg_playlabel_random_chat", "live_merge_hangout_mg_agg_playlabel_dating", "live_merge_hangout_live_cell_boxbattle", "live_merge_hangout_live_cell_debating", "live_merge_hangout_live_cell_talent_show", "live_merge_hangout_cover"));

    private final TopLiveParmasConfig getValue() {
        TopLiveParmasConfig topLiveParmasConfig = (TopLiveParmasConfig) SettingsManager.INSTANCE.getValueSafely(MultiGuestTopLiveParmasConfigSetting.class);
        return topLiveParmasConfig == null ? DEFAULT : topLiveParmasConfig;
    }

    public final String getFeedCardEnterMethodV1() {
        String str = getValue().feedCardEnterMethod;
        return str == null ? "hangout_live_cell" : str;
    }

    public final String getFeedCardEnterMethodV2() {
        String str = getValue().feedCardEnterMethodV2;
        return str == null ? "hangout_live_cell_all" : str;
    }

    public final String getJoinButtonEnterMethod() {
        String str = getValue().joinButtonEnterMethod;
        return str == null ? "hangout_join_live" : str;
    }

    public final List<String> getOtherEndAtMgTopLive() {
        List<String> list = getValue().otherEndAtMgTopLive;
        return list == null ? C1697810uHb.LJIIJJI("live_merge_hangout_mg_agg_playlabel_boxbattle", "live_merge_hangout_mg_agg_playlabel_debating", "live_merge_hangout_mg_agg_playlabel_talent_show", "live_merge_hangout_mg_agg_playlabel_random_chat", "live_merge_hangout_mg_agg_playlabel_dating", "live_merge_hangout_live_cell_boxbattle", "live_merge_hangout_live_cell_debating", "live_merge_hangout_live_cell_talent_show", "live_merge_hangout_cover") : list;
    }

    public final String getTopLivePageEnterFrom() {
        String str = getValue().topLivePageEnterFrom;
        return str == null ? "toplive_mg" : str;
    }
}

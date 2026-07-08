package com.bytedance.android.livesdk.livesetting.performance;

import X.C1697810uHb;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
@SettingsKey(preciseExperiment = false, value = "live_gecko_fe_opti_list_main_ak")
public final class LiveGeckoFEOptimizeListSetting {
    public static final LiveGeckoFEOptimizeListSetting INSTANCE = new LiveGeckoFEOptimizeListSetting();
    public static final List<String> DEFAULT = C1697810uHb.LJIILJJIL("wallet", "tiktok_live_revenue_subscription_invitation", "tiktok_live_fundamental_subscription_annual", "tiktok_live_interaction_game_activity", "tiktok_live_revenue_eoy_2023_popularity", "tiktok_live_revenue_eoy_2023_popularity_resource", "tiktok_live_revenue_match_victory_lap", "2023_11_eoy_fest_global", "tiktok_live_revenue_user_level_campaign", "tiktok_live_fundamental_unify_base", "top-image", "banner", "2022_05_light_up_your_live", "tiktok_live_campaign_integrate", "tiktok_live_revenue_crew_competition");

    public final List<String> getValue() {
        SettingsManager settingsManager = SettingsManager.INSTANCE;
        List<String> list = DEFAULT;
        ArrayList arrayList = (ArrayList) settingsManager.getValueSafely("live_gecko_fe_opti_list_main_ak", list);
        return arrayList != null ? arrayList : list;
    }
}

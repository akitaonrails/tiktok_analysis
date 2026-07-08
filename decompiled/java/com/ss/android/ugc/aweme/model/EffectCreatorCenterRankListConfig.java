package com.ss.android.ugc.aweme.model;

import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: loaded from: classes3.dex */
public final class EffectCreatorCenterRankListConfig {
    public static final EffectCreatorCenterRankListConfig INSTANCE = new EffectCreatorCenterRankListConfig();
    public static final EffectCreatorRankListConfig DEFAULT = new EffectCreatorRankListConfig("aweme://lynxview/?url=", "&use_spark=1&hide_nav_bar=1&should_full_screen=1&trans_status_bar=1&container_bg_color=ffffff&channel=tiktok_effect_lynx&bundle=pages/effect-leaderboard/template.js&dynamic=2&bdhm_bid=ttep_lynx&bdhm_pid=effect-leaderboard&use_forest=1", "https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-source-sg%2F10%2Fgecko%2Fresource%2Ftiktok_effect_lynx%2Fpages%2Feffect-leaderboard%2Ftemplate.js");

    public static final EffectCreatorRankListConfig get() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EffectCreatorRankListConfig effectCreatorRankListConfig = DEFAULT;
        EffectCreatorRankListConfig effectCreatorRankListConfig2 = (EffectCreatorRankListConfig) settingsManagerLIZLLL.LJIIIIZZ("effect_leaderboard_page_url", EffectCreatorRankListConfig.class, effectCreatorRankListConfig);
        return effectCreatorRankListConfig2 != null ? effectCreatorRankListConfig2 : effectCreatorRankListConfig;
    }

    public final EffectCreatorRankListConfig getDEFAULT() {
        return DEFAULT;
    }
}

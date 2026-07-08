package com.ss.android.ugc.aweme.model;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class EffectCreatorRankListConfig {

    @C09CT("container")
    public final String container;

    @C09CT("container_parameter")
    public final String containerParam;

    @C09CT("url")
    public final String url;

    public EffectCreatorRankListConfig() {
        this("aweme://lynxview/?url=", "&use_spark=1&hide_nav_bar=1&should_full_screen=1&trans_status_bar=1&container_bg_color=ffffff&channel=tiktok_effect_lynx&bundle=pages/effect-leaderboard/template.js&dynamic=2&bdhm_bid=ttep_lynx&bdhm_pid=effect-leaderboard&use_forest=1", "https%3A%2F%2Flf-main-gecko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-source-sg%2F10%2Fgecko%2Fresource%2Ftiktok_effect_lynx%2Fpages%2Feffect-leaderboard%2Ftemplate.js");
    }

    public EffectCreatorRankListConfig(String str, String str2, String str3) {
        this.container = str;
        this.containerParam = str2;
        this.url = str3;
    }
}

package com.ss.android.ugc.profile.business.effect.dashboard;

import X.C09CT;

/* JADX INFO: loaded from: classes30.dex */
public final class PopupBannerItem {
    public static final int $stable = 0;

    @C09CT("app_effect_id")
    public final String appEffectId;

    @C09CT("banner_id")
    public final String bannerId;

    @C09CT("effect_icon_url")
    public final String effectIconUrl;

    @C09CT("effect_name")
    public final String effectName;

    @C09CT("effect_source")
    public final int effectSource;

    @C09CT("has_shown")
    public final boolean hasShown;

    @C09CT("top_effect_ranking_banner")
    public final TopEffectRankingBannerInfo topEffectRankingBanner;

    @C09CT("effect_id")
    public final String ttepEffectId;

    @C09CT("type")
    public final int type;

    @C09CT("uid")
    public final long uid;

    public PopupBannerItem(int i, String str, long j, String str2, String str3, String str4, String str5, boolean z, int i2, TopEffectRankingBannerInfo topEffectRankingBannerInfo) {
        this.type = i;
        this.bannerId = str;
        this.uid = j;
        this.ttepEffectId = str2;
        this.appEffectId = str3;
        this.effectName = str4;
        this.effectIconUrl = str5;
        this.hasShown = z;
        this.effectSource = i2;
        this.topEffectRankingBanner = topEffectRankingBannerInfo;
    }
}

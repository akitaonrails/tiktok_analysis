package com.ss.android.ugc.profile.business.effect.dashboard;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class TopEffectRankingBannerInfo {
    public static final int $stable = 0;

    @C09CT("rank_index")
    public final long rankIndex;

    @C09CT("rank_type")
    public final String rankType;

    @C09CT("rank_type_translation")
    public final String rankTypeTranslation;

    public TopEffectRankingBannerInfo() {
        this("", "", 0L);
    }

    public TopEffectRankingBannerInfo(String str, String str2, long j) {
        this.rankType = str;
        this.rankTypeTranslation = str2;
        this.rankIndex = j;
    }
}

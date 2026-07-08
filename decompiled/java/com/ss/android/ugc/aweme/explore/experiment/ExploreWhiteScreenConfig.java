package com.ss.android.ugc.aweme.explore.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreWhiteScreenConfig {

    @C09CT("delay_preload_image_when_click_recommend_card")
    public final boolean delayPreloadImageWhenClickRecommendCard;

    @C09CT("delay_preload_image_when_load_more")
    public final long delayPreloadImageWhenLoadMore;

    @C09CT("explore_avatar_load_delay_time")
    public final long exploreAvatarLoadDelayTime;

    @C09CT("fix_load_more_bug")
    public final boolean fixLoadMoreBug;

    @C09CT("fix_rebind_bug")
    public final boolean fixRebindBug;

    @C09CT("force_preload_network_image")
    public final boolean forcePreloadNetworkImage;

    @C09CT("is_enable")
    public final boolean isEnable;

    @C09CT("need_load_bitmap")
    public final boolean needLoadBitmap;

    @C09CT("preload_image_count")
    public final int preloadImageCount;

    @C09CT("preload_without_considering_network_quality")
    public final boolean preloadWithoutConsideringNetworkQuality;

    @C09CT("revert_show_card_cover_end")
    public final boolean revertShowCardCoverEnd;

    public ExploreWhiteScreenConfig() {
        this(false, true, true, 500L, true, true, 6, true, true, 500L, true);
    }

    public final boolean isEnable() {
        return this.isEnable;
    }

    public ExploreWhiteScreenConfig(boolean z, boolean z2, boolean z3, long j, boolean z4, boolean z5, int i, boolean z6, boolean z7, long j2, boolean z8) {
        this.isEnable = z;
        this.needLoadBitmap = z2;
        this.preloadWithoutConsideringNetworkQuality = z3;
        this.exploreAvatarLoadDelayTime = j;
        this.delayPreloadImageWhenClickRecommendCard = z4;
        this.revertShowCardCoverEnd = z5;
        this.preloadImageCount = i;
        this.fixRebindBug = z6;
        this.forcePreloadNetworkImage = z7;
        this.delayPreloadImageWhenLoadMore = j2;
        this.fixLoadMoreBug = z8;
    }
}

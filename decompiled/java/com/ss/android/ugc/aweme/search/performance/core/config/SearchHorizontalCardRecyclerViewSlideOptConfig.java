package com.ss.android.ugc.aweme.search.performance.core.config;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchHorizontalCardRecyclerViewSlideOptConfig {

    @C09CT("enable_horizontal_card_recycler_view_slide_opt")
    public final boolean enableHorizontalCardRecyclerViewSlideOpt;

    @C09CT("horizontal_card_view_slide_opt_rate")
    public final float horizontalCardViewSlideOptRate;

    public SearchHorizontalCardRecyclerViewSlideOptConfig() {
        this(false, 1.0f);
    }

    public SearchHorizontalCardRecyclerViewSlideOptConfig(boolean z, float f) {
        this.enableHorizontalCardRecyclerViewSlideOpt = z;
        this.horizontalCardViewSlideOptRate = f;
    }
}

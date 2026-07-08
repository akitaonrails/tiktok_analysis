package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;

/* JADX INFO: loaded from: classes11.dex */
public final class TopBarDisplay {

    @C09CT("fixed_height")
    public final Integer fixedHeight;

    @C09CT("scroll_animation_type")
    public final Integer scrollAnimationType;

    @C09CT("total_height")
    public final Integer totalHeight;

    public TopBarDisplay() {
        this(null, null, null);
    }

    public TopBarDisplay(Integer num, Integer num2, Integer num3) {
        this.fixedHeight = num;
        this.totalHeight = num2;
        this.scrollAnimationType = num3;
    }
}

package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes17.dex */
public final class LeftSlideMiddlePageModel implements Serializable {

    @C09CT("boc_use_real_middle_page")
    public final boolean bocUseRealMiddlePage;

    @C09CT("middle_page_jump_type")
    public final int middlePageJumpType;

    @C09CT("should_use_middle_page")
    public final boolean shouldUseMiddlePage;

    public LeftSlideMiddlePageModel() {
        this(false, 0, false);
    }

    public LeftSlideMiddlePageModel(boolean z, int i, boolean z2) {
        this.shouldUseMiddlePage = z;
        this.middlePageJumpType = i;
        this.bocUseRealMiddlePage = z2;
    }
}

package com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc;

import X.C09CT;

/* JADX INFO: loaded from: classes26.dex */
public final class CenterRange {

    @C09CT("horizontal_range")
    public final DetectRange horizontalRange;

    @C09CT("vertical_range")
    public final DetectRange verticalRange;

    public CenterRange(DetectRange detectRange, DetectRange detectRange2) {
        this.horizontalRange = detectRange;
        this.verticalRange = detectRange2;
    }
}

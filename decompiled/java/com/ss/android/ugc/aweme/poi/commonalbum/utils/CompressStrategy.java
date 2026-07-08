package com.ss.android.ugc.aweme.poi.commonalbum.utils;

import X.C09CT;

/* JADX INFO: loaded from: classes4.dex */
public final class CompressStrategy {

    @C09CT("compressOption")
    public final Integer compressOption;

    @C09CT("ratio")
    public final Float ratio;

    public CompressStrategy() {
        this(null, null);
    }

    public CompressStrategy(Float f, Integer num) {
        this.ratio = f;
        this.compressOption = num;
    }
}

package com.ss.android.ugc.aweme.tako.ccl.model.api;

import X.C09CT;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoMultiModalInfo {

    @C09CT("gen_image_duration")
    public final long genImageDuration;

    @C09CT("gen_image_num")
    public final int genImageNum;

    @C09CT("gen_image_ratio")
    public final TakoImageRatio genImageRatio;

    public TakoMultiModalInfo() {
        this(new TakoImageRatio(900, 1600), 1, 0L);
    }

    public TakoMultiModalInfo(TakoImageRatio takoImageRatio, int i, long j) {
        this.genImageRatio = takoImageRatio;
        this.genImageNum = i;
        this.genImageDuration = j;
    }
}

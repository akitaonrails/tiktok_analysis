package com.ss.android.ugc.aweme.music.report.model;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class TT2DspActionInfo {

    @C09CT("button_type")
    public final Integer buttonType;

    @C09CT("platform")
    public final Integer platform;

    public TT2DspActionInfo() {
        this(null, null);
    }

    public TT2DspActionInfo(Integer num, Integer num2) {
        this.platform = num;
        this.buttonType = num2;
    }
}

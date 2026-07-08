package com.ss.android.ugc.aweme.pipo.hybrid.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class PipoRetentionFreqControl {

    @C09CT("times_limit")
    public final Integer timesLimit;

    @C09CT("within")
    public final Integer within;

    public PipoRetentionFreqControl() {
        this(null, null);
    }

    public PipoRetentionFreqControl(Integer num, Integer num2) {
        this.within = num;
        this.timesLimit = num2;
    }
}

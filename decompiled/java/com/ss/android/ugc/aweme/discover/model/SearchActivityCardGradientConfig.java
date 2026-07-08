package com.ss.android.ugc.aweme.discover.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchActivityCardGradientConfig implements Serializable {

    @C09CT("end_percent")
    public Double endPercent;

    @C09CT("start_percent")
    public Double startPercent;

    public final Double getEndPercent() {
        return this.endPercent;
    }

    public final Double getStartPercent() {
        return this.startPercent;
    }

    public final void setEndPercent(Double d) {
        this.endPercent = d;
    }

    public final void setStartPercent(Double d) {
        this.startPercent = d;
    }
}

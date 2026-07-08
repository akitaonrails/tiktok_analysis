package com.ss.android.ugc.aweme.search.pages.result.topsearch.precisead.core.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class PreciseAdInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("is_horizontal")
    public final Boolean isHorizontal;

    public PreciseAdInfo() {
        this(Boolean.FALSE);
    }

    public final Boolean isHorizontal() {
        return this.isHorizontal;
    }

    public PreciseAdInfo(Boolean bool) {
        this.isHorizontal = bool;
    }
}

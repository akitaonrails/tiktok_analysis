package com.ss.android.ugc.aweme.draft.model;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class DraftCherEffectParam {

    @C09CT("duration")
    public final double[] duration;

    @C09CT("matrix")
    public final String[] matrix;

    @C09CT("seg_user_cher")
    public final boolean[] segUseCher;

    public DraftCherEffectParam() {
        this(new String[0], new double[0], new boolean[0]);
    }

    public DraftCherEffectParam(String[] strArr, double[] dArr, boolean[] zArr) {
        this.matrix = strArr;
        this.duration = dArr;
        this.segUseCher = zArr;
    }
}

package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes31.dex */
public final class SegmentMin {

    @C09CT("prob")
    public final List<Double> boundaryFuncProb;

    @C09CT("dec")
    public final String decision;

    @C09CT("label")
    public final int functionLabel;

    @C09CT("func")
    public final String functionName;

    @C09CT("intv")
    public final List<Double> intervalMS;

    public SegmentMin() {
        this(null, null, 0, null, null, 31, null);
    }

    public SegmentMin(List<Double> list, List<Double> list2, int i, String str, String str2) {
        this.boundaryFuncProb = list;
        this.intervalMS = list2;
        this.functionLabel = i;
        this.functionName = str;
        this.decision = str2;
    }

    public SegmentMin(List list, List list2, int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? C13BV.INSTANCE : list, (i2 & 2) != 0 ? C13BV.INSTANCE : list2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : str, (i2 & 16) == 0 ? str2 : null);
    }
}

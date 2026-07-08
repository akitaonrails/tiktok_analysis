package com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class ClassifyData {

    @C09CT("vcClassifyFeature")
    public List<Float> vcFeature;

    @C09CT("vcClassifyScore")
    public List<Float> vcScore;

    public ClassifyData() {
        this(null, null, 3, null);
    }

    public final void setVcFeature(List<Float> list) {
        this.vcFeature = list;
    }

    public final void setVcScore(List<Float> list) {
        this.vcScore = list;
    }

    public ClassifyData(List<Float> list, List<Float> list2) {
        this.vcFeature = list;
        this.vcScore = list2;
    }

    public ClassifyData(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}

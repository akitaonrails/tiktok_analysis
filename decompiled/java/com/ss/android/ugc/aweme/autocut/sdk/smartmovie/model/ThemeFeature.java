package com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model;

import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class ThemeFeature {
    public List<Float> feature;
    public List<Float> score;

    public ThemeFeature() {
        this(null, null, 3, null);
    }

    public final void setFeature(List<Float> list) {
        this.feature = list;
    }

    public final void setScore(List<Float> list) {
        this.score = list;
    }

    public ThemeFeature(List<Float> list, List<Float> list2) {
        this.score = list;
        this.feature = list2;
    }

    public ThemeFeature(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}

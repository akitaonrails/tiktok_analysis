package com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model;

import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class C3FeatureData {
    public List<Float> vcC3Feature;

    public C3FeatureData() {
        this(null, 1, null);
    }

    public C3FeatureData(List<Float> list) {
        this.vcC3Feature = list;
    }

    public final void setVcC3Feature(List<Float> list) {
        this.vcC3Feature = list;
    }

    public C3FeatureData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}

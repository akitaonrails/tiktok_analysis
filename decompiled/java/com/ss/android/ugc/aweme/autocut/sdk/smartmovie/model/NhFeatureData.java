package com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model;

import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class NhFeatureData {
    public List<Integer> vcNhFeature;

    public NhFeatureData() {
        this(null, 1, null);
    }

    public NhFeatureData(List<Integer> list) {
        this.vcNhFeature = list;
    }

    public final void setVcNhFeature(List<Integer> list) {
        this.vcNhFeature = list;
    }

    public NhFeatureData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}

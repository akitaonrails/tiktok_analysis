package com.ss.android.ugc.aweme.tako.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class TakoPerfImageMobModelList {

    @C09CT("perf_image_list")
    public final List<TakoPerfImageMobModel> list;

    public TakoPerfImageMobModelList() {
        this(null, 1, null);
    }

    public TakoPerfImageMobModelList(List<TakoPerfImageMobModel> list) {
        this.list = list;
    }

    public TakoPerfImageMobModelList(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}

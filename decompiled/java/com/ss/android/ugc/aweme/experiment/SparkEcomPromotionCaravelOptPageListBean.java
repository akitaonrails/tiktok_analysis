package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class SparkEcomPromotionCaravelOptPageListBean {

    @C09CT("allowList")
    public final List<String> allowList;

    public SparkEcomPromotionCaravelOptPageListBean() {
        this(null, 1, null);
    }

    public SparkEcomPromotionCaravelOptPageListBean(List<String> list) {
        this.allowList = list;
    }

    public SparkEcomPromotionCaravelOptPageListBean(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}

package com.ss.android.ugc.aweme.config;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
public final class EcSearchShopResultPreloadConfigModel {

    @C09CT("ec_search_preload_inside_enter_method")
    public final List<String> insideEnterMethodList;

    @C09CT("ec_search_preload_outside_enter_method")
    public final List<String> outsideEnterMethodList;

    public EcSearchShopResultPreloadConfigModel() {
        this(null, null, 3, null);
    }

    public EcSearchShopResultPreloadConfigModel(List<String> list, List<String> list2) {
        this.insideEnterMethodList = list;
        this.outsideEnterMethodList = list2;
    }

    public EcSearchShopResultPreloadConfigModel(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}

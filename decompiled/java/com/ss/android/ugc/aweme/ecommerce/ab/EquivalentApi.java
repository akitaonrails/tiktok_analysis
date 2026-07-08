package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class EquivalentApi {

    @C09CT("equivalent_apis")
    public final List<String> equivalentApis;

    @C09CT("primary_api")
    public final String primaryApi;

    public EquivalentApi() {
        this(null, null, 3, null);
    }

    public EquivalentApi(String str, List<String> list) {
        this.primaryApi = str;
        this.equivalentApis = list;
    }

    public EquivalentApi(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}

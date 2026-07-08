package com.ss.android.ugc.aweme.ecommerce.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class AddressApiConfig {

    @C09CT("address")
    public final List<String> apiList;

    public AddressApiConfig() {
        this(null, 1, null);
    }

    public AddressApiConfig(List<String> list) {
        this.apiList = list;
    }

    public AddressApiConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}

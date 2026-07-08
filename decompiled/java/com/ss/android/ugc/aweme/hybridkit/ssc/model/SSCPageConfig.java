package com.ss.android.ugc.aweme.hybridkit.ssc.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class SSCPageConfig {

    @C09CT("gecko_res")
    public final List<GeckoResInfo> geckoRes;

    @C09CT("oid_pre")
    public final List<OidPreInfo> oidPre;

    public SSCPageConfig() {
        this(null, null, 3, null);
    }

    public SSCPageConfig(List<GeckoResInfo> list, List<OidPreInfo> list2) {
        this.geckoRes = list;
        this.oidPre = list2;
    }

    public SSCPageConfig(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}

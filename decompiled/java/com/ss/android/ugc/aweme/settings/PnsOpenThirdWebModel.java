package com.ss.android.ugc.aweme.settings;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class PnsOpenThirdWebModel {

    @C09CT("iab")
    public List<String> iabDomainList;

    @C09CT("sys")
    public List<String> sysDomainList;

    public PnsOpenThirdWebModel() {
        this(null, null, 3, null);
    }

    public PnsOpenThirdWebModel(List<String> list, List<String> list2) {
        this.iabDomainList = list;
        this.sysDomainList = list2;
    }

    public PnsOpenThirdWebModel(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}

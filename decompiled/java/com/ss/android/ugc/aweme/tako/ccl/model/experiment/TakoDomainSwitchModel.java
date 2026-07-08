package com.ss.android.ugc.aweme.tako.ccl.model.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class TakoDomainSwitchModel {

    @C09CT("items")
    public final List<TakoDomainSwitchInfo> items;

    public TakoDomainSwitchModel() {
        this(null, 1, null);
    }

    public TakoDomainSwitchModel(List<TakoDomainSwitchInfo> list) {
        this.items = list;
    }

    public TakoDomainSwitchModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}

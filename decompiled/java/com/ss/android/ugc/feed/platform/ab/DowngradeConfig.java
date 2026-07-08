package com.ss.android.ugc.feed.platform.ab;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes36.dex */
public final class DowngradeConfig {

    @C09CT("downgrade_components")
    public final List<ComponentStrategy> downgradeComponents;

    public DowngradeConfig() {
        this(null, 1, null);
    }

    public DowngradeConfig(List<ComponentStrategy> list) {
        this.downgradeComponents = list;
    }

    public DowngradeConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}

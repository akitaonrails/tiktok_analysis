package com.ss.android.ugc.aweme.settings;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes36.dex */
public final class SparkSwitchSettingsExt7Bean {

    @C09CT("allowList")
    public final List<String> allowList;

    @C09CT("denyList")
    public final List<String> denyList;

    public SparkSwitchSettingsExt7Bean() {
        this(null, null, 3, null);
    }

    public SparkSwitchSettingsExt7Bean(List<String> list, List<String> list2) {
        this.allowList = list;
        this.denyList = list2;
    }

    public SparkSwitchSettingsExt7Bean(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}

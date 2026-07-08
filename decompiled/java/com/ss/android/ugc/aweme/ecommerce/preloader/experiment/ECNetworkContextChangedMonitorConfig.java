package com.ss.android.ugc.aweme.ecommerce.preloader.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class ECNetworkContextChangedMonitorConfig {

    @C09CT("include_paths")
    public final List<String> includePaths;

    @C09CT("is_enabled")
    public final boolean isEnabled;

    public ECNetworkContextChangedMonitorConfig() {
        this(false, null, 3, null);
    }

    public ECNetworkContextChangedMonitorConfig(boolean z, List<String> list) {
        this.isEnabled = z;
        this.includePaths = list;
    }

    public ECNetworkContextChangedMonitorConfig(boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C13BV.INSTANCE : list);
    }
}

package com.ss.android.ugc.aweme.config;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class ECWeakNetworkConfig implements Serializable {

    @C09CT("network_check_mode")
    public final int networkMode;

    @C09CT("weak_network_scope")
    public final List<String> weakNetworkScope;

    public ECWeakNetworkConfig() {
        this(0, null, 3, null);
    }

    public ECWeakNetworkConfig(int i, List<String> list) {
        this.networkMode = i;
        this.weakNetworkScope = list;
    }

    public ECWeakNetworkConfig(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? C13BV.INSTANCE : list);
    }
}

package com.ss.android.ugc.aweme.setting.performance.publish;

import X.C08CX;
import X.C09CT;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
public final class SingleNodeRetryBlockConfig {

    @C09CT("ak")
    public final Set<Integer> ak;

    @C09CT("ca")
    public final Set<Integer> ca;

    @C09CT("sn")
    public final Set<Integer> sn;

    @C09CT("up")
    public final Set<Integer> up;

    public SingleNodeRetryBlockConfig() {
        this(null, null, null, null, 15, null);
    }

    public SingleNodeRetryBlockConfig(Set<Integer> set, Set<Integer> set2, Set<Integer> set3, Set<Integer> set4) {
        this.ak = set;
        this.sn = set2;
        this.up = set3;
        this.ca = set4;
    }

    public SingleNodeRetryBlockConfig(Set set, Set set2, Set set3, Set set4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C08CX.INSTANCE : set, (i & 2) != 0 ? C08CX.INSTANCE : set2, (i & 4) != 0 ? C08CX.INSTANCE : set3, (i & 8) != 0 ? C08CX.INSTANCE : set4);
    }
}

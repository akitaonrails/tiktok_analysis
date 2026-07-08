package com.bytedance.hybrid.spark.roma;

import X.C01GW;
import X.C08CX;
import X.C09CT;
import X.C452501pT;
import java.util.Set;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class SparkSensitiveBridges {
    public static final C01GW<SparkSensitiveBridges> LIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(46));

    @C09CT("block")
    public final Set<String> blockList;

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enable_block")
    public final boolean enableBlock;

    @C09CT("enable_shadow")
    public final boolean enableShadow;

    @C09CT("shadow")
    public final Set<String> shadowList;

    public SparkSensitiveBridges() {
        this(false, false, false, null, null, 31, null);
    }

    public SparkSensitiveBridges(boolean z, boolean z2, boolean z3, Set<String> set, Set<String> set2) {
        this.enable = z;
        this.enableShadow = z2;
        this.enableBlock = z3;
        this.shadowList = set;
        this.blockList = set2;
    }

    public SparkSensitiveBridges(boolean z, boolean z2, boolean z3, Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) == 0 ? z3 : false, (i & 8) != 0 ? C08CX.INSTANCE : set, (i & 16) != 0 ? C08CX.INSTANCE : set2);
    }
}

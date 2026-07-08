package com.ss.android.ugc.aweme.applog;

import X.C09CT;
import X.C844470XAv;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ConfigModel {

    @C09CT("enabled")
    public final boolean enabled;

    @C09CT("isolation_type")
    public final Set<String> isolationType;

    @C09CT("switch_bdtracker")
    public final boolean switchBdTracker;

    public ConfigModel() {
        this(false, false, null, 7, null);
    }

    public ConfigModel(boolean z, boolean z2, Set<String> set) {
        this.switchBdTracker = z;
        this.enabled = z2;
        this.isolationType = set;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ConfigModel(boolean z, boolean z2, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            C844470XAv.LIZ.getClass();
            if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                z = true;
            } else {
                z = false;
            }
        }
        if ((i & 2) != 0) {
            C844470XAv.LIZ.getClass();
            if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this(z, z2, (i & 4) != 0 ? Collections.singleton("us") : set);
    }
}

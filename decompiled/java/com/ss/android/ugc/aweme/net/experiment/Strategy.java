package com.ss.android.ugc.aweme.net.experiment;

import X.C08CX;
import X.C09CT;
import X.C786410Ut5;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class Strategy {

    @C09CT("blackList")
    public final Set<String> blackList;

    @C09CT("strictMode")
    public final boolean strictMode;

    @C09CT("threshold")
    public final int threshold;

    @C09CT("whiteList")
    public final Set<String> whiteList;

    public Strategy() {
        this(false, 0, null, null, 15, null);
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.strictMode) * 31) + this.threshold) * 31) + this.blackList.hashCode()) * 31) + this.whiteList.hashCode();
    }

    public Strategy(boolean z, int i, Set<String> set, Set<String> set2) {
        this.strictMode = z;
        this.threshold = i;
        this.blackList = set;
        this.whiteList = set2;
    }

    public Strategy(boolean z, int i, Set set, Set set2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? C08CX.INSTANCE : set, (i2 & 8) != 0 ? C08CX.INSTANCE : set2);
    }
}

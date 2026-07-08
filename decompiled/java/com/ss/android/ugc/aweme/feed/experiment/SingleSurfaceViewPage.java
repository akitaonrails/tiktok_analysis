package com.ss.android.ugc.aweme.feed.experiment;

import X.C09CT;
import X.C2188811AlT;
import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class SingleSurfaceViewPage {

    @C09CT("pages")
    public final Set<String> pages;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SingleSurfaceViewPage) && Intrinsics.LJFF(this.pages, ((SingleSurfaceViewPage) obj).pages);
    }

    public final int hashCode() {
        Set<String> set = this.pages;
        if (set == null) {
            return 0;
        }
        return set.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SingleSurfaceViewPage(pages=");
        sbLIZ.append(this.pages);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SingleSurfaceViewPage() {
        this(new HashSet());
    }

    public SingleSurfaceViewPage(Set<String> set) {
        this.pages = set;
    }
}

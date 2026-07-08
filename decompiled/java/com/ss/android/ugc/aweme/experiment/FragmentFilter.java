package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes5.dex */
public final class FragmentFilter {
    public static final int $stable = 0;

    @C09CT("fragment_name")
    public final String fragmentName;

    @C09CT("tag")
    public final String tag;

    public FragmentFilter() {
        this(null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FragmentFilter(tag=");
        sbLIZ.append(this.tag);
        sbLIZ.append(", fragmentName=");
        sbLIZ.append(this.fragmentName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FragmentFilter(String str, String str2) {
        this.tag = str;
        this.fragmentName = str2;
    }
}

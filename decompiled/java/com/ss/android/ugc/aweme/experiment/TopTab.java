package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C2188811AlT;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class TopTab {

    @C09CT("top_tab_list")
    public final ArrayList<TopTabItem> topTabList;

    public TopTab() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TopTab) && Intrinsics.LJFF(this.topTabList, ((TopTab) obj).topTabList);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopTab(topTabList=");
        sbLIZ.append(this.topTabList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public TopTab(ArrayList<TopTabItem> arrayList) {
        this.topTabList = arrayList;
    }
}

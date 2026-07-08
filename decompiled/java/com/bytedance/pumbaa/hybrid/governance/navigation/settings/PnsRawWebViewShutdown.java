package com.bytedance.pumbaa.hybrid.governance.navigation.settings;

import X.C09CT;
import X.C13BV;
import X.C2188811AlT;
import com.bytedance.pumbaa.hybrid.governance.api.BaseGovernanceModel;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PnsRawWebViewShutdown extends BaseGovernanceModel {

    @C09CT("allow_viewList")
    public final List<String> allowViewList;

    @C09CT("allow_list")
    public final List<String> allowlist;

    public PnsRawWebViewShutdown() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PnsRawWebViewShutdown)) {
            return false;
        }
        PnsRawWebViewShutdown pnsRawWebViewShutdown = (PnsRawWebViewShutdown) obj;
        return Intrinsics.LJFF(this.allowlist, pnsRawWebViewShutdown.allowlist) && Intrinsics.LJFF(this.allowViewList, pnsRawWebViewShutdown.allowViewList);
    }

    public final int hashCode() {
        return (this.allowlist.hashCode() * 31) + this.allowViewList.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PnsRawWebViewShutdown(allowlist=");
        sbLIZ.append(this.allowlist);
        sbLIZ.append(", allowViewList=");
        sbLIZ.append(this.allowViewList);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PnsRawWebViewShutdown(List<String> list, List<String> list2) {
        super(null, false, false, false, false);
        this.allowlist = list;
        this.allowViewList = list2;
    }

    public PnsRawWebViewShutdown(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}

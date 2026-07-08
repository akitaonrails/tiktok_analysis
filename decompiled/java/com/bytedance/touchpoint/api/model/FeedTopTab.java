package com.bytedance.touchpoint.api.model;

import X.C09CT;
import X.C1893670zNV;
import X.C2188811AlT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class FeedTopTab extends C1893670zNV {

    @C09CT("icon_url")
    public String iconUrl;

    @C09CT("jump_link")
    public String jumpLink;

    @C09CT("need_login_gate")
    public boolean needLoginGate;

    public FeedTopTab() {
        this(null, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedTopTab)) {
            return false;
        }
        FeedTopTab feedTopTab = (FeedTopTab) obj;
        return Intrinsics.LJFF(this.iconUrl, feedTopTab.iconUrl) && Intrinsics.LJFF(this.jumpLink, feedTopTab.jumpLink) && this.needLoginGate == feedTopTab.needLoginGate;
    }

    public final int hashCode() {
        String str = this.iconUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.jumpLink;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.needLoginGate);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedTopTab(iconUrl=");
        sbLIZ.append(this.iconUrl);
        sbLIZ.append(", jumpLink=");
        sbLIZ.append(this.jumpLink);
        sbLIZ.append(", needLoginGate=");
        sbLIZ.append(this.needLoginGate);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public FeedTopTab(String str, String str2, boolean z) {
        this.iconUrl = str;
        this.jumpLink = str2;
        this.needLoginGate = z;
    }
}

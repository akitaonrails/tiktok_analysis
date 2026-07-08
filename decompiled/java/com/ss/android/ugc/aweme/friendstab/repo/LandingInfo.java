package com.ss.android.ugc.aweme.friendstab.repo;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes25.dex */
public final class LandingInfo {

    @C09CT("anchor_item_id")
    public final String anchorItemId;

    @C09CT("anchor_type")
    public final int anchorType;

    @C09CT("degrade_reason")
    public final String degradeReason;

    @C09CT("is_degraded")
    public final boolean isDegraded;

    public LandingInfo() {
        this(0, null, false, null);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LandingInfo(anchorType=");
        sbLIZ.append(this.anchorType);
        sbLIZ.append(", anchorItemId=");
        sbLIZ.append(this.anchorItemId);
        sbLIZ.append(", isDegraded=");
        sbLIZ.append(this.isDegraded);
        sbLIZ.append(", degradeReason=");
        sbLIZ.append(this.degradeReason);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LandingInfo(int i, String str, boolean z, String str2) {
        this.anchorType = i;
        this.anchorItemId = str;
        this.isDegraded = z;
        this.degradeReason = str2;
    }
}

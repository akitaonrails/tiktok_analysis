package com.ss.android.ugc.profile.business.effect.userlevel;

import X.C09CT;
import X.C2188811AlT;

/* JADX INFO: loaded from: classes15.dex */
public final class TTAppGetUnclaimedBonusBadgeRsp {
    public static final int $stable = 8;

    @C09CT("badge_id")
    public final int badgeId;
    public int httpStatusCode;

    @C09CT("is_viewed")
    public final boolean isViewed;

    public TTAppGetUnclaimedBonusBadgeRsp() {
        this(0, true, -1);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTAppGetUnclaimedBonusBadgeRsp(badgeId=");
        sbLIZ.append(this.badgeId);
        sbLIZ.append(", isViewed=");
        sbLIZ.append(this.isViewed);
        sbLIZ.append(", httpStatusCode=");
        sbLIZ.append(this.httpStatusCode);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isViewed() {
        return this.isViewed;
    }

    public final void setHttpStatusCode(int i) {
        this.httpStatusCode = i;
    }

    public TTAppGetUnclaimedBonusBadgeRsp(int i, boolean z, int i2) {
        this.badgeId = i;
        this.isViewed = z;
        this.httpStatusCode = i2;
    }
}

package com.ss.android.ugc.aweme.inbox.widget.multi;

import X.C09CT;
import X.C2188811AlT;
import X.C895250ZAd;
import X.EnumC895310ZAj;

/* JADX INFO: loaded from: classes15.dex */
public final class RedPoint {

    @C09CT("type")
    public final EnumC895310ZAj type;

    @C09CT("unread_count")
    public final int unreadCount;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RedPoint(type=");
        sbLIZ.append(this.type);
        sbLIZ.append(", unreadCount=");
        sbLIZ.append(this.unreadCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return C895250ZAd.LIZ[this.type.ordinal()] == 1 ? this.type.hashCode() + this.unreadCount : this.type.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RedPoint)) {
            return false;
        }
        EnumC895310ZAj enumC895310ZAj = this.type;
        RedPoint redPoint = (RedPoint) obj;
        if (enumC895310ZAj != redPoint.type) {
            return false;
        }
        if (enumC895310ZAj != EnumC895310ZAj.COUNT || this.unreadCount == redPoint.unreadCount) {
            return true;
        }
        return false;
    }

    public RedPoint(EnumC895310ZAj enumC895310ZAj, int i) {
        this.type = enumC895310ZAj;
        this.unreadCount = i;
    }
}

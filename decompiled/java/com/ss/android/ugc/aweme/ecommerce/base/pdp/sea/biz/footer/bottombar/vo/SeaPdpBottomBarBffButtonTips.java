package com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.footer.bottombar.vo;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class SeaPdpBottomBarBffButtonTips {

    @C09CT("unread_message_count")
    public final Integer unreadMessageCount;

    public SeaPdpBottomBarBffButtonTips() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SeaPdpBottomBarBffButtonTips) && Intrinsics.LJFF(this.unreadMessageCount, ((SeaPdpBottomBarBffButtonTips) obj).unreadMessageCount);
    }

    public final int hashCode() {
        Integer num = this.unreadMessageCount;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaPdpBottomBarBffButtonTips(unreadMessageCount=");
        sbLIZ.append(this.unreadMessageCount);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public SeaPdpBottomBarBffButtonTips(Integer num) {
        this.unreadMessageCount = num;
    }
}

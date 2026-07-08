package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class PollOrderDisplayInfo {

    @C09CT("member_ship_display_info")
    public final MemberShipDisplayInfo memberShipDisplayInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PollOrderDisplayInfo) && Intrinsics.LJFF(this.memberShipDisplayInfo, ((PollOrderDisplayInfo) obj).memberShipDisplayInfo);
    }

    public final int hashCode() {
        MemberShipDisplayInfo memberShipDisplayInfo = this.memberShipDisplayInfo;
        if (memberShipDisplayInfo == null) {
            return 0;
        }
        return memberShipDisplayInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PollOrderDisplayInfo(memberShipDisplayInfo=");
        sbLIZ.append(this.memberShipDisplayInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PollOrderDisplayInfo(MemberShipDisplayInfo memberShipDisplayInfo) {
        this.memberShipDisplayInfo = memberShipDisplayInfo;
    }
}

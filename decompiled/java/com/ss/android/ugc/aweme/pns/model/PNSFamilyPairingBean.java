package com.ss.android.ugc.aweme.pns.model;

import X.C09CT;
import X.C2188811AlT;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class PNSFamilyPairingBean {

    @C09CT("children_count")
    public final Integer childrenCount;

    @C09CT("duration_as_parent")
    public final Long duration;

    @C09CT("link_count")
    public final Integer linkCount;

    @C09CT("restriction")
    public final PNSGuardianRestrictionBean restriction;

    @C09CT("user_identity")
    public final Integer userIdentity;

    public PNSFamilyPairingBean() {
        this(1, new PNSGuardianRestrictionBean(0, 0, 0, new PNSDoNotDisturbSettings(Boolean.FALSE, 0, 0, 0, 0), 0, 0, 0, 0, 0, new ArrayList(), false, new PNSScheduleBreakSettings(false, 0, 0, new ArrayList(), 0), null, 0), 0, 0, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PNSFamilyPairingBean)) {
            return false;
        }
        PNSFamilyPairingBean pNSFamilyPairingBean = (PNSFamilyPairingBean) obj;
        return Intrinsics.LJFF(this.userIdentity, pNSFamilyPairingBean.userIdentity) && Intrinsics.LJFF(this.restriction, pNSFamilyPairingBean.restriction) && Intrinsics.LJFF(this.childrenCount, pNSFamilyPairingBean.childrenCount) && Intrinsics.LJFF(this.linkCount, pNSFamilyPairingBean.linkCount) && Intrinsics.LJFF(this.duration, pNSFamilyPairingBean.duration);
    }

    public final int hashCode() {
        Integer num = this.userIdentity;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        PNSGuardianRestrictionBean pNSGuardianRestrictionBean = this.restriction;
        int iHashCode2 = (iHashCode + (pNSGuardianRestrictionBean == null ? 0 : pNSGuardianRestrictionBean.hashCode())) * 31;
        Integer num2 = this.childrenCount;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.linkCount;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l = this.duration;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PNSFamilyPairingBean(userIdentity=");
        sbLIZ.append(this.userIdentity);
        sbLIZ.append(", restriction=");
        sbLIZ.append(this.restriction);
        sbLIZ.append(", childrenCount=");
        sbLIZ.append(this.childrenCount);
        sbLIZ.append(", linkCount=");
        sbLIZ.append(this.linkCount);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public PNSFamilyPairingBean(Integer num, PNSGuardianRestrictionBean pNSGuardianRestrictionBean, Integer num2, Integer num3, Long l) {
        this.userIdentity = num;
        this.restriction = pNSGuardianRestrictionBean;
        this.childrenCount = num2;
        this.linkCount = num3;
        this.duration = l;
    }
}

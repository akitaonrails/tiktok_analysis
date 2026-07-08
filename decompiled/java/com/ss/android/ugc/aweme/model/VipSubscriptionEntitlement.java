package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class VipSubscriptionEntitlement implements Serializable {
    public static final int $stable = 8;

    @C09CT("desc")
    public final String desc;

    @C09CT("logo")
    public final com.ss.android.ugc.aweme.base.model.UrlModel logo;

    public VipSubscriptionEntitlement() {
        this("", null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VipSubscriptionEntitlement)) {
            return false;
        }
        VipSubscriptionEntitlement vipSubscriptionEntitlement = (VipSubscriptionEntitlement) obj;
        return Intrinsics.LJFF(this.desc, vipSubscriptionEntitlement.desc) && Intrinsics.LJFF(this.logo, vipSubscriptionEntitlement.logo);
    }

    public int hashCode() {
        int iHashCode = this.desc.hashCode() * 31;
        com.ss.android.ugc.aweme.base.model.UrlModel urlModel = this.logo;
        return iHashCode + (urlModel == null ? 0 : urlModel.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VipSubscriptionEntitlement(desc=");
        sbLIZ.append(this.desc);
        sbLIZ.append(", logo=");
        sbLIZ.append(this.logo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public VipSubscriptionEntitlement(String str, com.ss.android.ugc.aweme.base.model.UrlModel urlModel) {
        this.desc = str;
        this.logo = urlModel;
    }
}

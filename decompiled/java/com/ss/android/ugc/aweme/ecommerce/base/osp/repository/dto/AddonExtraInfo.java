package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class AddonExtraInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("da_info")
    public final AddonDaInfo daInfo;

    public AddonExtraInfo() {
        this(null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddonExtraInfo(daInfo=");
        sbLIZ.append(this.daInfo);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AddonExtraInfo(AddonDaInfo addonDaInfo) {
        this.daInfo = addonDaInfo;
    }
}

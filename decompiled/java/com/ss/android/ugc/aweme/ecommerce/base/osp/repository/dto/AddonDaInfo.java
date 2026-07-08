package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class AddonDaInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("enter_from")
    public final String enterFrom;

    @C09CT("enter_from_info")
    public final String enterFromInfo;

    @C09CT("enter_from_merge")
    public final String enterFromMerge;

    @C09CT("previous_page")
    public final String previousPage;

    public AddonDaInfo() {
        this(null, null, null, null);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddonDaInfo(enterFrom=");
        sbLIZ.append(this.enterFrom);
        sbLIZ.append(", enterFromInfo=");
        sbLIZ.append(this.enterFromInfo);
        sbLIZ.append(", enterFromMerge=");
        sbLIZ.append(this.enterFromMerge);
        sbLIZ.append(", previousPage=");
        sbLIZ.append(this.previousPage);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AddonDaInfo(String str, String str2, String str3, String str4) {
        this.enterFrom = str;
        this.enterFromInfo = str2;
        this.enterFromMerge = str3;
        this.previousPage = str4;
    }
}

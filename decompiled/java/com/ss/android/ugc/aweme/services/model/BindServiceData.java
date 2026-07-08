package com.ss.android.ugc.aweme.services.model;

import X.C123100dR;
import X.C2188811AlT;
import X.C786410Ut5;
import android.os.Bundle;

/* JADX INFO: loaded from: classes13.dex */
public final class BindServiceData {
    public static final int $stable = 8;
    public final Bundle activityData;
    public final String enterFrom;
    public final String enterFromInfo;
    public final String enterMethod;
    public final Bundle updatedActivityData;

    public BindServiceData(Bundle bundle, String str, String str2, String str3) {
        this.activityData = bundle;
        this.enterFrom = str;
        this.enterFromInfo = str2;
        this.enterMethod = str3;
        bundle = bundle == null ? new Bundle() : bundle;
        if (C123100dR.LIZ(str)) {
            C786410Ut5.LJJJI("enter_from", str, bundle);
            if (C123100dR.LIZ(str2)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(str2);
                C786410Ut5.LJJJI("enter_from_item", C2188811AlT.LIZIZ(sbLIZ), bundle);
            }
        }
        if (C123100dR.LIZ(str3)) {
            C786410Ut5.LJJJI("enter_method", str3, bundle);
        }
        this.updatedActivityData = bundle;
    }
}

package com.ss.android.ugc.aweme.web.permission;

import X.AbstractC1387200mCc;
import X.C1388190mED;
import X.C1906580ziK;
import X.C19741112Lp;
import X.C844470XAv;
import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class AdWebPermissionService implements IAdWebPermissionService {
    @Override // com.ss.android.ugc.aweme.web.permission.IAdWebPermissionService
    public final int Vc() {
        Activity activityLIZIZ;
        Activity activityLIZ;
        C19741112Lp c19741112Lp = C19741112Lp.LIZ;
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        c19741112Lp.getClass();
        if (C19741112Lp.LIZLLL(contextLIZ, "android.permission.CAMERA")) {
            return 3;
        }
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ == null || (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null || (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) == null) {
            return 0;
        }
        return C19741112Lp.LJI(activityLIZ, "android.permission.CAMERA", true) ? 2 : 1;
    }
}

package com.ss.android.ugc.aweme.mention.service;

import X.C04TD;
import X.C1389890mGx;
import X.EnumC1413205g2;
import android.app.Activity;

/* JADX INFO: loaded from: classes3.dex */
public final class MentionLimitServiceImpl implements IMentionLimitService {
    public static IMentionLimitService LIZIZ() {
        Object objLIZ = C04TD.LIZ(IMentionLimitService.class, false);
        if (objLIZ != null) {
            return (IMentionLimitService) objLIZ;
        }
        if (C04TD.h2 == null) {
            synchronized (IMentionLimitService.class) {
                if (C04TD.h2 == null) {
                    C04TD.h2 = new MentionLimitServiceImpl();
                }
            }
        }
        return C04TD.h2;
    }

    @Override // com.ss.android.ugc.aweme.mention.service.IMentionLimitService
    public final boolean LIZ(int i, Activity activity, EnumC1413205g2 enumC1413205g2) {
        if (i >= 30) {
            if (activity != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIIZ(2131848593);
                c1389890mGx.LJIIJJI();
                return true;
            }
            return true;
        }
        return false;
    }
}

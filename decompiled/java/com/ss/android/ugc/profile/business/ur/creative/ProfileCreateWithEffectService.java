package com.ss.android.ugc.profile.business.ur.creative;

import X.C0BXN;
import X.C12E7;
import X.EnumC2193121AsQ;
import com.ss.android.ugc.ur.creative.CardActionReportData;
import com.ss.android.ugc.ur.creative.IProfileCreateWithEffectService;

/* JADX INFO: loaded from: classes30.dex */
public final class ProfileCreateWithEffectService implements IProfileCreateWithEffectService {
    @Override // com.ss.android.ugc.ur.creative.IProfileCreateWithEffectService
    public final void LIZ(String str, CardActionReportData cardActionReportData) {
        if (C0BXN.LIZ()) {
            C12E7 c12e7 = C12E7.LIZ;
            EnumC2193121AsQ enumC2193121AsQ = EnumC2193121AsQ.PUBLISH;
            c12e7.getClass();
            C12E7.LIZ(str, enumC2193121AsQ, cardActionReportData);
        }
    }
}

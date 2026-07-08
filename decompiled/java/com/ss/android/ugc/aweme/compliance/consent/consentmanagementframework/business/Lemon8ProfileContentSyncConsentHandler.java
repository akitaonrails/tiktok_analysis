package com.ss.android.ugc.aweme.compliance.consent.consentmanagementframework.business;

import X.C13LP;
import X.C1697810uHb;
import X.EnumC1876780ywG;
import X.EnumC683800Qry;
import com.ss.android.ugc.aweme.pns.consent.api.IPNSConsentHandler;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class Lemon8ProfileContentSyncConsentHandler implements IPNSConsentHandler {
    @Override // com.ss.android.ugc.aweme.pns.consent.api.IPNSConsentHandler
    public final EnumC1876780ywG LIZ(EnumC1876780ywG enumC1876780ywG) {
        return enumC1876780ywG;
    }

    @Override // com.ss.android.ugc.aweme.pns.consent.api.IPNSConsentHandler
    public final void LIZLLL() {
    }

    @Override // com.ss.android.ugc.aweme.pns.consent.api.IPNSConsentHandler
    public final String LJ(String str) {
        return str;
    }

    @Override // com.ss.android.ugc.aweme.pns.consent.api.IPNSConsentHandler
    public final boolean LIZIZ(String str) {
        return Intrinsics.LJFF(str, EnumC683800Qry.DATA_POST_SYNC_TO_LEMON8.getKey());
    }

    @Override // com.ss.android.ugc.aweme.pns.consent.api.IPNSConsentHandler
    public final boolean LIZJ(EnumC1876780ywG enumC1876780ywG, EnumC1876780ywG enumC1876780ywG2) {
        if (enumC1876780ywG != null) {
            EnumC1876780ywG enumC1876780ywG3 = EnumC1876780ywG.APPROVE;
            EnumC1876780ywG enumC1876780ywG4 = EnumC1876780ywG.REJECT;
            if (C1697810uHb.LJIIJJI(enumC1876780ywG3, enumC1876780ywG4).contains(enumC1876780ywG) && !C13LP.LJJJJ(enumC1876780ywG2, C1697810uHb.LJIIJJI(enumC1876780ywG3, enumC1876780ywG4)) && (enumC1876780ywG2 == null || enumC1876780ywG.getI() != enumC1876780ywG2.getI())) {
                return true;
            }
        }
        return false;
    }
}

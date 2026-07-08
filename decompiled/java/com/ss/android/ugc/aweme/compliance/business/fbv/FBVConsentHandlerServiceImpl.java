package com.ss.android.ugc.aweme.compliance.business.fbv;

import X.C01GW;
import X.C1916240zxu;
import X.C1916250zxv;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C452501pT;
import X.C793770VBv;
import X.EnumC1876780ywG;
import X.EnumC683800Qry;
import com.ss.android.ugc.aweme.pns.consent.api.IPNSConsentHandler;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class FBVConsentHandlerServiceImpl implements IPNSConsentHandler {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1916240zxu());

    @Override // com.ss.android.ugc.aweme.pns.consent.api.IPNSConsentHandler
    public final void LIZLLL() {
    }

    @Override // com.ss.android.ugc.aweme.pns.consent.api.IPNSConsentHandler
    public final String LJ(String str) {
        return str;
    }

    @Override // com.ss.android.ugc.aweme.pns.consent.api.IPNSConsentHandler
    public final EnumC1876780ywG LIZ(EnumC1876780ywG enumC1876780ywG) {
        EnumC1876780ywG enumC1876780ywG2 = EnumC1876780ywG.APPROVE;
        if (enumC1876780ywG == enumC1876780ywG2) {
            return enumC1876780ywG2;
        }
        C1916250zxv c1916250zxv = (C1916250zxv) this.LIZ.getValue();
        if (!c1916250zxv.LIZIZ().getBoolean(c1916250zxv.LIZIZ, false)) {
            return EnumC1876780ywG.NOTDETERMINED;
        }
        return enumC1876780ywG2;
    }

    @Override // com.ss.android.ugc.aweme.pns.consent.api.IPNSConsentHandler
    public final boolean LIZIZ(String str) {
        return Intrinsics.LJFF(str, EnumC683800Qry.DATA_BIO_FBV.getKey());
    }

    @Override // com.ss.android.ugc.aweme.pns.consent.api.IPNSConsentHandler
    public final boolean LIZJ(EnumC1876780ywG enumC1876780ywG, EnumC1876780ywG enumC1876780ywG2) {
        String strName;
        String strName2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FBVConsentHandlerServiceImpl shouldMigrate localConsentState: ");
        if (enumC1876780ywG != null) {
            strName = enumC1876780ywG.name();
        } else {
            strName = null;
        }
        sbLIZ.append(strName);
        sbLIZ.append(", serverConsentState: ");
        if (enumC1876780ywG2 != null) {
            strName2 = enumC1876780ywG2.name();
        } else {
            strName2 = null;
        }
        sbLIZ.append(strName2);
        C2188811AlT.LIZIZ(sbLIZ);
        if (enumC1876780ywG == EnumC1876780ywG.APPROVE && enumC1876780ywG2 == EnumC1876780ywG.NOTDETERMINED) {
            C793770VBv.LJII("fbv_consent_migration", new JSONObject(C2097908Jt.LIZJ(new Pair("from", "fbv_consent_handler"))), null, null);
            return true;
        }
        return false;
    }
}

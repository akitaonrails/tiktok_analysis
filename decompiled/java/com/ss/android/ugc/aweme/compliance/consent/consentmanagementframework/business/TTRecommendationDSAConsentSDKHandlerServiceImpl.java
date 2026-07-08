package com.ss.android.ugc.aweme.compliance.consent.consentmanagementframework.business;

import X.C01GW;
import X.C1193204le;
import X.C1328405Hu;
import X.C1902600zbu;
import X.C2188811AlT;
import X.C452501pT;
import X.C793770VBv;
import X.EnumC1876780ywG;
import X.EnumC1915430zwb;
import X.EnumC683800Qry;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.pns.consent.api.IPNSConsentHandler;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class TTRecommendationDSAConsentSDKHandlerServiceImpl implements IPNSConsentHandler {
    public final List<String> LIZ = Collections.singletonList(EnumC683800Qry.TT_DSA_RECOMMENDATION_CONSENT.getKey());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1328405Hu());
    public final String LIZJ = "feeds_personalization";
    public final String LIZLLL = "non_personalized_feeds_state_";
    public final C01GW LJ = C452501pT.LIZIZ(new C1193204le(this));

    @Override // com.ss.android.ugc.aweme.pns.consent.api.IPNSConsentHandler
    public final void LIZLLL() {
    }

    @Override // com.ss.android.ugc.aweme.pns.consent.api.IPNSConsentHandler
    public final EnumC1876780ywG LIZ(EnumC1876780ywG enumC1876780ywG) {
        Boolean boolValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(((IAccountService) this.LIZIZ.getValue()).LJIIJ().getCurUserId());
        if (!((Keva) this.LJ.getValue()).contains(C2188811AlT.LIZIZ(sbLIZ))) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(!((Keva) this.LJ.getValue()).getBoolean(r2, false));
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            return EnumC1876780ywG.APPROVE;
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.FALSE)) {
            return EnumC1876780ywG.REJECT;
        }
        return EnumC1876780ywG.NOTDETERMINED;
    }

    @Override // com.ss.android.ugc.aweme.pns.consent.api.IPNSConsentHandler
    public final boolean LIZIZ(String str) {
        return this.LIZ.contains(str);
    }

    @Override // com.ss.android.ugc.aweme.pns.consent.api.IPNSConsentHandler
    public final String LJ(String str) {
        if (str.length() == 0) {
            return EnumC1915430zwb.DSA_CONSENT_BOX.getS();
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.pns.consent.api.IPNSConsentHandler
    public final boolean LIZJ(EnumC1876780ywG enumC1876780ywG, EnumC1876780ywG enumC1876780ywG2) throws JSONException {
        String strName;
        String strName2;
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("dsa_consent_migration_android", false)) {
            return false;
        }
        C1902600zbu.LIZ.getClass();
        if (!C1902600zbu.LIZ() || enumC1876780ywG == enumC1876780ywG2) {
            return false;
        }
        String str = "Null";
        if (enumC1876780ywG == null || (strName = enumC1876780ywG.name()) == null) {
            strName = "Null";
        }
        if (enumC1876780ywG2 != null && (strName2 = enumC1876780ywG2.name()) != null) {
            str = strName2;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("consent_key", EnumC683800Qry.TT_DSA_RECOMMENDATION_CONSENT.getKey());
        jSONObject.put("migration_action", "migrate");
        jSONObject.put("local_status", strName);
        jSONObject.put("server_status", str);
        C793770VBv.LJII("monitor_dsa_migration", jSONObject, null, null);
        return true;
    }
}

package com.ss.android.ugc.aweme.compliance.consent.deviceconsent;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C052B;
import X.C0XQ7;
import X.C10EU;
import X.C1328605Hw;
import X.C13LQ;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C257800A8k;
import X.C452501pT;
import X.C793770VBv;
import X.EnumC1876780ywG;
import X.EnumC1915980zxU;
import X.EnumC683800Qry;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IGuestModeService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pns.consent.api.IPNSConsentHandler;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class DeviceConsentSDKHandlerServiceImpl implements IPNSConsentHandler {
    public static final Keva LIZLLL = Keva.getRepo("tpc_consent");
    public final List<String> LIZ = Collections.singletonList(EnumC683800Qry.DEVICE_CONSENT.getKey());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1328605Hw());
    public final Set<String> LIZJ = C13LQ.LJLIIL(new String[]{"AT", "BE", "BG", "CH", "CY", "CZ", "DE", "DK", "EE", "EL", "ES", "FI", "FR", "GB", "GR", "HR", "HU", "IE", "IS", "IT", "LI", "LT", "LU", "LV", "MT", "NL", "NO", "PL", "PT", "RO", "SE", "SI", "SK"});

    @Override // com.ss.android.ugc.aweme.pns.consent.api.IPNSConsentHandler
    public final void LIZLLL() {
    }

    public static boolean LJFF() {
        return LIZLLL.getBoolean("have_passed_consent", false) || (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && !C10EU.LJIIIIZZ());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r1.getBoolean("is_consent_accepted", false) == false) goto L6;
     */
    @Override // com.ss.android.ugc.aweme.pns.consent.api.IPNSConsentHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EnumC1876780ywG LIZ(X.EnumC1876780ywG r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            boolean r0 = r0.isLogin()
            r2 = 0
            if (r0 == 0) goto L16
            boolean r0 = X.C10EU.LJIIIIZZ()
            if (r0 == 0) goto L16
        L13:
            X.0ywG r0 = X.EnumC1876780ywG.NOTDETERMINED
            return r0
        L16:
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            X.0XPy r0 = (X.AbstractC848400XPy) r0
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L3c
            com.bytedance.keva.Keva r1 = com.ss.android.ugc.aweme.compliance.consent.deviceconsent.DeviceConsentSDKHandlerServiceImpl.LIZLLL
            java.lang.String r0 = "have_passed_consent"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "user_logged_in_atleast_once"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "is_consent_accepted"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L13
        L3c:
            X.0ywG r0 = X.EnumC1876780ywG.APPROVE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.consent.deviceconsent.DeviceConsentSDKHandlerServiceImpl.LIZ(X.0ywG):X.0ywG");
    }

    @Override // com.ss.android.ugc.aweme.pns.consent.api.IPNSConsentHandler
    public final boolean LIZIZ(String str) {
        return this.LIZ.contains(str);
    }

    @Override // com.ss.android.ugc.aweme.pns.consent.api.IPNSConsentHandler
    public final String LJ(String str) {
        int i;
        EnumC1915980zxU enumC1915980zxU = EnumC1915980zxU.CONSENT_DEFAULT;
        if (!Intrinsics.LJFF(str, enumC1915980zxU.getFlow())) {
            return str;
        }
        Keva keva = LIZLLL;
        if (!keva.contains("consent_reason")) {
            if (C10EU.LJIIIIZZ()) {
                i = 2;
            } else if (((IGuestModeService) ServiceManager.get().getService(IGuestModeService.class)).isGuestMode()) {
                i = 3;
            } else if (keva.getBoolean("is_consent_accepted", false)) {
                i = 6;
            } else if (keva.getBoolean("user_logged_in_atleast_once", false)) {
                i = 4;
            } else if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                i = 1;
            } else if (LJFF()) {
                i = 10;
            } else if (!LJFF()) {
                i = 7;
            } else {
                i = 0;
            }
            keva.storeInt("consent_reason", i);
        }
        switch (keva.getInt("consent_reason", 0)) {
            case 1:
                enumC1915980zxU = EnumC1915980zxU.CONSENT_LOGIN;
                break;
            case 2:
                enumC1915980zxU = EnumC1915980zxU.CONSENT_KIDS_MODE;
                break;
            case 3:
                enumC1915980zxU = EnumC1915980zxU.CONSENT_GUEST_MODE;
                break;
            case 4:
                enumC1915980zxU = EnumC1915980zxU.CONSENT_LOGIN_ONCE;
                break;
            case 5:
                enumC1915980zxU = EnumC1915980zxU.CONSENT_KIDS_LOGIN_ONCE;
                break;
            case 6:
                enumC1915980zxU = EnumC1915980zxU.CONSENT_BOX;
                break;
            case 7:
                enumC1915980zxU = EnumC1915980zxU.DOES_NOT_HAVE_CONSENT;
                break;
            case 8:
                enumC1915980zxU = EnumC1915980zxU.CONSENT_AGE_GATE_PASS;
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                enumC1915980zxU = EnumC1915980zxU.HAS_CONSENT;
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                enumC1915980zxU = EnumC1915980zxU.USER_AGREED_CONSENT;
                break;
        }
        return enumC1915980zxU.getFlow();
    }

    @Override // com.ss.android.ugc.aweme.pns.consent.api.IPNSConsentHandler
    public final boolean LIZJ(EnumC1876780ywG enumC1876780ywG, EnumC1876780ywG enumC1876780ywG2) {
        String string;
        String str;
        String string2;
        C052B.LIZ.getClass();
        String str2 = "-1";
        if (enumC1876780ywG == null || (string = Integer.valueOf(enumC1876780ywG.getI()).toString()) == null) {
            string = "-1";
        }
        if (enumC1876780ywG2 != null && (string2 = Integer.valueOf(enumC1876780ywG2.getI()).toString()) != null) {
            str2 = string2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trackDeviceConsentConsistency, local status = ");
        sbLIZ.append(string);
        sbLIZ.append(", server status = ");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("local_consent_status", string);
        pairArr[1] = new Pair("server_consent_status", str2);
        if (Intrinsics.LJFF(string, str2)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("is_aligned", str);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        C20684815ws.LJIILLIIL("pns_device_consent_consistency", mapLJIIIIZZ);
        C793770VBv.LJII("pns_device_consent_consistency", new JSONObject(mapLJIIIIZZ), null, null);
        if (!((Boolean) C257800A8k.LIZ.getValue()).booleanValue() || enumC1876780ywG != EnumC1876780ywG.APPROVE || enumC1876780ywG2 != EnumC1876780ywG.NOTDETERMINED) {
            return false;
        }
        return true;
    }
}

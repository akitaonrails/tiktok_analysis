package com.ss.android.ugc.aweme.compliance.consent.deviceconsent;

import X.C01GW;
import X.C04TD;
import X.C13LQ;
import X.C1913000zsg;
import X.C294580Bge;
import X.C452501pT;
import X.C844470XAv;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.consent.DeviceConsentDisclaimerService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentConfigService;
import com.ss.android.ugc.aweme.compliance.api.services.consent.model.ConsentBoxConfig;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class DeviceConsentDisclaimerServiceImpl implements DeviceConsentDisclaimerService {
    public final String LIZ;
    public String LIZIZ;
    public final String LIZJ;
    public String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final C01GW LJII;
    public final Set<String> LJIIIIZZ;

    public DeviceConsentDisclaimerServiceImpl() {
        C844470XAv.LIZ.getClass();
        this.LIZ = C844470XAv.LIZ().getString(2131829455);
        this.LIZIZ = C844470XAv.LIZ().getString(2131829454);
        this.LIZJ = C844470XAv.LIZ().getString(2131829453);
        this.LIZLLL = C844470XAv.LIZ().getString(2131829456);
        this.LJ = C844470XAv.LIZ().getString(2131829448);
        this.LJFF = C844470XAv.LIZ().getString(2131821683);
        this.LJI = C844470XAv.LIZ().getString(2131821684);
        this.LJII = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(212));
        this.LJIIIIZZ = C13LQ.LJLIIL(new String[]{"AT", "BE", "BG", "CH", "CY", "CZ", "DE", "DK", "EE", "EL", "ES", "FI", "FR", "GB", "GR", "HR", "HU", "IE", "IS", "IT", "LI", "LT", "LU", "LV", "MT", "NL", "NO", "PL", "PT", "RO", "SE", "SI", "SK"});
    }

    public static DeviceConsentDisclaimerService LIZJ() {
        Object objLIZ = C04TD.LIZ(DeviceConsentDisclaimerService.class, false);
        if (objLIZ != null) {
            return (DeviceConsentDisclaimerService) objLIZ;
        }
        if (C04TD.LLLLL == null) {
            synchronized (DeviceConsentDisclaimerService.class) {
                if (C04TD.LLLLL == null) {
                    C04TD.LLLLL = new DeviceConsentDisclaimerServiceImpl();
                }
            }
        }
        return C04TD.LLLLL;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.DeviceConsentDisclaimerService
    public final String LIZ() {
        IPNSConsentConfigService iPNSConsentConfigServiceLJIIIZ;
        ConsentBoxConfig consentBoxConfigLJI;
        String str;
        if (C294580Bge.LIZ() && (iPNSConsentConfigServiceLJIIIZ = ComplianceServiceProvider.LJIIIZ()) != null && (consentBoxConfigLJI = iPNSConsentConfigServiceLJIIIZ.LJI()) != null) {
            C1913000zsg.LIZ.getClass();
            Map<String, String> map = consentBoxConfigLJI.buttons;
            if (map != null && (str = map.get("agree")) != null && str.length() != 0) {
                return str;
            }
        }
        String storeRegionUpperCase = ((IAccountService) this.LJII.getValue()).getStoreRegionUpperCase();
        if (this.LJIIIIZZ.contains(storeRegionUpperCase)) {
            storeRegionUpperCase = "EU";
        }
        if (Intrinsics.LJFF("TR", storeRegionUpperCase)) {
            C844470XAv.LIZ.getClass();
            this.LIZLLL = C844470XAv.LIZ().getString(2131857294);
        }
        return this.LIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x01e2  */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.consent.DeviceConsentDisclaimerService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.SpannableStringBuilder LIZIZ(java.lang.Integer r16, java.lang.Integer r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.consent.deviceconsent.DeviceConsentDisclaimerServiceImpl.LIZIZ(java.lang.Integer, java.lang.Integer, boolean):android.text.SpannableStringBuilder");
    }
}

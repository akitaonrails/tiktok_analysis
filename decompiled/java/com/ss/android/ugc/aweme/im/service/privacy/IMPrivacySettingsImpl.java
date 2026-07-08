package com.ss.android.ugc.aweme.im.service.privacy;

import X.C01GW;
import X.C05RV;
import X.C1192604lY;
import X.C11J7;
import X.C11JF;
import X.C11ON;
import X.C11RO;
import X.C1239300iM4;
import X.C13LP;
import X.C1689706jX;
import X.C1693106k5;
import X.C1910990zpR;
import X.C2529609vi;
import X.C452501pT;
import X.InterfaceC420801kM;
import X.InterfaceC742660TBg;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes29.dex */
public final class IMPrivacySettingsImpl implements PrivacySettingsFeature {
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1192604lY());

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature
    public final boolean LJI() {
        return LIZLLL(3);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature
    public final boolean LJIILL() {
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJJ = LJJ(0, "dm_setting_others");
        if (privacySettingsRestrictionItemLJJ != null) {
            return privacySettingsRestrictionItemLJJ.showType != 2 || LJJI();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature
    public final boolean LJIJ() {
        return LIZLLL(4) || LIZLLL(1);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature
    public final boolean LJIJJ() {
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJJ;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJJ2 = LJJ(0, "activity_status_v2");
        return (privacySettingsRestrictionItemLJJ2 != null && privacySettingsRestrictionItemLJJ2.showType == 0) || ((privacySettingsRestrictionItemLJJ = LJJ(0, "activity_status")) != null && privacySettingsRestrictionItemLJJ.showType == 0);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature
    public final boolean LJJI() {
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJJ = LJJ(0, "dm_setting_friends");
        return (privacySettingsRestrictionItemLJJ == null || privacySettingsRestrictionItemLJJ.showType == 2) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature
    public final boolean LJ() {
        int i = C2529609vi.LIZ;
        return C2529609vi.LIZ != 0;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature
    public final boolean LJII() {
        Integer numLIZIZ = LIZIZ("dm_setting_potential_connection");
        if (numLIZIZ != null && numLIZIZ.intValue() == 3) {
            return true;
        }
        Integer numLIZIZ2 = LIZIZ("dm_setting_others");
        return numLIZIZ2 != null && numLIZIZ2.intValue() == 3;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature
    public final String LJIIIIZZ() {
        Integer numLIZIZ = LIZIZ("direct_message");
        return numLIZIZ != null ? numLIZIZ.intValue() == 1 ? "Everyone" : numLIZIZ.intValue() == 4 ? "Suggested_friends" : numLIZIZ.intValue() == 2 ? "Friends" : numLIZIZ.intValue() == 3 ? "No_one" : "" : "";
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature
    public final boolean LJIIJ() {
        return LIZJ("dm_filter_keyword");
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature
    public final int LJIIJJI() {
        Integer numLIZIZ = LIZIZ("direct_message");
        if (numLIZIZ != null) {
            return numLIZIZ.intValue();
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature
    public final boolean LJIILJJIL() {
        Integer numLIZIZ = LIZIZ("direct_message");
        return (numLIZIZ == null || numLIZIZ.intValue() == 3) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature
    public final Boolean LJIJI() {
        Integer numLIZIZ = LIZIZ("message_read_status");
        if (numLIZIZ != null) {
            return Boolean.valueOf(numLIZIZ.intValue() == 1);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature
    public final boolean LIZ() {
        Boolean boolLJIIL = LJIIL();
        if (boolLJIIL != null) {
            return boolLJIIL.booleanValue();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature
    public final Boolean LJIIL() {
        if (!C1689706jX.LIZ()) {
            Integer numLIZIZ = LIZIZ("activity_status");
            if (numLIZIZ != null) {
                return Boolean.valueOf(numLIZIZ.intValue() == 1);
            }
            return null;
        }
        Integer numLIZIZ2 = LIZIZ("activity_status_v2");
        if (numLIZIZ2 == null) {
            return null;
        }
        int iIntValue = numLIZIZ2.intValue();
        return Boolean.valueOf(iIntValue == 1 || iIntValue == 4);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature
    public final int LJIILLIIL() {
        if (C1689706jX.LIZ()) {
            Integer numLIZIZ = LIZIZ("activity_status_v2");
            if (numLIZIZ != null) {
                return numLIZIZ.intValue();
            }
            return 5;
        }
        Integer numLIZIZ2 = LIZIZ("activity_status");
        if (numLIZIZ2 != null) {
            return numLIZIZ2.intValue();
        }
        return 2;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature
    public final boolean LJIIZILJ() {
        return C1693106k5.LIZIZ() ? LIZJ("dm_safe_mode") : LIZJ("dm_filter_nude");
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature
    public final void LJIL() {
        ComplianceServiceProvider.LJIJJ().LJIILJJIL();
    }

    public static Integer LIZIZ(String str) {
        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ = ComplianceServiceProvider.LJIJJ().LJIIIIZZ();
        if (privacyUserSettingsV2LJIIIIZZ != null) {
            return privacyUserSettingsV2LJIIIIZZ.LIZ(str);
        }
        return null;
    }

    public static boolean LIZJ(String str) {
        Integer numLIZIZ = LIZIZ(str);
        if (numLIZIZ != null && numLIZIZ.intValue() == 1) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(int i) {
        Integer numLIZIZ = LIZIZ("direct_message");
        if (numLIZIZ != null && numLIZIZ.intValue() == i) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature
    public final int LJIIIZ(String str) {
        Integer numLIZIZ = LIZIZ(str);
        if (numLIZIZ != null) {
            return numLIZIZ.intValue();
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature
    public final Integer LJIILIIL(String str) {
        return LIZIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature
    public final boolean LJIJJLI(boolean z) {
        if (z && C1910990zpR.LIZIZ.LIZJ() == C05RV.BUSINESS_INBOX) {
            return false;
        }
        if (!LIZJ("dm_safe_mode") && !LIZJ("dm_filter_keyword")) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature
    public final void LJJII(String str) {
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((Map) this.LIZIZ.getValue()).get(str);
        if (interfaceC420801kM != null && (!interfaceC420801kM.isDisposed())) {
            interfaceC420801kM.dispose();
        }
        ((Map) this.LIZIZ.getValue()).remove(str);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature
    public final PrivacySettingsRestrictionItem LJJ(int i, String str) {
        return ComplianceServiceProvider.LJIJJ().LJIIIZ(i, str);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature
    public final void LJJIFFI(Map<String, Integer> map, C11RO c11ro, C11RO c11ro2, Function0<Unit> function0, Function1<? super Throwable, Unit> function1, boolean z) {
        C11ON c11onLIZ;
        C11JF c11jfLJ = null;
        String strLJJLIIIJ = C13LP.LJJLIIIJ(map.keySet(), null, null, null, 0, null, null, 63);
        LJJII(strLJJLIIIJ);
        InterfaceC742660TBg interfaceC742660TBgLIZIZ = ComplianceServiceProvider.LJIJJ().LIZIZ();
        if (interfaceC742660TBgLIZIZ != null && (c11onLIZ = interfaceC742660TBgLIZIZ.LIZ(map)) != null) {
            c11jfLJ = C1239300iM4.LJ(c11onLIZ.LJL(c11ro).LJJJLZIJ(c11ro2), function1, function0, C1239300iM4.LIZ);
        }
        if (z) {
            ((Map) this.LIZIZ.getValue()).put(strLJJLIIIJ, c11jfLJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature
    public final void LJFF(String str, int i, C11RO c11ro, C11RO c11ro2, Function0<Unit> function0, Function1<? super Throwable, Unit> function1, boolean z) {
        C11J7 c11j7LIZJ;
        LJJII(str);
        InterfaceC742660TBg interfaceC742660TBgLIZIZ = ComplianceServiceProvider.LJIJJ().LIZIZ();
        C11JF c11jfLJ = null;
        if (interfaceC742660TBgLIZIZ != null && (c11j7LIZJ = interfaceC742660TBgLIZIZ.LIZJ(i, str)) != null) {
            c11jfLJ = C1239300iM4.LJ(c11j7LIZJ.LJL(c11ro).LJJJLZIJ(c11ro2), function1, function0, C1239300iM4.LIZ);
        }
        if (z) {
            ((Map) this.LIZIZ.getValue()).put(str, c11jfLJ);
        }
    }
}

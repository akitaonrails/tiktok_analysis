package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import X.C09JN;
import X.C0TON;
import X.C100E;
import X.C100F;
import X.C102O;
import X.C102R;
import X.C102T;
import X.C102U;
import X.C11S5;
import X.C13BV;
import X.C15O7;
import X.C1701940uOG;
import X.C1915280zwM;
import X.C19260610Wu;
import X.C2188811AlT;
import X.C589830NBl;
import X.C823050WQl;
import X.EnumC1915270zwL;
import X.EnumC191814102i;
import X.InterfaceC191808102c;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.bytedance.keva.Keva;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.model.LegalEntityChangeInfo;
import com.ss.android.ugc.aweme.compliance.api.model.PolicyBodyLinkList;
import com.ss.android.ugc.aweme.compliance.api.model.PreferenceSettings;
import com.ss.android.ugc.aweme.compliance.api.model.UltimateCmplSettings;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.ss.android.ugc.aweme.compliance.business.settings.ComplianceApi;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class ComplianceSettingsServiceImpl implements IComplianceSettingsService {
    public final String LIZ = "ComplianceSettingsServiceImpl";

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final EnumC191814102i LIZ() {
        C102U.LIZ.getClass();
        return C102U.LIZLLL() != EnumC191814102i.PASS ? C102U.LIZLLL() : EnumC191814102i.EU_EEA;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final boolean LJFF() {
        C102U.LIZ.getClass();
        if (C102U.LIZLLL() != EnumC191814102i.US_FTC) {
            return false;
        }
        C102T c102t = C102U.LIZJ;
        Long lValueOf = c102t.LJIIJ;
        if (lValueOf == null && (lValueOf = Long.valueOf(c102t.LIZIZ.getLong("age_gate_block_device_register_expire_time", 0L))) == null) {
            return false;
        }
        long jLongValue = lValueOf.longValue();
        return jLongValue > 0 && System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT) <= jLongValue;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final String LJII() {
        C102U.LIZ.getClass();
        C102T c102t = C102U.LIZJ;
        String str = c102t.LJI;
        if (str != null) {
            return str;
        }
        Keva keva = c102t.LIZIZ;
        ComplianceSetting complianceSettingLIZ = c102t.LIZ();
        String string = keva.getString("cmpl_enc", complianceSettingLIZ != null ? complianceSettingLIZ.getComplianceEncrypt() : null);
        return string == null ? "unknown" : string;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final boolean LJIIIIZZ() {
        C102U.LIZ.getClass();
        ComplianceSetting complianceSettingLIZ = C102U.LIZJ.LIZ();
        if (complianceSettingLIZ != null) {
            return complianceSettingLIZ.getNotifyParentsWithEmail();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final void LJIIJ() {
        C102O.LIZ.getClass();
        if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            C15O7.LIZJ(new C102R(null));
        } else {
            C102O.LIZ(null);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final ComplianceSetting LJIILLIIL() {
        C102U.LIZ.getClass();
        return C102U.LIZJ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final boolean LJIJI() {
        Integer enableImpressum;
        String impressumUrl;
        C102U.LIZ.getClass();
        C102T c102t = C102U.LIZJ;
        ComplianceSetting complianceSettingLIZ = c102t.LIZ();
        if (complianceSettingLIZ == null || (enableImpressum = complianceSettingLIZ.getEnableImpressum()) == null) {
            enableImpressum = 0;
        }
        if (enableImpressum.intValue() == 0) {
            return false;
        }
        ComplianceSetting complianceSettingLIZ2 = c102t.LIZ();
        if (complianceSettingLIZ2 == null || (impressumUrl = complianceSettingLIZ2.getImpressumUrl()) == null) {
            impressumUrl = "";
        }
        return !TextUtils.isEmpty(impressumUrl);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final void LJIJJ() {
        C102U.LIZ.getClass();
        C102T c102t = C102U.LIZJ;
        c102t.LJI = null;
        c102t.LIZIZ.storeString("cmpl_enc", null);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final boolean LJIL() {
        C102U.LIZ.getClass();
        return C102U.LJ;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final boolean LJJIII() {
        C102U.LIZ.getClass();
        return C102U.LJFF;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final int LJJIIJZLJL() {
        C102U.LIZ.getClass();
        ComplianceSetting complianceSettingLIZ = C102U.LIZJ.LIZ();
        if (complianceSettingLIZ != null) {
            return complianceSettingLIZ.isMixedAge();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final EnumC1915270zwL LJJIJ() {
        PreferenceSettings preferenceSettings;
        Integer numValueOf = null;
        ISpecActService iSpecActService = (ISpecActService) PluggableExtentionKt.pluggableSpi$default(ISpecActService.class, false, false, false, 14, null);
        if (iSpecActService != null && iSpecActService.LJJLI()) {
            ISpecActService iSpecActService2 = (ISpecActService) PluggableExtentionKt.pluggableSpi$default(ISpecActService.class, false, false, false, 14, null);
            if (iSpecActService2 != null && iSpecActService2.LJJZZI()) {
                return EnumC1915270zwL.FORCE_ON;
            }
            ISpecActService iSpecActService3 = (ISpecActService) PluggableExtentionKt.pluggableSpi$default(ISpecActService.class, false, false, false, 14, null);
            return (iSpecActService3 == null || !iSpecActService3.LJL()) ? EnumC1915270zwL.OFF : EnumC1915270zwL.ON;
        }
        C1915280zwM c1915280zwM = EnumC1915270zwL.Companion;
        ComplianceSetting complianceSettingLJIILLIIL = LJIILLIIL();
        if (complianceSettingLJIILLIIL != null && (preferenceSettings = complianceSettingLJIILLIIL.getPreferenceSettings()) != null) {
            numValueOf = Integer.valueOf(preferenceSettings.stemFeedStatus);
        }
        c1915280zwM.getClass();
        for (EnumC1915270zwL enumC1915270zwL : EnumC1915270zwL.values()) {
            int value = enumC1915270zwL.getValue();
            if (numValueOf != null && value == numValueOf.intValue()) {
                return enumC1915270zwL;
            }
        }
        return EnumC1915270zwL.UNKNOWN;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final List<PolicyBodyLinkList> LIZIZ() {
        LegalEntityChangeInfo legalEntityChangeInfo;
        List<PolicyBodyLinkList> list;
        ComplianceSetting complianceSettingLJIILLIIL = LJIILLIIL();
        return (complianceSettingLJIILLIIL == null || (legalEntityChangeInfo = complianceSettingLJIILLIIL.getLegalEntityChangeInfo()) == null || (list = legalEntityChangeInfo.bodyLinkList) == null) ? C13BV.INSTANCE : list;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final String LIZJ() {
        ComplianceSetting complianceSettingLJIILLIIL = LJIILLIIL();
        if (complianceSettingLJIILLIIL != null) {
            return complianceSettingLJIILLIIL.getInterfaceControlSettingsString();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final String LIZLLL() {
        LegalEntityChangeInfo legalEntityChangeInfo;
        String str;
        ComplianceSetting complianceSettingLJIILLIIL = LJIILLIIL();
        return (complianceSettingLJIILLIIL == null || (legalEntityChangeInfo = complianceSettingLJIILLIIL.getLegalEntityChangeInfo()) == null || (str = legalEntityChangeInfo.body) == null) ? "" : str;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final String LJ() {
        LegalEntityChangeInfo legalEntityChangeInfo;
        String str;
        ComplianceSetting complianceSettingLJIILLIIL = LJIILLIIL();
        return (complianceSettingLJIILLIIL == null || (legalEntityChangeInfo = complianceSettingLJIILLIIL.getLegalEntityChangeInfo()) == null || (str = legalEntityChangeInfo.title) == null) ? "" : str;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final List<String> LJI() {
        List<String> blackSetting;
        ComplianceSetting complianceSettingLJIILLIIL = LJIILLIIL();
        return (complianceSettingLJIILLIIL == null || (blackSetting = complianceSettingLJIILLIIL.getBlackSetting()) == null) ? new ArrayList() : blackSetting;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final boolean LJIIJJI() {
        AdPersonalitySettings adPersonalitySettings;
        AdFreeSubscription adFreeSubscription;
        List<Integer> list;
        ComplianceSetting complianceSettingLJIILLIIL = LJIILLIIL();
        return (complianceSettingLJIILLIIL == null || (adPersonalitySettings = complianceSettingLJIILLIIL.getAdPersonalitySettings()) == null || (adFreeSubscription = adPersonalitySettings.subscription) == null || (list = adFreeSubscription.ttPlusIntroEntries) == null || !list.contains(1)) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final AdPersonalitySettings LJIIL() {
        ComplianceSetting complianceSettingLJIILLIIL = LJIILLIIL();
        if (complianceSettingLJIILLIIL != null) {
            return complianceSettingLJIILLIIL.getAdPersonalitySettings();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final void LJIILIIL() {
        boolean zLJI = MethodIDManager.LJI(202080);
        C102U.LIZ.getClass();
        C102U.LIZJ.LIZIZ(null);
        ComplianceServiceProvider.LJIIZILJ().LIZ();
        C102U.LIZJ().LIZ(new C100E(null), 0);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final boolean LJIILJJIL() {
        AdPersonalitySettings adPersonalitySettings;
        AdFreeSubscription adFreeSubscription;
        List<Integer> list;
        ComplianceSetting complianceSettingLJIILLIIL = LJIILLIIL();
        return (complianceSettingLJIILLIIL == null || (adPersonalitySettings = complianceSettingLJIILLIIL.getAdPersonalitySettings()) == null || (adFreeSubscription = adPersonalitySettings.subscription) == null || (list = adFreeSubscription.ttPlusIntroEntries) == null || !list.contains(5)) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final boolean LJIIZILJ() {
        AdPersonalitySettings adPersonalitySettings;
        AdFreeSubscription adFreeSubscription;
        List<Integer> list;
        ComplianceSetting complianceSettingLJIILLIIL = LJIILLIIL();
        return (complianceSettingLJIILLIIL == null || (adPersonalitySettings = complianceSettingLJIILLIIL.getAdPersonalitySettings()) == null || (adFreeSubscription = adPersonalitySettings.subscription) == null || (list = adFreeSubscription.ttPlusIntroEntries) == null || !list.contains(2)) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final boolean LJJ() {
        AdPersonalitySettings adPersonalitySettings;
        AdFreeSubscription adFreeSubscription;
        List<Integer> list;
        AdPersonalitySettings adPersonalitySettings2;
        AdFreeSubscription adFreeSubscription2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTCommerce-");
        sbLIZ.append(this.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[isBottomBannerEntryEnabled] ttPlusIntroEntries=");
        ComplianceSetting complianceSettingLJIILLIIL = LJIILLIIL();
        sbLIZ2.append((complianceSettingLJIILLIIL == null || (adPersonalitySettings2 = complianceSettingLJIILLIIL.getAdPersonalitySettings()) == null || (adFreeSubscription2 = adPersonalitySettings2.subscription) == null) ? null : adFreeSubscription2.ttPlusIntroEntries);
        C2188811AlT.LIZIZ(sbLIZ2);
        ComplianceSetting complianceSettingLJIILLIIL2 = LJIILLIIL();
        return (complianceSettingLJIILLIIL2 == null || (adPersonalitySettings = complianceSettingLJIILLIIL2.getAdPersonalitySettings()) == null || (adFreeSubscription = adPersonalitySettings.subscription) == null || (list = adFreeSubscription.ttPlusIntroEntries) == null || !list.contains(3)) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final boolean LJJII() {
        AdPersonalitySettings adPersonalitySettings;
        AdFreeSubscription adFreeSubscription;
        List<Integer> list;
        AdPersonalitySettings adPersonalitySettings2;
        AdFreeSubscription adFreeSubscription2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTCommerce-");
        sbLIZ.append(this.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[isDislikeEntryEnabled] ttPlusIntroEntries=");
        ComplianceSetting complianceSettingLJIILLIIL = LJIILLIIL();
        sbLIZ2.append((complianceSettingLJIILLIIL == null || (adPersonalitySettings2 = complianceSettingLJIILLIIL.getAdPersonalitySettings()) == null || (adFreeSubscription2 = adPersonalitySettings2.subscription) == null) ? null : adFreeSubscription2.ttPlusIntroEntries);
        C2188811AlT.LIZIZ(sbLIZ2);
        ComplianceSetting complianceSettingLJIILLIIL2 = LJIILLIIL();
        return (complianceSettingLJIILLIIL2 == null || (adPersonalitySettings = complianceSettingLJIILLIIL2.getAdPersonalitySettings()) == null || (adFreeSubscription = adPersonalitySettings.subscription) == null || (list = adFreeSubscription.ttPlusIntroEntries) == null || !list.contains(4)) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final boolean LJJIJIIJIL() {
        Boolean enableTermsConsentPopup;
        ComplianceSetting complianceSettingLJIILLIIL = LJIILLIIL();
        if (complianceSettingLJIILLIIL == null || (enableTermsConsentPopup = complianceSettingLJIILLIIL.getEnableTermsConsentPopup()) == null) {
            return false;
        }
        return enableTermsConsentPopup.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0133  */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting r63) {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.serviceimpl.ComplianceSettingsServiceImpl.LJIIIZ(com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting):void");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final void LJIILL(final C19260610Wu c19260610Wu) {
        C102U.LIZ.getClass();
        ((ComplianceApi) C102U.LIZJ().LIZ.getValue()).LIZ().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.102Y
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("CompliancePresenter@3c5b.getUltimateComplianceSettings$1");
                UltimateCmplSettings ultimateCmplSettings = (UltimateCmplSettings) obj;
                if (ultimateCmplSettings.status_code == 0) {
                    c19260610Wu.LIZ(ultimateCmplSettings);
                } else {
                    c19260610Wu.onFailed();
                }
                C1C7U.LIZIZ("CompliancePresenter@3c5b.getUltimateComplianceSettings$1");
            }
        }, new C09JN() { // from class: X.102X
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("CompliancePresenter@3c5b.getUltimateComplianceSettings$2");
                c19260610Wu.onFailed();
                C1C7U.LIZIZ("CompliancePresenter@3c5b.getUltimateComplianceSettings$2");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final void LJJI(boolean z) {
        C102U.LIZ.getClass();
        C102U.LJ = z;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final void LJJIIJ(ComplianceSetting complianceSetting) {
        C102U.LIZ.getClass();
        C102U.LIZJ.LIZIZ(complianceSetting);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final void LJJIJIIJI(final int i) {
        C823050WQl.LIZJ().execute(new Runnable() { // from class: X.00ld
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ComplianceSettingsServiceImpl@7e34.logCmplSettings$1");
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.putOpt("cmpl_enc_status", Integer.valueOf(i));
                    C20684815ws.LJIJ("tfe_compliance_settings_tracking", jSONObject);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ComplianceSettingsServiceImpl@7e34.logCmplSettings$1");
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final void LJIJ(String str, InterfaceC191808102c interfaceC191808102c) {
        C102U.LIZ.getClass();
        C102U.LIZJ().LIZIZ(str, null, interfaceC191808102c);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final void LJIJJLI(C100F c100f, int i) {
        C102U.LIZ.getClass();
        C102U.LIZJ().LIZ(new C100E(c100f), i);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final void LJJIFFI(String str, C0TON c0ton) {
        C102U.LIZ.getClass();
        C102U.LIZJ().LIZIZ(str, "1", c0ton);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[Catch: Exception -> 0x011b, TryCatch #0 {Exception -> 0x011b, blocks: (B:15:0x004f, B:16:0x0051, B:18:0x0066, B:26:0x0075, B:27:0x007b, B:29:0x0084, B:30:0x0086, B:32:0x008f, B:35:0x0094, B:38:0x00a3, B:40:0x00d7, B:41:0x00e1, B:43:0x00ef, B:44:0x00fa, B:45:0x00fe, B:9:0x0016, B:10:0x0025, B:12:0x002b, B:13:0x0045), top: B:50:0x0016 }] */
    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.text.SpannableStringBuilder LJJIIZ(android.content.Context r17, java.lang.String r18, java.util.List<com.ss.android.ugc.aweme.compliance.api.model.PolicyBodyLinkList> r19) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.serviceimpl.ComplianceSettingsServiceImpl.LJJIIZ(android.content.Context, java.lang.String, java.util.List):android.text.SpannableStringBuilder");
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final void LJJIIZI(int i, Integer num, String str, String str2, Map map) {
        C589830NBl.LIZ.getClass();
        C589830NBl.LIZIZ("/aweme/v1/compliance/settings/", i, -1L, num, str, str2, map);
    }
}

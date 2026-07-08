package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase;

import X.AbstractC1824710xaH;
import X.C01GW;
import X.C0KA3;
import X.C0KBP;
import X.C0TGC;
import X.C1100630ekP;
import X.C1106750euH;
import X.C1121890fIh;
import X.C1122150fJ7;
import X.C1135804cO;
import X.C1353905Rp;
import X.C1411000mp0;
import X.C1824200xZS;
import X.C1824260xZY;
import X.C1824270xZZ;
import X.C1824330xZf;
import X.C1824370xZj;
import X.C1824380xZk;
import X.C1824420xZo;
import X.C1824450xZr;
import X.C1826730xdX;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C23250099c;
import X.C452501pT;
import X.C500260Jjc;
import X.C510160Jza;
import X.C517510KRh;
import X.C723850SaN;
import X.C741980T8q;
import X.C860200Xoo;
import X.InterfaceC517590KRp;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.chatroom.api.UpsellRevokeInfo;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import com.bytedance.android.livesdk.livesetting.broadcast.pcs.LivePcsOnboardingPerfOptSetting;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.api.sub.SMBOptInQualificationResponse;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsOnboardingConfigFragment extends PcsOnboardingShowcaseStepFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE1JzAiLS4nISoiZzw2HELIOSOjMlKiojJDA/ZyA9KiotOys6JiJiLz0yLygpJzt9Oy0jPiwyOyBiGSwgBysuJi4hLCwiLgw8JiMlLgkhKSIhLCEn";
    public final String LLLIL = "OnboardingConfigurationFlowStartPage";
    public final String LLLILZ = "OnboardingConfigurationFlowStartPage";
    public final int LLLILZJ = 1301;
    public final C01GW LLLILZLLLI = C452501pT.LIZIZ(new C1824370xZj(this));
    public final C1824270xZZ LLLIZZ = new C1824270xZZ(this);
    public final C01GW LLLJ = C452501pT.LIZIZ(new C1824380xZk(this));
    public final C1824260xZY LLLJIL = new C1824260xZY(this);

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment
    public final void vT(String str) {
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment
    public final void xT() {
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final void PS() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C860200Xoo(this, new C1824450xZr(this), null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C1353905Rp(this, null), 3);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final String lT() {
        return (String) this.LLLILZLLLI.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final String oT() {
        return (String) this.LLLJ.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment, com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final void pT() {
        C723850SaN.LIZ(this, false, null, new C1135804cO(this), 3);
    }

    public final void DT() {
        C510160Jza c510160JzaES = ES();
        if (c510160JzaES != null) {
            c510160JzaES.LIZJ();
        }
        boolean z = JS().LLILZLL + 1 == 1;
        boolean z2 = JS().LLILZLL + 1 == 2;
        String str = JS().LLILZLL + 1 == 1 ? "individual" : JS().LLILZLL + 1 == 2 ? "enterprise" : "unknown";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingConfigurationFlowStartPage requestSmbOptIn request identity_type=");
        sbLIZ.append(str);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        PcsOnboardingVM pcsOnboardingVMJS = JS();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(pcsOnboardingVMJS), null, null, new C1411000mp0(pcsOnboardingVMJS, new C1824330xZf(this), z, z2, false, false, null), 3);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment, com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final void VS() {
        super.VS();
        String showEntrance = JS().DQ2().getShowEntrance();
        boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LJ(JS().EQ2())));
        C1824200xZS.LJII("click", showEntrance, JS().LQ2(), "", zLJJJI ? 1 : 0, C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZLLL(JS().EQ2()))) ? 1 : 0, C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZ(JS().EQ2()))) ? 1 : 0, "back");
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment, com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLLFFI) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingConfigurationFlowStartPage onDestroy show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        if (this.LLLFFI) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        XS("onDestroyView", C2188811AlT.LIZIZ(sbLIZ), C0TGC.LIZ());
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("OnboardingConfigurationFlowStartPage onDestroyView show_entrance=");
        String showEntrance2 = JS().DQ2().getShowEntrance();
        sbLIZ2.append(showEntrance2 != null ? showEntrance2 : "");
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final String FS() {
        return this.LLLILZ;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final Function0<Unit> kT() {
        return this.LLLIZZ;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final String mT() {
        return this.LLLIL;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final Function0<Unit> nT() {
        return this.LLLJIL;
    }

    public final void AT(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingConfigurationFlowStartPage click click_position=");
        sbLIZ.append(str);
        sbLIZ.append(", show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment, com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        Boolean boolValueOf;
        int i;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        UpsellRevokeInfo upsellRevokeInfo;
        super.onCreate(bundle);
        if (this.LLLFFI) {
            return;
        }
        SMBOptInQualificationResponse.ResponseData responseDataEQ2 = JS().EQ2();
        StringBuilder sb = new StringBuilder("OnboardingConfigurationFlowStartPage onCreate show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        String str = "";
        if (showEntrance == null) {
            showEntrance = "";
        }
        sb.append(showEntrance);
        sb.append(", has_smb_qualification=");
        boolean z2 = true;
        int i2 = 0;
        if (responseDataEQ2 != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0);
        sb.append(", has_opt_in_process=");
        if (responseDataEQ2 == null || responseDataEQ2.servicePlusOptInStatus == 0) {
            z2 = false;
        }
        sb.append(C500260Jjc.LJJJI(Boolean.valueOf(z2)) ? 1 : 0);
        sb.append(", qualification=");
        Boolean boolValueOf4 = null;
        if (responseDataEQ2 != null) {
            boolValueOf = Boolean.valueOf(responseDataEQ2.qualification);
        } else {
            boolValueOf = null;
        }
        sb.append(C500260Jjc.LJJJI(boolValueOf) ? 1 : 0);
        sb.append(", revoke_reason=");
        if (responseDataEQ2 != null && (upsellRevokeInfo = responseDataEQ2.revokeInfo) != null) {
            i = upsellRevokeInfo.revokeReason;
        } else {
            i = 0;
        }
        sb.append(i);
        sb.append(", allow_receive_dm=");
        if (responseDataEQ2 != null) {
            boolValueOf2 = Boolean.valueOf(responseDataEQ2.canEveryoneSendDm);
        } else {
            boolValueOf2 = null;
        }
        sb.append(C500260Jjc.LJJJI(boolValueOf2) ? 1 : 0);
        sb.append(", is_ba=");
        if (responseDataEQ2 != null) {
            boolValueOf3 = Boolean.valueOf(responseDataEQ2.isBa);
        } else {
            boolValueOf3 = null;
        }
        sb.append(C500260Jjc.LJJJI(boolValueOf3) ? 1 : 0);
        sb.append(", inferred_industry_type=");
        if (responseDataEQ2 != null) {
            i2 = responseDataEQ2.inferredIndustryType;
        }
        sb.append(i2);
        sb.append(", has_industry_selection=");
        if (responseDataEQ2 != null) {
            boolValueOf4 = Boolean.valueOf(responseDataEQ2.hasValidatedIndustryLabel);
        }
        sb.append(C500260Jjc.LJJJI(boolValueOf4) ? 1 : 0);
        C1121890fIh.LIZ(sb.toString());
        C517510KRh c517510KRh = new C517510KRh(this.LLJLLL, JS().DQ2().getShowEntrance(), this.LLLILZJ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show_entrance=");
        String showEntrance2 = JS().DQ2().getShowEntrance();
        if (showEntrance2 != null) {
            str = showEntrance2;
        }
        sbLIZ.append(str);
        ZS("OnboardingConfigurationFlowStartPage", c517510KRh, C2188811AlT.LIZIZ(sbLIZ));
        if (!LivePcsOnboardingPerfOptSetting.INSTANCE.enabledDownstreamPrefetch()) {
            C1121890fIh.LIZ("OnboardingConfigurationFlowStartPage prefetch service_switch_info skipped reason=prefetch_disabled");
        } else {
            C1121890fIh.LIZ("OnboardingConfigurationFlowStartPage prefetch service_switch_info request");
            C1106750euH.LIZ.LIZIZ(new C1100630ekP(C0KA3.LIZ), "/webcast/sub/smb/service_switch_info/", C2097908Jt.LIZJ(new Pair("skip_industry_selection", Boolean.FALSE)), new C1824420xZo(), new C741980T8q());
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.ability.IPcsOnboardingShowcaseAbility
    public final void tz2(AbstractC1824710xaH abstractC1824710xaH) {
        boolean z;
        Boolean boolValueOf;
        int i;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        UpsellRevokeInfo upsellRevokeInfo;
        C1824200xZS.LJII("show", JS().DQ2().getShowEntrance(), JS().LQ2(), "", C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LJ(JS().EQ2()))) ? 1 : 0, C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZLLL(JS().EQ2()))) ? 1 : 0, C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZ(JS().EQ2()))) ? 1 : 0, "");
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.LJ(new C0KBP(this.LLJLLL));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingConfigurationFlowStartPage perf.onShowSuccess show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        String str = "";
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        SMBOptInQualificationResponse.ResponseData responseDataEQ2 = JS().EQ2();
        StringBuilder sb = new StringBuilder("OnboardingConfigurationFlowStartPage initView show_entrance=");
        String showEntrance2 = JS().DQ2().getShowEntrance();
        if (showEntrance2 != null) {
            str = showEntrance2;
        }
        sb.append(str);
        sb.append(", has_smb_qualification=");
        boolean z2 = true;
        int i2 = 0;
        if (responseDataEQ2 != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0);
        sb.append(", has_opt_in_process=");
        if (responseDataEQ2 == null || responseDataEQ2.servicePlusOptInStatus == 0) {
            z2 = false;
        }
        sb.append(C500260Jjc.LJJJI(Boolean.valueOf(z2)) ? 1 : 0);
        sb.append(", qualification=");
        Boolean boolValueOf4 = null;
        if (responseDataEQ2 != null) {
            boolValueOf = Boolean.valueOf(responseDataEQ2.qualification);
        } else {
            boolValueOf = null;
        }
        sb.append(C500260Jjc.LJJJI(boolValueOf) ? 1 : 0);
        sb.append(", revoke_reason=");
        if (responseDataEQ2 != null && (upsellRevokeInfo = responseDataEQ2.revokeInfo) != null) {
            i = upsellRevokeInfo.revokeReason;
        } else {
            i = 0;
        }
        sb.append(i);
        sb.append(", allow_receive_dm=");
        if (responseDataEQ2 != null) {
            boolValueOf2 = Boolean.valueOf(responseDataEQ2.canEveryoneSendDm);
        } else {
            boolValueOf2 = null;
        }
        sb.append(C500260Jjc.LJJJI(boolValueOf2) ? 1 : 0);
        sb.append(", is_ba=");
        if (responseDataEQ2 != null) {
            boolValueOf3 = Boolean.valueOf(responseDataEQ2.isBa);
        } else {
            boolValueOf3 = null;
        }
        sb.append(C500260Jjc.LJJJI(boolValueOf3) ? 1 : 0);
        sb.append(", inferred_industry_type=");
        if (responseDataEQ2 != null) {
            i2 = responseDataEQ2.inferredIndustryType;
        }
        sb.append(i2);
        sb.append(", has_industry_selection=");
        if (responseDataEQ2 != null) {
            boolValueOf4 = Boolean.valueOf(responseDataEQ2.hasValidatedIndustryLabel);
        }
        sb.append(C500260Jjc.LJJJI(boolValueOf4) ? 1 : 0);
        C1121890fIh.LIZ(sb.toString());
        JS().LJJJJL();
    }

    public static void CT(int i, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingConfigurationFlowStartPage requestSmbOptIn response is_success=");
        sbLIZ.append(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0);
        sbLIZ.append(", error_code=");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }
}

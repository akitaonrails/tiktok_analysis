package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase;

import X.AbstractC1824710xaH;
import X.C01GW;
import X.C0KBP;
import X.C0TGC;
import X.C1106750euH;
import X.C1121890fIh;
import X.C1141804dM;
import X.C1354705Rx;
import X.C13LP;
import X.C1410560moI;
import X.C1410760moc;
import X.C1410770mod;
import X.C1697810uHb;
import X.C1824200xZS;
import X.C1824280xZa;
import X.C1824290xZb;
import X.C1824300xZc;
import X.C1824390xZl;
import X.C1826730xdX;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C23250099c;
import X.C452501pT;
import X.C500260Jjc;
import X.C517510KRh;
import X.C723850SaN;
import X.InterfaceC517590KRp;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.chatroom.api.UpsellRevokeInfo;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import com.bytedance.android.livesdk.livesetting.broadcast.pcs.LivePcsOnboardingPerfOptSetting;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.api.smb.GetSMBOptInProgressResponse;
import webcast.api.sub.SMBOptInQualificationResponse;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsOnboardingContinueFragment extends PcsOnboardingShowcaseStepFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE1JzAiLS4nISoiZzw2OjHELIOSMlKiojJDA/ZyA9KiotOys6JiJiLz0yLygpJzt9Oy0jPiwyOyBiGSwgBysuJi4hLCwiLgw8JjElJzo2DjctLiI2JjE=";
    public final String LLLIL = "OnboardingContinuationPage";
    public final String LLLILZ = "OnboardingContinuationPage";
    public final int LLLILZJ = 1311;
    public final C01GW LLLILZLLLI = C452501pT.LIZIZ(new C1824390xZl(this));
    public final C1824280xZa LLLIZZ = new C1824280xZa(this);

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment
    public final void vT(String str) {
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment
    public final void xT() {
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final String lT() {
        return (String) this.LLLILZLLLI.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment, com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final void pT() {
        C723850SaN.LIZ(this, false, null, new C1141804dM(this), 3);
    }

    public final void FT() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingContinuationPage requestOptinQualification request show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        sbLIZ.append(", has_smb_qualification_cache=0");
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        JS().TQ2(new C1824290xZb(this));
    }

    public final void GT() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingContinuationPage getSmbOptInProgress request show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        PcsOnboardingVM pcsOnboardingVMJS = JS();
        C1824300xZc c1824300xZc = new C1824300xZc(this);
        boolean zEnabledDownstreamPrefetch = LivePcsOnboardingPerfOptSetting.INSTANCE.enabledDownstreamPrefetch();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getSmbOptInProgress entry prefetch_enabled=");
        sbLIZ2.append(zEnabledDownstreamPrefetch);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        if (!zEnabledDownstreamPrefetch) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(pcsOnboardingVMJS), null, null, new C1410560moI(pcsOnboardingVMJS, c1824300xZc, null), 3);
            return;
        }
        C1106750euH c1106750euH = C1106750euH.LIZ;
        C1106750euH.LIZ.LJI("/webcast/smb/opt_in/progress/", C2097608Jq.LJ(), GetSMBOptInProgressResponse.ResponseData.class, new C1410770mod(pcsOnboardingVMJS, c1824300xZc), new C1410760moc(pcsOnboardingVMJS, c1824300xZc), 1000L);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final void PS() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C1354705Rx(this, null), 3);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment, com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final void VS() {
        super.VS();
        C1824200xZS.LJI("click", JS().DQ2().getShowEntrance(), "back");
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment, com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingContinuationPage onDestroy show_entrance=");
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
        sbLIZ2.append("OnboardingContinuationPage onDestroyView show_entrance=");
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

    public final boolean DT(SMBOptInQualificationResponse.ResponseData responseData) {
        Integer numValueOf;
        UpsellRevokeInfo upsellRevokeInfo;
        List listLJIIJJI = C1697810uHb.LJIIJJI(2, 3);
        if (responseData != null && (upsellRevokeInfo = responseData.revokeInfo) != null) {
            numValueOf = Integer.valueOf(upsellRevokeInfo.revokeReason);
        } else {
            numValueOf = null;
        }
        if (!C13LP.LJJJJ(numValueOf, listLJIIJJI) && (responseData == null || !responseData.inBlockIndustryCoolingDown)) {
            return false;
        }
        return true;
    }

    public final void ET(String str) {
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.LIZJ(str, new C0KBP(this.LLJLLL));
        }
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
        StringBuilder sb = new StringBuilder("OnboardingContinuationPage onCreate show_entrance=");
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
        ZS("OnboardingContinuationPage", c517510KRh, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.ability.IPcsOnboardingShowcaseAbility
    public final void tz2(AbstractC1824710xaH abstractC1824710xaH) {
        boolean z;
        Boolean boolValueOf;
        int i;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        UpsellRevokeInfo upsellRevokeInfo;
        JS().LJLJLJ();
        NS();
        SMBOptInQualificationResponse.ResponseData responseDataEQ2 = JS().EQ2();
        StringBuilder sb = new StringBuilder("OnboardingContinuationPage initView show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
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
    }

    public static void AT(int i, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingContinuationPage getSmbOptInProgress response is_success=");
        sbLIZ.append(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0);
        sbLIZ.append(", error_code=");
        sbLIZ.append(i);
        sbLIZ.append(", skip_form=");
        sbLIZ.append(C500260Jjc.LJJJI(Boolean.FALSE) ? 1 : 0);
        sbLIZ.append(", opt_in_steps_array_count=");
        sbLIZ.append(0);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingLightModeSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.LLLFFI) {
            return;
        }
        NS();
    }

    public static void CT(boolean z, int i, SMBOptInQualificationResponse.ResponseData responseData) {
        Boolean boolValueOf;
        int i2;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        UpsellRevokeInfo upsellRevokeInfo;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingContinuationPage requestOptinQualification response is_success=");
        sbLIZ.append(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0);
        sbLIZ.append(", error_code=");
        sbLIZ.append(i);
        sbLIZ.append(", qualification=");
        Boolean boolValueOf4 = null;
        if (responseData != null) {
            boolValueOf = Boolean.valueOf(responseData.qualification);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(C500260Jjc.LJJJI(boolValueOf) ? 1 : 0);
        sbLIZ.append(", revoke_reason=");
        int i3 = 0;
        if (responseData != null && (upsellRevokeInfo = responseData.revokeInfo) != null) {
            i2 = upsellRevokeInfo.revokeReason;
        } else {
            i2 = 0;
        }
        sbLIZ.append(i2);
        sbLIZ.append(", allow_receive_dm=");
        if (responseData != null) {
            boolValueOf2 = Boolean.valueOf(responseData.canEveryoneSendDm);
        } else {
            boolValueOf2 = null;
        }
        sbLIZ.append(C500260Jjc.LJJJI(boolValueOf2) ? 1 : 0);
        sbLIZ.append(", is_ba=");
        if (responseData != null) {
            boolValueOf3 = Boolean.valueOf(responseData.isBa);
        } else {
            boolValueOf3 = null;
        }
        sbLIZ.append(C500260Jjc.LJJJI(boolValueOf3) ? 1 : 0);
        sbLIZ.append(", inferred_industry_type=");
        if (responseData != null) {
            i3 = responseData.inferredIndustryType;
        }
        sbLIZ.append(i3);
        sbLIZ.append(", has_industry_selection=");
        if (responseData != null) {
            boolValueOf4 = Boolean.valueOf(responseData.hasValidatedIndustryLabel);
        }
        sbLIZ.append(C500260Jjc.LJJJI(boolValueOf4) ? 1 : 0);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }
}

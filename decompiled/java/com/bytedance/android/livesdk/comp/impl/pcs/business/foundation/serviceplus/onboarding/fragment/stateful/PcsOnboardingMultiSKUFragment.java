package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.stateful;

import X.AbstractC1824710xaH;
import X.AbstractC1825450xbT;
import X.C01GW;
import X.C0KBP;
import X.C0TGC;
import X.C1106750euH;
import X.C1121890fIh;
import X.C1122150fJ7;
import X.C1159204gA;
import X.C1354405Ru;
import X.C13BV;
import X.C1410540moG;
import X.C1410740moa;
import X.C1410750mob;
import X.C1411000mp0;
import X.C1558360qeg;
import X.C1558520qew;
import X.C16FS;
import X.C1824200xZS;
import X.C1824250xZX;
import X.C1824310xZd;
import X.C1824320xZe;
import X.C1824430xZp;
import X.C1824440xZq;
import X.C1825410xbP;
import X.C1825420xbQ;
import X.C1825430xbR;
import X.C1825440xbS;
import X.C1826730xdX;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C23250099c;
import X.C452501pT;
import X.C500260Jjc;
import X.C510160Jza;
import X.C517510KRh;
import X.C723850SaN;
import X.C860200Xoo;
import X.InterfaceC517590KRp;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.chatroom.api.UpsellRevokeInfo;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.ability.IPcsOnboardingShowcaseAbility;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import com.bytedance.android.livesdk.livesetting.broadcast.pcs.LivePcsOnboardingPerfOptSetting;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.api.sub.SMBOptInQualificationResponse;
import webcast.api.sub.SMBServiceSwitchInfoResponse;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsOnboardingMultiSKUFragment extends PcsOnboardingStatefulStepFragment implements IPcsOnboardingShowcaseAbility {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE1JzAiLS4nISoiZzw2OjHELIOSMlKiojJDA/ZyA9KiotOys6JiJiLz0yLygpJzt9OzEtPSo1PSliGSwgBysuJi4hLCwiLgImJDElGgQGDjctLiI2JjE=";
    public final String LLLIILIL = "OnboardingMultiSKUSelectionPage";
    public final String LLLIL = "OnboardingMultiSKUSelectionPage";
    public final int LLLILZ = 1312;
    public final C01GW LLLILZJ = C452501pT.LIZIZ(new C1824430xZp());
    public final C1824250xZX LLLILZLLLI = new C1824250xZX(this);
    public final boolean LLLIZZ = true;
    public boolean LLLJ;
    public boolean LLLJIL;
    public boolean LLLJL;
    public boolean LLLL;
    public boolean LLLLII;

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final String lT() {
        return (String) this.LLLILZJ.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final void pT() {
        C723850SaN.LIZ(this, false, null, new C1159204gA(this), 3);
    }

    public final void sT() {
        C1121890fIh.LIZ("OnboardingMultiSKUSelectionPage getServiceSwitchInfo request skip_industry_selection=0");
        PcsOnboardingVM pcsOnboardingVMJS = JS();
        C1824310xZd c1824310xZd = new C1824310xZd(this);
        boolean zEnabledDownstreamPrefetch = LivePcsOnboardingPerfOptSetting.INSTANCE.enabledDownstreamPrefetch();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getServiceSwitchInfo entry prefetch_enabled=");
        sbLIZ.append(zEnabledDownstreamPrefetch);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (!zEnabledDownstreamPrefetch) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(pcsOnboardingVMJS), null, null, new C1410540moG(pcsOnboardingVMJS, c1824310xZd, null), 3);
            return;
        }
        C1106750euH c1106750euH = C1106750euH.LIZ;
        C1106750euH.LIZ.LJI("/webcast/sub/smb/service_switch_info/", C2097908Jt.LIZJ(new Pair("skip_industry_selection", Boolean.FALSE)), SMBServiceSwitchInfoResponse.ResponseData.class, new C1410750mob(pcsOnboardingVMJS, c1824310xZd), new C1410740moa(pcsOnboardingVMJS, c1824310xZd), 1000L);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final void PS() {
        JS().LJLJLJ();
        NS();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C860200Xoo(this, new C1824440xZq(this), null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C1354405Ru(this, null), 3);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final void VS() {
        super.VS();
        uT("back");
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final void eT() {
        super.eT();
        uT("close");
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final void hT() {
        super.hT();
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            int i = this.LLJLLL;
            Boolean bool = JS().getState().LLIZ;
            interfaceC517590KRpLIZJ.LJ(new C0KBP(i, bool != null ? C2097608Jq.LJIIJ(new Pair("is_cache", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(bool.booleanValue())) ? 1 : 0))) : new LinkedHashMap()));
        }
        if (this.LLLLII) {
            return;
        }
        this.LLLLII = true;
        C1824200xZS.LIZIZ("show", JS().DQ2().getShowEntrance(), C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LJ(JS().EQ2()))) ? 1 : 0, JS().LQ2(), C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZLLL(JS().EQ2()))) ? 1 : 0, C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZ(JS().EQ2()))) ? 1 : 0, "", C13BV.INSTANCE);
        StringBuilder sb = new StringBuilder("OnboardingMultiSKUSelectionPage perf.onShowSuccess show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        String str = "";
        if (showEntrance == null) {
            showEntrance = "";
        }
        sb.append(showEntrance);
        Boolean bool2 = JS().getState().LLIZ;
        if (bool2 != null) {
            boolean zBooleanValue = bool2.booleanValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(", is_cache=");
            sbLIZ.append(C500260Jjc.LJJJI(Boolean.valueOf(zBooleanValue)) ? 1 : 0);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (strLIZIZ != null) {
                str = strLIZIZ;
            }
        }
        sb.append(str);
        C1121890fIh.LIZ(sb.toString());
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.ability.IPcsOnboardingBottomFunctionAbility
    public final void iR() {
        C510160Jza c510160JzaES;
        String quantityString = getResources().getQuantityString(2131755964, JS().GQ2(), Integer.valueOf(JS().GQ2()));
        boolean z = JS().GQ2() > 0;
        C510160Jza c510160JzaES2 = ES();
        if (c510160JzaES2 != null) {
            c510160JzaES2.LIZIZ(z);
        }
        if (quantityString == null || (c510160JzaES = ES()) == null) {
            return;
        }
        c510160JzaES.LIZ = quantityString;
        C16FS c16fs = c510160JzaES.LIZLLL;
        if (c16fs != null) {
            c16fs.setText(quantityString);
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLLFFI) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingMultiSKUSelectionPage onDestroy show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), IPcsOnboardingShowcaseAbility.class, null);
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
        sbLIZ2.append("OnboardingMultiSKUSelectionPage onDestroyView show_entrance=");
        String showEntrance2 = JS().DQ2().getShowEntrance();
        sbLIZ2.append(showEntrance2 != null ? showEntrance2 : "");
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void vT() {
        C510160Jza c510160JzaES = ES();
        if (c510160JzaES != null) {
            c510160JzaES.LIZJ();
        }
        String str = JS().LLILZLL + 1 == 1 ? "individual" : JS().LLILZLL + 1 == 2 ? "enterprise" : "unknown";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingMultiSKUSelectionPage requestSmbOptIn request identity_type=");
        sbLIZ.append(str);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        PcsOnboardingVM pcsOnboardingVMJS = JS();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(pcsOnboardingVMJS), null, null, new C1411000mp0(pcsOnboardingVMJS, new C1824320xZe(this), this.LLLJ, this.LLLJIL, this.LLLL, this.LLLJL, null), 3);
    }

    public final void xT() {
        boolean z;
        boolean z2;
        boolean z3;
        List<AbstractC1825450xbT> listFQ2 = JS().FQ2();
        boolean z4 = true;
        if (listFQ2.isEmpty()) {
            z = false;
        } else {
            for (AbstractC1825450xbT abstractC1825450xbT : listFQ2) {
                if ((abstractC1825450xbT instanceof C1825430xbR) && abstractC1825450xbT.LIZ) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        this.LLLJ = z;
        List<AbstractC1825450xbT> listFQ22 = JS().FQ2();
        if (listFQ22.isEmpty()) {
            z2 = false;
        } else {
            for (AbstractC1825450xbT abstractC1825450xbT2 : listFQ22) {
                if ((abstractC1825450xbT2 instanceof C1825440xbS) && abstractC1825450xbT2.LIZ) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        this.LLLJIL = z2;
        List<AbstractC1825450xbT> listFQ23 = JS().FQ2();
        if (listFQ23.isEmpty()) {
            z3 = false;
        } else {
            for (AbstractC1825450xbT abstractC1825450xbT3 : listFQ23) {
                if ((abstractC1825450xbT3 instanceof C1825410xbP) && abstractC1825450xbT3.LIZ) {
                    z3 = true;
                    break;
                }
            }
            z3 = false;
        }
        this.LLLJL = z3;
        List<AbstractC1825450xbT> listFQ24 = JS().FQ2();
        if (listFQ24.isEmpty()) {
            z4 = false;
        } else {
            for (AbstractC1825450xbT abstractC1825450xbT4 : listFQ24) {
                if ((abstractC1825450xbT4 instanceof C1825420xbQ) && abstractC1825450xbT4.LIZ) {
                    break;
                }
            }
            z4 = false;
        }
        this.LLLL = z4;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final String FS() {
        return this.LLLIL;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final Function0<Unit> kT() {
        return this.LLLILZLLLI;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final String mT() {
        return this.LLLIILIL;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final boolean yS() {
        return this.LLLIZZ;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Boolean boolValueOf;
        UpsellRevokeInfo upsellRevokeInfo;
        super.onCreate(bundle);
        if (this.LLLFFI) {
            return;
        }
        SMBOptInQualificationResponse.ResponseData responseDataEQ2 = JS().EQ2();
        boolean z = true;
        boolean z2 = !JS().getState().LLILLL.isEmpty();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingMultiSKUSelectionPage onCreate show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        String str = "";
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        sbLIZ.append(", has_switch_info_cache=");
        sbLIZ.append(C500260Jjc.LJJJI(Boolean.valueOf(z2)) ? 1 : 0);
        sbLIZ.append(", has_smb_qualification=");
        int i = 0;
        if (responseDataEQ2 == null) {
            z = false;
        }
        sbLIZ.append(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0);
        sbLIZ.append(", qualification=");
        if (responseDataEQ2 != null) {
            boolValueOf = Boolean.valueOf(responseDataEQ2.qualification);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(C500260Jjc.LJJJI(boolValueOf) ? 1 : 0);
        sbLIZ.append(", revoke_reason=");
        if (responseDataEQ2 != null && (upsellRevokeInfo = responseDataEQ2.revokeInfo) != null) {
            i = upsellRevokeInfo.revokeReason;
        }
        sbLIZ.append(i);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, IPcsOnboardingShowcaseAbility.class, null, null);
        C517510KRh c517510KRh = new C517510KRh(this.LLJLLL, JS().DQ2().getShowEntrance(), this.LLLILZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("show_entrance=");
        String showEntrance2 = JS().DQ2().getShowEntrance();
        if (showEntrance2 != null) {
            str = showEntrance2;
        }
        sbLIZ2.append(str);
        ZS("OnboardingMultiSKUSelectionPage", c517510KRh, C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.ability.IPcsOnboardingShowcaseAbility
    public final void tz2(AbstractC1824710xaH abstractC1824710xaH) {
        Boolean boolValueOf;
        UpsellRevokeInfo upsellRevokeInfo;
        SMBOptInQualificationResponse.ResponseData responseDataEQ2 = JS().EQ2();
        boolean z = true;
        boolean z2 = !JS().getState().LLILLL.isEmpty();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingMultiSKUSelectionPage initView show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        sbLIZ.append(", has_switch_info_cache=");
        sbLIZ.append(C500260Jjc.LJJJI(Boolean.valueOf(z2)) ? 1 : 0);
        sbLIZ.append(", has_smb_qualification=");
        int i = 0;
        if (responseDataEQ2 == null) {
            z = false;
        }
        sbLIZ.append(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0);
        sbLIZ.append(", qualification=");
        if (responseDataEQ2 != null) {
            boolValueOf = Boolean.valueOf(responseDataEQ2.qualification);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(C500260Jjc.LJJJI(boolValueOf) ? 1 : 0);
        sbLIZ.append(", revoke_reason=");
        if (responseDataEQ2 != null && (upsellRevokeInfo = responseDataEQ2.revokeInfo) != null) {
            i = upsellRevokeInfo.revokeReason;
        }
        sbLIZ.append(i);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void uT(String str) {
        xT();
        String showEntrance = JS().DQ2().getShowEntrance();
        boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LJ(JS().EQ2())));
        String strLQ2 = JS().LQ2();
        boolean zLJJJI2 = C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZLLL(JS().EQ2())));
        boolean zLJJJI3 = C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZ(JS().EQ2())));
        ArrayList arrayList = new ArrayList();
        if (this.LLLJ) {
            arrayList.add("dm");
        }
        if (this.LLLJIL) {
            arrayList.add("form");
        }
        if (this.LLLJL) {
            arrayList.add("booking");
        }
        if (this.LLLL) {
            arrayList.add("course");
        }
        C1824200xZS.LIZIZ("click", showEntrance, zLJJJI ? 1 : 0, strLQ2, zLJJJI2 ? 1 : 0, zLJJJI3 ? 1 : 0, str, arrayList);
    }

    public static void qT(int i, int i2, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingMultiSKUSelectionPage getServiceSwitchInfo response is_success=");
        sbLIZ.append(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0);
        sbLIZ.append(", error_code=");
        sbLIZ.append(i);
        sbLIZ.append(", skus_count=");
        sbLIZ.append(i2);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void rT(int i, int i2, boolean z, boolean z2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingMultiSKUSelectionPage requestSmbOptIn response is_success=");
        sbLIZ.append(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0);
        sbLIZ.append(", error_code=");
        sbLIZ.append(i);
        sbLIZ.append(", skip_form=");
        sbLIZ.append(C500260Jjc.LJJJI(Boolean.valueOf(z2)) ? 1 : 0);
        sbLIZ.append(", opt_in_steps_array_count=");
        sbLIZ.append(i2);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }
}

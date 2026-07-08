package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase;

import X.AbstractC1824710xaH;
import X.AbstractC1824790xaP;
import X.AbstractC1824810xaR;
import X.C01GW;
import X.C0KBP;
import X.C0TGC;
import X.C1121890fIh;
import X.C1122150fJ7;
import X.C1411040mp4;
import X.C1411350mpZ;
import X.C15438062q;
import X.C1548820qPI;
import X.C1822790xXB;
import X.C1824650xaB;
import X.C1824670xaD;
import X.C1824950xaf;
import X.C1826730xdX;
import X.C1835860xsG;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C23250099c;
import X.C262100zr;
import X.C343110Dcj;
import X.C434260H1c;
import X.C452501pT;
import X.C500260Jjc;
import X.C517510KRh;
import X.C7974039o;
import X.InterfaceC1141530foN;
import X.InterfaceC517590KRp;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsOnboardingWelcomeMessageFragment extends PcsOnboardingShowcaseStepFragment implements InterfaceC1141530foN {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE1JzAiLS4nISoiZzw2OjMlKiHELIOSojJDA/ZyA9KiotOys6JiJiLz0yLygpJzt9Oy0jPiwyOyBiGSwgBysuJi4hLCwiLhg2JCYjJCoeLTY/KCg2DjctLiI2JjE=";
    public String LLLJL;
    public final String LLLIL = "OnboardingWelcomeMessageIntroductionPage";
    public final String LLLILZ = "OnboardingWelcomeMessageIntroductionPage";
    public final int LLLILZJ = 1305;
    public final boolean LLLILZLLLI = true;
    public final String LLLIZZ = "dm_welcome_message";
    public final C01GW LLLJ = C452501pT.LIZIZ(new C1824950xaf(this));
    public final C1824650xaB LLLJIL = new C1824650xaB(this);
    public final C1822790xXB LLLL = new C1822790xXB("OnboardingWelcomeMessageConfigurationPage", 1306);

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final String lT() {
        return (String) this.LLLJ.getValue();
    }

    public final String AT() {
        int iLIZJ = C1122150fJ7.LIZJ(JS().EQ2());
        return getString((iLIZJ == 1 || iLIZJ == 2) ? 2131855939 : iLIZJ != 3 ? 2131855937 : 2131855938);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment, com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLLFFI) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingWelcomeMessageIntroductionPage onDestroy show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        sbLIZ.append(", is_resume=");
        sbLIZ.append(C500260Jjc.LJJJI(Boolean.valueOf(JS().LLJJJ)) ? 1 : 0);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C1548820qPI.LJIIIIZZ("ttsmb_universal_popup_submit", this);
        C1548820qPI.LJIIIIZZ("ttsmb_universal_popup_show", this);
        this.LLLL.LIZJ(C2097608Jq.LJ());
        this.LLLL.LIZ();
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
        sbLIZ2.append("OnboardingWelcomeMessageIntroductionPage onDestroyView show_entrance=");
        String showEntrance2 = JS().DQ2().getShowEntrance();
        sbLIZ2.append(showEntrance2 != null ? showEntrance2 : "");
        sbLIZ2.append(", is_resume=");
        sbLIZ2.append(C500260Jjc.LJJJI(Boolean.valueOf(JS().LLJJJ)) ? 1 : 0);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        this.LLLL.LIZJ(C2097608Jq.LJ());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLLFFI) {
            return;
        }
        this.LLLL.LIZJ(C2097608Jq.LJ());
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment
    public final int uT() {
        Iterator it2 = ((ArrayList) C1411040mp4.LIZIZ(JS().getState().LLILZIL)).iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            if (((SMBOptInStep) it2.next()).type == 3) {
                break;
            }
            i++;
        }
        return i + 1;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final String FS() {
        return this.LLLILZ;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final Function0<Unit> kT() {
        return this.LLLJIL;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final String mT() {
        return this.LLLIL;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment
    public final String sT() {
        return this.LLLIZZ;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final boolean yS() {
        return this.LLLILZLLLI;
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        int i;
        Integer numValueOf;
        String str = c262100zr.LIZ;
        String str2 = "";
        if (Intrinsics.LJFF(str, "ttsmb_universal_popup_show")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("show_entrance=");
            String showEntrance = JS().DQ2().getShowEntrance();
            if (showEntrance != null) {
                str2 = showEntrance;
            }
            sbLIZ.append(str2);
            XS("ttsmb_universal_popup_show", C2188811AlT.LIZIZ(sbLIZ), C0TGC.LIZ());
            this.LLLL.LJ(C2097908Jt.LIZJ(new Pair("is_cache", this.LLLJL)));
            return;
        }
        if (!Intrinsics.LJFF(str, "ttsmb_universal_popup_submit")) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("OnboardingWelcomeMessageIntroductionPage received_complete_jsb_event event_name=");
        sbLIZ2.append("ttsmb_universal_popup_submit");
        sbLIZ2.append(", current_step_index=");
        sbLIZ2.append(JS().LLJJ);
        sbLIZ2.append(", current_step_type=");
        SMBOptInStep sMBOptInStep = JS().LLJILLL;
        if (sMBOptInStep != null) {
            i = sMBOptInStep.type;
        } else {
            i = 0;
        }
        sbLIZ2.append(zT(i));
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        JS().vQ2();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("show_entrance=");
        String showEntrance2 = JS().DQ2().getShowEntrance();
        if (showEntrance2 != null) {
            str2 = showEntrance2;
        }
        sbLIZ3.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        SMBOptInStep sMBOptInStep2 = JS().LLJILLL;
        if (sMBOptInStep2 != null && (numValueOf = Integer.valueOf(sMBOptInStep2.type)) != null) {
            if (numValueOf.intValue() == 4) {
                QS(R.id.pl8, R.id.a52, null, null, strLIZIZ);
                return;
            } else if (numValueOf.intValue() == 8) {
                QS(R.id.pl8, R.id.a53, null, null, strLIZIZ);
                return;
            }
        }
        QS(R.id.pl8, R.id.a54, null, null, strLIZIZ);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment, com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.LLLFFI) {
            return;
        }
        C1411350mpZ state = JS().getState();
        List<SMBOptInStep> list = state.LLILZIL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<SMBOptInStep> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(zT(it2.next().type));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingWelcomeMessageIntroductionPage onCreate show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        String str = "";
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        sbLIZ.append(", is_resume=");
        sbLIZ.append(C500260Jjc.LJJJI(Boolean.valueOf(JS().LLJJJ)) ? 1 : 0);
        sbLIZ.append(", steps=");
        sbLIZ.append(arrayList);
        sbLIZ.append(", skip_form=");
        sbLIZ.append(C500260Jjc.LJJJI(Boolean.valueOf(JS().LLJJIJIL)) ? 1 : 0);
        sbLIZ.append(", has_opt_in_response=");
        sbLIZ.append(C500260Jjc.LJJJI(Boolean.valueOf(state.LLILZIL.isEmpty() ^ true)) ? 1 : 0);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C1548820qPI.LIZLLL("ttsmb_universal_popup_submit", this);
        C1548820qPI.LIZLLL("ttsmb_universal_popup_show", this);
        C517510KRh c517510KRh = new C517510KRh(this.LLJLLL, JS().DQ2().getShowEntrance(), this.LLLILZJ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("show_entrance=");
        String showEntrance2 = JS().DQ2().getShowEntrance();
        if (showEntrance2 != null) {
            str = showEntrance2;
        }
        sbLIZ2.append(str);
        ZS("OnboardingWelcomeMessageIntroductionPage", c517510KRh, C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.ability.IPcsOnboardingShowcaseAbility
    public final void tz2(AbstractC1824710xaH abstractC1824710xaH) {
        fT(JS().KQ2(), JS().xQ2());
        abstractC1824710xaH.LLJLLIL.setText(getString(2131855940));
        abstractC1824710xaH.LLJLL.setText(getString(2131855936));
        C1835860xsG c1835860xsG = abstractC1824710xaH.LLJLIL;
        c1835860xsG.setPrimaryContentLayout(R.layout.h3d);
        c1835860xsG.setSecondaryContentLayout(R.layout.h3e);
        AbstractC1824810xaR abstractC1824810xaR = (AbstractC1824810xaR) c1835860xsG.getPrimaryBinding();
        if (abstractC1824810xaR != null) {
            abstractC1824810xaR.LLJJJJLIIL.setText(getString(2131836437));
            abstractC1824810xaR.LLJJJJJIL.setText(getString(2131855869));
            abstractC1824810xaR.LLJJJJ.setLayoutManager(new LinearLayoutManager(c1835860xsG.getContext()));
            abstractC1824810xaR.LLJJJJ.setAdapter(new C7974039o(rT(C1122150fJ7.LIZJ(JS().EQ2()))));
            C1824670xaD.LIZIZ(abstractC1824810xaR.LLJJJJ, new C343110Dcj(8));
            C1824670xaD.LIZJ(c1835860xsG, abstractC1824810xaR.LLJJJIL);
        }
        AbstractC1824790xaP abstractC1824790xaP = (AbstractC1824790xaP) c1835860xsG.getSecondaryBinding();
        if (abstractC1824790xaP != null) {
            abstractC1824790xaP.LLJJJJJIL.setImageURI(qT());
            abstractC1824790xaP.LLJJJJLIIL.setText(getString(2131836437));
            abstractC1824790xaP.LLJJL.setText(AT());
            C0TGC.LIZIZ(abstractC1824790xaP.LLJJJJ, "ttlive_pcs_onboarding_tail_container.png");
            C1824670xaD.LIZJ(c1835860xsG, abstractC1824790xaP.LLJJJIL);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C434260H1c(abstractC1824710xaH, null), 3);
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.LJ(new C0KBP(this.LLJLLL));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingWelcomeMessageIntroductionPage perf.onShowSuccess show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        String str = "";
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C1411350mpZ state = JS().getState();
        List<SMBOptInStep> list = state.LLILZIL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<SMBOptInStep> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(zT(it2.next().type));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("OnboardingWelcomeMessageIntroductionPage initView show_entrance=");
        String showEntrance2 = JS().DQ2().getShowEntrance();
        if (showEntrance2 != null) {
            str = showEntrance2;
        }
        sbLIZ2.append(str);
        sbLIZ2.append(", is_resume=");
        sbLIZ2.append(C500260Jjc.LJJJI(Boolean.valueOf(JS().LLJJJ)) ? 1 : 0);
        sbLIZ2.append(", steps=");
        sbLIZ2.append(arrayList);
        sbLIZ2.append(", skip_form=");
        sbLIZ2.append(C500260Jjc.LJJJI(Boolean.valueOf(JS().LLJJIJIL)) ? 1 : 0);
        sbLIZ2.append(", has_opt_in_response=");
        sbLIZ2.append(C500260Jjc.LJJJI(Boolean.valueOf(state.LLILZIL.isEmpty() ^ true)) ? 1 : 0);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        JS().LJJJJL();
    }
}

package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase;

import X.AbstractC1824710xaH;
import X.AbstractC1824800xaQ;
import X.AbstractC1824810xaR;
import X.C01GW;
import X.C0IJT;
import X.C0KBP;
import X.C0TGC;
import X.C1121890fIh;
import X.C1122150fJ7;
import X.C1411040mp4;
import X.C1411350mpZ;
import X.C15438062q;
import X.C1548820qPI;
import X.C1625606Yc;
import X.C1822790xXB;
import X.C1824640xaA;
import X.C1824670xaD;
import X.C1824940xae;
import X.C1826730xdX;
import X.C1835860xsG;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C23250099c;
import X.C262100zr;
import X.C343110Dcj;
import X.C434250H1b;
import X.C452501pT;
import X.C474500IjA;
import X.C500260Jjc;
import X.C517510KRh;
import X.C766270U4b;
import X.C786410Ut5;
import X.C7974039o;
import X.InterfaceC1141530foN;
import X.InterfaceC500940Jki;
import X.InterfaceC517590KRp;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsOnboardingSuggestedQuestionsFragment extends PcsOnboardingShowcaseStepFragment implements InterfaceC1141530foN {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE1JzAiLS4nISoiZzw2OjMlKiojHELIOSJDA/ZyA9KiotOys6JiJiLz0yLygpJzt9Oy0jPiwyOyBiGSwgBysuJi4hLCwiLhwmLyIpOjs2LBQ5LDwnISoiOgkhKSIhLCEn";
    public TuxTextView LLLJL;
    public boolean LLLL;
    public int LLLLII;
    public String LLLLIIIILLL;
    public final String LLLIL = "OnboardingSuggestedQuestionsIntroductionPage";
    public final String LLLILZ = "OnboardingSuggestedQuestionsIntroductionPage";
    public final int LLLILZJ = 1303;
    public final boolean LLLILZLLLI = true;
    public final String LLLIZZ = "dm_suggested_question";
    public final C01GW LLLJ = C452501pT.LIZIZ(new C1824940xae(this));
    public final C1824640xaA LLLJIL = new C1824640xaA(this);
    public final C1822790xXB LLLLIIL = new C1822790xXB("OnboardingSuggestedQuestionsConfigurationPage", 1304);

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final String lT() {
        return (String) this.LLLJ.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment, com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLLFFI) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingSuggestedQuestionsIntroductionPage onDestroy show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        sbLIZ.append(", is_resume=");
        sbLIZ.append(C500260Jjc.LJJJI(Boolean.valueOf(JS().LLJJJ)) ? 1 : 0);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C1548820qPI.LJIIIIZZ("ttsmb_universal_popup_suggested_questions_submit", this);
        C1548820qPI.LJIIIIZZ("ttsmb_universal_popup_suggested_questions_show", this);
        this.LLLLIIL.LIZJ(C2097608Jq.LJ());
        this.LLLLIIL.LIZ();
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
        sbLIZ2.append("OnboardingSuggestedQuestionsIntroductionPage onDestroyView show_entrance=");
        String showEntrance2 = JS().DQ2().getShowEntrance();
        sbLIZ2.append(showEntrance2 != null ? showEntrance2 : "");
        sbLIZ2.append(", is_resume=");
        sbLIZ2.append(C500260Jjc.LJJJI(Boolean.valueOf(JS().LLJJJ)) ? 1 : 0);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        this.LLLLIIL.LIZJ(C2097608Jq.LJ());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLLFFI) {
            return;
        }
        this.LLLLIIL.LIZJ(C2097608Jq.LJ());
        if (this.LLLL || JS().LLJILJIL.length() <= 0) {
            return;
        }
        TuxTextView tuxTextView = this.LLLJL;
        if (tuxTextView != null) {
            C786410Ut5.B5(tuxTextView, 0.0f);
            C786410Ut5.wd(tuxTextView, 10 * getResources().getDisplayMetrics().density);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C1625606Yc(tuxTextView, null), 3);
        }
        this.LLLL = true;
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
            if (((SMBOptInStep) it2.next()).type == 2) {
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
        if (Intrinsics.LJFF(str, "ttsmb_universal_popup_suggested_questions_show")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("show_entrance=");
            String showEntrance = JS().DQ2().getShowEntrance();
            if (showEntrance != null) {
                str2 = showEntrance;
            }
            sbLIZ.append(str2);
            XS("ttsmb_universal_popup_suggested_questions_show", C2188811AlT.LIZIZ(sbLIZ), C0TGC.LIZ());
            this.LLLLIIL.LJ(C2097908Jt.LIZJ(new Pair("is_cache", this.LLLLIIIILLL)));
            return;
        }
        if (!Intrinsics.LJFF(str, "ttsmb_universal_popup_suggested_questions_submit")) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("OnboardingSuggestedQuestionsIntroductionPage received_complete_jsb_event event_name=");
        sbLIZ2.append("ttsmb_universal_popup_suggested_questions_submit");
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
        JS().VQ2(c262100zr);
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
                QS(R.id.pl7, R.id.a4s, null, null, strLIZIZ);
                return;
            } else if (numValueOf.intValue() == 3) {
                QS(R.id.pl7, R.id.a4w, null, null, strLIZIZ);
                return;
            } else if (numValueOf.intValue() == 8) {
                QS(R.id.pl7, R.id.a4u, null, null, strLIZIZ);
                return;
            }
        }
        QS(R.id.pl7, R.id.a4v, null, null, strLIZIZ);
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
        sbLIZ.append("OnboardingSuggestedQuestionsIntroductionPage onCreate show_entrance=");
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
        C1548820qPI.LIZLLL("ttsmb_universal_popup_suggested_questions_submit", this);
        C1548820qPI.LIZLLL("ttsmb_universal_popup_suggested_questions_show", this);
        this.LLLLII = C1122150fJ7.LIZJ(JS().EQ2());
        C517510KRh c517510KRh = new C517510KRh(this.LLJLLL, JS().DQ2().getShowEntrance(), this.LLLILZJ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("show_entrance=");
        String showEntrance2 = JS().DQ2().getShowEntrance();
        if (showEntrance2 != null) {
            str = showEntrance2;
        }
        sbLIZ2.append(str);
        ZS("OnboardingSuggestedQuestionsIntroductionPage", c517510KRh, C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.ability.IPcsOnboardingShowcaseAbility
    public final void tz2(AbstractC1824710xaH abstractC1824710xaH) {
        Long lValueOf;
        User userLJIJJLI;
        fT(JS().KQ2(), JS().xQ2());
        JS().SQ2();
        if (JS().LLJJIJI) {
            JS().LLJJIJI = false;
            C766270U4b.LIZLLL(2131851588);
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser != null && (userLJIJJLI = interfaceC500940JkiUser.LJIJJLI()) != null) {
                lValueOf = Long.valueOf(userLJIJJLI.getId());
            } else {
                lValueOf = null;
            }
            String strValueOf = String.valueOf(lValueOf);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_chat_builder_status_toast");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(strValueOf, "anchor_id");
            c474500IjALIZ.LJJII("generated_failed", "toast_type");
            c474500IjALIZ.LIZ();
        }
        abstractC1824710xaH.LLJLLIL.setText(getString(2131855921));
        abstractC1824710xaH.LLJLL.setText(getString(2131855920));
        C1835860xsG c1835860xsG = abstractC1824710xaH.LLJLIL;
        c1835860xsG.setPrimaryContentLayout(R.layout.h3c);
        c1835860xsG.setSecondaryContentLayout(R.layout.h3d);
        AbstractC1824800xaQ abstractC1824800xaQ = (AbstractC1824800xaQ) c1835860xsG.getPrimaryBinding();
        if (abstractC1824800xaQ != null) {
            abstractC1824800xaQ.LLJJJJ.setImageURI(qT());
            abstractC1824800xaQ.LLJJJJLIIL.setText(getString(2131836437));
            abstractC1824800xaQ.LLJJJJJIL.setText(JS().LLJILJIL);
            this.LLLJL = abstractC1824800xaQ.LLJJJJJIL;
            C1824670xaD.LIZJ(c1835860xsG, abstractC1824800xaQ.LLJJJIL);
        }
        AbstractC1824810xaR abstractC1824810xaR = (AbstractC1824810xaR) c1835860xsG.getSecondaryBinding();
        if (abstractC1824810xaR != null) {
            abstractC1824810xaR.LLJJJJLIIL.setText(getString(2131836437));
            abstractC1824810xaR.LLJJJJJIL.setText(getString(2131855869));
            abstractC1824810xaR.LLJJJJ.setLayoutManager(new LinearLayoutManager(c1835860xsG.getContext()));
            abstractC1824810xaR.LLJJJJ.setAdapter(new C7974039o(rT(this.LLLLII)));
            C1824670xaD.LIZIZ(abstractC1824810xaR.LLJJJJ, new C343110Dcj(8));
            C1824670xaD.LIZJ(c1835860xsG, abstractC1824810xaR.LLJJJIL);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C434250H1b(abstractC1824710xaH, null), 3);
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.LJ(new C0KBP(this.LLJLLL));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingSuggestedQuestionsIntroductionPage perf.onShowSuccess show_entrance=");
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
        sbLIZ2.append("OnboardingSuggestedQuestionsIntroductionPage initView show_entrance=");
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

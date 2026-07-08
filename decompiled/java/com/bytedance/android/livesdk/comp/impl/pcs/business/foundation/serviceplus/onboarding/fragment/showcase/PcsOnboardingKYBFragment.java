package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase;

import X.AbstractC1824710xaH;
import X.AbstractC1824840xaU;
import X.C01GW;
import X.C0KBP;
import X.C0TGC;
import X.C1121890fIh;
import X.C1122150fJ7;
import X.C1411350mpZ;
import X.C15438062q;
import X.C1697810uHb;
import X.C1824200xZS;
import X.C1824630xa9;
import X.C1824670xaD;
import X.C1824690xaF;
import X.C1824720xaI;
import X.C1824930xad;
import X.C1826730xdX;
import X.C1835860xsG;
import X.C2188811AlT;
import X.C343110Dcj;
import X.C452501pT;
import X.C500260Jjc;
import X.C517510KRh;
import X.C786410Ut5;
import X.C7972039m;
import X.InterfaceC517590KRp;
import android.os.Bundle;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsOnboardingKYBFragment extends PcsOnboardingShowcaseStepFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE1JzAiLS4nISoiZzHELIOSw2OjMlKiojJDA/ZyA9KiotOys6JiJiLz0yLygpJzt9Oy0jPiwyOyBiGSwgBysuJi4hLCwiLgQKCgM+KCg+LSs4";
    public boolean LLLIZZ;
    public final String LLLIL = "OnboardingKYBVerificationIntroductionPage";
    public final String LLLILZ = "OnboardingKYBVerificationIntroductionPage";
    public final int LLLILZJ = 1309;
    public final boolean LLLILZLLLI = true;
    public final C01GW LLLJ = C452501pT.LIZIZ(new C1824930xad(this));
    public final C1824630xa9 LLLJIL = new C1824630xa9(this);
    public final C01GW LLLJL = C452501pT.LIZIZ(new C1824720xaI(this));
    public final C1824690xaF LLLL = new C1824690xaF(this);

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final String lT() {
        return (String) this.LLLJ.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final String oT() {
        return (String) this.LLLJL.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment
    public final void xT() {
        String showEntrance = JS().DQ2().getShowEntrance();
        boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LJ(JS().EQ2())));
        C1824200xZS.LJIIIZ(zLJJJI ? 1 : 0, C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZLLL(JS().EQ2()))) ? 1 : 0, C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZ(JS().EQ2()))) ? 1 : 0, C500260Jjc.LJJJI(Boolean.valueOf(JS().LLJJJ)) ? 1 : 0, "show", showEntrance, JS().LQ2(), "");
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment, com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingKYBVerificationIntroductionPage onDestroy show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        sbLIZ.append(", is_resume=");
        sbLIZ.append(C500260Jjc.LJJJI(Boolean.valueOf(JS().LLJJJ)) ? 1 : 0);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        XS("onDestroyView", C2188811AlT.LIZIZ(sbLIZ), C0TGC.LIZ());
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("OnboardingKYBVerificationIntroductionPage onDestroyView show_entrance=");
        String showEntrance2 = JS().DQ2().getShowEntrance();
        sbLIZ2.append(showEntrance2 != null ? showEntrance2 : "");
        sbLIZ2.append(", is_resume=");
        sbLIZ2.append(C500260Jjc.LJJJI(Boolean.valueOf(JS().LLJJJ)) ? 1 : 0);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
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

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final Function0<Unit> nT() {
        return this.LLLL;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final boolean yS() {
        return this.LLLILZLLLI;
    }

    public final void AT(String str) {
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingKYBVerificationIntroductionPage ");
        sbLIZ.append(str);
        sbLIZ.append(" current_step_index=");
        sbLIZ.append(JS().LLJJ);
        sbLIZ.append(", current_step_type=");
        SMBOptInStep sMBOptInStep = JS().LLJILLL;
        if (sMBOptInStep != null) {
            i = sMBOptInStep.type;
        } else {
            i = 0;
        }
        sbLIZ.append(zT(i));
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
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
        sbLIZ.append("OnboardingKYBVerificationIntroductionPage onCreate show_entrance=");
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
        C517510KRh c517510KRh = new C517510KRh(this.LLJLLL, JS().DQ2().getShowEntrance(), this.LLLILZJ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("show_entrance=");
        String showEntrance2 = JS().DQ2().getShowEntrance();
        if (showEntrance2 != null) {
            str = showEntrance2;
        }
        sbLIZ2.append(str);
        ZS("OnboardingKYBVerificationIntroductionPage", c517510KRh, C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.ability.IPcsOnboardingShowcaseAbility
    public final void tz2(AbstractC1824710xaH abstractC1824710xaH) {
        int i;
        fT(JS().KQ2(), JS().xQ2());
        abstractC1824710xaH.LLJLLIL.setText(getString(2131856332));
        TuxTextView tuxTextView = abstractC1824710xaH.LLJLL;
        if (JS().LLJ.get()) {
            i = 2131856154;
        } else {
            i = 2131855951;
        }
        tuxTextView.setText(getString(i));
        abstractC1824710xaH.LLJJL.setImageURI(qT());
        C0TGC.LIZIZ(abstractC1824710xaH.LLJJLIIIJLLLLLLLZ, "ttlive_pcs_onboarding_badge.png");
        C1835860xsG c1835860xsG = abstractC1824710xaH.LLJLIL;
        c1835860xsG.setPrimaryContentLayout(R.layout.h3a);
        AbstractC1824840xaU abstractC1824840xaU = (AbstractC1824840xaU) c1835860xsG.getPrimaryBinding();
        if (abstractC1824840xaU != null) {
            List listLJIIJJI = C1697810uHb.LJIIJJI("Email", "Phone number", "Address");
            abstractC1824840xaU.LLJJJJJIL.setText(getString(2131856152));
            abstractC1824840xaU.LLJJJJ.setLayoutManager(new LinearLayoutManager(c1835860xsG.getContext()));
            abstractC1824840xaU.LLJJJJ.setAdapter(new C7972039m(listLJIIJJI));
            C1824670xaD.LIZIZ(abstractC1824840xaU.LLJJJJ, new C343110Dcj(14));
            C1824670xaD.LIZJ(c1835860xsG, abstractC1824840xaU.LLJJJIL);
        }
        final TuxTextView tuxTextView2 = abstractC1824710xaH.LLJLLIL;
        C786410Ut5.S4(0.0f, tuxTextView2);
        HandlerHook.viewPost(tuxTextView2, new Runnable() { // from class: X.06PM
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PcsOnboardingKYBFragment@2ee7.animateTitleText$1");
                try {
                    tuxTextView2.animate().alpha(1.0f).setDuration(350L).start();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PcsOnboardingKYBFragment@2ee7.animateTitleText$1");
            }
        });
        final TuxTextView tuxTextView3 = abstractC1824710xaH.LLJLL;
        C786410Ut5.S4(0.0f, tuxTextView3);
        HandlerHook.viewPost(tuxTextView3, new Runnable() { // from class: X.06PM
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PcsOnboardingKYBFragment@2ee7.animateTitleText$1");
                try {
                    tuxTextView3.animate().alpha(1.0f).setDuration(350L).start();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PcsOnboardingKYBFragment@2ee7.animateTitleText$1");
            }
        });
        final C1835860xsG c1835860xsG2 = abstractC1824710xaH.LLJLIL;
        final View view = abstractC1824710xaH.LLJJJJJIL;
        HandlerHook.viewPost(view, new Runnable() { // from class: X.0GgE
            public final /* synthetic */ long LLILLL = 1000;

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PcsOnboardingKYBFragment@2ee7.animateCardToBackground$1");
                try {
                    c1835860xsG2.animate().translationY(view.getBottom() - c1835860xsG2.getTop()).setStartDelay(this.LLILLL).setDuration(350L).setInterpolator(new DecelerateInterpolator()).start();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PcsOnboardingKYBFragment@2ee7.animateCardToBackground$1");
            }
        });
        final ConstraintLayout constraintLayout = abstractC1824710xaH.LLJL;
        C786410Ut5.LL(0, constraintLayout);
        C786410Ut5.Ub(constraintLayout, 0.0f);
        C786410Ut5.uc(constraintLayout, 0.0f);
        HandlerHook.viewPost(constraintLayout, new Runnable() { // from class: X.0EoJ
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PcsOnboardingKYBFragment@2ee7.animateKybContainer$1$1");
                try {
                    constraintLayout.animate().scaleX(1.0f).scaleY(1.0f).setStartDelay(1350L).setDuration(350L).setInterpolator(new DecelerateInterpolator()).start();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PcsOnboardingKYBFragment@2ee7.animateKybContainer$1$1");
            }
        });
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.LJ(new C0KBP(this.LLJLLL));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingKYBVerificationIntroductionPage perf.onShowSuccess show_entrance=");
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
        sbLIZ2.append("OnboardingKYBVerificationIntroductionPage initView show_entrance=");
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

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment
    public final void vT(String str) {
        if (!this.LLLIZZ) {
            this.LLLIZZ = true;
            String showEntrance = JS().DQ2().getShowEntrance();
            boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LJ(JS().EQ2())));
            C1824200xZS.LJIIIZ(zLJJJI ? 1 : 0, C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZLLL(JS().EQ2()))) ? 1 : 0, C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZ(JS().EQ2()))) ? 1 : 0, C500260Jjc.LJJJI(Boolean.valueOf(JS().LLJJJ)) ? 1 : 0, "click", showEntrance, JS().LQ2(), str);
        }
    }
}

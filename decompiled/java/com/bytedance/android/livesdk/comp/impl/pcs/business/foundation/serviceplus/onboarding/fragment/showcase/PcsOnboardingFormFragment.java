package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase;

import X.AbstractC1824710xaH;
import X.AbstractC1824800xaQ;
import X.AbstractC1824840xaU;
import X.C011N;
import X.C01GW;
import X.C0KBP;
import X.C0TGC;
import X.C1121890fIh;
import X.C1410670moT;
import X.C1411040mp4;
import X.C1411350mpZ;
import X.C15438062q;
import X.C1548820qPI;
import X.C1625806Ye;
import X.C1697810uHb;
import X.C1822790xXB;
import X.C1824660xaC;
import X.C1824670xaD;
import X.C1824770xaN;
import X.C1824920xac;
import X.C1826730xdX;
import X.C1835860xsG;
import X.C19298910ep;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C23250099c;
import X.C262100zr;
import X.C343110Dcj;
import X.C434280H1e;
import X.C444210HbP;
import X.C452501pT;
import X.C500260Jjc;
import X.C510160Jza;
import X.C517510KRh;
import X.C786410Ut5;
import X.C7972039m;
import X.InterfaceC1141530foN;
import X.InterfaceC517590KRp;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.CompoundButton;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase.PcsOnboardingFormFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import ttpobfuscated.e3;
import webcast.api.sub.SMBOptInQualificationResponse;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsOnboardingFormFragment extends PcsOnboardingShowcaseStepFragment implements InterfaceC1141530foN {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE1JzAiLS4nISoiZzw2HELIOSOjMlKiojJDA/ZyA9KiotOys6JiJiLz0yLygpJzt9Oy0jPiwyOyBiGSwgBysuJi4hLCwiLgk8OigKOy40JSAiPQ==";
    public boolean LLLJ;
    public TuxTextView LLLJIL;
    public boolean LLLJL;
    public long LLLL;
    public String LLLLII;
    public final String LLLIL = "OnboardingFormIntroductionPage";
    public final String LLLILZ = "OnboardingFormIntroductionPage";
    public final int LLLILZJ = 1307;
    public final boolean LLLILZLLLI = true;
    public final String LLLIZZ = "form";
    public final C1822790xXB LLLLIIIILLL = new C1822790xXB("OnboardingFormConfigurationPage", 1308);
    public final C01GW LLLLIIL = C452501pT.LIZIZ(new C1824920xac(this));
    public final C1824660xaC LLLLIILL = new C1824660xaC(this);

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final String lT() {
        return (String) this.LLLLIIL.getValue();
    }

    public final void AT() {
        C510160Jza c510160JzaES = ES();
        if (c510160JzaES != null) {
            c510160JzaES.LIZJ();
        }
        PcsOnboardingVM pcsOnboardingVMJS = JS();
        SMBOptInStep sMBOptInStep = JS().LLJILLL;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(pcsOnboardingVMJS), null, null, new C1410670moT(new C1824770xaN(this), pcsOnboardingVMJS, sMBOptInStep != null ? sMBOptInStep.skuId : 0L, C1697810uHb.LJIILJJIL(5, 4, 3), null), 3);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final void PS() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C444210HbP(this, null), 3);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment, com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLLFFI) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingFormIntroductionPage onDestroy show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        sbLIZ.append(", is_resume=");
        sbLIZ.append(C500260Jjc.LJJJI(Boolean.valueOf(JS().LLJJJ)) ? 1 : 0);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C1548820qPI.LJIIIIZZ("ttlive_smb_onboarding_form_questions_save", this);
        C1548820qPI.LJIIIIZZ("ttlive_smb_onboarding_form_questions_show", this);
        this.LLLLIIIILLL.LIZJ(C2097608Jq.LJ());
        this.LLLLIIIILLL.LIZ();
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
        sbLIZ2.append("OnboardingFormIntroductionPage onDestroyView show_entrance=");
        String showEntrance2 = JS().DQ2().getShowEntrance();
        sbLIZ2.append(showEntrance2 != null ? showEntrance2 : "");
        sbLIZ2.append(", is_resume=");
        sbLIZ2.append(C500260Jjc.LJJJI(Boolean.valueOf(JS().LLJJJ)) ? 1 : 0);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        this.LLLLIIIILLL.LIZJ(C2097608Jq.LJ());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLLFFI) {
            return;
        }
        this.LLLLIIIILLL.LIZJ(C2097608Jq.LJ());
        if (this.LLLJL || JS().LLJILJIL.length() <= 0) {
            return;
        }
        TuxTextView tuxTextView = this.LLLJIL;
        if (tuxTextView != null) {
            C786410Ut5.B5(tuxTextView, 0.0f);
            C786410Ut5.wd(tuxTextView, 10 * getResources().getDisplayMetrics().density);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C1625806Ye(tuxTextView, null), 3);
        }
        this.LLLJL = true;
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
            if (((SMBOptInStep) it2.next()).type == 4) {
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
        return this.LLLLIILL;
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
        String str = c262100zr.LIZ;
        if (Intrinsics.LJFF(str, "ttlive_smb_onboarding_form_questions_show")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("show_entrance=");
            String showEntrance = JS().DQ2().getShowEntrance();
            if (showEntrance == null) {
                showEntrance = "";
            }
            sbLIZ.append(showEntrance);
            XS("ttlive_smb_onboarding_form_questions_show", C2188811AlT.LIZIZ(sbLIZ), C0TGC.LIZ());
            this.LLLLIIIILLL.LJ(C2097908Jt.LIZJ(new Pair("is_cache", this.LLLLII)));
            return;
        }
        if (!Intrinsics.LJFF(str, "ttlive_smb_onboarding_form_questions_save")) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("OnboardingFormIntroductionPage received_complete_jsb_event event_name=");
        sbLIZ2.append("ttlive_smb_onboarding_form_questions_save");
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
        AT();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment, com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        long j;
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
        sbLIZ.append("OnboardingFormIntroductionPage onCreate show_entrance=");
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
        C1548820qPI.LIZLLL("ttlive_smb_onboarding_form_questions_save", this);
        C1548820qPI.LIZLLL("ttlive_smb_onboarding_form_questions_show", this);
        SMBOptInStep sMBOptInStep = JS().LLJILLL;
        if (sMBOptInStep != null) {
            j = sMBOptInStep.skuId;
        } else {
            j = 0;
        }
        this.LLLL = j;
        C517510KRh c517510KRh = new C517510KRh(this.LLJLLL, JS().DQ2().getShowEntrance(), this.LLLILZJ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("show_entrance=");
        String showEntrance2 = JS().DQ2().getShowEntrance();
        if (showEntrance2 != null) {
            str = showEntrance2;
        }
        sbLIZ2.append(str);
        ZS("OnboardingFormIntroductionPage", c517510KRh, C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.ability.IPcsOnboardingShowcaseAbility
    public final void tz2(AbstractC1824710xaH abstractC1824710xaH) {
        fT(JS().KQ2(), JS().xQ2());
        JS().SQ2();
        abstractC1824710xaH.LLJLLIL.setText(getString(2131855933));
        abstractC1824710xaH.LLJLL.setText(getString(2131855932));
        TuxTextView tuxTextView = abstractC1824710xaH.LLJJJIL;
        String string = getString(2131856333);
        final C011N c011n = new C011N();
        boolean z = false;
        SpannableString spannableString = new SpannableString(C19298910ep.LIZ(u.LJJIFFI(u.LJJIFFI(string, e3.e, "<b><a href=\"action://disclaimer\">", false), e3.f, "</a></b>", false), 0));
        for (Object obj : spannableString.getSpans(0, spannableString.length(), URLSpan.class)) {
            int spanStart = spannableString.getSpanStart(obj);
            int spanEnd = spannableString.getSpanEnd(obj);
            int spanFlags = spannableString.getSpanFlags(obj);
            spannableString.removeSpan(obj);
            C786410Ut5.p2(spannableString, new ClickableSpan() { // from class: X.0xaT
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    c011n.invoke();
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    textPaint.setFakeBoldText(true);
                    textPaint.setUnderlineText(false);
                }
            }, spanStart, spanEnd, spanFlags);
        }
        tuxTextView.setText(spannableString);
        abstractC1824710xaH.LLJJJIL.setMovementMethod(LinkMovementMethod.getInstance());
        C500260Jjc.LLFFF(abstractC1824710xaH.LLJJJIL);
        SMBOptInQualificationResponse.ResponseData responseData = JS().getState().LLILLJJLI;
        if (responseData != null) {
            z = responseData.isBa;
        }
        if (z) {
            C500260Jjc.LJIILIIL(abstractC1824710xaH.LLJJJIL);
            C500260Jjc.LJIILIIL(abstractC1824710xaH.LLJJJJ);
            this.LLLJ = true;
        } else {
            C500260Jjc.LLFFF(abstractC1824710xaH.LLJJJJ);
            C786410Ut5.D7(abstractC1824710xaH.LLJJJJ, new CompoundButton.OnCheckedChangeListener() { // from class: X.0xaY
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    PcsOnboardingFormFragment pcsOnboardingFormFragment = this.LL;
                    pcsOnboardingFormFragment.LLLJ = z2;
                    PcsOnboardingStepFragment.iT(pcsOnboardingFormFragment, z2);
                }
            });
            abstractC1824710xaH.LLJJJJ.setChecked(true);
            this.LLLJ = true;
            PcsOnboardingStepFragment.iT(this, true);
        }
        C1835860xsG c1835860xsG = abstractC1824710xaH.LLJLIL;
        c1835860xsG.setPrimaryContentLayout(R.layout.h3c);
        c1835860xsG.setSecondaryContentLayout(R.layout.h3a);
        AbstractC1824800xaQ abstractC1824800xaQ = (AbstractC1824800xaQ) c1835860xsG.getPrimaryBinding();
        if (abstractC1824800xaQ != null) {
            abstractC1824800xaQ.LLJJJJ.setImageURI(qT());
            abstractC1824800xaQ.LLJJJJLIIL.setText(getString(2131856152));
            abstractC1824800xaQ.LLJJJJJIL.setText(JS().LLJILJIL);
            this.LLLJIL = abstractC1824800xaQ.LLJJJJJIL;
            C1824670xaD.LIZJ(c1835860xsG, abstractC1824800xaQ.LLJJJIL);
        }
        AbstractC1824840xaU abstractC1824840xaU = (AbstractC1824840xaU) c1835860xsG.getSecondaryBinding();
        if (abstractC1824840xaU != null) {
            List listLJIIJJI = C1697810uHb.LJIIJJI("Email", "Phone number", "Address");
            abstractC1824840xaU.LLJJJJJIL.setText(getString(2131856152));
            abstractC1824840xaU.LLJJJJ.setLayoutManager(new LinearLayoutManager(c1835860xsG.getContext()));
            abstractC1824840xaU.LLJJJJ.setAdapter(new C7972039m(listLJIIJJI));
            C1824670xaD.LIZIZ(abstractC1824840xaU.LLJJJJ, new C343110Dcj(14));
            C1824670xaD.LIZJ(c1835860xsG, abstractC1824840xaU.LLJJJIL);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C434280H1e(abstractC1824710xaH, null), 3);
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.LJ(new C0KBP(this.LLJLLL));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingFormIntroductionPage perf.onShowSuccess show_entrance=");
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
        sbLIZ2.append("OnboardingFormIntroductionPage initView show_entrance=");
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

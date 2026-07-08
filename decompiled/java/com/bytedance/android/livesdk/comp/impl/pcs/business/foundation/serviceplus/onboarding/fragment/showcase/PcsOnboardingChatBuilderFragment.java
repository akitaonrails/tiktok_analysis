package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.showcase;

import X.AbstractC1824710xaH;
import X.AbstractC1824800xaQ;
import X.AbstractC1824810xaR;
import X.C01GW;
import X.C0KBP;
import X.C1121890fIh;
import X.C1122150fJ7;
import X.C1388190mED;
import X.C1411040mp4;
import X.C1411350mpZ;
import X.C15438062q;
import X.C1548820qPI;
import X.C1625706Yd;
import X.C1713250ugV;
import X.C1713260ugW;
import X.C1822790xXB;
import X.C1824200xZS;
import X.C1824610xa7;
import X.C1824620xa8;
import X.C1824670xaD;
import X.C1824900xaa;
import X.C1824910xab;
import X.C1826730xdX;
import X.C1835860xsG;
import X.C20736316Cj;
import X.C20743516Fd;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C23250099c;
import X.C262100zr;
import X.C343110Dcj;
import X.C434270H1d;
import X.C439101nJ;
import X.C452501pT;
import X.C500260Jjc;
import X.C507500JvI;
import X.C517510KRh;
import X.C786410Ut5;
import X.C7974039o;
import X.InterfaceC1141530foN;
import X.InterfaceC517590KRp;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsOnboardingChatBuilderFragment extends PcsOnboardingShowcaseStepFragment implements InterfaceC1141530foN {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE1JzAiLS4nISoiZzw2OjMlHELIOSKiojJDA/ZyA9KiotOys6JiJiLz0yLygpJzt9Oy0jPiwyOyBiGSwgBysuJi4hLCwiLgw7KTEOPCY/LCA+Dz0yLygpJzs=";
    public TuxTextView LLLL;
    public boolean LLLLII;
    public int LLLLIIIILLL;
    public final String LLLIL = "OnboardingChatBuilderIntroductionPage";
    public final String LLLILZ = "OnboardingChatBuilderIntroductionPage";
    public final int LLLILZJ = 1313;
    public final boolean LLLILZLLLI = true;
    public final C01GW LLLIZZ = C452501pT.LIZIZ(new C1824900xaa(this));
    public final C1824610xa7 LLLJ = new C1824610xa7(this);
    public final C01GW LLLJIL = C452501pT.LIZIZ(new C1824910xab(this));
    public final C1824620xa8 LLLJL = new C1824620xa8(this);
    public final C1822790xXB LLLLIIL = new C1822790xXB("OnboardingChatBuilderConfigurationPage", 1314);

    public final void ET() {
        Integer numValueOf;
        JS().vQ2();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        SMBOptInStep sMBOptInStep = JS().LLJILLL;
        if (sMBOptInStep != null && (numValueOf = Integer.valueOf(sMBOptInStep.type)) != null) {
            if (numValueOf.intValue() == 4) {
                QS(R.id.pkx, R.id.a2i, null, null, strLIZIZ);
                return;
            }
            if (numValueOf.intValue() == 2) {
                QS(R.id.pkx, R.id.a2m, null, null, strLIZIZ);
                return;
            } else if (numValueOf.intValue() == 3) {
                QS(R.id.pkx, R.id.a2n, null, null, strLIZIZ);
                return;
            } else if (numValueOf.intValue() == 8) {
                QS(R.id.pkx, R.id.a2k, null, null, strLIZIZ);
                return;
            }
        }
        QS(R.id.pkx, R.id.a2l, null, null, strLIZIZ);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment
    public final /* bridge */ /* synthetic */ String sT() {
        return null;
    }

    public final void DT() {
        Activity activityLIZ;
        this.LLLLIIL.LIZJ(C2097608Jq.LJ());
        Context context = (Context) C507500JvI.LIZIZ().get();
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        activityLIZ.finish();
        C786410Ut5.ae(R.anim.lu, activityLIZ, R.anim.lw);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final String lT() {
        return (String) this.LLLIZZ.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final String oT() {
        return (String) this.LLLJIL.getValue();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment, com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingChatBuilderIntroductionPage onDestroy show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        sbLIZ.append(", is_resume=");
        sbLIZ.append(C500260Jjc.LJJJI(Boolean.valueOf(JS().LLJJJ)) ? 1 : 0);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C1548820qPI.LJIIIIZZ("ttsmb_dm_chatbuilder_page_show", this);
        C1548820qPI.LJIIIIZZ("ttsmb_dm_chatbuilder_write_manually_click", this);
        C1548820qPI.LJIIIIZZ("ttsmb_dm_chatbuilder_apply", this);
        C1548820qPI.LJIIIIZZ("ttsmb_dm_chatbuilder_close", this);
        this.LLLLIIL.LIZJ(C2097608Jq.LJ());
        this.LLLLIIL.LIZ();
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
        XS("onDestroyView", C2188811AlT.LIZIZ(sbLIZ), null);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("OnboardingChatBuilderIntroductionPage onDestroyView show_entrance=");
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
        this.LLLLIIL.LIZJ(C2097608Jq.LJ());
        if (this.LLLLII || JS().LLJILJIL.length() <= 0) {
            return;
        }
        TuxTextView tuxTextView = this.LLLL;
        if (tuxTextView != null) {
            C786410Ut5.B5(tuxTextView, 0.0f);
            C786410Ut5.wd(tuxTextView, 10 * getResources().getDisplayMetrics().density);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C1625706Yd(tuxTextView, null), 3);
        }
        this.LLLLII = true;
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
        return this.LLLJ;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final String mT() {
        return this.LLLIL;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public final Function0<Unit> nT() {
        return this.LLLJL;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final boolean yS() {
        return this.LLLILZLLLI;
    }

    public final void AT(String str) {
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingChatBuilderIntroductionPage ");
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

    public final void CT(String str) {
        int i;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingChatBuilderIntroductionPage received_complete_jsb_event event_name=");
        sbLIZ.append(str);
        sbLIZ.append(", current_step_index=");
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

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        String str = c262100zr.LIZ;
        switch (str.hashCode()) {
            case -969878254:
                if (str.equals("ttsmb_dm_chatbuilder_page_show")) {
                    String str2 = c262100zr.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("show_entrance=");
                    String showEntrance = JS().DQ2().getShowEntrance();
                    if (showEntrance == null) {
                        showEntrance = "";
                    }
                    sbLIZ.append(showEntrance);
                    XS(str2, C2188811AlT.LIZIZ(sbLIZ), null);
                    this.LLLLIIL.LJ(C2097608Jq.LJ());
                }
                break;
            case -58662829:
                if (str.equals("ttsmb_dm_chatbuilder_apply")) {
                    CT("ttsmb_dm_chatbuilder_apply");
                    JS().VQ2(c262100zr);
                    DT();
                    JS().LLJJIII = true;
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C1713260ugW(this, null), 3);
                }
                break;
            case -56935715:
                if (str.equals("ttsmb_dm_chatbuilder_close")) {
                    CT("ttsmb_dm_chatbuilder_close");
                    DT();
                }
                break;
            case 397996791:
                if (str.equals("ttsmb_dm_chatbuilder_write_manually_click")) {
                    CT("ttsmb_dm_chatbuilder_write_manually_click");
                    DT();
                    JS().LLJJIJI = true;
                    JS().LLJJIII = false;
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C1713250ugV(this, null), 3);
                }
                break;
        }
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingShowcaseStepFragment, com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1411350mpZ state = JS().getState();
        List<SMBOptInStep> list = state.LLILZIL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<SMBOptInStep> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(zT(it2.next().type));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingChatBuilderIntroductionPage onCreate show_entrance=");
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
        C1548820qPI.LIZLLL("ttsmb_dm_chatbuilder_page_show", this);
        C1548820qPI.LIZLLL("ttsmb_dm_chatbuilder_write_manually_click", this);
        C1548820qPI.LIZLLL("ttsmb_dm_chatbuilder_apply", this);
        C1548820qPI.LIZLLL("ttsmb_dm_chatbuilder_close", this);
        this.LLLLIIIILLL = C1122150fJ7.LIZJ(JS().EQ2());
        C517510KRh c517510KRh = new C517510KRh(this.LLJLLL, JS().DQ2().getShowEntrance(), this.LLLILZJ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("show_entrance=");
        String showEntrance2 = JS().DQ2().getShowEntrance();
        if (showEntrance2 != null) {
            str = showEntrance2;
        }
        sbLIZ2.append(str);
        ZS("OnboardingChatBuilderIntroductionPage", c517510KRh, C2188811AlT.LIZIZ(sbLIZ2));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.ability.IPcsOnboardingShowcaseAbility
    public final void tz2(AbstractC1824710xaH abstractC1824710xaH) {
        int i;
        String str = "";
        C1824200xZS.LIZ("show", JS().DQ2().getShowEntrance(), "");
        fT(JS().KQ2(), JS().xQ2());
        JS().SQ2();
        String string = getString(2131851602);
        int iLIZ = C439101nJ.LIZ(24);
        C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.di0, requireContext());
        if (c20743516FdLIZLLL != null) {
            c20743516FdLIZLLL.setBounds(0, 0, iLIZ, iLIZ);
        } else {
            c20743516FdLIZLLL = null;
        }
        TuxTextView tuxTextView = abstractC1824710xaH.LLJLLIL;
        CharSequence charSequence = string;
        if (c20743516FdLIZLLL != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            spannableStringBuilder.append((CharSequence) "  ");
            if (Build.VERSION.SDK_INT >= 29) {
                i = 2;
            } else {
                i = 1;
            }
            C786410Ut5.q2(spannableStringBuilder, new ImageSpan(c20743516FdLIZLLL, i), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
            charSequence = spannableStringBuilder;
        }
        tuxTextView.setText(charSequence);
        abstractC1824710xaH.LLJLL.setText(getString(2131851601));
        C1835860xsG c1835860xsG = abstractC1824710xaH.LLJLIL;
        c1835860xsG.setPrimaryContentLayout(R.layout.h3c);
        c1835860xsG.setSecondaryContentLayout(R.layout.h3d);
        AbstractC1824800xaQ abstractC1824800xaQ = (AbstractC1824800xaQ) c1835860xsG.getPrimaryBinding();
        if (abstractC1824800xaQ != null) {
            abstractC1824800xaQ.LLJJJJ.setImageURI(qT());
            abstractC1824800xaQ.LLJJJJLIIL.setText(getString(2131836437));
            abstractC1824800xaQ.LLJJJJJIL.setText(JS().LLJILJIL);
            this.LLLL = abstractC1824800xaQ.LLJJJJJIL;
            C1824670xaD.LIZJ(c1835860xsG, abstractC1824800xaQ.LLJJJIL);
        }
        AbstractC1824810xaR abstractC1824810xaR = (AbstractC1824810xaR) c1835860xsG.getSecondaryBinding();
        if (abstractC1824810xaR != null) {
            abstractC1824810xaR.LLJJJJLIIL.setText(getString(2131836437));
            abstractC1824810xaR.LLJJJJJIL.setText(getString(2131855869));
            abstractC1824810xaR.LLJJJJ.setLayoutManager(new LinearLayoutManager(c1835860xsG.getContext()));
            abstractC1824810xaR.LLJJJJ.setAdapter(new C7974039o(rT(this.LLLLIIIILLL)));
            C1824670xaD.LIZIZ(abstractC1824810xaR.LLJJJJ, new C343110Dcj(8));
            C1824670xaD.LIZJ(c1835860xsG, abstractC1824810xaR.LLJJJIL);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C434270H1d(abstractC1824710xaH, null), 3);
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.LJ(new C0KBP(this.LLJLLL));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingChatBuilderIntroductionPage perf.onShowSuccess show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
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
        sbLIZ2.append("OnboardingChatBuilderIntroductionPage initView show_entrance=");
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
    }
}

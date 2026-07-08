package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.step;

import X.AbstractC1824560xa2;
import X.C092O;
import X.C0KBP;
import X.C0TGC;
import X.C0WZX;
import X.C1121890fIh;
import X.C1122150fJ7;
import X.C1410680moU;
import X.C1411350mpZ;
import X.C15438062q;
import X.C1824200xZS;
import X.C1826730xdX;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C23250099c;
import X.C327040Cru;
import X.C500060JjI;
import X.C500260Jjc;
import X.C510160Jza;
import X.C517510KRh;
import X.InterfaceC517590KRp;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.step.PcsOnboardingIntroFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.viewmodel.PcsOnboardingVM;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import u4.q0;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsOnboardingIntroFragment extends PcsOnboardingStepFragment<AbstractC1824560xa2> {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE1JzAiLS4nISoiZzHELIOSw2OjMlKiojJDA/ZyA9KiotOys6JiJiLz0yLygpJzt9OzEpOWEDKzYDJy08KTcoICE0ASs4OyAVOiQrJCo9PA==";
    public final int LLLIIIL = R.layout.gkr;
    public final boolean LLLIIL = true;
    public final String LLLIILIL = "OnboardingServiceIntroductionPage";
    public final int LLLIL = 1302;
    public boolean LLLILZ;

    public final String kT(int i) {
        switch (i) {
            case 1:
                return "intro";
            case 2:
                return "suggested_questions";
            case 3:
                return "welcome_message";
            case 4:
                return "form";
            case 5:
                return "booking";
            case 6:
                return "course";
            case 7:
                return "kyc";
            case 8:
                return "kyb";
            default:
                return "unknown";
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        C500060JjI c500060JjI = new C500060JjI();
        c500060JjI.LIZ(Collections.singletonList(new C510160Jza(getString(2131855963), R.style.a7k, new C092O() { // from class: X.0xZy
            @Override // X.C092O
            public final void accept(Object obj) {
                C1A6V c1a6vLJIIJ;
                View view = this.LIZ.getView();
                if (view != null && (c1a6vLJIIJ = q0.LJIIJ(view)) != null) {
                    c1a6vLJIIJ.LIZ(8);
                }
                C510160Jza c510160JzaES = this.LIZ.ES();
                if (c510160JzaES != null) {
                    c510160JzaES.LIZJ();
                }
                this.LIZ.JS().LLJILJIL = String.valueOf(C2204961BRm.LLLLJI(this.LIZ.wS().LLJJJJ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSePE4qAkAHkvhoPDXzszdkRe7BLFK2FcFirciR2swhp6NqAOsaDwHL4a9ejOmaefh52Hogua0RTqcenlYNND8HhM6NKx2m/MG7Pww==", null)));
                PcsOnboardingIntroFragment pcsOnboardingIntroFragment = this.LIZ;
                pcsOnboardingIntroFragment.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("OnboardingServiceIntroductionPage requestBasicInfoEdit request show_entrance=");
                String showEntrance = pcsOnboardingIntroFragment.JS().DQ2().getShowEntrance();
                if (showEntrance == null) {
                    showEntrance = "";
                }
                sbLIZ.append(showEntrance);
                C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                PcsOnboardingVM pcsOnboardingVMJS = this.LIZ.JS();
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(pcsOnboardingVMJS), null, null, new C1410660moS(pcsOnboardingVMJS, this.LIZ.JS().LLJILJIL, null), 3);
            }
        })));
        return c500060JjI;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final void PS() {
        PcsOnboardingVM pcsOnboardingVMJS = JS();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(pcsOnboardingVMJS), null, null, new C1410680moU(pcsOnboardingVMJS, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), null, null, new C327040Cru(this, null), 3);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final void VS() {
        super.VS();
        jT("back");
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final void eT() {
        super.eT();
        jT("close");
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.ability.IPcsOnboardingBottomFunctionAbility
    public final void iR() throws Throwable {
        Editable editableLLLLJI = C2204961BRm.LLLLJI(wS().LLJJJJ, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSePE4qAkAHkvhoPDXzszdkRe7BLFK2FcFirciR2swhp6NqAOsaDwHL4a9ejOmaefh52Hogua0RTqcenlYNND8HhM6NKx2m/MG7Pww==", null));
        boolean z = false;
        if (editableLLLLJI != null && editableLLLLJI.length() > 0) {
            z = true;
        }
        PcsOnboardingStepFragment.iT(this, z);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLLFFI) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingServiceIntroductionPage onDestroy show_entrance=");
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
        sbLIZ2.append("OnboardingServiceIntroductionPage onDestroyView show_entrance=");
        String showEntrance2 = JS().DQ2().getShowEntrance();
        sbLIZ2.append(showEntrance2 != null ? showEntrance2 : "");
        sbLIZ2.append(", is_resume=");
        sbLIZ2.append(C500260Jjc.LJJJI(Boolean.valueOf(JS().LLJJJ)) ? 1 : 0);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final String FS() {
        return this.LLLIILIL;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final boolean yS() {
        return this.LLLIIL;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final int zS() {
        return this.LLLIIIL;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final void initView(View view) {
        int i;
        super.initView(view);
        C0TGC.LIZIZ(wS().LLJJJIL, "ttlive_pcs_onboarding_intro.png");
        wS().LLJJJJ.addTextChangedListener(new TextWatcher() { // from class: X.0xa0
            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                int length;
                if (editable != null) {
                    length = editable.length();
                } else {
                    length = 0;
                }
                this.LL.iR();
                if (length >= 120) {
                    PcsOnboardingIntroFragment pcsOnboardingIntroFragment = this.LL;
                    if (!pcsOnboardingIntroFragment.LLLILZ) {
                        C766270U4b.LJIIJJI(pcsOnboardingIntroFragment.getResources().getQuantityString(2131755962, 120, 120));
                        this.LL.LLLILZ = true;
                    }
                } else {
                    this.LL.LLLILZ = false;
                }
                C0I7D c0i7d = this.LL.wS().LLJJJJ;
                final PcsOnboardingIntroFragment pcsOnboardingIntroFragment2 = this.LL;
                HandlerHook.viewPost(c0i7d, new Runnable() { // from class: X.0xZz
                    public final void LIZ() {
                        int lineCount = pcsOnboardingIntroFragment2.wS().LLJJJJ.getLineCount();
                        C1324720kZq c1324720kZq = pcsOnboardingIntroFragment2.wS().LLJJJIL;
                        ViewGroup.LayoutParams layoutParams = c1324720kZq.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(lineCount >= 3 ? 90 : 120)));
                        layoutParams.width = iLIZIZ;
                        layoutParams.height = iLIZIZ;
                        C786410Ut5.W5(c1324720kZq, layoutParams);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("PcsOnboardingIntroFragment@b6a5.initView$1$afterTextChanged$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("PcsOnboardingIntroFragment@b6a5.initView$1$afterTextChanged$1");
                    }
                });
            }
        });
        int iLIZJ = C1122150fJ7.LIZJ(JS().EQ2());
        if (iLIZJ != 1) {
            if (iLIZJ != 2) {
                if (iLIZJ != 3) {
                    if (iLIZJ != 4) {
                        if (iLIZJ != 6) {
                            i = 2131855906;
                        } else {
                            i = 2131855909;
                        }
                    } else {
                        i = 2131855908;
                    }
                } else {
                    i = 2131855905;
                }
            } else {
                i = 2131855907;
            }
        } else {
            i = 2131855904;
        }
        wS().LLJJJJ.setHint(i);
        HandlerHook.viewPost(wS().LLJJJJ, new Runnable() { // from class: X.0xa1
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PcsOnboardingIntroFragment@b6a5.initView$2");
                try {
                    C0I7D c0i7d = this.LL.wS().LLJJJJ;
                    C1A6V c1a6vLJIIJ = q0.LJIIJ(c0i7d);
                    c0i7d.requestFocus();
                    if (c1a6vLJIIJ != null) {
                        c1a6vLJIIJ.LIZLLL(8);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PcsOnboardingIntroFragment@b6a5.initView$2");
            }
        });
        wS().LLJJJJ.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.0xa3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z) {
                if (z) {
                    this.LL.jT("text_box");
                }
            }
        });
        iR();
        if (JS().KQ2() > 1) {
            fT(JS().KQ2(), JS().xQ2());
        }
        String showEntrance = JS().DQ2().getShowEntrance();
        boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LJ(JS().EQ2())));
        C1824200xZS.LJFF(zLJJJI ? 1 : 0, C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZLLL(JS().EQ2()))) ? 1 : 0, C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZ(JS().EQ2()))) ? 1 : 0, C500260Jjc.LJJJI(Boolean.valueOf(JS().LLJJIJIL)) ? 1 : 0, C500260Jjc.LJJJI(Boolean.valueOf(JS().LLJJJ)) ? 1 : 0, "show", showEntrance, JS().LQ2(), "");
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.LJ(new C0KBP(this.LLJLLL));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingServiceIntroductionPage perf.onShowSuccess show_entrance=");
        String showEntrance2 = JS().DQ2().getShowEntrance();
        String str = "";
        if (showEntrance2 == null) {
            showEntrance2 = "";
        }
        sbLIZ.append(showEntrance2);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C1411350mpZ state = JS().getState();
        List<SMBOptInStep> list = state.LLILZIL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<SMBOptInStep> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(kT(it2.next().type));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("OnboardingServiceIntroductionPage initView show_entrance=");
        String showEntrance3 = JS().DQ2().getShowEntrance();
        if (showEntrance3 != null) {
            str = showEntrance3;
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

    public final void jT(String str) {
        String showEntrance = JS().DQ2().getShowEntrance();
        boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LJ(JS().EQ2())));
        C1824200xZS.LJFF(zLJJJI ? 1 : 0, C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZLLL(JS().EQ2()))) ? 1 : 0, C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZ(JS().EQ2()))) ? 1 : 0, C500260Jjc.LJJJI(Boolean.valueOf(JS().LLJJIJIL)) ? 1 : 0, C500260Jjc.LJJJI(Boolean.valueOf(JS().LLJJJ)) ? 1 : 0, "click", showEntrance, JS().LQ2(), str);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
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
            arrayList.add(kT(it2.next().type));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingServiceIntroductionPage onCreate show_entrance=");
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
        C517510KRh c517510KRh = new C517510KRh(this.LLJLLL, JS().DQ2().getShowEntrance(), this.LLLIL);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("show_entrance=");
        String showEntrance2 = JS().DQ2().getShowEntrance();
        if (showEntrance2 != null) {
            str = showEntrance2;
        }
        sbLIZ2.append(str);
        ZS("OnboardingServiceIntroductionPage", c517510KRh, C2188811AlT.LIZIZ(sbLIZ2));
    }
}

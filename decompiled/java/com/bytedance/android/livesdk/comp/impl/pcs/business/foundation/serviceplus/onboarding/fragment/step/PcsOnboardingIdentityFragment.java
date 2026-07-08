package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.step;

import X.AbstractC1824130xZL;
import X.AbstractC21673619ry;
import X.AbstractC21673719rz;
import X.AbstractC21674919sB;
import X.C092O;
import X.C0KBP;
import X.C0TGC;
import X.C1121890fIh;
import X.C1122150fJ7;
import X.C13BV;
import X.C1697810uHb;
import X.C1783010wV1;
import X.C1824120xZK;
import X.C1824150xZN;
import X.C1824200xZS;
import X.C1824670xaD;
import X.C1826730xdX;
import X.C2188811AlT;
import X.C343110Dcj;
import X.C500060JjI;
import X.C500260Jjc;
import X.C510160Jza;
import X.C517510KRh;
import X.InterfaceC517590KRp;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.step.PcsOnboardingIdentityFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsOnboardingIdentityFragment extends PcsOnboardingStepFragment<AbstractC1824130xZL> {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE1JzAiLS4nISoiZzw2HELIOSOjMlKiojJDA/ZyA9KiotOys6JiJiLz0yLygpJzt9OzEpOWEDKzYDJy08KTcoICE0ASEpJzs6PDwKOy40JSAiPQ==";
    public final int LLLIIIL = R.layout.gkq;
    public final String LLLIIL = "OnboardingIdentitySelectionPage";
    public List<C1783010wV1> LLLIILIL = C13BV.INSTANCE;
    public final int LLLIL = 1300;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        C500060JjI c500060JjI = new C500060JjI();
        c500060JjI.LIZ(Collections.singletonList(new C510160Jza(getString(2131855963), R.style.a7k, new C092O() { // from class: X.0xZJ
            @Override // X.C092O
            public final void accept(Object obj) {
                String str;
                int i = this.LIZ.JS().LLILZLL;
                if (i != 0) {
                    if (i != 1) {
                        str = "unknown";
                    } else {
                        str = "enterprise";
                    }
                } else {
                    str = "individual";
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("OnboardingIdentitySelectionPage nextClick identity_type=");
                sbLIZ.append(str);
                C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                String showEntrance = this.LIZ.JS().DQ2().getShowEntrance();
                boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LJ(this.LIZ.JS().EQ2())));
                C1824200xZS.LJIIIIZZ(zLJJJI ? 1 : 0, "click", C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZLLL(this.LIZ.JS().EQ2()))) ? 1 : 0, showEntrance, this.LIZ.JS().LQ2(), C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZ(this.LIZ.JS().EQ2()))) ? 1 : 0, "verify");
                PcsOnboardingIdentityFragment pcsOnboardingIdentityFragment = this.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("show_entrance=");
                String showEntrance2 = this.LIZ.JS().DQ2().getShowEntrance();
                if (showEntrance2 == null) {
                    showEntrance2 = "";
                }
                sbLIZ2.append(showEntrance2);
                pcsOnboardingIdentityFragment.QS(R.id.pl2, R.id.a3f, null, null, C2188811AlT.LIZIZ(sbLIZ2));
            }
        })));
        return c500060JjI;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final void VS() {
        super.VS();
        String showEntrance = JS().DQ2().getShowEntrance();
        boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LJ(JS().EQ2())));
        C1824200xZS.LJIIIIZZ(zLJJJI ? 1 : 0, "click", C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZLLL(JS().EQ2()))) ? 1 : 0, showEntrance, JS().LQ2(), C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZ(JS().EQ2()))) ? 1 : 0, "close");
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.ability.IPcsOnboardingBottomFunctionAbility
    public final void iR() {
        PcsOnboardingStepFragment.iT(this, JS().LLILZLL != -1);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLLFFI) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingIdentitySelectionPage onDestroy show_entrance=");
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
        sbLIZ2.append("OnboardingIdentitySelectionPage onDestroyView show_entrance=");
        String showEntrance2 = JS().DQ2().getShowEntrance();
        sbLIZ2.append(showEntrance2 != null ? showEntrance2 : "");
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLLFFI) {
            return;
        }
        int i = JS().LLILZLL;
        if (i >= 0 && i < this.LLLIILIL.size() && !((C1783010wV1) ListProtector.get(this.LLLIILIL, i)).LJ) {
            int i2 = 0;
            for (C1783010wV1 c1783010wV1 : this.LLLIILIL) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                c1783010wV1.LJ = i2 == i;
                i2 = i3;
            }
            AbstractC21673619ry adapter = wS().LLJJJIL.getAdapter();
            if (adapter != null) {
                adapter.notifyItemChanged(i, "PAYLOAD_SELECT");
            }
        }
        iR();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final String FS() {
        return this.LLLIIL;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final int zS() {
        return this.LLLIIIL;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final void initView(View view) {
        super.initView(view);
        wS().LLJJJJ.setText(getString(2131855947));
        wS().LLJJJIL.setLayoutManager(new LinearLayoutManager(view.getContext()));
        this.LLLIILIL = C1697810uHb.LJIIJJI(new C1783010wV1("ttlive_pcs_onboarding_individual.png", getString(2131855948), getString(2131855949)), new C1783010wV1("ttlive_pcs_onboarding_enterprise.png", getString(2131855945), getString(2131855946)));
        wS().LLJJJIL.setAdapter(new C1824150xZN(this.LLLIILIL, new C1824120xZK(this)));
        AbstractC21673719rz itemAnimator = wS().LLJJJIL.getItemAnimator();
        if (itemAnimator instanceof AbstractC21674919sB) {
            ((AbstractC21674919sB) itemAnimator).LLIZ = false;
        }
        C1824670xaD.LIZIZ(wS().LLJJJIL, new C343110Dcj(12));
        iR();
        C1824200xZS.LJIIIIZZ(C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LJ(JS().EQ2()))) ? 1 : 0, "show", C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZLLL(JS().EQ2()))) ? 1 : 0, JS().DQ2().getShowEntrance(), JS().LQ2(), C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZ(JS().EQ2()))) ? 1 : 0, "");
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.LJ(new C0KBP(this.LLJLLL));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingIdentitySelectionPage perf.onShowSuccess show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        String str = "";
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("OnboardingIdentitySelectionPage initView show_entrance=");
        String showEntrance2 = JS().DQ2().getShowEntrance();
        if (showEntrance2 != null) {
            str = showEntrance2;
        }
        sbLIZ2.append(str);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        JS().LJJJJL();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.LLLFFI) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnboardingIdentitySelectionPage onCreate show_entrance=");
        String showEntrance = JS().DQ2().getShowEntrance();
        String str = "";
        if (showEntrance == null) {
            showEntrance = "";
        }
        sbLIZ.append(showEntrance);
        C1121890fIh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C517510KRh c517510KRh = new C517510KRh(this.LLJLLL, JS().DQ2().getShowEntrance(), this.LLLIL);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("show_entrance=");
        String showEntrance2 = JS().DQ2().getShowEntrance();
        if (showEntrance2 != null) {
            str = showEntrance2;
        }
        sbLIZ2.append(str);
        ZS("OnboardingIdentitySelectionPage", c517510KRh, C2188811AlT.LIZIZ(sbLIZ2));
    }
}

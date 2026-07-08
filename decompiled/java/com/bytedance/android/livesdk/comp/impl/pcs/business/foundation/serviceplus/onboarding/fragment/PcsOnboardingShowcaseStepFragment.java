package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment;

import X.C0JLW;
import X.C1122150fJ7;
import X.C1159004g8;
import X.C1411040mp4;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1824200xZS;
import X.C500260Jjc;
import X.C723850SaN;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.ability.IPcsOnboardingShowcaseAbility;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public abstract class PcsOnboardingShowcaseStepFragment extends PcsOnboardingStatefulStepFragment implements IPcsOnboardingShowcaseAbility {
    public final boolean LLLIILIL = true;

    public final String qT() {
        String strLIZJ = C0JLW.LIZJ(null);
        return strLIZJ == null ? "" : strLIZJ;
    }

    public String sT() {
        return null;
    }

    public int uT() {
        return 0;
    }

    public final String zT(int i) {
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

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment
    public void pT() {
        C723850SaN.LIZ(this, false, null, new C1159004g8(this), 3);
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public void VS() {
        super.VS();
        vT("back");
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final void eT() {
        super.eT();
        vT("close");
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.LLLFFI) {
            return;
        }
        C1558520qew.LJIIJJI(C1558360qeg.LJFF(this, null), IPcsOnboardingShowcaseAbility.class, null);
    }

    public void xT() {
        String strST = sT();
        if (strST == null) {
            return;
        }
        String showEntrance = JS().DQ2().getShowEntrance();
        boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LJ(JS().EQ2())));
        String strLQ2 = JS().LQ2();
        boolean zLJJJI2 = C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZLLL(JS().EQ2())));
        boolean zLJJJI3 = C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZ(JS().EQ2())));
        C1824200xZS.LJ("show", showEntrance, zLJJJI ? 1 : 0, strLQ2, zLJJJI2 ? 1 : 0, zLJJJI3 ? 1 : 0, JS().LLJJIJIIJIL, ((ArrayList) C1411040mp4.LIZIZ(JS().getState().LLILZIL)).size(), uT(), strST, C500260Jjc.LJJJI(Boolean.valueOf(JS().LLJJJ)) ? 1 : 0, "");
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final boolean HS() {
        return this.LLLIILIL;
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStatefulStepFragment, com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment
    public final void initView(View view) {
        super.initView(view);
        xT();
    }

    @Override // com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.onboarding.fragment.PcsOnboardingStepFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.LLLFFI) {
            return;
        }
        C1558520qew.LJII(C1558360qeg.LJFF(this, null), this, IPcsOnboardingShowcaseAbility.class, null, null);
    }

    public final List<String> rT(int i) {
        switch (i) {
            case 1:
                return C1697810uHb.LJIIJJI(getString(2131856349), getString(2131856354), getString(2131856350));
            case 2:
                return C1697810uHb.LJIIJJI(getString(2131856351), getString(2131856352), getString(2131856353));
            case 3:
                return C1697810uHb.LJIIJJI(getString(2131856347), getString(2131856348), getString(2131856354));
            case 4:
                return C1697810uHb.LJIIJJI(getString(2131856358), getString(2131856359), getString(2131856354));
            case 5:
                return C1697810uHb.LJIIJJI(getString(2131856360), getString(2131856354), getString(2131856361));
            case 6:
                return C1697810uHb.LJIIJJI(getString(2131856355), getString(2131856356), getString(2131856357));
            default:
                return C1697810uHb.LJIIJJI(getString(2131856362), getString(2131856363), getString(2131856364));
        }
    }

    public void vT(String str) {
        String strST = sT();
        if (strST == null) {
            return;
        }
        String showEntrance = JS().DQ2().getShowEntrance();
        boolean zLJJJI = C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LJ(JS().EQ2())));
        String strLQ2 = JS().LQ2();
        boolean zLJJJI2 = C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZLLL(JS().EQ2())));
        boolean zLJJJI3 = C500260Jjc.LJJJI(Boolean.valueOf(C1122150fJ7.LIZ(JS().EQ2())));
        C1824200xZS.LJ("click", showEntrance, zLJJJI ? 1 : 0, strLQ2, zLJJJI2 ? 1 : 0, zLJJJI3 ? 1 : 0, JS().LLJJIJIIJIL, ((ArrayList) C1411040mp4.LIZIZ(JS().getState().LLILZIL)).size(), uT(), strST, C500260Jjc.LJJJI(Boolean.valueOf(JS().LLJJJ)) ? 1 : 0, str);
    }
}

package com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary;

import X.C01GW;
import X.C01VC;
import X.C0R45;
import X.C23250099c;
import X.C452501pT;
import X.C684940Qto;
import X.C786410Ut5;
import X.InterfaceC684740QtU;
import Y.ATListenerS444S0100000_10;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.pages.result.pov.landingpage.ui.IPovLandingPageFragmentAbility;
import com.zhiliaoapp.musically.R;
import irm.AkS82S0100000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class FoldableSectionHeaderAssem extends SearchMultiSummaryBaseAssem<C684940Qto> {
    public TuxTextView LLJLLL;
    public ImageView LLJZ;
    public View LLJZIJLIL;
    public final C01GW LLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 653));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS554S0100000_10(this, 652));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ey9;
    }

    public final IPovLandingPageFragmentAbility Ap() {
        return (IPovLandingPageFragmentAbility) this.LLLF.getValue();
    }

    public final void Bp(boolean z) {
        float f;
        ImageView imageView = this.LLJZ;
        if (imageView != null) {
            if (z) {
                f = 0.0f;
            } else {
                f = 180.0f;
            }
            C786410Ut5.Cb(imageView, f);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C01VC(z, this, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.SearchMultiSummaryBaseAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        view.addOnAttachStateChangeListener(new C0R45(this, 15));
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.SearchMultiSummaryBaseAssem
    public final void sp(InterfaceC684740QtU interfaceC684740QtU) {
        boolean zLJFF;
        Boolean boolValueOf;
        C684940Qto c684940Qto = (C684940Qto) interfaceC684740QtU;
        TuxTextView tuxTextView = this.LLJLLL;
        if (tuxTextView != null) {
            tuxTextView.setText(c684940Qto.LLILLJJLI);
        }
        String str = c684940Qto.LL;
        if (str != null) {
            IPovLandingPageFragmentAbility iPovLandingPageFragmentAbilityAp = Ap();
            if (iPovLandingPageFragmentAbilityAp != null) {
                boolValueOf = Boolean.valueOf(iPovLandingPageFragmentAbilityAp.MQ1(str));
            } else {
                boolValueOf = null;
            }
            zLJFF = Intrinsics.LJFF(boolValueOf, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        Bp(zLJFF);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.SearchMultiSummaryBaseAssem
    public final void tp(View view) {
        this.LLJLLL = (TuxTextView) view.findViewById(R.id.title);
        this.LLJZ = (ImageView) view.findViewById(R.id.dr_);
        this.LLJZIJLIL = view.findViewById(R.id.fz3);
        view.setOnTouchListener(new ATListenerS444S0100000_10(this, 6));
        C786410Ut5.I7(new AkS82S0100000_10(this, 2), view);
    }
}

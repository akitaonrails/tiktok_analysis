package com.ss.android.ugc.aweme.poi.reviews.landing.ui;

import X.C019F;
import X.C13LE;
import X.C1637806bA;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsLandingViewModel;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS454S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewsStatusAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final AssemVMLazy LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiReviewsStatusAssem.class, "contentVM", "getContentVM()Lcom/ss/android/ugc/aweme/poi/reviews/landing/viewmodel/PoiReviewsLandingViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiReviewsStatusAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiReviewsLandingViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1845), AFwS256S0000000_18.get$arr$(597), null, true);
    }

    public final PoiReviewsLandingViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        return (PoiReviewsLandingViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C1749280vcc c1749280vcc;
        super.onViewCreated(view);
        if ((view instanceof C1749280vcc) && (c1749280vcc = (C1749280vcc) view) != null) {
            C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0h5p
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1190280h50) obj).LLILZ;
                }
            }, null, new AwS454S0200000_18(c1749280vcc, this, 17), 6);
        }
    }
}

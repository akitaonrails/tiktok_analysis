package com.ss.android.ugc.aweme.poi.reviews.tab.ui;

import X.C019F;
import X.C1190270h4z;
import X.C13LE;
import X.C1637806bA;
import X.C1749280vcc;
import X.C1913380ztI;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.tab.viewmodel.PoiCommentReviewListVM;
import java.util.List;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS454S0200000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiCommentReviewStatusAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final AssemVMLazy LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiCommentReviewStatusAssem.class, "contentVM", "getContentVM()Lcom/ss/android/ugc/aweme/poi/reviews/tab/viewmodel/PoiCommentReviewListVM;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiCommentReviewStatusAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiCommentReviewListVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1987), AFwS256S0000000_18.get$arr$(630), null, true);
    }

    public final PoiCommentReviewListVM Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        return (PoiCommentReviewListVM) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Ho(C1749280vcc c1749280vcc) {
        Boolean boolValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StatusAssem - onSuccess, listItemState is Empty: ");
        List<PoiReviewsApi.PoiReviewModel> list = ((C1190270h4z) Go().getState()).LLJIJIL.LLILZ;
        if (list != null) {
            boolValueOf = Boolean.valueOf(list.isEmpty());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        List<PoiReviewsApi.PoiReviewModel> list2 = ((C1190270h4z) Go().getState()).LLJIJIL.LLILZ;
        if (list2 != null && list2.isEmpty()) {
            if (c1749280vcc != null) {
                C1913380ztI.LLILLJJLI.setStatusView(c1749280vcc, "review_list_page", new AwS562S0100000_18(this, 1984), new Exception());
            }
            C786410Ut5.LLLZLZ(c1749280vcc, 0);
            return;
        }
        C786410Ut5.LLLZLZ(c1749280vcc, 8);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C1749280vcc c1749280vcc;
        super.onViewCreated(view);
        if ((view instanceof C1749280vcc) && (c1749280vcc = (C1749280vcc) view) != null) {
            AssemViewModel.asyncSubscribe$default(Go(), new C2217381BqS() { // from class: X.0hCV
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    C1190270h4z c1190270h4z = (C1190270h4z) obj;
                    c1190270h4z.getClass();
                    return C627260Oiy.LIZLLL(c1190270h4z);
                }
            }, null, new AwS384S0200000_18(c1749280vcc, this, 149), new AwS562S0100000_18(c1749280vcc, 1986), new AwS384S0200000_18(c1749280vcc, this, 150), 2, null);
            C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0hCU
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1190270h4z) obj).LLJIJIL;
                }
            }, null, new AwS454S0200000_18(c1749280vcc, this, 19), 6);
        }
    }
}

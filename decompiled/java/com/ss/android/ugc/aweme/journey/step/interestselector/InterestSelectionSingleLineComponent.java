package com.ss.android.ugc.aweme.journey.step.interestselector;

import X.C10R1;
import X.C1911410zq7;
import X.C19245310Qx;
import X.C19245810Rc;
import X.C2188811AlT;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes29.dex */
public class InterestSelectionSingleLineComponent extends InterestSelectionComponentRevampV1 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zi8jPD09LTxiOjs2OGslJzs2OiA/PTHELIOSw2JCAvPSAhZgwiPSohLTY4Gio/LSY4ICA9GywiLiM2BCwiLAw8JTUjJyo9PA==";

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.InterestSelectionComponentRevampV1, com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent
    public final RecyclerView.LayoutManager dS() {
        RecyclerView recyclerView = this.LLJLLL;
        return new LinearLayoutManager(recyclerView != null ? recyclerView.getContext() : null);
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent
    public final int gS() {
        RecyclerView recyclerView = this.LLJLLL;
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
            }
        }
        return super.gS();
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.InterestSelectionComponentRevampV1, com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent, com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment
    public final String RR() {
        return RS().LIZ("show_emoji", false) ? "single_line_emoji" : "single_line";
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.InterestSelectionComponentRevampV1, com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent
    public final C10R1 cS() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("creating SingleLineAdapter, showEmoji=");
        sbLIZ.append(RS().LIZ("show_emoji", false));
        C1911410zq7.LIZ("IS_SingleLine", C2188811AlT.LIZIZ(sbLIZ));
        return new C19245310Qx(nS(), this.LLLLIILL, this.LLJL, this.LLLIIL, RS().LIZ("show_emoji", false));
    }

    @Override // com.ss.android.ugc.aweme.journey.step.interestselector.InterestSelectionComponentRevampV1, com.ss.android.ugc.aweme.journey.step.interestselector.BaseInterestSelectionComponent
    public final void NS(C19245810Rc c19245810Rc) {
        this.LLLILZJ = Boolean.valueOf(RS().LIZ("show_emoji", false));
    }
}

package com.ss.android.ugc.aweme.poi.reviews.tab.ui;

import X.C019F;
import X.C01GW;
import X.C108500b5;
import X.C1161980gLM;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C452501pT;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.poi.reviews.tab.adapter.PoiCommentReviewCellVAbility;
import com.ss.android.ugc.aweme.poi.reviews.tab.viewmodel.PoiCommentReviewListVM;
import com.ss.android.ugc.aweme.tux.business.powerlist.LoadingFooterCell;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiReviewPanelAssem extends UIListContentAssem<PoiCommentReviewListVM> implements PoiCommentReviewCellVAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C1161980gLM LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PoiReviewPanelAssem.class, "contentVM", "getContentVM()Lcom/ss/android/ugc/aweme/poi/reviews/tab/viewmodel/PoiCommentReviewListVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public PoiReviewPanelAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PoiCommentReviewListVM.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 1991), AFwS256S0000000_18.get$arr$(631), null, true);
        this.LLJ = C452501pT.LIZIZ(new AwS562S0100000_18(this, 1988));
        this.LLJI = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(507));
        this.LLJIJIL = new C1161980gLM("poi_reviews_comment", new AwS562S0100000_18(this, 1989), AFwS206S0000000_18.get$arr$(508), AFwS206S0000000_18.get$arr$(509));
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJ.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = true;
        c20603715jn.LIZLLL = LoadingFooterCell.class;
        int iIntValue = ((Number) C108500b5.LIZ.getValue()).intValue();
        if (iIntValue < 0) {
            iIntValue = 0;
        }
        c20603715jn.LIZ = iIntValue;
        return c20603715jn;
    }

    public final PoiCommentReviewListVM Lo() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (PoiCommentReviewListVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final AssemListViewModel Jo() {
        return Lo();
    }

    @Override // com.ss.android.ugc.aweme.poi.reviews.tab.adapter.PoiCommentReviewCellVAbility
    public final PoiCommentReviewListVM jM2() {
        return Lo();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C1161980gLM c1161980gLM = this.LLJIJIL;
        RecyclerView recyclerView = c1161980gLM.LJI;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(c1161980gLM.LJII);
        }
        c1161980gLM.LJI = null;
        c1161980gLM.LJFF = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00fb  */
    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.reviews.tab.ui.PoiReviewPanelAssem.onViewCreated(android.view.View):void");
    }
}

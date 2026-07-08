package com.ss.android.ugc.aweme.repostfeed.ui;

import X.C019F;
import X.C1156580gCe;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723590SZx;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.repostfeed.feed.RepostFeedPanel;
import com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedViewModel;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class RepostFeedContentAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public RepostFeedPanel LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RepostFeedContentAssem.class, "feedVM", "getFeedVM()Lcom/ss/android/ugc/aweme/repostfeed/viewmodel/RepostFeedViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public RepostFeedContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RepostFeedViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS562S0100000_18(c19719912DlLIZ, 2186), AFwS264S0000000_24.get$arr$(265), null, true);
        this.LLJ = new C1559260qg8(new C723590SZx(this, C1156580gCe.class, null), checkSupervisorPrepared());
    }

    public final RepostFeedViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (RepostFeedViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJI = ((C1156580gCe) this.LLJ.getValue()).LL;
        AssemViewModel.asyncSubscribe$default(Go(), new C2217381BqS() { // from class: X.0rpq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1567630qtd) obj).getRefreshState();
            }
        }, null, new AwS603S0100000_24(this, 183), new AwS568S0100000_24(this, 885), new AwS603S0100000_24(this, 184), 2, null);
        AssemViewModel.asyncSubscribe$default(Go(), new C2217381BqS() { // from class: X.0rpr
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1567630qtd) obj).getLoadMoreState();
            }
        }, null, new AwS603S0100000_24(this, 185), new AwS568S0100000_24(this, 886), new AwS603S0100000_24(this, 186), 2, null);
        Go().refresh();
    }
}

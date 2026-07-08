package com.ss.android.ugc.aweme.topicfeed.ui;

import X.C019F;
import X.C1156600gCg;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723590SZx;
import X.C724750Sbp;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.topicfeed.panel.TopicFeedFragmentPanel;
import com.ss.android.ugc.aweme.topicfeed.vm.TopicFeedListViewModel;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class TopicFeedContentAssem extends UIContentAssem implements ITopicContentAssemAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public TopicFeedFragmentPanel LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TopicFeedContentAssem.class, "contentVM", "getContentVM()Lcom/ss/android/ugc/aweme/topicfeed/vm/TopicFeedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TopicFeedContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TopicFeedListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1390), AFwS264S0000000_24.get$arr$(475), null, true);
        this.LLJ = new C1559260qg8(new C723590SZx(this, C1156600gCg.class, null), checkSupervisorPrepared());
    }

    @Override // com.ss.android.ugc.aweme.topicfeed.ui.ITopicContentAssemAbility
    public final void K0() {
        this.LLJILJIL = false;
        TopicFeedFragmentPanel topicFeedFragmentPanel = this.LLJI;
        if (topicFeedFragmentPanel != null) {
            topicFeedFragmentPanel.l = this.LLJIJIL;
        }
        Go().manualListLoadMore(0L);
    }

    @Override // com.ss.android.ugc.aweme.topicfeed.ui.ITopicContentAssemAbility
    public final boolean LLLLL() {
        this.LLJIJIL = true;
        K0();
        return true;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.topicfeed.ui.ITopicContentAssemAbility
    public final void iu() {
        this.LLJILJIL = true;
        TopicFeedFragmentPanel topicFeedFragmentPanel = this.LLJI;
        if (topicFeedFragmentPanel != null) {
            topicFeedFragmentPanel.l = this.LLJIJIL;
        }
        ITopicToFYPAssemAbility iTopicToFYPAssemAbility = (ITopicToFYPAssemAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITopicToFYPAssemAbility.class, null);
        if (iTopicToFYPAssemAbility != null) {
            iTopicToFYPAssemAbility.L3();
        }
        Go().manualListRefresh();
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1351615169) {
            return null;
        }
        return this;
    }

    public final TopicFeedListViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (TopicFeedListViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.topicfeed.ui.ITopicContentAssemAbility
    public final boolean LJJJJI() {
        return ((Boolean) withState(Go(), AFwS264S0000000_24.get$arr$(474))).booleanValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.topicfeed.ui.ITopicContentAssemAbility
    public final boolean G6() {
        return this.LLJILJIL;
    }

    @Override // com.ss.android.ugc.aweme.topicfeed.ui.ITopicContentAssemAbility
    public final boolean g8() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.topicfeed.ui.ITopicContentAssemAbility
    public final boolean LLZLLIL(Aweme aweme) {
        return ((Boolean) withState(Go(), new AwS390S0200000_24(aweme, this, 50))).booleanValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        this.LLJI = ((C1156600gCg) this.LLJ.getValue()).LL;
        AssemViewModel.asyncSubscribe$default(Go(), new C2217381BqS() { // from class: X.0qtP
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1567610qtb) obj).getRefreshState();
            }
        }, null, new AwS603S0100000_24(this, 335), new AwS568S0100000_24(this, 1388), new AwS603S0100000_24(this, 336), 2, null);
        AssemViewModel.asyncSubscribe$default(Go(), new C2217381BqS() { // from class: X.0qtQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1567610qtb) obj).getLoadMoreState();
            }
        }, null, new AwS603S0100000_24(this, 337), new AwS568S0100000_24(this, 1389), new AwS603S0100000_24(this, 338), 2, null);
        iu();
    }
}

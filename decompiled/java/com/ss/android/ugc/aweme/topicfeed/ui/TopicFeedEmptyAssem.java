package com.ss.android.ugc.aweme.topicfeed.ui;

import X.C019F;
import X.C1156600gCg;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723590SZx;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import Y.ACListenerS158S0100000_24;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.topicfeed.panel.TopicFeedFragmentPanel;
import com.ss.android.ugc.aweme.topicfeed.vm.TopicFeedListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class TopicFeedEmptyAssem extends UISlotAssem implements ITopicEmptyAssemAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJJI;
    public final C1559260qg8 LLJJIII;
    public TuxTextView LLJJIJI;
    public TopicFeedFragmentPanel LLJJIJIIJIL;
    public boolean LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TopicFeedEmptyAssem.class, "contentVM", "getContentVM()Lcom/ss/android/ugc/aweme/topicfeed/vm/TopicFeedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TopicFeedEmptyAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TopicFeedListViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1391), AFwS264S0000000_24.get$arr$(477), null, true);
        this.LLJJIII = new C1559260qg8(new C723590SZx(this, C1156600gCg.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fw0;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1771730259) {
            return null;
        }
        return this;
    }

    public final TopicFeedListViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return (TopicFeedListViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.topicfeed.ui.ITopicEmptyAssemAbility
    public final boolean Rr() {
        return this.LLJJIJIL;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        if (!(LJJIJL() instanceof FrameLayout)) {
            return;
        }
        this.LLJJIJIIJIL = ((C1156600gCg) this.LLJJIII.getValue()).LL;
        AssemViewModel.asyncSubscribe$default(hp(), new C2217381BqS() { // from class: X.0qtO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1567610qtb) obj).getRefreshState();
            }
        }, null, AFwS264S0000000_24.get$arr$(476), AFwS213S0000000_24.get$arr$(371), new AwS603S0100000_24(this, 339), 2, null);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.foa);
        this.LLJJIJI = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.LJJJJI(30.0f);
        }
        TuxTextView tuxTextView2 = this.LLJJIJI;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(hp().LLILZLL);
        }
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.cnc);
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS158S0100000_24(this, 91));
        }
        view.findViewById(R.id.ex3);
    }
}

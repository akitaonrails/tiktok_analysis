package com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.highlight;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C425620GmW;
import X.C452501pT;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C781710UlV;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS36S0200000_27;
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.ui.LiveReplayListFooterCell;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.GuideVM;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.NotificationBarVM;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.highlight.vm.HighlightListViewModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.highlight.vm.HighlightPlayControlVM;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.highlight.vm.SharedPlayerVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AFwS314S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class HighlightTabAssem extends ReusedUISlotAssem<HighlightTabAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 515));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 521));
    public final AssemVMLazy LLJLIL;
    public final AssemVMLazy LLJLILLLLZIIL;
    public final AssemVMLazy LLJLL;
    public final AssemVMLazy LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public C781710UlV LLJZIJLIL;
    public Long LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HighlightTabAssem.class, "listVM", "getListVM()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/replaylistv2/tabs/highlight/vm/HighlightListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(HighlightTabAssem.class, "playControlVM", "getPlayControlVM()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/replaylistv2/tabs/highlight/vm/HighlightPlayControlVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(HighlightTabAssem.class, "sharedPlayerVM", "getSharedPlayerVM()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/replaylistv2/tabs/highlight/vm/SharedPlayerVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(HighlightTabAssem.class, "notificationBarVM", "getNotificationBarVM()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/replaylistv2/NotificationBarVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(HighlightTabAssem.class, "guideVM", "getGuideVM()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/replaylistv2/GuideVM;", 0);
        c09r3.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    public HighlightTabAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(HighlightListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS571S0100000_27(c19719912DlLIZ, 516), AFwS269S0000000_27.get$arr$(115), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(HighlightPlayControlVM.class);
        this.LLJLILLLLZIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS571S0100000_27(c19719912DlLIZ2, 517), AFwS269S0000000_27.get$arr$(116), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(SharedPlayerVM.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS571S0100000_27(c19719912DlLIZ3, 518), AFwS269S0000000_27.get$arr$(117), null, true);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(NotificationBarVM.class);
        this.LLJLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new AwS571S0100000_27(c19719912DlLIZ4, 519), AFwS269S0000000_27.get$arr$(118), null, true);
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(GuideVM.class);
        this.LLJLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), c019f, c1637906bB, new AwS571S0100000_27(c19719912DlLIZ5, 520), AFwS269S0000000_27.get$arr$(114), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.dgx;
    }

    public final HighlightListViewModel op() {
        AssemVMLazy assemVMLazy = this.LLJLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLF;
        return (HighlightListViewModel) assemVMLazy.getValue();
    }

    public final HighlightPlayControlVM sp() {
        AssemVMLazy assemVMLazy = this.LLJLILLLLZIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLF;
        return (HighlightPlayControlVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        HighlightListViewModel highlightListViewModelOp = op();
        AssemVMLazy assemVMLazy = this.LLJLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLF;
        highlightListViewModelOp.LL = (NotificationBarVM) assemVMLazy.getValue();
        op().LLILLJJLI = (GuideVM) this.LLJLLIL.getValue();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJLIIIJLLLLLLLZ.getValue();
        viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C425620GmW(0, 0, 7));
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new StaggeredGridLayoutManager(2, 1));
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(HighLightItemCell.class);
        op().getConfig().LIZ.LIZLLL = LiveReplayListFooterCell.class;
        op().setListState(viewOnAttachStateChangeListenerC20604515jv.getState());
        viewOnAttachStateChangeListenerC20604515jv.LJIIL(op().getConfig());
        viewOnAttachStateChangeListenerC20604515jv.addOnScrollListener(new AsS36S0200000_27(this, viewOnAttachStateChangeListenerC20604515jv, 0));
        this.LLJZIJLIL = new C781710UlV(1, 0.0d, viewOnAttachStateChangeListenerC20604515jv, new AwS641S0100000_27(this, 22));
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0xrq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C612690O1j) obj).LL;
            }
        }, null, AFwS314S0000000_27.get$arr$(11), 6);
    }
}

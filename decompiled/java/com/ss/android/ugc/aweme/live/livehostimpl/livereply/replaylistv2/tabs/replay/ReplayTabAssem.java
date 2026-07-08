package com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.replay;

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
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.ui.LiveReplayListFooterCell;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.GuideVM;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.NotificationBarVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AFwS314S0000000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class ReplayTabAssem extends ReusedUISlotAssem<ReplayTabAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 527));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 531));
    public final AssemVMLazy LLJLIL;
    public final AssemVMLazy LLJLILLLLZIIL;
    public final AssemVMLazy LLJLL;
    public boolean LLJLLIL;
    public C781710UlV LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ReplayTabAssem.class, "listVM", "getListVM()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/replaylistv2/tabs/replay/ReplayListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ReplayTabAssem.class, "notificationBarVM", "getNotificationBarVM()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/replaylistv2/NotificationBarVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(ReplayTabAssem.class, "guideVM", "getGuideVM()Lcom/ss/android/ugc/aweme/live/livehostimpl/livereply/replaylistv2/GuideVM;", 0);
        c09r3.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public ReplayTabAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ReplayListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS571S0100000_27(c19719912DlLIZ, 528), AFwS269S0000000_27.get$arr$(125), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(NotificationBarVM.class);
        this.LLJLILLLLZIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS571S0100000_27(c19719912DlLIZ2, 529), AFwS269S0000000_27.get$arr$(126), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(GuideVM.class);
        this.LLJLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS571S0100000_27(c19719912DlLIZ3, 530), AFwS269S0000000_27.get$arr$(127), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.dgz;
    }

    public final ReplayListViewModel op() {
        AssemVMLazy assemVMLazy = this.LLJLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        return (ReplayListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        ReplayListViewModel replayListViewModelOp = op();
        AssemVMLazy assemVMLazy = this.LLJLILLLLZIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        replayListViewModelOp.LL = (NotificationBarVM) assemVMLazy.getValue();
        op().LLILLJJLI = (GuideVM) this.LLJLL.getValue();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJLIIIJLLLLLLLZ.getValue();
        viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C425620GmW(0, 6, 5));
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new StaggeredGridLayoutManager(2, 1));
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(ReplayItemCell.class);
        op().getConfig().LIZ.LIZLLL = LiveReplayListFooterCell.class;
        op().setListState(viewOnAttachStateChangeListenerC20604515jv.getState());
        viewOnAttachStateChangeListenerC20604515jv.LJIIL(op().getConfig());
        this.LLJLLL = new C781710UlV(1, 0.0d, viewOnAttachStateChangeListenerC20604515jv, new AwS641S0100000_27(this, 24));
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0xrp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C612730O1n) obj).LL;
            }
        }, null, AFwS314S0000000_27.get$arr$(13), 6);
    }
}

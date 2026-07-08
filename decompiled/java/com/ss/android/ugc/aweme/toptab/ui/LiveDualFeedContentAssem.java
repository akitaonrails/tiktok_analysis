package com.ss.android.ugc.aweme.toptab.ui;

import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C1637806bA;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C20603715jn;
import X.C2217381BqS;
import X.C452501pT;
import X.C481090Itn;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC481060Itk;
import X.InterfaceC2217461Bqa;
import X.InterfaceC336510DHd;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.toptab.vm.LiveDualFeedListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS138S1100000_24;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class LiveDualFeedContentAssem extends UIListContentAssem<LiveDualFeedListViewModel> implements InterfaceC336510DHd {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public C481090Itn LLIZLLLIL;
    public C1749280vcc LLJ;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 763));
    public boolean LLJIJIL;
    public final AssemVMLazy LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LiveDualFeedContentAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/toptab/vm/LiveDualFeedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public LiveDualFeedContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LiveDualFeedListViewModel.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 764), AFwS264S0000000_24.get$arr$(484), null, true);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        c20603715jn.LIZ = 4;
        c20603715jn.LIZLLL = LiveDualFeedFooterCell.class;
        c20603715jn.LJIIIZ = "Live";
        return c20603715jn;
    }

    public final C481090Itn Lo() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.t25) : null;
            this.LLIZLLLIL = (C481090Itn) viewFindViewById;
        }
        return (C481090Itn) viewFindViewById;
    }

    public final C1749280vcc No() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.w28) : null;
            this.LLJ = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Oo, reason: merged with bridge method [inline-methods] */
    public final LiveDualFeedListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (LiveDualFeedListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        Lo().setScrollMode(EnumC481060Itk.REFRESH);
        LiveDualFeedListViewModel liveDualFeedListViewModelJo = Jo();
        liveDualFeedListViewModelJo.withState(new AwS138S1100000_24(liveDualFeedListViewModelJo, "click_top_icon", 3));
        Lo().setOnRefreshListener(new AwS568S0100000_24(this, 1400));
        C736680Sv4.LJIIIIZZ(this, Jo(), new C2217381BqS() { // from class: X.0rHy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1581070rFJ) obj).LL;
            }
        }, null, new AwS638S0100000_24(this, 115), 6);
        AssemViewModel.asyncSubscribe$default(Jo(), new C2217381BqS() { // from class: X.0rHx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C1581070rFJ c1581070rFJ = (C1581070rFJ) obj;
                c1581070rFJ.getClass();
                return C627260Oiy.LIZLLL(c1581070rFJ);
            }
        }, null, new AwS603S0100000_24(this, 352), new AwS568S0100000_24(this, 1401), new AwS603S0100000_24(this, 353), 2, null);
    }
}

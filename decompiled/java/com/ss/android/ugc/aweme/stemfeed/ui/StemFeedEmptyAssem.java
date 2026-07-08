package com.ss.android.ugc.aweme.stemfeed.ui;

import X.C019F;
import X.C1156590gCf;
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
import com.ss.android.ugc.aweme.stemfeed.panel.StemFeedFragmentPanel;
import com.ss.android.ugc.aweme.stemfeed.vm.StemFeedListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class StemFeedEmptyAssem extends UISlotAssem implements IStemEmptyAssemAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final AssemVMLazy LLJJI;
    public final C1559260qg8 LLJJIII;
    public C197039127h LLJJIJI;
    public StemFeedFragmentPanel LLJJIJIIJIL;
    public boolean LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StemFeedEmptyAssem.class, "contentVM", "getContentVM()Lcom/ss/android/ugc/aweme/stemfeed/vm/StemFeedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public StemFeedEmptyAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StemFeedListViewModel.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1155), AFwS264S0000000_24.get$arr$(390), null, true);
        this.LLJJIII = new C1559260qg8(new C723590SZx(this, C1156590gCf.class, null), checkSupervisorPrepared());
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.faa;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -536348941) {
            return null;
        }
        return this;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.stemfeed.ui.IStemEmptyAssemAbility
    public final boolean Rr() {
        return this.LLJJIJIL;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        if (!(LJJIJL() instanceof FrameLayout)) {
            return;
        }
        this.LLJJIJIIJIL = ((C1156590gCf) this.LLJJIII.getValue()).LL;
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        AssemViewModel.asyncSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0qtN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1567600qta) obj).getRefreshState();
            }
        }, null, AFwS264S0000000_24.get$arr$(389), AFwS213S0000000_24.get$arr$(349), new AwS603S0100000_24(this, 290), 2, null);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.foa);
        if (tuxTextView != null) {
            tuxTextView.LJJJJI(30.0f);
        }
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.cnc);
        this.LLJJIJI = c197039127h;
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS158S0100000_24(this, 87));
        }
        view.findViewById(R.id.ex3);
    }
}

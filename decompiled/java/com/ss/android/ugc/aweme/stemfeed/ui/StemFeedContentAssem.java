package com.ss.android.ugc.aweme.stemfeed.ui;

import X.C019F;
import X.C1156590gCf;
import X.C1204000hR8;
import X.C13LE;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723590SZx;
import X.C724750Sbp;
import X.EnumC1593290rZ1;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.spi.TabSwitchMetricService;
import com.ss.android.ugc.aweme.stemfeed.panel.StemFeedFragmentPanel;
import com.ss.android.ugc.aweme.stemfeed.vm.StemFeedListViewModel;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class StemFeedContentAssem extends UIContentAssem implements IStemContentAssemAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public StemFeedFragmentPanel LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StemFeedContentAssem.class, "contentVM", "getContentVM()Lcom/ss/android/ugc/aweme/stemfeed/vm/StemFeedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public StemFeedContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StemFeedListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1154), AFwS264S0000000_24.get$arr$(388), null, true);
        this.LLJ = new C1559260qg8(new C723590SZx(this, C1156590gCf.class, null), checkSupervisorPrepared());
    }

    @Override // com.ss.android.ugc.aweme.stemfeed.ui.IStemContentAssemAbility
    public final void K0() {
        this.LLJILJIL = false;
        StemFeedFragmentPanel stemFeedFragmentPanel = this.LLJI;
        if (stemFeedFragmentPanel != null) {
            stemFeedFragmentPanel.l = this.LLJIJIL;
        }
        Go().manualListLoadMore(0L);
    }

    @Override // com.ss.android.ugc.aweme.stemfeed.ui.IStemContentAssemAbility
    public final boolean LLLLL() {
        this.LLJIJIL = true;
        K0();
        return true;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.stemfeed.ui.IStemContentAssemAbility
    public final void iu() {
        this.LLJILJIL = true;
        StemFeedFragmentPanel stemFeedFragmentPanel = this.LLJI;
        if (stemFeedFragmentPanel != null) {
            stemFeedFragmentPanel.l = this.LLJIJIL;
        }
        IStemToFYPAssemAbility iStemToFYPAssemAbility = (IStemToFYPAssemAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IStemToFYPAssemAbility.class, null);
        if (iStemToFYPAssemAbility != null) {
            iStemToFYPAssemAbility.L3();
        }
        Go().manualListRefresh();
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1082365663) {
            return null;
        }
        return this;
    }

    public final StemFeedListViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (StemFeedListViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.stemfeed.ui.IStemContentAssemAbility
    public final boolean LJJJJI() {
        return ((Boolean) withState(Go(), AFwS264S0000000_24.get$arr$(387))).booleanValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.aweme.stemfeed.ui.IStemContentAssemAbility
    public final boolean G6() {
        return this.LLJILJIL;
    }

    @Override // com.ss.android.ugc.aweme.stemfeed.ui.IStemContentAssemAbility
    public final boolean g8() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.stemfeed.ui.IStemContentAssemAbility
    public final boolean LLZLLIL(Aweme aweme) {
        return ((Boolean) withState(Go(), new AwS390S0200000_24(aweme, this, 42))).booleanValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        this.LLJI = ((C1156590gCf) this.LLJ.getValue()).LL;
        AssemViewModel.asyncSubscribe$default(Go(), new C2217381BqS() { // from class: X.0qtX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1567600qta) obj).getRefreshState();
            }
        }, null, new AwS603S0100000_24(this, 286), new AwS568S0100000_24(this, 1152), new AwS603S0100000_24(this, 287), 2, null);
        AssemViewModel.asyncSubscribe$default(Go(), new C2217381BqS() { // from class: X.0qtY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1567600qta) obj).getLoadMoreState();
            }
        }, null, new AwS603S0100000_24(this, 288), new AwS568S0100000_24(this, 1153), new AwS603S0100000_24(this, 289), 2, null);
        iu();
        TabSwitchMetricService.LIZ.getClass();
        TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
        if (tabSwitchMetricServiceLIZ != null) {
            tabSwitchMetricServiceLIZ.LJIIJ("Stem", EnumC1593290rZ1.VIDEO);
        }
    }
}

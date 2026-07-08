package com.ss.android.ugc.aweme.toplive.assem;

import X.C019F;
import X.C01GW;
import X.C0A5A;
import X.C1161920gLG;
import X.C13LE;
import X.C13LQ;
import X.C1637806bA;
import X.C1697810uHb;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C19EG;
import X.C20603715jn;
import X.C2217381BqS;
import X.C452501pT;
import X.C481090Itn;
import X.C482710IwP;
import X.C724240Sb0;
import X.C724750Sbp;
import X.EnumC471720Ieg;
import X.EnumC471750Iej;
import X.EnumC482480Iw2;
import X.InterfaceC2217461Bqa;
import X.InterfaceC336510DHd;
import X.InterfaceC476860Imy;
import X.InterfaceC482720IwQ;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.livesdk.feed.skylight.CommonSkylightDataManager;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.ss.android.ugc.aweme.toplive.cell.ToplivePagePowerCell;
import com.ss.android.ugc.aweme.toplive.vm.ToplivePageListViewModel;
import com.ss.android.ugc.aweme.toptab.ui.LiveDualFeedFooterCell;
import java.util.List;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class ToplivePageContentAssem extends UIListContentAssem<ToplivePageListViewModel> implements InterfaceC336510DHd {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 531));
    public final AssemVMLazy LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public C482710IwP LLJILJIL;
    public long LLJILJILJ;
    public boolean LLJILLL;
    public InterfaceC476860Imy LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ToplivePageContentAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/toplive/vm/ToplivePageListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ToplivePageContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ToplivePageListViewModel.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 870), AFwS237S0000000_7.get$arr$(235), null, true);
        this.LLJI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 535));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 534));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final ViewOnAttachStateChangeListenerC20604515jv Go() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public final C20603715jn Ho() {
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        c20603715jn.LIZ = 4;
        c20603715jn.LIZLLL = LiveDualFeedFooterCell.class;
        return c20603715jn;
    }

    public final C481090Itn Lo() {
        return (C481090Itn) this.LLJIJIL.getValue();
    }

    public final C1749280vcc No() {
        return (C1749280vcc) this.LLJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* JADX INFO: renamed from: Oo, reason: merged with bridge method [inline-methods] */
    public final ToplivePageListViewModel Jo() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (ToplivePageListViewModel) assemVMLazy.getValue();
    }

    public final void So() {
        InterfaceC476860Imy interfaceC476860Imy = this.LLJJ;
        if (interfaceC476860Imy == null) {
            ((ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class)).zX1();
            interfaceC476860Imy = CommonSkylightDataManager.LIZ;
            interfaceC476860Imy.LJIJ(EnumC471750Iej.ENTER_TOPLIVE_PAGE);
            this.LLJJ = interfaceC476860Imy;
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            interfaceC476860Imy.LJIIJJI(c19egLIZ, true, EnumC471720Ieg.TOP_LIVE);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C482710IwP c482710IwP = this.LLJILJIL;
        if (c482710IwP != null) {
            c482710IwP.LLILLJJLI = false;
            c482710IwP.LL.removeOnScrollListener(c482710IwP);
            c482710IwP.LL.removeOnChildAttachStateChangeListener(c482710IwP);
        }
        InterfaceC476860Imy interfaceC476860Imy = this.LLJJ;
        if (interfaceC476860Imy != null) {
            interfaceC476860Imy.LJII();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        C482710IwP c482710IwP = this.LLJILJIL;
        if (c482710IwP != null && c482710IwP.LLILLJJLI) {
            c482710IwP.LLILLL = false;
            InterfaceC482720IwQ interfaceC482720IwQ = c482710IwP.LLIZ;
            if (interfaceC482720IwQ != null) {
                interfaceC482720IwQ.LJJL();
            }
        }
        this.LLJILJILJ = System.currentTimeMillis();
        InterfaceC476860Imy interfaceC476860Imy = this.LLJJ;
        if (interfaceC476860Imy != null) {
            interfaceC476860Imy.LJII();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        ToplivePagePowerCell toplivePagePowerCell;
        super.onResume();
        C482710IwP c482710IwP = this.LLJILJIL;
        if (c482710IwP != null) {
            c482710IwP.onResume();
        }
        if (this.LLJILJILJ > 0) {
            if (System.currentTimeMillis() - this.LLJILJILJ > ((Number) C0A5A.LIZ.getValue()).longValue()) {
                ToplivePageListViewModel toplivePageListViewModelIp = ip();
                toplivePageListViewModelIp.withState(new AwS373S0200000_7(toplivePageListViewModelIp, (ToplivePageListViewModel) C1697810uHb.LJ("follow_window", "hangout"), (List<String>) 95));
            }
            this.LLJILJILJ = 0L;
        }
        RecyclerView.LayoutManager layoutManager = Go().getLayoutManager();
        if ((layoutManager instanceof StaggeredGridLayoutManager) && (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager) != null) {
            int[] iArrLJIJ = staggeredGridLayoutManager.LJIJ(null);
            int[] iArrLJIJJ = staggeredGridLayoutManager.LJIJJ(null);
            Integer numLJJJJLL = C13LQ.LJJJJLL(iArrLJIJ);
            int iIntValue = numLJJJJLL != null ? numLJJJJLL.intValue() : -1;
            Integer numLJJJJJL = C13LQ.LJJJJJL(iArrLJIJJ);
            int iIntValue2 = numLJJJJJL != null ? numLJJJJJL.intValue() : -1;
            if (iIntValue <= iIntValue2) {
                while (true) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForLayoutPosition = Go().findViewHolderForLayoutPosition(iIntValue);
                    if ((viewHolderFindViewHolderForLayoutPosition instanceof ToplivePagePowerCell) && (toplivePagePowerCell = (ToplivePagePowerCell) viewHolderFindViewHolderForLayoutPosition) != null) {
                        toplivePagePowerCell.L5();
                    }
                    if (iIntValue == iIntValue2) {
                        break;
                    } else {
                        iIntValue++;
                    }
                }
            }
        }
        if (this.LLJILLL) {
            So();
        }
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ip().wQ2(EnumC482480Iw2.INIT);
        AssemViewModel.asyncSubscribe$default(ip(), new C2217381BqS() { // from class: X.0IwN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C482550Iw9 c482550Iw9 = (C482550Iw9) obj;
                c482550Iw9.getClass();
                return C627260Oiy.LIZLLL(c482550Iw9);
            }
        }, this, null, new AwS586S0100000_7(this, 312), new AwS551S0100000_7(this, 532), new AwS586S0100000_7(this, 313), 4, null);
        Lo().setOnRefreshListener(new AwS551S0100000_7(this, 533));
    }
}

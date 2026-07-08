package com.ss.android.ugc.aweme.ecommerce.ug.trending.page;

import X.AbstractC21673619ry;
import X.C019F;
import X.C06WM;
import X.C08J8;
import X.C0VWN;
import X.C1309620kBU;
import X.C1390410mHn;
import X.C13LE;
import X.C13LP;
import X.C1637806bA;
import X.C1775690wJD;
import X.C19719912Dl;
import X.C20600815jK;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C637920P0k;
import X.C724750Sbp;
import X.C736680Sv4;
import X.EnumC476430ImH;
import X.EnumC585200MxK;
import X.InterfaceC1742830vSD;
import X.InterfaceC1742850vSF;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.ARunnableS95S0200000_26;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.feedtitle.view.ECTrendingFeedTitleCell;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.follow.view.ECAuctionFollowCell;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.live.view.ECTrendingLiveCell;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.loading.ECTrendingListFooterCell;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.loading.ECTrendingNoMoreItemCell;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.video.view.ECTrendingVideoCell;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.voucher.view.ECTrendingVoucherCell;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.vm.TrendingListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS267S0000000_26;
import kotlin.jvm.internal.AwS303S0300000_26;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS640S0100000_26;

/* JADX INFO: loaded from: classes27.dex */
public final class ECTrendingListAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final AssemVMLazy LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJILJIL;
    public int LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ECTrendingListAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/ug/trending/list/vm/TrendingListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ECTrendingListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TrendingListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 357), AFwS264S0000000_24.get$arr$(103), null, true);
        this.LLJ = -1;
        this.LLJI = -1;
        this.LLJIJIL = -1;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final TrendingListViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (TrendingListViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        Ho().wQ2().pause();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        Jo(this.LLJ, true);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.gho);
        this.LLJILJIL = viewOnAttachStateChangeListenerC20604515jv;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(ECTrendingLiveCell.class, ECTrendingVideoCell.class, ECTrendingVoucherCell.class, ECAuctionFollowCell.class, ECTrendingFeedTitleCell.class, ECTrendingListFooterCell.class, ECTrendingNoMoreItemCell.class);
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2, 1, getContext(), false);
        gridLayoutManager.LLIZ = new C1775690wJD(this, 0);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJILJIL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.setLayoutManager(gridLayoutManager);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJILJIL;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
            viewOnAttachStateChangeListenerC20604515jv3.setItemAnimator(null);
        }
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0vS9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1742800vSA) obj).LLILZ;
            }
        }, null, new AwS640S0100000_26(this, 37), 6);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0vS7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1742800vSA) obj).LLILZIL);
            }
        }, null, new AwS640S0100000_26(this, 38), 6);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0vS8
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1742800vSA) obj).LLIZ;
            }
        }, null, new AwS303S0300000_26(this, gridLayoutManager, view, 1), 6);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJILJIL;
        if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
            C637920P0k.LIZ(viewOnAttachStateChangeListenerC20604515jv4, new ARunnableS95S0200000_26(this, gridLayoutManager, 17));
        }
        C0VWN.LIZ("trending_page_list", false).LIZIZ(this.LLJILJIL);
    }

    public final void Go(GridLayoutManager gridLayoutManager, boolean z) {
        int itemCount;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        View view;
        AbstractC21673619ry adapter;
        AbstractC21673619ry adapter2;
        int iFindLastVisibleItemPosition = gridLayoutManager.findLastVisibleItemPosition();
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJILJIL;
        int itemCount2 = 0;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (adapter2 = viewOnAttachStateChangeListenerC20604515jv.getAdapter()) != null) {
            itemCount = adapter2.getItemCount();
        } else {
            itemCount = 0;
        }
        if (iFindLastVisibleItemPosition == itemCount - 1) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJILJIL;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null && (adapter = viewOnAttachStateChangeListenerC20604515jv2.getAdapter()) != null) {
                itemCount2 = adapter.getItemCount();
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJILJIL;
            if (viewOnAttachStateChangeListenerC20604515jv3 != null && (viewHolderFindViewHolderForAdapterPosition = viewOnAttachStateChangeListenerC20604515jv3.findViewHolderForAdapterPosition(itemCount2 - 1)) != null && (view = viewHolderFindViewHolderForAdapterPosition.itemView) != null) {
                List<View> listLIZ = C08J8.LIZ(view);
                ArrayList arrayList = new ArrayList();
                for (View view2 : listLIZ) {
                    if (view2 instanceof C06WM) {
                        arrayList.add(view2);
                    }
                }
                View view3 = (View) C13LP.LJJJLL(arrayList);
                if (view3 != null) {
                    if (z) {
                        ((C1390410mHn) view3.findViewById(R.id.yk8)).LIZJ();
                        C1309620kBU.LIZ("LoadingStates");
                    } else {
                        C1309620kBU.LIZ("LoadingStates");
                        ((C1390410mHn) view3.findViewById(R.id.yk8)).LIZLLL();
                    }
                }
            }
        }
    }

    public final void Jo(int i, boolean z) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        View view;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJILJIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (viewHolderFindViewHolderForAdapterPosition = viewOnAttachStateChangeListenerC20604515jv.findViewHolderForAdapterPosition(i)) != null && (view = viewHolderFindViewHolderForAdapterPosition.itemView) != null) {
            List<View> listLIZ = C08J8.LIZ(view);
            ArrayList arrayList = new ArrayList();
            for (View view2 : listLIZ) {
                if (view2 instanceof InterfaceC1742850vSF) {
                    arrayList.add(view2);
                }
            }
            InterfaceC1742830vSD interfaceC1742830vSD = (InterfaceC1742830vSD) C13LP.LJJJLL(arrayList);
            if (interfaceC1742830vSD != null) {
                if (z) {
                    interfaceC1742830vSD.LJIILLIIL();
                } else {
                    interfaceC1742830vSD.play();
                }
                this.LLJ = i;
                Ho().setState(new AwS267S0000000_26(i, EnumC476430ImH.PLAYING, EnumC585200MxK.IDLE, 4));
            }
        }
    }

    public final void Lo(EnumC585200MxK enumC585200MxK, int i) {
        Integer numValueOf;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        View view;
        C20600815jK<InterfaceC1891350zJl> state;
        this.LLJI = this.LLJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("slideDirection ");
        sbLIZ.append(enumC585200MxK);
        sbLIZ.append(" newPosition ");
        sbLIZ.append(i);
        sbLIZ.append(" previousPlayPosition ");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(" list size ");
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJILJIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            numValueOf = Integer.valueOf(((ArrayList) state.LJII()).size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        C1309620kBU.LIZ("PlayerState");
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJILJIL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null && (viewHolderFindViewHolderForAdapterPosition = viewOnAttachStateChangeListenerC20604515jv2.findViewHolderForAdapterPosition(this.LLJI)) != null && (view = viewHolderFindViewHolderForAdapterPosition.itemView) != null) {
            List<View> listLIZ = C08J8.LIZ(view);
            ArrayList arrayList = new ArrayList();
            for (View view2 : listLIZ) {
                if (view2 instanceof InterfaceC1742850vSF) {
                    arrayList.add(view2);
                }
            }
            InterfaceC1742830vSD interfaceC1742830vSD = (InterfaceC1742830vSD) C13LP.LJJJLL(arrayList);
            if (interfaceC1742830vSD != null) {
                interfaceC1742830vSD.pause();
            }
        }
        Jo(i, false);
    }
}

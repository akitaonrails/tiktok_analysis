package com.ss.android.ugc.aweme.favorites.base.ui;

import X.C20603715jn;
import X.C2217381BqS;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC636340Oxc;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public abstract class BaseFavoriteListAssem<S extends InterfaceC636340Oxc<S, ITEM>, ITEM extends InterfaceC1891350zJl, CURSOR> extends BaseFavoritePageAssem {
    public ViewOnAttachStateChangeListenerC20604515jv LLJJ;
    public boolean LLJJI = true;
    public Boolean LLJJIII;

    public abstract AssemListViewModel<S, ITEM, CURSOR> So();

    public final ViewOnAttachStateChangeListenerC20604515jv Oo() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJ;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            return viewOnAttachStateChangeListenerC20604515jv;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePageAssem
    public final void Lo() {
        So().manualListRefresh();
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePageAssem
    public final void No() {
        So().manualListRefresh();
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BasicFavoritePageAbilities
    public final ViewOnAttachStateChangeListenerC20604515jv fj0() {
        return Oo();
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePageAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        View viewFindViewById = null;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = new ViewOnAttachStateChangeListenerC20604515jv(view.getContext(), null);
        C786410Ut5.E6(viewOnAttachStateChangeListenerC20604515jv, new RecyclerView.LayoutParams(-1, -1));
        this.LLJJ = viewOnAttachStateChangeListenerC20604515jv;
        View view2 = this.LLJ;
        if (view2 == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.hpn);
            }
            this.LLJ = (FrameLayout) viewFindViewById;
            view2 = viewFindViewById;
        }
        ((ViewGroup) view2).addView(Oo());
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvOo = Oo();
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = !((Boolean) this.LLJIJIL.getValue()).booleanValue();
        c20603715jn.LIZ = 5;
        c20603715jn.LIZLLL = DefaultFavoriteLoadingFooterCell.class;
        viewOnAttachStateChangeListenerC20604515jvOo.setListConfig(c20603715jn);
        So().setListState(Oo().getState());
        Oo().LJIIL(So().getConfig());
        AssemListViewModel<S, ITEM, CURSOR> assemListViewModelSo = So();
        AssemViewModel.asyncSubscribe$default(assemListViewModelSo, new C2217381BqS() { // from class: X.0Siy
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((InterfaceC636270OxV) obj).getRefreshState();
            }
        }, null, new AwS603S0100000_24(this, (BaseFavoriteListAssem<InterfaceC636340Oxc<Object, Object>, InterfaceC1891350zJl, Object>) 499), AFwS213S0000000_24.get$arr$(502), new AwS390S0200000_24(this, assemListViewModelSo, 78), 2, null);
        C736680Sv4.LJIIIIZZ(this, So(), new C2217381BqS() { // from class: X.0hwS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((InterfaceC627270Oiz) obj).getListState();
            }
        }, null, new AwS638S0100000_24(this, (BaseFavoriteListAssem<InterfaceC636340Oxc<Object, Object>, InterfaceC1891350zJl, Object>) 163), 6);
        C786410Ut5.LLF(8, Oo());
        Oo().setLifecycleOwner(this);
        C786410Ut5.LLLZLZ(Jo(), 8);
    }

    @Override // com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePageAssem, com.ss.android.ugc.aweme.favorites.base.ui.VisibilityAware
    public final void onVisibilityChanged(boolean z) {
        if (((Boolean) this.LLJIJIL.getValue()).booleanValue()) {
            So().manualListRefresh();
        }
    }
}

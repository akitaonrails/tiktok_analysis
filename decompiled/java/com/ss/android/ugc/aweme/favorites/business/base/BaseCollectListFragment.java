package com.ss.android.ugc.aweme.favorites.business.base;

import X.AbstractC1255880imo;
import X.AbstractC683590Qrd;
import X.AbstractC848400XPy;
import X.C036E;
import X.C086I;
import X.C098200Yq;
import X.C0DXR;
import X.C0P6P;
import X.C0PN0;
import X.C0XQ7;
import X.C1255920ims;
import X.C1389890mGx;
import X.C1685300txQ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C189200o6;
import X.C1893080zMY;
import X.C19719512Dh;
import X.C19EG;
import X.C19GS;
import X.C683660Qrk;
import X.C786410Ut5;
import X.InterfaceC1206390hUz;
import X.InterfaceC1206560hVG;
import X.InterfaceC1212360hec;
import X.InterfaceC1255930imt;
import X.InterfaceC683650Qrj;
import Y.ARunnableS121S0100000_21;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public abstract class BaseCollectListFragment<T, D> extends ProfileListFragment implements InterfaceC1212360hec<T>, InterfaceC1255930imt<T>, InterfaceC683650Qrj, InterfaceC1206390hUz {
    public RecyclerView LLILZLL;
    public C1749280vcc LLIZ;
    public AbstractC683590Qrd<T> LLIZLLLIL;
    public String LLJ;
    public boolean LLJI = true;
    public boolean LLJIJIL = true;
    public C1255920ims<AbstractC1255880imo<T, D>> LLJILJIL;

    @Override // X.InterfaceC1255930imt
    public final /* synthetic */ boolean B1(C0PN0 c0pn0) {
        return false;
    }

    @Override // X.InterfaceC1255930imt
    public final /* synthetic */ void IK(int[] iArr) {
    }

    @Override // X.InterfaceC1212360hec
    public final void Jm() {
    }

    @Override // X.InterfaceC1255930imt
    public final /* synthetic */ void Js(List list) {
    }

    public abstract void LJJIFFI();

    @Override // X.InterfaceC1206390hUz
    public final void LLLILZLLLI() {
    }

    @Override // X.InterfaceC1255930imt
    public final /* synthetic */ void LLLZZIL(List list) {
    }

    @Override // X.InterfaceC1212360hec
    public final /* synthetic */ void SY() {
    }

    @Override // X.InterfaceC1255930imt
    public final /* synthetic */ void V1(int i, Object obj) {
    }

    @Override // X.InterfaceC1206390hUz
    public final void V6() {
    }

    @Override // X.InterfaceC1212360hec
    public final void bD1(Exception exc) {
    }

    @Override // X.InterfaceC1212360hec
    public final void mE(List<? extends T> list, boolean z) {
    }

    public abstract void refreshData();

    public abstract void wS();

    public abstract AbstractC683590Qrd<T> yS();

    public final void BS() {
        LinearLayoutManager linearLayoutManager;
        int iFindFirstVisibleItemPosition;
        int iFindLastVisibleItemPosition;
        RecyclerView recyclerView = this.LLILZLL;
        if (recyclerView == null || (linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager()) == null || (iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()) > (iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition())) {
            return;
        }
        int i = iFindFirstVisibleItemPosition;
        while (true) {
            if (i >= 0 && i < linearLayoutManager.getItemCount()) {
                View childAt = this.LLILZLL.getChildAt(i - iFindFirstVisibleItemPosition);
                if (childAt != null && this.LLILZLL.getChildViewHolder(childAt) != null && (this.LLILZLL.getChildViewHolder(childAt) instanceof InterfaceC1206560hVG)) {
                    ((InterfaceC1206560hVG) this.LLILZLL.getChildViewHolder(childAt)).onShowItem();
                }
            }
            if (i == iFindLastVisibleItemPosition) {
                return;
            } else {
                i++;
            }
        }
    }

    public void ES() {
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        c1722300uv6.LJIIIIZZ = getString(2131833896);
        this.LLIZ.setStatus(c1722300uv6);
        C786410Ut5.LLLZLZ(this.LLIZ, 0);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public void mz() {
        C1255920ims<AbstractC1255880imo<T, D>> c1255920ims = this.LLJILJIL;
        if (c1255920ims == null || c1255920ims.LL == 0 || getActivity() == null) {
            return;
        }
        getActivity().runOnUiThread(new ARunnableS121S0100000_21(this, 66));
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Bp() {
        if (getUserVisibleHint()) {
            BS();
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void LJ() {
        if (isViewValid()) {
            this.LLIZ.LJ();
        }
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        if (isViewValid()) {
            return this.LLILZLL;
        }
        return null;
    }

    @Override // X.InterfaceC1212360hec
    public final void Ng1() {
        if (isViewValid()) {
            ES();
            C786410Ut5.LLIZLLLIL(this.LLILZLL, 4);
        }
    }

    public final boolean W0() {
        boolean zLIZIZ;
        if (!isViewValid()) {
            return false;
        }
        getActivity();
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (!zLIZIZ) {
            if (!this.LLJI) {
                C1389890mGx c1389890mGx = new C1389890mGx(this);
                c1389890mGx.LJIIIZ(2131837962);
                c1389890mGx.LJIIJJI();
            }
            this.LLJI = true;
            return false;
        }
        this.LLJI = false;
        this.LLIZ.LJ();
        boolean z = !this.LLJILJIL.LJIIL();
        if (TextUtils.isEmpty(this.LLJ)) {
            this.LLJ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        }
        if (!TextUtils.isEmpty(this.LLJ)) {
            refreshData();
        }
        return z;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final boolean isEmpty() {
        AbstractC683590Qrd<T> abstractC683590Qrd;
        return isViewValid() && (abstractC683590Qrd = this.LLIZLLLIL) != null && abstractC683590Qrd.getItemCount() == 0;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.LLJI = true;
    }

    @Override // X.InterfaceC1212360hec
    public final void showLoadMoreLoading() {
        if (isViewValid()) {
            this.LLIZLLLIL.showLoadMoreLoading();
        }
    }

    public void zS() {
        AbstractC683590Qrd<T> abstractC683590QrdYS = yS();
        this.LLIZLLLIL = abstractC683590QrdYS;
        this.LLILZLL.setAdapter(abstractC683590QrdYS);
    }

    @Override // X.InterfaceC683650Qrj
    public final boolean LJIIJJI() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1206550hVF
    public final boolean LJLLL() {
        return this.LLJI;
    }

    @Override // X.InterfaceC683650Qrj
    public final void preload() {
        LJJIFFI();
    }

    @Override // X.InterfaceC1206550hVF
    public final void Ii(boolean z) {
        W0();
    }

    @Override // X.InterfaceC1212360hec
    public final void Uq2(Exception exc) {
        if (!isViewValid()) {
            return;
        }
        C786410Ut5.LLLZLZ(this.LLIZ, 0);
        C1749280vcc c1749280vcc = this.LLIZ;
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C1893080zMY.LIZ(c1722300uv6, new AwS565S0100000_21((BaseCollectListFragment) this, 544));
        c1749280vcc.setStatus(c1722300uv6);
        this.LLJI = true;
    }

    @Override // X.InterfaceC1212360hec
    public final void Wi(Exception exc) {
        if (!isViewValid()) {
            return;
        }
        this.LLIZLLLIL.showLoadMoreError();
    }

    @Override // X.InterfaceC1255930imt
    public final void Y1(int i) {
        if (!isViewValid()) {
            return;
        }
        this.LLIZLLLIL.notifyItemRemoved(i);
        if (this.LLIZLLLIL.getBasicItemCount() == 0) {
            ES();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void cS(boolean z) {
        RecyclerView recyclerView;
        if (isViewValid() && (recyclerView = this.LLILZLL) != null && recyclerView.getChildCount() > 0) {
            if (z) {
                RecyclerView recyclerView2 = this.LLILZLL;
                if (recyclerView2 != null) {
                    recyclerView2.smoothScrollToPosition(0);
                    return;
                }
                return;
            }
            RecyclerView recyclerView3 = this.LLILZLL;
            if (recyclerView3 == null) {
                return;
            }
            recyclerView3.scrollToPosition(0);
        }
    }

    public void initView(View view) {
        this.LLILZLL = (RecyclerView) view.findViewById(R.id.e6l);
        this.LLIZ = (C1749280vcc) view.findViewById(R.id.w28);
        RecyclerView recyclerView = this.LLILZLL;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
        }
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager(getActivity());
        wrapLinearLayoutManager.setOrientation(1);
        RecyclerView recyclerView2 = this.LLILZLL;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(wrapLinearLayoutManager);
        }
        RecyclerView recyclerView3 = this.LLILZLL;
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(new C0DXR() { // from class: X.0lOr
                public final int LL = 1;

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView4, C21673919s1 c21673919s1) {
                    rect.bottom = this.LL;
                }
            });
        }
        RecyclerView recyclerView4 = this.LLILZLL;
        C683660Qrk.LIZ(recyclerView4, this, null, 2, false);
        this.LLILZLL = recyclerView4;
    }

    @Override // X.InterfaceC683650Qrj
    public final void n2(boolean z) {
        if (!z) {
            this.LLIZLLLIL.setLoadMoreListener((C0P6P) null);
            this.LLIZLLLIL.setLoadEmptyText(2131830409);
            this.LLIZLLLIL.setShowFooter(false);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // X.InterfaceC1206390hUz
    public final void onPageSelected(int i) {
        if (this.LLJI) {
            W0();
        }
        BS();
    }

    @Override // X.InterfaceC1212360hec
    public void LLJJJIL(List<T> list, boolean z) {
        if (isViewValid()) {
            this.LLIZLLLIL.resetLoadMoreState();
            this.LLIZLLLIL.setShowFooter(true);
            this.LLIZLLLIL.setData(list);
            this.LLJIJIL = z;
            C786410Ut5.LLLZLZ(this.LLIZ, 4);
            if (this.LLILZLL.getVisibility() == 4) {
                C786410Ut5.LLIZLLLIL(this.LLILZLL, 0);
            }
            n2(z);
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void Pj(List<T> list, boolean z) {
        if (isViewValid()) {
            this.LLIZLLLIL.resetLoadMoreState();
            this.LLIZLLLIL.setDataAfterLoadMore(list);
            C786410Ut5.LLLZLZ(this.LLIZ, 4);
            if (this.LLILZLL.getVisibility() == 4) {
                C786410Ut5.LLIZLLLIL(this.LLILZLL, 0);
            }
            this.LLJIJIL = z;
            n2(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        initView(view);
        zS();
        C1255920ims<AbstractC1255880imo<T, D>> c1255920ims = new C1255920ims<>();
        this.LLJILJIL = c1255920ims;
        c1255920ims.LLILLJJLI = this;
        c1255920ims.LLILZ = this;
        wS();
        if (this.LL) {
            W0();
        }
    }

    @Override // X.InterfaceC1255930imt
    public final void w(int i, List list) {
        if (!isViewValid() || C086I.LIZIZ(list)) {
            return;
        }
        if (this.LLIZLLLIL.getBasicItemCount() == 0) {
            this.LLIZLLLIL.setData(C19719512Dh.LIZIZ(list));
            return;
        }
        this.LLIZLLLIL.notifyItemInserted(i);
        if (this.LLILZLL == null) {
            return;
        }
        HandlerHook.viewPost(this.LLILZLL, new ARunnableS121S0100000_21(this, 124));
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.acs, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}

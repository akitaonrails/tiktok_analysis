package com.ss.android.ugc.aweme.sticker.view.internal.search;

import X.C098200Yq;
import X.C11JF;
import X.C11NZ;
import X.C1636320sgQ;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import X.InterfaceC1636820shE;
import Y.AObserverS227S0100000_25;
import Y.AfS194S0100000_25;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes26.dex */
public final class SearchStickerFragment extends AbstractStickerFragment<C1636320sgQ> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY4ICw4LTdiPyY2P2HELIOSslJzs2OistJWEgLSQ+Kid9GyAtOyw7GzElKiQ2OgM+KCg+LSs4";
    public SearchStickerViewContainer LLJILJILJ;
    public InterfaceC1636820shE LLJILLL;
    public LiveData<Unit> LLJJ;
    public Function0<Unit> LLJJI;
    public C11JF LLJJIII;
    public boolean LLJJIJI;

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment
    public final String SR() {
        return "search_sticker";
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment
    public final void ZR() {
    }

    public final SearchStickerViewContainer dS() {
        SearchStickerViewContainer searchStickerViewContainer = this.LLJILJILJ;
        if (searchStickerViewContainer != null) {
            return searchStickerViewContainer;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (this.LLJILJILJ == null || this.LLJILLL == null || this.LLJJ == null) {
            return;
        }
        dS().LJI();
        C11NZ<Pair<Integer, Integer>> c11nz = OR().LJII;
        if (c11nz != null) {
            this.LLJJIII = (C11JF) c11nz.LJJLJLI(new AfS194S0100000_25(this, 43));
        }
        LiveData<Unit> liveData = this.LLJJ;
        if (liveData != null) {
            liveData.observe(this, new AObserverS227S0100000_25(this, 41));
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C11JF c11jf = this.LLJJIII;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment
    public final LinearLayoutManager aS(View view) {
        SearchStickerViewContainer searchStickerViewContainerDS = dS();
        LinearLayoutManager linearLayoutManager = searchStickerViewContainerDS.LLJLL;
        if (linearLayoutManager == null) {
            return new LinearLayoutManager(searchStickerViewContainerDS.LL);
        }
        return linearLayoutManager;
    }

    @Override // com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractStickerFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        View view;
        if (this.LLJILJILJ != null && this.LLJILLL != null && this.LLJJ != null) {
            z = false;
        } else {
            z = true;
        }
        C19GS c19gs = null;
        if (z) {
            view = null;
        } else {
            if (dS().LLILLJJLI.getParent() != null) {
                C786410Ut5.LJJJLZIJ(dS().LLILLJJLI, (ViewGroup) dS().LLILLJJLI.getParent());
            }
            view = dS().LLILLJJLI;
        }
        if (!(view instanceof View)) {
            view = null;
        }
        if (view != null) {
            try {
                ViewTreeLifecycleOwner.set(view, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(view, this);
                view.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return view;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return view;
    }
}

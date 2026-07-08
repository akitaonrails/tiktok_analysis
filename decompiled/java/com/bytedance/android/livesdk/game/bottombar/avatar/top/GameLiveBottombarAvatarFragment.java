package com.bytedance.android.livesdk.game.bottombar.avatar.top;

import X.C098200Yq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C340790DXp;
import X.C475860IlM;
import X.C475870IlN;
import X.C497740JfY;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class GameLiveBottombarAvatarFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExJzE4JiIxKTHELIOSdiKDkyPCQ+Zzs8OGsLKCI2BCw6LA08PDEjJC0yOgQ6KDsyOgM+KCg+LSs4";
    public C475870IlN LL;
    public RecyclerView LLILLJJLI;
    public Function1<? super C475860IlM, Unit> LLILLL;
    public final ArrayList<C475860IlM> LLILZ = new ArrayList<>();

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        C475870IlN c475870IlN;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gmm, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) viewTd.findViewById(R.id.tun);
        this.LLILLJJLI = recyclerView;
        if (recyclerView != null) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(5, 1, getContext(), false);
            gridLayoutManager.mSmoothScrollbarEnabled = false;
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        RecyclerView recyclerView2 = this.LLILLJJLI;
        if (recyclerView2 != null) {
            recyclerView2.setNestedScrollingEnabled(false);
        }
        RecyclerView recyclerView3 = this.LLILLJJLI;
        if (recyclerView3 != null) {
            recyclerView3.addItemDecoration(new C340790DXp((int) C497740JfY.LIZIZ(6.0f), (int) C497740JfY.LIZIZ(10.0f)));
        }
        C475870IlN c475870IlN2 = new C475870IlN(new AwS586S0100000_7(this, 443));
        this.LL = c475870IlN2;
        RecyclerView recyclerView4 = this.LLILLJJLI;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(c475870IlN2);
        }
        if ((!this.LLILZ.isEmpty()) && (c475870IlN = this.LL) != null) {
            c475870IlN.LLLII(this.LLILZ);
        }
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}

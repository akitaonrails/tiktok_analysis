package com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager;

import X.C01GW;
import X.C098200Yq;
import X.C1643020srE;
import X.C1643070srJ;
import X.C1643080srK;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1635390sev;
import X.InterfaceC1643190srV;
import Y.AObserverS227S0100000_25;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class OptionCategoryFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWs+LCw8OiEpO2EgPCwvIiohZiHELIOSo8PSY8JiklOjt9PiwpPj8yLyA+ZwAjPCwjJwwyPCArJj0qDjctLiI2JjE=";
    public final List<C1643080srK> LL;
    public final InterfaceC1635390sev LLILLJJLI;
    public final InterfaceC1643190srV LLILLL;
    public final Effect LLILZ;
    public final Effect LLILZIL;
    public final C1643020srE LLILZLL;
    public RecyclerView LLIZ;
    public final boolean LLIZLLLIL;
    public final C01GW LLJ;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.pq9);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        this.LLIZ = recyclerView;
        recyclerView.setAdapter(new C1643070srJ(this.LLILLL, this.LL, this.LLILZLL, new AwS604S0100000_25(this, 395)));
        C1643020srE c1643020srE = this.LLILZLL;
        if (c1643020srE != null) {
            RecyclerView recyclerView2 = this.LLIZ;
            if (recyclerView2 == null) {
                recyclerView2 = null;
            }
            recyclerView2.scrollToPosition(c1643020srE.LIZIZ);
        }
        ((OptionCategoryViewModel) this.LLJ.getValue()).LLJ.observe(this, new AObserverS227S0100000_25(this, 72));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.du7, viewGroup, false);
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

    public OptionCategoryFragment(List<C1643080srK> list, InterfaceC1635390sev interfaceC1635390sev, InterfaceC1643190srV interfaceC1643190srV, Effect effect, Effect effect2, C1643020srE c1643020srE) {
        this.LL = list;
        this.LLILLJJLI = interfaceC1635390sev;
        this.LLILLL = interfaceC1643190srV;
        this.LLILZ = effect;
        this.LLILZIL = effect2;
        this.LLILZLL = c1643020srE;
        this.LLIZLLLIL = list.isEmpty() ^ true ? Intrinsics.LJFF(((C1643080srK) ListProtector.get(list, 0)).LIZ, "Green Screen") : false;
        this.LLJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 644));
    }
}

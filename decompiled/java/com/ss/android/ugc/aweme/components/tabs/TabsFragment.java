package com.ss.android.ugc.aweme.components.tabs;

import X.C098200Yq;
import X.C1685300txQ;
import X.C1846060y8i;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C638540P2u;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final class TabsFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjHELIOSJD88JiAiPTx9PCQuOmEHKSc/Dz0yLygpJzs=";
    public C638540P2u LL;
    public final List<TabChildParams> LLILLJJLI = new ArrayList();

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1846060y8i c1846060y8i = (C1846060y8i) view.findViewById(R.id.wx3);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.view_pager);
        c1846060y8i.setTabVariant(0);
        C1846060y8i.LJIJI(c1846060y8i, viewPager);
        C638540P2u c638540P2u = new C638540P2u(getChildFragmentManager(), this.LLILLJJLI);
        this.LL = c638540P2u;
        viewPager.setAdapter(c638540P2u);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dul, viewGroup, false);
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

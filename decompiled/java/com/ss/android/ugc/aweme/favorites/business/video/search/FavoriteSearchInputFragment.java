package com.ss.android.ugc.aweme.favorites.business.video.search;

import X.C01GW;
import X.C098200Yq;
import X.C0H5I;
import X.C0HCS;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C452501pT;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class FavoriteSearchInputFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMtPyAhITEpOmExPTYlJyogHELIOSO2s6ICs2J2s/LC4hKy1iDy4lJzclPSoALSQ+KicaJjU5PQkhKSIhLCEn";
    public C0H5I LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 78));

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C0H5I c0h5i = this.LL;
        if (c0h5i != null) {
            C0HCS.LIZ.getClass();
            c0h5i.LL = new ArrayList(C0HCS.LIZ());
            c0h5i.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context == null) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.hqn);
        recyclerView.setPadding(recyclerView.getPaddingLeft(), getResources().getDimensionPixelSize(R.dimen.xc), recyclerView.getPaddingRight(), recyclerView.getPaddingBottom());
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        C0HCS.LIZ.getClass();
        C0H5I c0h5i = new C0H5I(new ArrayList(C0HCS.LIZ()), new AwS585S0100000_6(this, 57), new AwS585S0100000_6(this, 58));
        this.LL = c0h5i;
        recyclerView.setAdapter(c0h5i);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.c6c, viewGroup, false);
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

package com.ss.android.ugc.aweme.notification;

import X.C098200Yq;
import X.C1685300txQ;
import X.C1748440vbG;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import X.ViewOnClickListenerC511801z2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class SubscribeTestPanelFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZisjPSY1ISYtHELIOSPSY8JmsfPC0gKzclKyoHLTY4GS49LSkKOy40JSAiPQ==";
    public C1748440vbG LL;
    public C1748440vbG LLILLJJLI;
    public C197039127h LLILLL;

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C1748440vbG c1748440vbG;
        C197039127h c197039127h;
        super.onViewCreated(view, bundle);
        View view2 = getView();
        C1748440vbG c1748440vbG2 = null;
        if (view2 != null) {
            c1748440vbG = (C1748440vbG) view2.findViewById(R.id.dod);
        } else {
            c1748440vbG = null;
        }
        this.LL = c1748440vbG;
        View view3 = getView();
        if (view3 != null) {
            c197039127h = (C197039127h) view3.findViewById(R.id.cp0);
        } else {
            c197039127h = null;
        }
        this.LLILLL = c197039127h;
        View view4 = getView();
        if (view4 != null) {
            c1748440vbG2 = (C1748440vbG) view4.findViewById(R.id.dii);
        }
        this.LLILLJJLI = c1748440vbG2;
        C1748440vbG c1748440vbG3 = this.LL;
        if (c1748440vbG3 != null) {
            c1748440vbG3.setPlaceholderText("Channel");
        }
        C1748440vbG c1748440vbG4 = this.LLILLJJLI;
        if (c1748440vbG4 != null) {
            c1748440vbG4.setPlaceholderText("Category");
        }
        C197039127h c197039127h2 = this.LLILLL;
        if (c197039127h2 != null) {
            C786410Ut5.U8(c197039127h2, new ViewOnClickListenerC511801z2(this, c197039127h2, 25));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.abj, viewGroup, false);
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

package com.ss.android.ugc.aweme.ui;

import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1257340ipA;
import X.C1257350ipB;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C427690Gpr;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import irm.AkS58S0200000_19;
import irm.AkS88S0100000_19;
import kotlin.Unit;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class CancelUploadOrReeditSheetContentFragment extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjAlZwwyJiYpJRHELIOSojJCotLQAhGiApLSYnGy0pLDsQJys4LCEnDjctLiI2JjE=";
    public View LL;
    public View LLILLJJLI;
    public View LLILLL;
    public C1257350ipB LLILZ;
    public C1257340ipA LLILZIL;

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131849377);
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS563S0100000_19(this, 1865));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LL = view.findViewById(R.id.t1m);
        this.LLILLJJLI = view.findViewById(R.id.uqb);
        this.LLILLL = view.findViewById(R.id.fkp);
        C1257350ipB c1257350ipB = this.LLILZ;
        if (c1257350ipB != null) {
            View view2 = this.LLILLJJLI;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            View view3 = this.LL;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(0, view3);
            }
            View view4 = this.LL;
            if (view4 != null) {
                C427690Gpr.LJ(view4, 0.0f);
            }
            View view5 = this.LL;
            if (view5 != null) {
                C786410Ut5.I7(new AkS58S0200000_19(c1257350ipB, this, 0), view5);
            }
        }
        View view6 = this.LLILLL;
        if (view6 != null) {
            C427690Gpr.LJ(view6, 0.0f);
        }
        View view7 = this.LLILLL;
        if (view7 != null) {
            C786410Ut5.I7(new AkS88S0100000_19(this, 3), view7);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.f9w, viewGroup, false);
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

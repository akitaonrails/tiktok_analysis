package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view;

import X.C098200Yq;
import X.C0OM1;
import X.C1041990dDp;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C1AF0;
import X.C786410Ut5;
import X.C905703gN;
import X.InterfaceC883003ci;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class SparkNavigationFragment extends Fragment implements InterfaceC883003ci {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyHELIOSAgOGs8KDY+LSs4Zzk6LTJiGj8yOi4CKDk6LyQ4ICA9DjctLiI2JjE=";
    public TuxNavBar LL;
    public SparkFragment LLILLJJLI;
    public boolean LLILZIL;
    public String LLILLL = "";
    public String LLILZ = "";
    public boolean LLILZLL = true;
    public boolean LLIZ = true;

    @Override // X.InterfaceC883003ci
    public final boolean uH() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLILLJJLI = new SparkFragment();
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(this.LLILLL);
        SparkFragment sparkFragment = this.LLILLJJLI;
        View viewFindViewById = null;
        if (sparkFragment == null) {
            sparkFragment = null;
        }
        Bundle bundle2 = new Bundle();
        C905703gN.LIZ.getClass();
        C1041990dDp.LIZ.getClass();
        C1041990dDp.LIZJ(sparkContext);
        C786410Ut5.LJJJI("SparkContextContainerId", sparkContext.containerId, bundle2);
        sparkFragment.setArguments(bundle2);
        try {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            SparkFragment sparkFragment2 = this.LLILLJJLI;
            if (sparkFragment2 == null) {
                sparkFragment2 = null;
            }
            c19ehLJIIJ.LJIJ(R.id.i1r, sparkFragment2, null);
            c19ehLJIIJ.LJIIJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        C0OM1 c0om1 = new C0OM1();
        c0om1.LIZLLL = true;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS545S0100000_1(this, 1243));
        if (this.LLILZIL) {
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark;
            c0om1.LIZIZ(c1251150ifB);
        }
        if (this.LLILZLL) {
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
            c0om1.LJ(c1251150ifB);
        }
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = this.LLILZ;
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZLLL = this.LLIZ;
        View view2 = this.LL;
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById = view3.findViewById(R.id.p12);
            }
            this.LL = (TuxNavBar) viewFindViewById;
            view2 = viewFindViewById;
        }
        ((TuxNavBar) view2).setNavActions(c0om1);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.aqy, viewGroup, false);
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

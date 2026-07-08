package com.ss.android.ugc.aweme.notification.aggregate;

import X.C098200Yq;
import X.C0OM1;
import X.C0OSB;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1616706Ur;
import X.C1618770sE7;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C497820Jfg;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC836760Ws6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC836760Ws6
public final class BulletinInviteListFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZisjPSY1ISYtPSY8JmHELIOSstLighLSItPSp9CjAgJSonISsFJzk6PCAAIDwnDjctLiI2JjE=";
    public TuxNavBar LLIZ;

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS229S0000000_2.get$arr$(429));
        activityConfiguration(AFwS229S0000000_2.get$arr$(430));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("aggregate_page_title")) == null) {
            string = getString(2131828153);
        }
        if (C1616706Ur.LIZ()) {
            View view2 = getView();
            if (view2 != null) {
                view2.setFitsSystemWindows(true);
            }
        } else {
            View view3 = getView();
            if (view3 != null) {
                view3.setPadding(0, C497820Jfg.LIZJ(requireActivity()), 0, 0);
            }
            ViewGroup viewGroup = (ViewGroup) getView();
            if (viewGroup != null) {
                C0OSB.LIZ(viewGroup, 0, null, 0, null, false);
            }
        }
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById = view4.findViewById(R.id.xzp);
            } else {
                viewFindViewById = null;
            }
            this.LLIZ = (TuxNavBar) viewFindViewById;
        }
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS546S0100000_2(this, 1001));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = string;
        c0om1.LIZJ = c1250250idj;
        ((TuxNavBar) viewFindViewById).setNavActions(c0om1);
        View viewFindViewById2 = this.LLIZ;
        if (viewFindViewById2 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById2 = view5.findViewById(R.id.xzp);
            } else {
                viewFindViewById2 = null;
            }
            this.LLIZ = (TuxNavBar) viewFindViewById2;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) viewFindViewById2;
        if (tuxNavBar != null) {
            tuxNavBar.setNavBackground(C1618770sE7.LIZ(R.attr.zn));
        }
        C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 274), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a9t, viewGroup, false);
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

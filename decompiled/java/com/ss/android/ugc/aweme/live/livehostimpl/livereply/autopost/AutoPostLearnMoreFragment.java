package com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost;

import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1546210qL5;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC344240DeY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: loaded from: classes3.dex */
public final class AutoPostLearnMoreFragment extends BaseFragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9JCw6LCc8OzElJD8/ZiHELIOSklPyohLTUgMGEyPTEjOSAgPGsNPDs8GCo/PQM2KTciBCAhLQM+KCg+LSs4";

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = C497740JfY.LJIJI(2131851331);
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZLLL = false;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LJIIIIZZ = getString(2131823353);
        c1251150ifB.LIZJ(new AwS546S0100000_2(this, 661));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    public static void SR(int i, View view) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(i);
        if (appCompatTextView != null) {
            CharSequence text = appCompatTextView.getText();
            C1546210qL5.LIZ.getClass();
            appCompatTextView.setText(C500260Jjc.LIZJ(C814420VxA.LIZIZ(C1546210qL5.LIZ(6)), C497740JfY.LIZJ(R.attr.a1j), C814420VxA.LIZIZ(C1546210qL5.LIZ(2)), text));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        SR(R.id.hoh, view);
        SR(R.id.hoi, view);
        SR(R.id.hoj, view);
        SR(R.id.hok, view);
        SR(R.id.hoo, view);
        SR(R.id.hop, view);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dcx, viewGroup, false);
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

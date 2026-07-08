package com.ss.android.ugc.aweme.account.login.adapter;

import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C1687890u1b;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C21578619ce;
import X.C438600HHu;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class LoginMore3POptionsFragment extends AbsFragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiJSA0ISHELIOStiKCsyODEpO2EfJyIlJwI8OiB/GQAjPCwjJzwVOiQrJCo9PA==";
    public final List<C1687890u1b> LL = new ArrayList();
    public LinearLayout LLILLJJLI;

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131829310);
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS565S0100000_21(this, 94));
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = false;
        return c0om1;
    }

    @Override // com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LinearLayout linearLayout;
        if (((ArrayList) this.LL).size() == 0) {
            C438600HHu.LIZ(this);
            return;
        }
        LinearLayout linearLayout2 = this.LLILLJJLI;
        if (linearLayout2 != null && linearLayout2.getChildCount() == 0) {
            for (C1687890u1b c1687890u1b : (ArrayList) this.LL) {
                if (!Intrinsics.LJFF(c1687890u1b.LJ, "login_3p_more_options") && (linearLayout = this.LLILLJJLI) != null) {
                    View viewTd = C786410Ut5.Td(getLayoutInflater(), R.layout.yr, linearLayout, false);
                    C786410Ut5.I7(c1687890u1b.LJIIIIZZ, viewTd);
                    ((TuxIconView) viewTd.findViewById(R.id.jxe)).setIconRes(c1687890u1b.LIZ);
                    ((TextView) viewTd.findViewById(R.id.dog)).setText(c1687890u1b.LIZJ);
                    linearLayout.addView(viewTd);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C21578619ce c21578619ce;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.zk, viewGroup, false);
        C19GS c19gs = null;
        if (viewGroup != null) {
            C786410Ut5.X5(new FrameLayout.LayoutParams(-1, -2), viewGroup);
            ViewParent parent = viewGroup.getParent();
            if (parent instanceof C21578619ce) {
                c21578619ce = (C21578619ce) parent;
            } else {
                c21578619ce = null;
            }
            if (c21578619ce != null) {
                C786410Ut5.o6(c21578619ce, new LinearLayout.LayoutParams(-1, -2));
            }
        }
        this.LLILLJJLI = (LinearLayout) viewTd.findViewById(R.id.okk);
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
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

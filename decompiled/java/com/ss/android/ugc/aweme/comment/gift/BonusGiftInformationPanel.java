package com.ss.android.ugc.aweme.comment.gift;

import X.C098200Yq;
import X.C0OM1;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2344009Gk;
import X.C384050F3z;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import Y.ACListenerS139S0100000_4;
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
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class BonusGiftInformationPanel extends Fragment implements InterfaceC344240DeY {
    public static String LLILLL = "tap_overlay";
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2JjHELIOSFiLiY1PGsOJiEmOwIlLzsaJiMjOyIyPCwjJx8yJiAg";
    public String LL;
    public String LLILLJJLI;

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS548S0100000_4(this, 52));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LLILLJJLI);
        c2344009Gk.LJIIIIZZ("enter_method", this.LL);
        C20684815ws.LJIILLIIL("show_free_gift_tooltip", c2344009Gk.LIZ);
        C786410Ut5.I7(new ACListenerS139S0100000_4(this, 10), view.findViewById(R.id.iw7));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a24, viewGroup, false);
        View viewFindViewById = viewTd.findViewById(R.id.iw7);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
        viewFindViewById.setBackground(c384050F3z.LIZ(viewTd.getContext()));
        C427690Gpr.LJ(viewFindViewById, C418440Gaw.LIZIZ(2));
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

package com.ss.android.ugc.aweme.authorize;

import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import Y.ACListenerS141S0100000_6;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class ManageAccessBottomSheetFragment extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQ5PSc8Oiw2HELIOSLGEeKSstLioSKyYpOjwRJzE4JiIAICApPQkhKSIhLCEn";
    public String LL;
    public Spanned LLILLJJLI;
    public String LLILLL;

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        String str = this.LL;
        if (str == null) {
            str = "";
        }
        c1250250idj.LIZJ = str;
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS550S0100000_6(this, 27));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TextView textView;
        C197039127h c197039127h;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dmr, viewGroup, false);
        C19GS c19gs = null;
        if (viewTd != null) {
            textView = (TextView) viewTd.findViewById(R.id.nx9);
        } else {
            textView = null;
        }
        if (viewTd != null) {
            c197039127h = (C197039127h) viewTd.findViewById(R.id.cqt);
        } else {
            c197039127h = null;
        }
        if (textView != null) {
            textView.setText(this.LLILLJJLI);
        }
        if (c197039127h != null) {
            c197039127h.setText(this.LLILLL);
        }
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS141S0100000_6(this, 15));
        }
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

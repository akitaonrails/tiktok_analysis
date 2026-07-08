package com.ss.android.ugc.aweme.prop.fragment;

import X.C098200Yq;
import X.C0OM1;
import X.C0TMT;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import X.C800330VaR;
import X.InterfaceC197023126r;
import X.InterfaceC344240DeY;
import Y.ACListenerS163S0100000_29;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public final class MediaFilterFragment extends Fragment implements InterfaceC344240DeY {
    public static int LLILZ = 0;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjU+Jj99HELIOSLjctLiI2JjFiBCo3ISQKICMnLTcKOy40JSAiPQ==";
    public ImageView LL;
    public LinearLayout LLILLJJLI;
    public C0TMT LLILLL;

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131835106);
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZ = new InterfaceC197023126r() { // from class: X.0TMR
            @Override // X.InterfaceC197023126r
            public final void LIZ() {
                String str = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF(this.LIZ, C343970De7.LIZ);
            }
        };
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLILLJJLI;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.max);
            } else {
                viewFindViewById = null;
            }
            this.LLILLJJLI = (LinearLayout) viewFindViewById;
        }
        viewFindViewById.setBackground(C800330VaR.LIZIZ(getContext(), R.drawable.fht));
        View viewFindViewById3 = this.LL;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.lyq);
            } else {
                viewFindViewById3 = null;
            }
            this.LL = (ImageView) viewFindViewById3;
        }
        ImageView imageView = (ImageView) viewFindViewById3;
        if (LLILZ == 0) {
            i = R.drawable.d6l;
        } else {
            i = R.drawable.d6o;
        }
        imageView.setImageResource(i);
        View view4 = this.LLILLJJLI;
        if (view4 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById2 = view5.findViewById(R.id.max);
            }
            this.LLILLJJLI = (LinearLayout) viewFindViewById2;
            view4 = viewFindViewById2;
        }
        C786410Ut5.R7((LinearLayout) view4, new ACListenerS163S0100000_29(this, 68));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dl4, viewGroup, false);
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

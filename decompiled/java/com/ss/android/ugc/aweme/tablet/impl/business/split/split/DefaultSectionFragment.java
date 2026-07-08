package com.ss.android.ugc.aweme.tablet.impl.business.split.split;

import X.C098200Yq;
import X.C1361400lX0;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import X.InterfaceC21613719iJ;
import Y.ACListenerS139S0100000_4;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public class DefaultSectionFragment extends Fragment implements InterfaceC21613719iJ {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtKyM2PGslJD8/Zic5OiHELIOSY9LTY/ZzwjJCw4ZzwjJCw4Zws2LiQ5JTsALSY4ICA9DjctLiI2JjE=";
    public TuxIconView LL;
    public LinearLayout LLILLJJLI;

    @Override // X.InterfaceC21613719iJ
    public final void Ml() {
    }

    @Override // X.InterfaceC21613719iJ
    public final void RM() {
    }

    @Override // X.InterfaceC21613719iJ
    public final void my() {
    }

    @Override // X.InterfaceC21613719iJ
    public final void tA() {
    }

    @Override // X.InterfaceC21613719iJ
    public final Fragment wb() {
        return this;
    }

    @Override // X.InterfaceC21613719iJ
    public final void wq(Object... objArr) {
    }

    public String xC() {
        return "";
    }

    @Override // X.InterfaceC21613719iJ
    public final void ED(int i, int i2) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3 = this.LLILLJJLI;
        if ((linearLayout3 != null && linearLayout3.getPaddingTop() == i && (linearLayout2 = this.LLILLJJLI) != null && linearLayout2.getPaddingBottom() == i2) || (linearLayout = this.LLILLJJLI) == null) {
            return;
        }
        linearLayout.setPadding(0, i, 0, i2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LL = (TuxIconView) view.findViewById(R.id.f677bn3);
        this.LLILLJJLI = (LinearLayout) view.findViewById(R.id.tsc);
        TuxIconView tuxIconView = this.LL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS139S0100000_4(this, 49));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater.cloneInContext(new C1361400lX0(getContext(), R.style.xz)), R.layout.fj_, viewGroup, false);
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

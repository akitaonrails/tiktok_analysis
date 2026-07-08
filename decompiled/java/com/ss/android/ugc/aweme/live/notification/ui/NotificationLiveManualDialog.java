package com.ss.android.ugc.aweme.live.notification.ui;

import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class NotificationLiveManualDialog extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9Jio4ICk6KyHELIOSQ4ICA9ZjAlZwE8PCwqICwyPCwjJwM6PiABKCEmKSkIIC4/JyI=";
    public final int LL;
    public TuxNavBar LLILLJJLI;
    public TuxTextView LLILLL;
    public View LLILZ;

    public NotificationLiveManualDialog() {
        this(0);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    public NotificationLiveManualDialog(int i) {
        this.LL = i;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.tqy);
        this.LLILZ = viewFindViewById;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            viewFindViewById = null;
        }
        viewFindViewById.setMinimumHeight(this.LL);
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZJ(new AwS545S0100000_1(this, 1579));
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131843185);
        View viewFindViewById3 = this.LLILLJJLI;
        if (viewFindViewById3 == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById3 = view2.findViewById(R.id.p15);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILLJJLI = (TuxNavBar) viewFindViewById3;
        }
        C0OM1 c0om1 = new C0OM1();
        c0om1.LJ(c1251150ifB);
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZLLL = true;
        ((TuxNavBar) viewFindViewById3).setNavActions(c0om1);
        View view3 = this.LLILLL;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById2 = view4.findViewById(R.id.pgm);
            }
            this.LLILLL = (TuxTextView) viewFindViewById2;
            view3 = viewFindViewById2;
        }
        ((TextView) view3).setText(2131842797);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dcl, viewGroup, false);
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

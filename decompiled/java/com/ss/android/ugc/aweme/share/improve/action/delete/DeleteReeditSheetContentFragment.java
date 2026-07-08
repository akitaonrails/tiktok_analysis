package com.ss.android.ugc.aweme.share.improve.action.delete;

import X.C098200Yq;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1387500mD6;
import X.C1387520mD8;
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
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS59S0200000_21;
import irm.AkS89S0100000_21;
import kotlin.Unit;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class DeleteReeditSheetContentFragment extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkKD02ZiwhOT08PiBiKCwnISHELIOSoiZys2JCA4LGEXLSkpPSoBLSAoIDsAICApPQw8JjEpJzsVOiQrJCo9PA==";
    public View LL;
    public View LLILLJJLI;
    public View LLILLL;
    public boolean LLILZ;
    public C1387500mD6 LLILZIL;
    public C1387520mD8 LLILZLL;
    public boolean LLIZ = true;

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(R.string.gm7);
        c0om1.LIZJ = c1250250idj;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS565S0100000_21(this, 809));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LL = view.findViewById(R.id.t1m);
        this.LLILLJJLI = view.findViewById(R.id.uqb);
        this.LLILLL = view.findViewById(R.id.fkp);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.fl6);
        if (this.LLILZ) {
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            }
        } else if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        C1387500mD6 c1387500mD6 = this.LLILZIL;
        if (c1387500mD6 != null) {
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
                C786410Ut5.I7(new AkS59S0200000_21(this, c1387500mD6, 1), view5);
            }
        }
        View view6 = this.LLILLL;
        if (view6 != null) {
            C427690Gpr.LJ(view6, 0.0f);
        }
        View view7 = this.LLILLL;
        if (view7 != null) {
            C786410Ut5.I7(new AkS89S0100000_21(this, 6), view7);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.f7x, viewGroup, false);
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

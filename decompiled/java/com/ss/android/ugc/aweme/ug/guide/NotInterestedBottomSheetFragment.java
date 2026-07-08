package com.ss.android.ugc.aweme.ug.guide;

import X.C098200Yq;
import X.C0OM1;
import X.C0SHX;
import X.C11JF;
import X.C11S5;
import X.C1251150ifB;
import X.C1620050sGB;
import X.C1685300txQ;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2214201BlK;
import X.C2344009Gk;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import Y.ACListenerS147S0100000_12;
import Y.AObserverS30S0500000_12;
import Y.AfS181S0100000_12;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.guide.notinterested.NotInterestedViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class NotInterestedBottomSheetFragment extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjArZygmISEpHELIOSZwE8PAwiPSohLTY4LCsRJzE4JiIAICApPQkhKSIhLCEn";
    public NotInterestedViewModel LL;
    public long LLILLJJLI = SystemClock.elapsedRealtime();
    public C1620050sGB LLILLL;
    public long LLILZ;
    public C11JF LLILZIL;

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZJ(new AwS556S0100000_12(this, 624));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C11JF c11jf = this.LLILZIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.LLILLJJLI = SystemClock.elapsedRealtime();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.LLILZ += SystemClock.elapsedRealtime() - this.LLILLJJLI;
    }

    public final void MR(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
        c2344009Gk.LJIIIIZZ("dismiss_method", str);
        c2344009Gk.LIZLLL((SystemClock.elapsedRealtime() - this.LLILLJJLI) + this.LLILZ, "duration");
        C20684815ws.LJIILLIIL("dismiss_not_interested_tutorial", c2344009Gk.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C19EG activity = getActivity();
        if (activity != null) {
            this.LL = (NotInterestedViewModel) ViewModelProviders.of(activity).get(NotInterestedViewModel.class);
            this.LLILLL = C0SHX.LIZ(activity, null);
        }
        this.LLILZIL = (C11JF) C2214201BlK.LIZJ().LJL(C11S5.LIZ()).LJJLJLI(new AfS181S0100000_12(this, 140));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TuxTextView tuxTextView;
        TuxTextView tuxTextView2;
        TuxTextView tuxTextView3;
        C197039127h c197039127h;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.b_k, viewGroup, false);
        C19GS c19gs = null;
        if (viewTd != null) {
            tuxTextView = (TuxTextView) viewTd.findViewById(R.id.title);
        } else {
            tuxTextView = null;
        }
        if (viewTd != null) {
            tuxTextView2 = (TuxTextView) viewTd.findViewById(R.id.pc6);
        } else {
            tuxTextView2 = null;
        }
        if (viewTd != null) {
            tuxTextView3 = (TuxTextView) viewTd.findViewById(R.id.hpp);
        } else {
            tuxTextView3 = null;
        }
        if (viewTd != null) {
            c197039127h = (C197039127h) viewTd.findViewById(R.id.fy2);
        } else {
            c197039127h = null;
        }
        NotInterestedViewModel notInterestedViewModel = this.LL;
        if (notInterestedViewModel == null) {
            notInterestedViewModel = null;
        }
        notInterestedViewModel.LL.observe(getViewLifecycleOwner(), new AObserverS30S0500000_12(tuxTextView, tuxTextView2, tuxTextView3, c197039127h, this, 1));
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS147S0100000_12(this, 275));
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

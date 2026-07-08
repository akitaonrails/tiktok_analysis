package com.ss.android.ugc.aweme.compliance.privacy.checkup;

import X.C098200Yq;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C1848530yCh;
import X.C189200o6;
import X.C19202710An;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C1AF0;
import X.C306560Bzy;
import X.C418440Gaw;
import X.C426750GoL;
import X.C427690Gpr;
import X.C786410Ut5;
import X.C814420VxA;
import X.C985403tE;
import X.EnumC19202910Ap;
import Y.ACListenerS130S0200000_28;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public abstract class CheckupBasePageFragment extends Fragment {
    public TuxNavBar LL;
    public C197039127h LLILLJJLI;
    public TuxTextView LLILLL;
    public View LLILZ;

    public abstract int MR();

    public void OR(EnumC19202910Ap enumC19202910Ap) {
    }

    public void PR() {
    }

    public String RR() {
        return null;
    }

    public void WR() {
        CheckupContainerFragment checkupContainerFragment;
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment instanceof CheckupContainerFragment) || (checkupContainerFragment = (CheckupContainerFragment) parentFragment) == null) {
            return;
        }
        C197039127h c197039127h = this.LLILLJJLI;
        TuxTextView tuxTextView = this.LLILLL;
        C19202710An c19202710An = new C19202710An(this);
        int iLJJLIIIIJ = checkupContainerFragment.getChildFragmentManager().LJJLIIIIJ();
        if (c197039127h != null) {
            C786410Ut5.T7(c197039127h, new ACListenerS130S0200000_28(c19202710An, checkupContainerFragment, 16));
        }
        if (tuxTextView != null) {
            if (iLJJLIIIIJ <= 1) {
                C786410Ut5.LLIL(tuxTextView, 8);
                if (c197039127h != null) {
                    C426750GoL.LJIIIZ(c197039127h, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), false, 23);
                    return;
                }
                return;
            }
            C786410Ut5.LLIL(tuxTextView, 0);
            if (c197039127h != null) {
                C426750GoL.LJIIIZ(c197039127h, null, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), false, 23);
            }
            C786410Ut5.T7(tuxTextView, new ACListenerS130S0200000_28(c19202710An, checkupContainerFragment, 17));
            C427690Gpr.LJI(tuxTextView, null);
        }
    }

    public final String getEnterFrom() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("enter_from")) == null) ? "" : string;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        PR();
    }

    public boolean NR(boolean z) {
        if (z) {
            SR(requireContext());
            return true;
        }
        return false;
    }

    public void SR(Context context) {
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJFF(2131845088);
        c1397580mTM.LIZ(2131845085);
        C985403tE.LIZ(c1397580mTM, new AwS607S0100000_28(this, 61));
        new C1397510mTF(c1397580mTM).LIZLLL();
        OR(EnumC19202910Ap.EVENT_CLOSE);
    }

    public final void UR(boolean z) {
        int i;
        View view = this.LLILZ;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    public final void VR(float f) {
        LinearLayout linearLayout;
        try {
            TuxNavBar tuxNavBar = this.LL;
            if (tuxNavBar != null && (linearLayout = (LinearLayout) tuxNavBar.findViewById(R.id.p1k)) != null) {
                C786410Ut5.W4(linearLayout, f);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LIZJ("checkup nav_center alpha problem");
        }
    }

    public final void ZR(int i) {
        int i2;
        if (C306560Bzy.LIZ()) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        C197039127h c197039127h = this.LLILLJJLI;
        if (c197039127h != null) {
            c197039127h.setText(C786410Ut5.j4(c197039127h.getContext().getString(2131845059), Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2)));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LIZ(true);
        tuxImmersionBarLIZLLL.LJIIIIZZ(R.attr.zp);
        tuxImmersionBarLIZLLL.LJ(R.attr.zp);
        tuxImmersionBarLIZLLL.LIZLLL();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zp, context)) != null) {
            view.setBackgroundColor(numLIZJ.intValue());
        }
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p15);
        this.LL = tuxNavBar;
        if (tuxNavBar != null) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark;
            c1251150ifB.LIZJ(new AwS572S0100000_28(this, 163));
            tuxNavBar.LIZIZ(c1251150ifB);
            tuxNavBar.LJIIZILJ(false);
            tuxNavBar.setNavBackground(0);
        }
        this.LLILLJJLI = (C197039127h) view.findViewById(R.id.p8o);
        this.LLILLL = (TuxTextView) view.findViewById(R.id.rss);
        this.LLILZ = view.findViewById(R.id.u33);
        WR();
        String strRR = RR();
        if (strRR != null) {
            C1848530yCh.LIZLLL(this, strRR, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bde, viewGroup, false);
        C19GS c19gs = null;
        if (viewTd != null) {
            C786410Ut5.Td(layoutInflater, MR(), (ViewGroup) viewTd.findViewById(R.id.eux), true);
        } else {
            viewTd = null;
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

package com.bytedance.effectcreatormobile.infrastructure.ui.view;

import X.AbstractC1177930gl5;
import X.C098200Yq;
import X.C0GXN;
import X.C0HN7;
import X.C0HN9;
import X.C1616006Uk;
import X.C1685300txQ;
import X.C16G0;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C786410Ut5;
import Y.ACListenerS110S0200000_6;
import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BottomDialog extends Fragment {
    public C0HN7 LL;
    public final List<C0HN9> LLILLJJLI = new ArrayList();

    public abstract View OR(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public final void NR() {
        C19EH c19ehLJIIJ;
        Iterator<C0HN9> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().onDismiss();
        }
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager == null || (c19ehLJIIJ = fragmentManager.LJIIJ()) == null) {
            return;
        }
        c19ehLJIIJ.LJIIZILJ(this);
        c19ehLJIIJ.LJIIIZ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C0HN7 c0hn7 = this.LL;
        if (c0hn7 == null) {
            c0hn7 = null;
        }
        PR(BottomSheetBehavior.from(c0hn7.LLILLJJLI).getState());
    }

    public static void MR(BottomDialog bottomDialog) {
        C0HN7 c0hn7 = bottomDialog.LL;
        if (c0hn7 == null) {
            c0hn7 = null;
        }
        BottomSheetBehavior.from(c0hn7.LLILLJJLI).setState(5);
    }

    public final void PR(int i) {
        C0HN7 c0hn7;
        int height;
        C0HN7 c0hn72 = null;
        if (i != 4) {
            if (i != 5) {
                C0HN7 c0hn73 = this.LL;
                if (c0hn73 != null) {
                    c0hn72 = c0hn73;
                }
                c0hn72.LLILLJJLI.setPadding(0, 0, 0, 0);
                return;
            }
            NR();
            return;
        }
        C0HN7 c0hn74 = this.LL;
        if (c0hn74 == null) {
            c0hn7 = null;
        } else {
            c0hn7 = c0hn74;
        }
        C0GXN c0gxn = c0hn7.LLILLJJLI;
        if (c0hn74 != null) {
            c0hn72 = c0hn74;
        }
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(c0hn72.LLILLJJLI);
        View viewFindViewById = requireActivity().findViewById(R.id.content);
        if (bottomSheetBehaviorFrom.getPeekHeight() == -1) {
            height = (viewFindViewById.getWidth() * 9) / 16;
        } else {
            height = viewFindViewById.getHeight() - bottomSheetBehaviorFrom.getPeekHeight();
        }
        c0gxn.setPadding(0, 0, 0, height);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C0HN7 c0hn7 = this.LL;
        C0HN7 c0hn72 = null;
        if (c0hn7 == null) {
            c0hn7 = null;
        }
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(c0hn7.LLILLJJLI);
        bottomSheetBehaviorFrom.setHideable(true);
        bottomSheetBehaviorFrom.setBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0HN8
            @Override // X.AbstractC1177930gl5
            public final void LIZJ(View view2, float f) {
            }

            @Override // X.AbstractC1177930gl5
            public final void LIZLLL(int i, View view2) {
                this.LIZ.PR(i);
            }
        });
        C0HN7 c0hn73 = this.LL;
        if (c0hn73 != null) {
            c0hn72 = c0hn73;
        }
        C16G0 c16g0 = c0hn72.LLILLL;
        C786410Ut5.I7(new ACListenerS110S0200000_6(c16g0, this, 34), c16g0);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs = null;
        View viewTd = C786410Ut5.Td(layoutInflater, com.zhiliaoapp.musically.R.layout.afk, null, false);
        C0GXN c0gxn = (C0GXN) C1616006Uk.LIZ(com.zhiliaoapp.musically.R.id.cgu, viewTd);
        if (c0gxn != null) {
            C16G0 c16g0 = (C16G0) viewTd;
            this.LL = new C0HN7(c16g0, c0gxn, c16g0);
            View viewOR = OR(layoutInflater, c0gxn, bundle);
            C0HN7 c0hn7 = this.LL;
            if (c0hn7 == null) {
                c0hn7 = null;
            }
            c0hn7.LLILLJJLI.addView(viewOR);
            C0HN7 c0hn72 = this.LL;
            if (c0hn72 == null) {
                c0hn72 = null;
            }
            C16G0 c16g02 = c0hn72.LLILLL;
            if (!(c16g02 instanceof View)) {
                c16g02 = null;
            }
            if (c16g02 != null) {
                try {
                    ViewTreeLifecycleOwner.set(c16g02, getViewLifecycleOwner());
                    ViewTreeViewModelStoreOwner.set(c16g02, this);
                    c16g02.setTag(com.zhiliaoapp.musically.R.id.view_tree_saved_state_registry_owner, this);
                    C19EG activity = getActivity();
                    if (activity instanceof C19GS) {
                        c19gs = (C19GS) activity;
                    }
                    C1685300txQ.LIZ(c19gs);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                    return c16g02;
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return c16g02;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(com.zhiliaoapp.musically.R.id.cgu)));
    }
}

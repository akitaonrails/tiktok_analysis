package com.ss.android.ugc.profile.business.ur.impersonation;

import X.C098200Yq;
import X.C0OM1;
import X.C1251150ifB;
import X.C1685300txQ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C189200o6;
import X.C197039127h;
import X.C19EG;
import X.C19GS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS139S0100000_4;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditInputFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class ImpersonationSubmitSuccessFragment extends ProfileEditInputFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9PTdiICIjLTHELIOSc/JiEyPCwjJ2EaJTUpOzw8JiQ4ICA9GzAuJCYnGzAvKiogOwM+KCg+LSs4";
    public TuxNavBar LLILZLL;
    public C1749280vcc LLIZ;
    public C197039127h LLIZLLLIL;

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditInputFragment
    public final void gS() {
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileEditInputFragment
    public final boolean onBackPressed() {
        Dialog dialog;
        if (getDialog() != null && (dialog = getDialog()) != null && dialog.isShowing() && isResumed()) {
            try {
                C19EG activity = getActivity();
                if (activity != null) {
                    activity.finish();
                    return true;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }

    @Override // com.ss.android.ugc.profile.business.ur.ui.ProfileDetailEditFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String quantityString;
        String string;
        Resources resources;
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLILZLL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.p15);
            } else {
                viewFindViewById = null;
            }
            this.LLILZLL = (TuxNavBar) viewFindViewById;
        }
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_left_offset_ltr;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c1251150ifB.LIZLLL();
        c1251150ifB.LJ = c419910GdJ;
        c1251150ifB.LIZJ(new AwS548S0100000_4(this, 332));
        c0om1.LJ(c1251150ifB);
        ((TuxNavBar) viewFindViewById).setNavActions(c0om1);
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null) {
            quantityString = resources.getQuantityString(2131755378, 1, 1);
        } else {
            quantityString = null;
        }
        View viewFindViewById3 = this.LLIZ;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.w28);
            } else {
                viewFindViewById3 = null;
            }
            this.LLIZ = (C1749280vcc) viewFindViewById3;
        }
        C1749280vcc c1749280vcc = (C1749280vcc) viewFindViewById3;
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_clock_fill;
        c419910GdJ2.LJ = Integer.valueOf(R.attr.a01);
        c1722300uv6.LIZJ = 0;
        c1722300uv6.LIZIZ = c419910GdJ2;
        Context context2 = getContext();
        if (context2 == null || (string = context2.getString(2131835940)) == null) {
            string = "";
        }
        c1722300uv6.LJI = string;
        if (quantityString == null) {
            quantityString = "";
        }
        c1722300uv6.LJIIIIZZ = quantityString;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
        c1722300uv6.LIZLLL = iLIZIZ;
        c1722300uv6.LJ = iLIZIZ2;
        c1749280vcc.setStatus(c1722300uv6);
        View view4 = this.LLIZLLLIL;
        if (view4 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById2 = view5.findViewById(R.id.eoq);
            }
            this.LLIZLLLIL = (C197039127h) viewFindViewById2;
            view4 = viewFindViewById2;
        }
        C786410Ut5.U8((C197039127h) view4, new ACListenerS139S0100000_4(this, 57));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ee9, viewGroup, false);
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

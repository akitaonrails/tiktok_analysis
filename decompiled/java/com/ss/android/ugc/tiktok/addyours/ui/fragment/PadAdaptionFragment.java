package com.ss.android.ugc.tiktok.addyours.ui.fragment;

import X.C098200Yq;
import X.C0OM1;
import X.C1251150ifB;
import X.C128Y;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C339190DRl;
import X.C786410Ut5;
import X.InterfaceC344240DeY;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.widget.RadiusLayout;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS548S0100000_4;
import wh6.AbS687S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class PadAdaptionFragment extends AppCompatDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjElIjs8I2stLSsqJzA+HELIOSOmEmIWsqOy40JSAiPWEDKSENLS4jPCwjJwkhKSIhLCEn";
    public RadiusLayout LL;
    public ConstraintLayout LLILLJJLI;
    public TuxNavBar LLILLL;
    public Fragment LLILZ;
    public Integer LLILZIL;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        Window window2;
        Window window3;
        Dialog dialog = getDialog();
        if (dialog != null && (window3 = dialog.getWindow()) != null) {
            window3.requestFeature(1);
        }
        super.onActivityCreated(bundle);
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window2 = dialog2.getWindow()) != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null && (window = dialog3.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Window window;
        WindowManager.LayoutParams attributes;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (attributes = window.getAttributes()) != null) {
            attributes.windowAnimations = R.anim.ce;
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C0OM1 c0om1Sn;
        InterfaceC344240DeY interfaceC344240DeY;
        super.onViewCreated(view, bundle);
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        Fragment fragment = this.LLILZ;
        View viewFindViewById = null;
        if (fragment == null) {
            fragment = null;
        }
        c19ehLJIIJ.LJIJ(R.id.eqx, fragment, null);
        c19ehLJIIJ.LJIIL();
        View viewFindViewById2 = this.LL;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.tqy);
            } else {
                viewFindViewById2 = null;
            }
            this.LL = (RadiusLayout) viewFindViewById2;
        }
        viewFindViewById2.setClickable(true);
        View viewFindViewById3 = this.LLILLJJLI;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.pwk);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILLJJLI = (ConstraintLayout) viewFindViewById3;
        }
        C786410Ut5.I7(new AbS687S0100000_4(this, 1), viewFindViewById3);
        C128Y c128y = this.LLILZ;
        if (c128y == null) {
            c128y = null;
        }
        if ((c128y instanceof InterfaceC344240DeY) && (interfaceC344240DeY = (InterfaceC344240DeY) c128y) != null) {
            c0om1Sn = interfaceC344240DeY.Sn();
        } else {
            c0om1Sn = null;
        }
        if (c0om1Sn != null) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark;
            c1251150ifB.LIZJ(new AwS548S0100000_4(this, 553));
            c0om1Sn.LJ(c1251150ifB);
            View view4 = this.LLILLL;
            if (view4 == null) {
                View view5 = getView();
                if (view5 != null) {
                    viewFindViewById = view5.findViewById(R.id.p15);
                }
                this.LLILLL = (TuxNavBar) viewFindViewById;
                view4 = viewFindViewById;
            }
            ((TuxNavBar) view4).setNavActions(c0om1Sn);
            return;
        }
        View view6 = this.LLILLL;
        if (view6 == null) {
            View view7 = getView();
            if (view7 != null) {
                viewFindViewById = view7.findViewById(R.id.p15);
            }
            this.LLILLL = (TuxNavBar) viewFindViewById;
            view6 = viewFindViewById;
        }
        C339190DRl.LIZIZ(view6);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Integer num = this.LLILZIL;
        if (num != null) {
            LayoutInflater layoutInflaterNe = C786410Ut5.ne(new ContextThemeWrapper(layoutInflater.getContext(), num.intValue()));
            if (layoutInflaterNe != null) {
                layoutInflater = layoutInflaterNe;
            }
        }
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.m5, viewGroup, false);
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

package com.ss.android.ugc.aweme.commercialize.router.api.ui;

import X.C098200Yq;
import X.C1389600mGU;
import X.C1685300txQ;
import X.C1766560w4U;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C786410Ut5;
import X.C960203pA;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class HostDialogFragment extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2OiYlKCM6HELIOSMiBiOyAmPCA+Zy4jIWs5IGEbJzY4DSYyJCorDz0yLygpJzs=";

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        View decorView2;
        Window window3;
        View decorView3;
        Window window4;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null && (window4 = dialog2.getWindow()) != null) {
            window4.setLayout(-1, -1);
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null && (window3 = dialog3.getWindow()) != null && (decorView3 = window3.getDecorView()) != null) {
            decorView3.setPadding(0, 0, 0, 0);
        }
        Dialog dialog4 = getDialog();
        if (dialog4 != null && (window2 = dialog4.getWindow()) != null && (decorView2 = window2.getDecorView()) != null) {
            decorView2.setBackgroundColor(0);
        }
        TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(this, false);
        tuxImmersionBarLIZJ.LIZIZ.LJIIJ(!C960203pA.LIZIZ(requireContext()));
        tuxImmersionBarLIZJ.LIZIZ.LJIIL();
        tuxImmersionBarLIZJ.LJFF(-16777216);
        tuxImmersionBarLIZJ.LIZIZ.LJII(true);
        tuxImmersionBarLIZJ.LIZ(false);
        tuxImmersionBarLIZJ.LIZLLL();
        Dialog dialog5 = getDialog();
        if (dialog5 == null || (window = dialog5.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.0DPv
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i != 4) {
                    return false;
                }
                if (keyEvent.getAction() == 1) {
                    this.LL.dismissAllowingStateLoss();
                }
                return true;
            }
        });
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.b4h, viewGroup, false);
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

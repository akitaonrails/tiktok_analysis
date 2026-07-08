package com.ss.android.ugc.aweme.subscription.pgc.business.foundation.editor.ui;

import X.C098200Yq;
import X.C0JCO;
import X.C1389600mGU;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public class PGCSubEmojiInputDialogFragment extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8Jms8Lix9KjA/ICE2OzZiHELIOSLyAmJiEtPSY8JmspLSYnJzdiPCZ9GAIPGjoxDSgjIyYaJjU5PQs6KSkjLgkhKSIhLCEn";
    public boolean LL = true;
    public C0JCO LLILLJJLI;

    public View MR(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final int getTheme() {
        return R.style.ag_;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.setCanceledOnTouchOutside(this.LL);
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setSoftInputMode(20);
        }
        Window window2 = dialogOnCreateDialog.getWindow();
        if (window2 != null && (decorView = window2.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    @Override // com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        super.showNow(fragmentManager, str);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewMR = MR(layoutInflater, viewGroup);
        if (viewMR == null) {
            viewMR = super.onCreateView(layoutInflater, viewGroup, bundle);
        }
        C19GS c19gs = null;
        if (!(viewMR instanceof View)) {
            viewMR = null;
        }
        if (viewMR != null) {
            try {
                ViewTreeLifecycleOwner.set(viewMR, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewMR, this);
                viewMR.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewMR;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewMR;
    }
}

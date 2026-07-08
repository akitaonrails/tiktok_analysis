package com.ss.android.ugc.profile.business.ur.ui;

import X.C1766560w4U;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public class ProfileDetailEditFragment extends GlobalHookDialogFragment {
    public static final int LL = 8;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjHELIOSx9PTdiPCZ9GDcjLyY/LQEpPS46JAAoIDsVOiQrJCo9PA==";

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        PR(this);
    }

    @Override // com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        OR(this, fragmentManager, str);
    }

    public void MR() {
        super.onStart();
        TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(this, false);
        tuxImmersionBarLIZJ.LJ(R.attr.bx);
        tuxImmersionBarLIZJ.LJIIIIZZ(R.attr.bx);
        tuxImmersionBarLIZJ.LIZ(true);
        tuxImmersionBarLIZJ.LIZLLL();
    }

    public static void PR(ProfileDetailEditFragment profileDetailEditFragment) {
        Window window;
        View decorView;
        profileDetailEditFragment.MR();
        Dialog dialog = profileDetailEditFragment.getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, profileDetailEditFragment);
            ViewTreeViewModelStoreOwner.set(decorView, profileDetailEditFragment);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, profileDetailEditFragment);
        }
    }

    public void NR(FragmentManager fragmentManager, String str) {
        try {
            super.show(fragmentManager, str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!view.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestFitSystemWindows();
            }
        }
    }

    public static void OR(ProfileDetailEditFragment profileDetailEditFragment, FragmentManager fragmentManager, String str) {
        profileDetailEditFragment.NR(fragmentManager, str);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(profileDetailEditFragment);
    }
}

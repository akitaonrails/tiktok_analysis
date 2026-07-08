package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.leaderboard;

import X.C098200Yq;
import X.C1389600mGU;
import X.C1685300txQ;
import X.C1881420z3k;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20441214yg;
import X.C786410Ut5;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.base.view.MixPageInnerDialog;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes29.dex */
public final class LeaderboardPageFragment extends LiveSheetHostFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZygyJSBiOS4hPCspOzw7ITViJCHELIOSYrJCQ1JjonZic5OiY9LTY/Zyc8OzFiJSoyLCA+KyAyOiFiBSoyLCA+KyAyOiEcKCg2DjctLiI2JjE=";
    public C1881420z3k LLJ;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isFollowAppTheme() {
        return true;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return false;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C19EG activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        MixPageInnerDialog mixPageInnerDialog = new MixPageInnerDialog(getContext(), getTheme());
        mixPageInnerDialog.LLJILJILJ = this;
        Window window = mixPageInnerDialog.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(mixPageInnerDialog);
        return mixPageInnerDialog;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C1881420z3k c1881420z3k;
        super.onViewCreated(view, bundle);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.dgc);
        if (frameLayout != null && (c1881420z3k = this.LLJ) != null) {
            c1881420z3k.h(frameLayout);
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.0z8o
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    if (i == 4 && keyEvent.getAction() == 1) {
                        this.LL.dismissAllowingStateLoss();
                        return true;
                    }
                    return false;
                }
            });
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2;
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        try {
            View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gms, null, false);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (viewOnCreateView instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) viewOnCreateView;
            } else {
                viewGroup2 = null;
            }
            if (viewGroup2 != null) {
                viewGroup2.addView(viewTd, layoutParams);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("LeaderboardPageFragment", e);
        }
        if (!(viewOnCreateView instanceof View)) {
            viewOnCreateView = null;
        }
        if (viewOnCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(viewOnCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewOnCreateView, this);
                viewOnCreateView.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewOnCreateView;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewOnCreateView;
    }
}

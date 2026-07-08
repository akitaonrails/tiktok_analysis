package com.ss.android.ugc.aweme.feed.flexible;

import X.C098200Yq;
import X.C1389600mGU;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C786410Ut5;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.flexible.FlexibleLandingPageDialogFragment;
import com.ss.android.ugc.aweme.feed.flexible.FlexibleRootFragment;
import com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes22.dex */
public final class FlexibleLandingPageDialogFragment extends AppCompatDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiMpLCt9LikpMSYxHELIOSJCBiDyM2MCwuJSofKSsoICE0GCQrLAs6KSkjLgkhKSIhLCEn";
    public IPlayerComponentAbility LL;
    public VideoShrinkAbility LLILLJJLI;
    public int LLILLL = -1;
    public boolean LLILZ;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setLayout(-1, -1);
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, android.R.style.Theme.Translucent.NoTitleBar.Fullscreen);
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        final Dialog dialog = new Dialog(requireContext(), getTheme());
        dialog.setCanceledOnTouchOutside(false);
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener(dialog) { // from class: X.0mJZ
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                SAFTikTokFragment sAFTikTokFragment;
                if (i == 4 && keyEvent.getAction() == 1) {
                    FlexibleLandingPageDialogFragment flexibleLandingPageDialogFragment = this.LL;
                    Fragment fragmentLJJJJZ = flexibleLandingPageDialogFragment.getChildFragmentManager().LJJJJZ(flexibleLandingPageDialogFragment.LLILLL);
                    if ((fragmentLJJJJZ instanceof FlexibleRootFragment) && (sAFTikTokFragment = (SAFTikTokFragment) fragmentLJJJJZ) != null) {
                        sAFTikTokFragment.onBackPressed();
                        return true;
                    }
                    this.LL.dismissAllowingStateLoss();
                    return true;
                }
                return false;
            }
        });
        Window window = dialog.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialog);
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            int i = this.LLILLL;
            FlexibleRootFragment flexibleRootFragment = new FlexibleRootFragment();
            Bundle arguments = getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            flexibleRootFragment.setArguments(new Bundle(arguments));
            c19ehLJIIJ.LJIJ(i, flexibleRootFragment, null);
            c19ehLJIIJ.LJIIL();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        FrameLayout frameLayout = new FrameLayout(requireContext());
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        int iGenerateViewId = View.generateViewId();
        this.LLILLL = iGenerateViewId;
        frameLayout.setId(iGenerateViewId);
        frameLayout.setBackgroundColor(0);
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return frameLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return frameLayout;
        }
    }
}

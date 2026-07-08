package com.ss.android.ugc.tiktok.location_api.service.view;

import X.C098200Yq;
import X.C0DRA;
import X.C1389600mGU;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20625115nF;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class FypLocationHintDialogFragment extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjElIjs8I2sgJiwyPCwjJxAyOCxiOiHELIOSohPiwvLGElISA7ZwkqOAkjKi4nISoiASY9PAElKCM8LwM+KCg+LSs4";

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            C0DRA.LIZ(window2, false);
            window2.setBackgroundDrawable(new ColorDrawable(0));
            window2.clearFlags(2);
            window2.addFlags(-2147483336);
            window2.getDecorView().setSystemUiVisibility(1792);
            window2.setStatusBarColor(0);
            window2.setNavigationBarColor(0);
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = window2.getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                window2.setAttributes(attributes);
            }
            window2.setLayout(-1, -1);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
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
        Dialog dialog = new Dialog(requireContext(), R.style.aec);
        Window window = dialog.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialog);
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        View decorView;
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getString("arg_title_text");
        }
        Bundle arguments2 = getArguments();
        C19GS c19gs = null;
        if (arguments2 == null || (string = arguments2.getString("arg_content_text")) == null) {
            string = "";
        }
        C20625115nF c20625115nF = new C20625115nF(requireContext());
        Window window = requireActivity().getWindow();
        if (window != null) {
            decorView = window.getDecorView();
        } else {
            decorView = null;
        }
        c20625115nF.LL.setText(string);
        if (decorView != null) {
            c20625115nF.LIZIZ(decorView);
        }
        try {
            ViewTreeLifecycleOwner.set(c20625115nF, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(c20625115nF, this);
            c20625115nF.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return c20625115nF;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return c20625115nF;
        }
    }
}

package com.ss.android.ugc.aweme.live.notification.ui;

import X.C098200Yq;
import X.C0WZX;
import X.C10EW;
import X.C1389600mGU;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C2204961BRm;
import X.InterfaceC19225710Jj;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes29.dex */
public final class NotificationLiveHorizontalDialog extends NotificationLiveBottomDialog {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiklPyp9Jio4ICk6KyQ4HELIOSICA9ZjAlZwE8PCwqICwyPCwjJwM6PiAEJj06MioiPS4/DCwtJSA0";
    public boolean LLLII;

    public NotificationLiveHorizontalDialog() {
        super(null, null, false, "", "", "", "", null, null);
    }

    @Override // com.ss.android.ugc.aweme.live.notification.ui.NotificationLiveBottomDialog, com.bytedance.android.live.design.app.LiveControllableDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.LLLII = false;
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.live.notification.ui.NotificationLiveBottomDialog, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        if (getFragmentManager() != null) {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismissAllowingStateLoss() {
        if (getFragmentManager() != null) {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // com.bytedance.android.live.design.app.LiveControllableDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        WindowManager windowManager;
        Display displayLLILZIL;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(true);
            Window window2 = dialog.getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawable(new ColorDrawable(0));
                WindowManager.LayoutParams attributes = window2.getAttributes();
                attributes.dimAmount = 0.5f;
                attributes.width = (int) ((Resources.getSystem().getDisplayMetrics().density * 375.0f) + 0.5f);
                C19EG activity = getActivity();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                if (activity != null && (windowManager = activity.getWindowManager()) != null && (displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOahdZqA0j34YlnccEi5plT+UWkbf3b9DSWo6Ml2Q2Sihj8DWoRAfwMsNkcDS12F4NGM6FSJ", null))) != null) {
                    displayLLILZIL.getRealMetrics(displayMetrics);
                }
                attributes.height = displayMetrics.heightPixels;
                attributes.gravity = 8388613;
                attributes.softInputMode = 0;
                window2.setAttributes(attributes);
            }
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        if (this.LLLII) {
            dismissAllowingStateLoss();
        }
        this.LLLI.onCancel(dialogInterface);
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLLII = false;
        setStyle(1, R.style.ui);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.requestWindowFeature(1);
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.LLLFZ.onDismiss(dialogInterface);
    }

    @Override // com.ss.android.ugc.aweme.live.notification.ui.NotificationLiveBottomDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLLII = true;
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.10Fv
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    if (4 == i) {
                        keyEvent.getAction();
                    }
                    return false;
                }
            });
        }
        kS().setBackgroundResource(R.drawable.cgy);
    }

    @Override // com.bytedance.android.live.design.app.LiveControllableDialogFragment, com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
        c19ehLJIIJ.LJIIZILJ(this);
        c19ehLJIIJ.LIZLLL(this, str);
        c19ehLJIIJ.LJIIJ();
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.live.notification.ui.NotificationLiveBottomDialog, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView;
        C19GS c19gs;
        if (getContext() instanceof C19EG) {
            viewOnCreateView = super.onCreateView(((Activity) getContext()).getLayoutInflater(), viewGroup, bundle);
        } else {
            viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        }
        try {
            ViewTreeLifecycleOwner.set(viewOnCreateView, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewOnCreateView, this);
            viewOnCreateView.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewOnCreateView;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewOnCreateView;
        }
    }

    public NotificationLiveHorizontalDialog(User user, InterfaceC19225710Jj interfaceC19225710Jj, String str, String str2, String str3, AwemeRawAd awemeRawAd, C10EW c10ew) {
        super(user, interfaceC19225710Jj, false, str, str2, "", str3, awemeRawAd, c10ew);
    }
}

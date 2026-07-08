package com.google.android.gms.common;

import X.C0W3J;
import X.C1389600mGU;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes14.dex */
public class SupportErrorDialogFragment extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZyg8JyIgLGEyJiE+JiY3ZiIhOmEwJyghJiHELIOSF9GzA8OSAhPAA+OyAhDCwtJSA0DjctLiI2JjE=";
    public Dialog LL;
    public DialogInterface.OnCancelListener LLILLJJLI;
    public Dialog LLILLL;

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.LLILLJJLI;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        Dialog dialog = this.LL;
        if (dialog == null) {
            this.mShowsDialog = false;
            if (this.LLILLL == null) {
                Context context = getContext();
                C0W3J.LJIIIIZZ(context);
                this.LLILLL = new AlertDialog.Builder(context).create();
            }
            dialog = this.LLILLL;
        }
        Window window = dialog.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialog);
        return dialog;
    }

    @Override // com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(this);
    }
}

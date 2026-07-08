package org.greenrobot.eventbus.util;

import X.C1389600mGU;
import X.C19EG;
import android.R;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;

/* JADX INFO: loaded from: classes14.dex */
public class ErrorDialogFragments$Support extends GlobalHookDialogFragment implements DialogInterface.OnClickListener {
    public static final String _pnsPageId = "JzcrZyghLSAiOyAxJzFiLDk2JjEuPDx9PTElJWHELIOSEWOjcjOws6KSkjLgkhKSIhLCEnO2EfPD8jJzc4";

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        C19EG activity = getActivity();
        Bundle arguments = getArguments();
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(arguments.getString("de.greenrobot.eventbus.errordialog.title"));
        builder.setMessage(arguments.getString("de.greenrobot.eventbus.errordialog.message"));
        builder.setPositiveButton(R.string.ok, this);
        AlertDialog alertDialogCreate = builder.create();
        Window window = alertDialogCreate.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(com.zhiliaoapp.musically.R.id.yzv, this);
        }
        C1389600mGU.LIZJ(alertDialogCreate);
        return alertDialogCreate;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C19EG activity = getActivity();
        if (getArguments().getBoolean("de.greenrobot.eventbus.errordialog.finish_after_dialog", false) && activity != null) {
            activity.finish();
        }
    }
}

package com.google.android.material.bottomsheet;

import X.C1389600mGU;
import X.DialogC1389100mFg;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    public static final String _pnsPageId = "KyohZyg8JyIgLGEyJiE+JiY3ZigtPSohISQgZy08PDEjHELIOSJDw7LSA4Zw08PDEjJBw7LSA4DSYyJCorDz0yLygpJzs=";

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        Dialog dialog = getDialog();
        if (dialog instanceof DialogC1389100mFg) {
            ((DialogC1389100mFg) dialog).LJJZZI().isHideable();
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        Dialog dialog = getDialog();
        if (dialog instanceof DialogC1389100mFg) {
            ((DialogC1389100mFg) dialog).LJJZZI().isHideable();
        }
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        DialogC1389100mFg dialogC1389100mFg = new DialogC1389100mFg(getContext(), getTheme());
        Window window = dialogC1389100mFg.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogC1389100mFg);
        return dialogC1389100mFg;
    }
}

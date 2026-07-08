package com.ss.android.ugc.aweme.component.bio.biometric.ui;

import X.C1389600mGU;
import X.C1766560w4U;
import android.R;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.bytedance.tux.system.TuxImmersionBar;

/* JADX INFO: loaded from: classes22.dex */
public class BioTransparentFragment extends AppCompatDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD88JiAiPWExISHELIOSpiKyY8JSA4OyYwZjAlZw06JxE+KCEgOCQ+LCEnDjctLiI2JjE=";

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.clearFlags(2);
            window.setBackgroundDrawableResource(R.color.transparent);
            window.setLayout(-1, -1);
            window.setWindowAnimations(0);
        }
        dialogOnCreateDialog.setCanceledOnTouchOutside(false);
        Window window2 = dialogOnCreateDialog.getWindow();
        if (window2 != null && (decorView = window2.getDecorView()) != null) {
            decorView.setTag(com.zhiliaoapp.musically.R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(this, false);
        tuxImmersionBarLIZJ.LJIIJJI();
        tuxImmersionBarLIZJ.LIZLLL();
    }
}

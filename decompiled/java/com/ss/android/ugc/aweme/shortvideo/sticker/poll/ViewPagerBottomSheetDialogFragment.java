package com.ss.android.ugc.aweme.shortvideo.sticker.poll;

import X.C1389600mGU;
import X.C16BJ;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public class ViewPagerBottomSheetDialogFragment extends BottomSheetDialogFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjYkJj0nPiwoLCB9OzElKiQ2HELIOSOms8JiM/ZhMlLDgDKSIpOw08PDEjJBw7LSA4DSYyJCorDz0yLygpJzs=";

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        C16BJ c16bj = new C16BJ(getContext(), getTheme());
        Window window = c16bj.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(c16bj);
        return c16bj;
    }
}

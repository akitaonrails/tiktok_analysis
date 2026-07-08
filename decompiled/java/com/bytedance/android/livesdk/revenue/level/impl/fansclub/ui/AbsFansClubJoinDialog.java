package com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui;

import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.JoinDialogViewModel;

/* JADX INFO: loaded from: classes18.dex */
public abstract class AbsFansClubJoinDialog extends LiveDialogFragment {
    public JoinDialogViewModel LLILLL;
    public String LL = "";
    public final String LLILLJJLI = "";
    public String LLILZ = "no_info";

    public final void MR(JoinDialogViewModel joinDialogViewModel) {
        this.LLILLL = joinDialogViewModel;
        if (joinDialogViewModel != null) {
            joinDialogViewModel.BQ2(this.LL);
        }
    }
}

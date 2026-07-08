package com.ss.android.ugc.aweme.services.uikit;

import android.app.Dialog;

/* JADX INFO: loaded from: classes9.dex */
public interface CreativeLoadingDialog {
    void delayShow(long j);

    void dismiss();

    boolean isShowing();

    Dialog originalDialog();

    void show();

    void showCloseIcon(boolean z);

    void updateFakeProgress(int i);

    void updateProgress(int i, boolean z);

    void updateProgressContent(String str);

    public static final class DefaultImpls {
        public static /* synthetic */ void updateProgress$default(CreativeLoadingDialog creativeLoadingDialog, int i, boolean z, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    z = false;
                }
                creativeLoadingDialog.updateProgress(i, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateProgress");
        }
    }
}

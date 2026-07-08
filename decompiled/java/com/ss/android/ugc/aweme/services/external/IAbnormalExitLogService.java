package com.ss.android.ugc.aweme.services.external;

/* JADX INFO: loaded from: classes9.dex */
public interface IAbnormalExitLogService {
    void logAppAbnormalExit();

    void logRestoreDialogClick(boolean z, boolean z2);

    void logRestoreDialogDismiss(String str, boolean z);

    void logRestoreDialogShow(boolean z);
}

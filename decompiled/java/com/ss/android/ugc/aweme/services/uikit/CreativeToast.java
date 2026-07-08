package com.ss.android.ugc.aweme.services.uikit;

/* JADX INFO: loaded from: classes22.dex */
public interface CreativeToast {

    public interface OnDismissListener {
        void onDismiss(CreativeToast creativeToast);
    }

    public interface OnShowListener {
        void onShow(CreativeToast creativeToast);
    }

    void dismiss();

    Object originalToast();

    void show();
}

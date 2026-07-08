package com.ss.android.ugc.aweme.services.draft;

import android.content.Intent;

/* JADX INFO: loaded from: classes9.dex */
public interface OnStartEditDraftListener {

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        public static void onEnd(OnStartEditDraftListener onStartEditDraftListener) {
        }
    }

    void onEnd();

    void onStart(Intent intent);
}

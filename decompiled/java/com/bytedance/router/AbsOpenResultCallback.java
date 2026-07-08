package com.bytedance.router;

import X.C1951107kb;
import android.content.Intent;

/* JADX INFO: loaded from: classes29.dex */
public abstract class AbsOpenResultCallback implements OpenResultCallback {
    @Override // com.bytedance.router.OpenResultCallback
    public void onActionResult(Object obj) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onEmpty() {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onFail(String str, String str2) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onIntercept(String str) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onMatched(String str) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onMissed(String str) {
    }

    @Override // com.bytedance.router.OpenResultCallback
    public /* synthetic */ void onOpen(Intent intent) {
        C1951107kb.LIZIZ(this, intent);
    }

    @Override // com.bytedance.router.OpenResultCallback
    public void onSuccess(Intent intent) {
    }
}

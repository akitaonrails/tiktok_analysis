package com.ss.android.ugc.aweme.im.sharepanel.impl.share.viewmodel;

import X.C11JF;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes13.dex */
public final class MultiGuestLiveEventViewModel extends ViewModel {
    public C11JF LL;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C11JF c11jf = this.LL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LL = null;
    }
}

package com.bytedance.android.livesdkapi.host.dummy;

import X.C19EG;
import X.C469480Ib4;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdkapi.host.IHostPersonalized;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveHostPersonalizedDummy implements IHostPersonalized {
    @Override // com.bytedance.android.livesdkapi.host.IHostPersonalized
    public final boolean BA2() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPersonalized
    public final void MZ0(C19EG c19eg) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPersonalized
    public final boolean P9() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPersonalized
    public final Fragment ds2(boolean z, C469480Ib4 c469480Ib4) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPersonalized
    public final String va2(int i) {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPersonalized
    public final LiveData<Boolean> cx2() {
        return new MutableLiveData(Boolean.FALSE);
    }
}

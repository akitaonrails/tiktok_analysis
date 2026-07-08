package com.ss.android.ugc.aweme.music.ui;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes29.dex */
public final class MusicLandingPageViewModel extends ViewModel {
    public final MutableLiveData<String> LL;
    public final MutableLiveData LLILLJJLI;
    public final MutableLiveData<String> LLILLL;
    public final MutableLiveData LLILZ;

    public MusicLandingPageViewModel() {
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.LL = mutableLiveData;
        this.LLILLJJLI = mutableLiveData;
        MutableLiveData<String> mutableLiveData2 = new MutableLiveData<>();
        this.LLILLL = mutableLiveData2;
        this.LLILZ = mutableLiveData2;
    }

    public final void vQ2(String str) {
        this.LLILLL.setValue(str);
    }
}

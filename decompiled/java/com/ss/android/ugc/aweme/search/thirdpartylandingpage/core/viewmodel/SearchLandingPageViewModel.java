package com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes35.dex */
public final class SearchLandingPageViewModel extends ViewModel {
    public final MutableLiveData<String> LL;
    public final MutableLiveData LLILLJJLI;
    public final MutableLiveData<String> LLILLL;
    public final MutableLiveData LLILZ;

    public SearchLandingPageViewModel() {
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        this.LL = mutableLiveData;
        this.LLILLJJLI = mutableLiveData;
        MutableLiveData<String> mutableLiveData2 = new MutableLiveData<>();
        this.LLILLL = mutableLiveData2;
        new MutableLiveData();
        this.LLILZ = mutableLiveData2;
    }

    public final void vQ2(String str) {
        this.LL.setValue(str);
    }
}

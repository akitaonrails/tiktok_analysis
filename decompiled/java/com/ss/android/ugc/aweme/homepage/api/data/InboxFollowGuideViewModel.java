package com.ss.android.ugc.aweme.homepage.api.data;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes25.dex */
public final class InboxFollowGuideViewModel extends ViewModel {
    public static final /* synthetic */ int LLILZ = 0;
    public final MutableLiveData<Boolean> LL;
    public final MutableLiveData<Boolean> LLILLJJLI;
    public final MutableLiveData<Boolean> LLILLL;

    public InboxFollowGuideViewModel() {
        Boolean bool = Boolean.FALSE;
        this.LL = new MutableLiveData<>(bool);
        this.LLILLJJLI = new MutableLiveData<>(bool);
        this.LLILLL = new MutableLiveData<>(bool);
    }
}

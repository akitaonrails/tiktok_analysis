package com.ss.android.ugc.aweme.relation.dialog;

import X.InterfaceC1582690rHv;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes13.dex */
public final class SocialRecFriendsConditionViewModel extends ViewModel implements InterfaceC1582690rHv {
    public static final /* synthetic */ int LLILLL = 0;
    public final MutableLiveData<Boolean> LL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILLJJLI = new MutableLiveData<>();

    @Override // X.InterfaceC1582690rHv
    public final void G80(boolean z) {
        this.LLILLJJLI.postValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1582690rHv
    public final void dv2(boolean z) {
        this.LL.postValue(Boolean.valueOf(z));
    }
}

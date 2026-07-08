package com.ss.android.ugc.aweme.setting.page.backgroundaudio;

import X.C20692815yA;
import X.EnumC20692615y8;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes10.dex */
public final class BGAudioViewModel extends ViewModel {
    public final MutableLiveData<Boolean> LL;
    public final MutableLiveData<EnumC20692615y8> LLILLJJLI;

    public BGAudioViewModel() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(Boolean.valueOf(C20692815yA.LIZJ()));
        this.LL = mutableLiveData;
        MutableLiveData<EnumC20692615y8> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.setValue(C20692815yA.LIZ());
        this.LLILLJJLI = mutableLiveData2;
    }
}

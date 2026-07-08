package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.soundcontrol.ui;

import X.EnumC658820Psm;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchMediaSoundIconVM extends ViewModel {
    public final MutableLiveData<Boolean> LL;
    public final MutableLiveData LLILLJJLI;
    public final MutableLiveData<EnumC658820Psm> LLILLL;
    public final MutableLiveData LLILZ;

    public SearchMediaSoundIconVM() {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.FALSE);
        this.LL = mutableLiveData;
        this.LLILLJJLI = mutableLiveData;
        MutableLiveData<EnumC658820Psm> mutableLiveData2 = new MutableLiveData<>(EnumC658820Psm.NOTING);
        this.LLILLL = mutableLiveData2;
        this.LLILZ = mutableLiveData2;
    }
}
